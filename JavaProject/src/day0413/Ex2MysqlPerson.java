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
	static final String URL = "jdbc:mysql://localhost:3306/bitcamp"; // 5����
//	static final String URL = "jdbc:mysql://localhost:3306/bitcamp?serverTimezone=Asia/Seoul"; //5����,8����
	Scanner sc = new Scanner(System.in);

	public Ex2MysqlPerson() {
		try {
			Class.forName(DRIVER);
			System.out.println("mysql ����̹� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql ����̹� ����" + e.getMessage());
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "root", "1234");
//			System.out.println("mysql ���� ����!");
		} catch (SQLException e) {
			System.out.println("mysql ���� ����!:" + e.getMessage());
		}
		return conn;
	}

	public int getMenu() {
		System.out.println("** �޴����� **");
		System.out.println("1. �߰�  2. ��ü���  3. ����  4.�м�  5.����  6.����");
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}

	public void personInsert() { // �ʿ��� ���� ���� �ֱ�
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		// Statement : �Ϻ��� ������ �� sql �˻�
		// PreparedStatement : sql���� �̿ϼ����� ����� ���߿� match
		String sql = "";

		// �ʿ��� ������ �Է�
		System.out.println("�̸� �Է�");
		String name = sc.nextLine();
		System.out.println("������ �Է�");
		String blood = sc.nextLine();
		System.out.println("���� �Է�");
		int age = Integer.parseInt(sc.nextLine());

		// db ����
		conn = this.getConnection();
		sql = "insert into person (name, blood, age, writeday) values (?,?,?,now())";
		// ? --> ���߿� �ְڴٴ� �� (prepareStatement)

		try {
			// sql �˻�
			pstmt = conn.prepareStatement(sql);
			// ? ������ŭ �ݵ�� ���ε� (�ϳ��ϳ� ��Ī) : ?�� 1�� ���� ����
			pstmt.setString(1, name);
			pstmt.setString(2, blood);
			pstmt.setInt(3, age);

			// ����
			pstmt.execute();
			System.out.println("�߰��Ǿ����ϴ�!");

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

		// db����
		conn = this.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("\t** Person DB ��� **");
			System.out.println();
			System.out.println("��ȣ\t�̸�\t������\t����\t�ۼ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			while (rs.next()) { // rs.next �� true �� ���� �����
				String num = rs.getString("num");
				String name = rs.getString("name");
				String blood = rs.getString("blood").toUpperCase(); // �빮�ڷ� ��ȯ
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
		// �̸��� �Է� �� �ش� ������ ����
		// ���� �� "�����Ǿ����ϴ�" �޼��� ���
		// �̸��� ������ "XXX ���� ���ܿ� �����ϴ�" ���

		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		String sql = "";

		System.out.println("������ �̸� �Է�");
		String name = sc.nextLine();

		// db ����
		conn = this.getConnection();
		sql = "delete from person where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			// ?�� ���ε�
			pstmt.setString(1, name);

			// 1) ����(insert, delete�� �ַ� execute)
			// pstmt.execute();
			// System.out.println("�����Ǿ����ϴ�!");

			// 2) ������ ����! ������ ���ڵ��� ������ ��ȯ
			int n = pstmt.executeUpdate();
			if (n == 0)
				System.out.println(name + "���� ���ܿ� �����ϴ�.");
			else
				System.out.println("�� " + n + "���� " + name + "���� �����Ǿ����ϴ�");

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
		// ������ �� �ο����� ��� ���� ��� (group by)
		/*
		 * ������ �ο��� ��ճ��� A�� 5�� 29 B�� 2�� 36 ...
		 */
		Connection conn = null;
		java.sql.ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "select blood Blood, count(*) Count, round(avg(age),0) Average from person group by blood;";

		// db����
		conn = this.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\t** �������� �м� ǥ **");
			System.out.println();
			System.out.println("������\t�ο���\t��ճ���");
			while (rs.next()) { // rs.next �� true �� ���� �����
				String blood = rs.getString("blood").toUpperCase();
				int count = rs.getInt("count");
				int average = rs.getInt("average");// �빮�ڷ� ��ȯ

				System.out.println(blood + "��\t" + count + "��\t" + average + "��");
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

		System.out.println("������ num �� �Է�");
		num = Integer.parseInt(sc.nextLine());
		System.out.println("������ Blood ��");
		blood = sc.nextLine();
		System.out.println("������ ���� �Է�");
		age = Integer.parseInt(sc.nextLine());

		sql = "update person set blood=?, age=? where num=?";

		// db����
		conn = this.getConnection();

		try {
			pstmt = conn.prepareStatement(sql);
			// ���ε�
			pstmt.setString(1, blood);
			pstmt.setInt(2, age);
			pstmt.setInt(3, num);
			// ����
			int n = pstmt.executeUpdate();
			if (n == 0)
				System.out.println("�ش� ��ȣ�� �������� �ʽ��ϴ�");
			else
				System.out.println("�����Ǿ����ϴ�");
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
				System.out.println("���α׷� ����!");
				System.exit(0);
			}

		}
	}

}