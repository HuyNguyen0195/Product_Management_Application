package cogent.infotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cogent.infotech.jdbc.JdbcUtils;

public class ProductDaoImpl implements ProductDAO {
	
	public void addProduct(int pId, String pName, int price, 
			String category, String manufactur_date,
			String expire_date) {
		// TODO Auto-generated method stub
		String query="insert into Product value (?,?,?,?,?,?)";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, pId);
			ps.setString(2, pName);
			ps.setInt(3, price);
			ps.setString(4, category);
			ps.setString(5, manufactur_date);
			ps.setString(6, expire_date);
			
			int rowInsertd=ps.executeUpdate();
			if(rowInsertd >0) {
				System.out.println("inserted");
			} else {
				System.out.println("can not insert");
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
