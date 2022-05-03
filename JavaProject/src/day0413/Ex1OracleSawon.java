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
	// localhost : �� ��ǻ�� ����(Ȥ�� IP �ּ�)

	Scanner sc = new Scanner(System.in);

	public Ex1OracleSawon() {
		try {
			Class.forName(DRIVER);
			System.out.println("����Ŭ ����̹� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹� ����!" + e.getMessage());
			;
		}

	}

	public int getMenu() {
		System.out.println("** �޴� ���� **");
		System.out.println("1. ����߰�  2.��ü������  3.����˻�  4.�μ����м�  5.����");
		int n = Integer.parseInt(sc.nextLine());
		return n;

	}

	// db ������ �����ϴ� �޼���
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "bit901", "a1234");
//			System.out.println("DB ���� ����!");
		} catch (SQLException e) {
			System.out.println("DB ���� ����!" + e.getMessage());
		}
		return conn;

	}

	public void sawonInsert() {
		Connection conn = this.getConnection();
		Statement stmt = null; // Statement - �ݵ�� sql����!

		System.out.println("����� : ");
		String name = sc.nextLine();
		System.out.println("�μ���(ȫ����, �λ��, ������):");
		String buseo = sc.nextLine();
		System.out.println("�⺻��");
		int gibon = Integer.parseInt(sc.nextLine());
		System.out.println("����");
		int sudang = Integer.parseInt(sc.nextLine());

		String sql = "insert into sawon values (seq_bit.nextval,'" + name + "','" + buseo + "'," + gibon + "," + sudang
				+ ",sysdate)";
//		System.out.println(sql);

		try {
			stmt = conn.createStatement();
			// sql ���� ����
			stmt.execute(sql);

			System.out.println("db�� �����Ͱ� �߰��Ǿ����!");
		} catch (SQLException e) {
			System.out.println("insert ���� :" + e.getMessage());
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
		ResultSet rs = null; // ����� ����
		String sql = "select * from sawon order by name"; // �̸���

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// ����
			System.out.println("��ȣ\t�����\t�μ���\t�⺻��\t����\t�ѱ޿�\t�����");
			while (rs.next()) {

				// ����ȣ�� ��������
//				int num = rs.getInt(1);
//				String name = rs.getString(2);
//				String buseo = rs.getString(3);
//				int gibon = rs.getInt(4); //����ϴ� data : �ַ� Int��
//				int sudang = rs.getInt(5);
//				int total = gibon + sudang;
//				Timestamp ts = rs.getTimestamp(6);

				// �÷������� ��������
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String buseo = rs.getString("buseo");
				int gibon = rs.getInt("gibon"); // ����ϴ� data : �ַ� Int��
				int sudang = rs.getInt("sudang");
				int total = gibon + sudang;
				Timestamp ts = rs.getTimestamp("writeday");

				// ��¥�� ���ڿ��� ��ȯ
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
		System.out.println("�˻��� �̸��̳� ���� �Է��ϼ���");
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
			System.out.println("\t** " + searchName + " ���� �˻� **");
			System.out.println();
			System.out.println("��ȣ\t�̸�\t�μ�\t�⺻��\t����\t�ѱ޿�\t�����");
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
			System.out.println("** �μ��� ��ձ޿� **");
			System.out.println("�μ���\t��ձ޿�");

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
				System.out.println("���α׷� ����!!");
				System.exit(0);
			}
		}
	}

}
