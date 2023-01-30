package cogent.infotech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			
			int rowInserted=ps.executeUpdate();
			if(rowInserted >0) {
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
	
	public void deleteProductById(int pId) {
		// TODO Auto-generated method stub
		String query="delete from Product where pId=?";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, pId);
			int rowDeleted=ps.executeUpdate();
			if(rowDeleted >0) {
				System.out.println("deleted");
			} else {
				System.out.println("can not delete");
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deleteProductByCat(String pCat) {
		// TODO Auto-generated method stub
		String query="delete from Product where pCat=?";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, pCat);
			int rowDeleted=ps.executeUpdate();
			if(rowDeleted >0) {
				System.out.println("deleted");
			} else {
				System.out.println("can not delete");
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void findCheapestProductInCat(String pCat) {
		// TODO Auto-generated method stub
		String query="select min(price) as Minimum_price from product where pCat=?";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, pCat);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("minimum price of "+pCat+" is "+rs.getString(1));
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void findProductByCat(String pCat) {
		// TODO Auto-generated method stub
		String query="select * from product where pCat=?";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, pCat);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("id: "+rs.getInt("pId"));
				System.out.println("name: "+rs.getString("pName"));
				System.out.println("price: "+rs.getInt("price"));
				System.out.println("category: "+rs.getString("pCat"));
				System.out.println("manu_date: "+rs.getString("manufacture_date"));
				System.out.println("expire_date: "+rs.getString("expire_date"));
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void findProductById(int pId) {
		// TODO Auto-generated method stub
		String query="select * from product where pId=?";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, pId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("id: "+rs.getInt("pId"));
				System.out.println("name: "+rs.getString("pName"));
				System.out.println("price: "+rs.getInt("price"));
				System.out.println("category: "+rs.getString("pCat"));
				System.out.println("manu_date: "+rs.getString("manufacture_date"));
				System.out.println("expire_date: "+rs.getString("expire_date"));
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateProductById(int pId, String pName, int price, String category, String manufactur_date,
			String expire_date) {
		// TODO Auto-generated method stub
		String query="update Product set pName=?, price=?, pCat=?, manufacture_date=?, expire_date=? where pId=?";
		try {
			Connection connection=JdbcUtils.getConnect();
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, pName);
			ps.setInt(2, price);
			ps.setString(3, category);
			ps.setString(4, manufactur_date);
			ps.setString(5, expire_date);
			ps.setInt(6, pId);
			int rowUpdated=ps.executeUpdate();
			if(rowUpdated >0) {
				System.out.println("updated");
			} else {
				System.out.println("can not update");
			}
			connection.close();
			ps.close();
	
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
