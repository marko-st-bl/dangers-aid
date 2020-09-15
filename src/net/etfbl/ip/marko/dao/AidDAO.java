package net.etfbl.ip.marko.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.etfbl.ip.marko.dto.Aid;
;

public class AidDAO {
	
	public boolean addAid(Aid aid) {
		boolean retVal = false;
		Connection conn = null;
		PreparedStatement ps =null;
		
		String query = "insert into aid (title, description, date, location, image, category) "
				+ "values (?, ?, ?, ?, ?, ?)";
		
		try {
			conn = ConnectionPool.getConnectionPool().checkOut();
			ps = conn.prepareStatement(query);
			ps.setString(1, aid.getTitle());
			ps.setString(2, aid.getDescription());
			ps.setDate(3, new java.sql.Date(aid.getDate().getTime()));
			ps.setString(4, aid.getAddress());
			ps.setString(5, aid.getImageUrl());
			ps.setString(6, aid.getCategory());
			
			retVal = ps.executeUpdate() == 1;
			
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionPool.getConnectionPool().checkIn(conn);
		}
		return retVal;
	}

}
