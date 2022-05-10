package mysql.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuDao {
	DBConnect db = new DBConnect();

//���
	public List<StuDto> getAllDatas() {

		List<StuDto> list = new ArrayList<StuDto>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student order by name";

		conn = db.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// db�� �����͸� ���ڵ� ������ dto�� �ִ´�.
				StuDto dto = new StuDto();
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setAddr(rs.getString("addr"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				dto.setPhoto(rs.getString("photo"));
				// list�� �߰�
				list.add(dto);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return list;
	}

	// insert method
	public void insertStudent(StuDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into student (name,hp,addr,photo,writeday) values (?,?,?,?,now())";

		conn = db.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			// ���ε�
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getHp());
			pstmt.setString(3, dto.getAddr());
			pstmt.setString(4, dto.getPhoto());
			// ����
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//���� �޼���
	public void deleteStudent(String num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from student where num=?";
		
		conn = db.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			//���ε�
			pstmt.setString(1, num); // ? ���� - 1���� ����
			
			//����
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
}
