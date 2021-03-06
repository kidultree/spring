package day0413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.mysql.jdbc.ResultSet;

public class Ex2MysqlPerson {
	static final String DRIVER = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/bitcamp"; // 5버전
//	static final String URL = "jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul"; //5버전,8버전
	Scanner sc = new Scanner(System.in);

	public Ex2MysqlPerson() {
		try {
			Class.forName(DRIVER);
			System.out.println("mysql 드라이버 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이버 실패" + e.getMessage());
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "root", "1234");
//			System.out.println("mysql 접근 성공!");
		} catch (SQLException e) {
			System.out.println("mysql 접근 실패!:" + e.getMessage());
		}
		return conn;
	}

	public int getMenu() {
		System.out.println("** 메뉴선택 **");
		System.out.println("1. 추가  2. 전체출력  3. 삭제  4.분석  5.수정  6.종료");
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}

	public void personInsert() { // 필요한 변수 먼저 주기
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		// Statement : 완벽히 실행할 때 sql 검사
		// PreparedStatement : sql문을 미완성으로 만들고 나중에 match
		String sql = "";

		// 필요한 데이터 입력
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("혈액형 입력");
		String blood = sc.nextLine();
		System.out.println("나이 입력");
		int age = Integer.parseInt(sc.nextLine());

		// db 연결
		conn = this.getConnection();
		sql = "insert into person (name, blood, age, writeday) values (?,?,?,now())";
		// ? --> 나중에 넣겠다는 뜻 (prepareStatement)

		try {
			// sql 검사
			pstmt = conn.prepareStatement(sql);
			// ? 갯수만큼 반드시 바인딩 (하나하나 매칭) : ?는 1번 부터 시작
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);

			// 실행
			pstmt.execute();
			System.out.println("추가되었습니다!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void personAllWrite() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String sql = "select * from person order by name";

		// db연결
		conn = this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("\t** Person DB 목록 **");
			System.out.println();
			System.out.println("번호\t이름\t혈액형\t나이\t작성일");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			while (rs.next()) { // rs.next 가 true 일 동안 실행됨
				String num = rs.getString("num");
				String name = rs.getString("name");
				String blood = rs.getString("blood").toUpperCase(); // 대문자로 변환
				int age = rs.getInt("age");
				Timestamp ts = rs.getTimestamp("writeday");
				System.out.println(num + "\t" + name + "\t" + blood + "\t" + age + "\t" + sdf.format(ts));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void personDelete() {
		// 이름을 입력 후 해당 데이터 삭제
		// 삭제 후 "삭제되었습니다" 메세지 출력
		// 이름이 없으면 "XXX 님은 명단에 없습니다" 출력

		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		String sql = "";

		System.out.println("삭제할 이름 입력");
		String name = sc.nextLine();

		// db 연결
		conn = this.getConnection();
		sql = "delete from person where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			// ?에 바인딩
			pstmt.setString(1, name);

			// 1) 실행(insert, delete는 주로 execute)
			// pstmt.execute();
			// System.out.println("삭제되었습니다!");

			// 2) 실행은 같음! 성공한 레코드의 개수를 반환
			int n = pstmt.executeUpdate();
			if (n == 0)
				System.out.println(name + "님은 명단에 없습니다.");
			else
				System.out.println("총 " + n + "명의 " + name + "님이 삭제되었습니다");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void personBloodGroup() {
		// 혈액형 별 인원수와 평균 나이 출력 (group by)
		/*
		 * 혈액형 인원수 평균나이 A형 5명 29 B형 2명 36 ...
		 */
		Connection conn = null;
		java.sql.ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "select blood Blood, count(*) Count, round(avg(age),0) Average from person group by blood;";

		// db연결
		conn = this.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\t** 혈액형별 분석 표 **");
			System.out.println();
			System.out.println("혈액형\t인원수\t평균나이");
			while (rs.next()) { // rs.next 가 true 일 동안 실행됨
				String blood = rs.getString("blood").toUpperCase();
				int count = rs.getInt("count");
				int average = rs.getInt("average");// 대문자로 변환

				System.out.println(blood + "형\t" + count + "명\t" + average + "세");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}

	}

	public void personUpdate() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		int num, age;
		String blood;

		System.out.println("수정할 num 값 입력");
		num = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 Blood 값");
		blood = sc.nextLine();
		System.out.println("수정할 나이 입력");
		age = Integer.parseInt(sc.nextLine());

		sql = "update person set blood=?, age=? where num=?";

		// db연결
		conn = this.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			// 바인딩
			pstmt.setString(1, blood);
			pstmt.setInt(2, age);
			pstmt.setInt(3, num);
			// 실행
			int n = pstmt.executeUpdate();
			if (n == 0)
				System.out.println("해당 번호가 존재하지 않습니다");
			else
				System.out.println("수정되었습니다");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public static void main(String[] args) {
		Ex2MysqlPerson ex = new Ex2MysqlPerson();
		while (true) {
			int n = ex.getMenu();
			switch (n) {
			case 1:
				ex.personInsert();
				break;
			case 2:
				ex.personAllWrite();
				break;
			case 3:
				ex.personDelete();
				break;
			case 4:
				ex.personBloodGroup();
				break;
			case 5:
				ex.personUpdate();
				break;

			default:
				System.out.println("프로그램 종료!");
				System.exit(0);
			}

		}
	}

}
