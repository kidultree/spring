package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex1OracleSawon {
	static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// localhost : 내 컴퓨터 서버(혹은 IP 주소)

	Scanner sc = new Scanner(System.in);

	public Ex1OracleSawon() {
		try {
			Class.forName(DRIVER);
			System.out.println("오라클 드라이버 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 실패!" + e.getMessage());
			;
		}

	}

	public int getMenu() {
		System.out.println("** 메뉴 선택 **");
		System.out.println("1. 사원추가  2.전체사원출력  3.사원검색  4.부서별분석  5.종료");
		int n = Integer.parseInt(sc.nextLine());
		return n;

	}

	// db 서버에 연결하는 메서드
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "bit901", "a1234");
//			System.out.println("DB 연결 성공!");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!" + e.getMessage());
		}
		return conn;

	}

	public void sawonInsert() {
		Connection conn = this.getConnection();
		Statement stmt = null; // Statement - 반드시 sql꺼로!

		System.out.println("사원명 : ");
		String name = sc.nextLine();
		System.out.println("부서명(홍보부, 인사부, 교육부):");
		String buseo = sc.nextLine();
		System.out.println("기본급");
		int gibon = Integer.parseInt(sc.nextLine());
		System.out.println("수당");
		int sudang = Integer.parseInt(sc.nextLine());

		String sql = "insert into sawon values (seq_bit.nextval,'" + name + "','" + buseo + "'," + gibon + "," + sudang
				+ ",sysdate)";
//		System.out.println(sql);

		try {
			stmt = conn.createStatement();
			// sql 문을 실행
			stmt.execute(sql);

			System.out.println("db에 데이터가 추가되었어요!");
		} catch (SQLException e) {
			System.out.println("insert 오류 :" + e.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void sawonAllWrite() {
		Connection conn = this.getConnection();
		Statement stmt = null;
		ResultSet rs = null; // 결과값 저장
		String sql = "select * from sawon order by name"; // 이름순

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 제목
			System.out.println("번호\t사원명\t부서명\t기본급\t수당\t총급여\t등록일");
			while (rs.next()) {

				// 열번호로 가져오기
//				int num = rs.getInt(1);
//				String name = rs.getString(2);
//				String buseo = rs.getString(3);
//				int gibon = rs.getInt(4); //계산하는 data : 주로 Int로
//				int sudang = rs.getInt(5);
//				int total = gibon + sudang;
//				Timestamp ts = rs.getTimestamp(6);

				// 컬럼명으로 가져오기
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String buseo = rs.getString("buseo");
				int gibon = rs.getInt("gibon"); // 계산하는 data : 주로 Int로
				int sudang = rs.getInt("sudang");
				int total = gibon + sudang;
				Timestamp ts = rs.getTimestamp("writeday");

				// 날짜를 문자열로 변환
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				System.out.println(num + "\t" + name + "\t" + buseo + "\t" + gibon + "\t" + sudang + "\t" + total + "\t"
						+ sdf.format(ts));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void sawonSearch() {
		System.out.println("검색할 이름이나 성을 입력하세요");
		String searchName = sc.nextLine();
		String sql = "select num,name,buseo,gibon,sudang," + "gibon+sudang total,to_char(writeday,'yyyy-mm-dd hh:mi')"
				+ " writeday from sawon where name like '%" + searchName + "%'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = this.getConnection();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("\t** " + searchName + " 으로 검색 **");
			System.out.println();
			System.out.println("번호\t이름\t부서\t기본급\t수당\t총급여\t등록일");
			while (rs.next()) {
				System.out.println(rs.getString("num") + "\t" + rs.getString("name") + "\t" + rs.getString("buseo")
						+ "\t" + rs.getInt("gibon") + "\t" + rs.getInt("sudang") + "\t" + rs.getInt("total") + "\t"
						+ rs.getString("writeday"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void sawonBuseoGroup() {

		String sql = "select buseo, round(avg(gibon+sudang),0) pay from sawon group by buseo";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = this.getConnection();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("** 부서별 평균급여 **");
			System.out.println("부서명\t평균급여");

			while (rs.next()) {
				System.out.println(rs.getString("buseo") + "\t" + rs.getInt("pay"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}

	}

	public static void main(String[] args) {
		Ex1OracleSawon ex = new Ex1OracleSawon();
		while (true) {
			int n = ex.getMenu();
			switch (n) {
			case 1:
				ex.sawonInsert();
				break;
			case 2:
				ex.sawonAllWrite();
				break;

			case 3:
				ex.sawonSearch();
				break;

			case 4:
				ex.sawonBuseoGroup();
				break;

			default:
				System.out.println("프로그램 종료!!");
				System.exit(0);
			}
		}
	}

}
