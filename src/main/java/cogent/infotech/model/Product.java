package cogent.infotech.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Product {
	int pId;
	String pName;
	int price;
	String pCat;
	String manufacture_date;
	String expire_date;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getpCat() {
		return pCat;
	}
	public void setpCat(String pCat) {
		this.pCat = pCat;
	}
	public String getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(String manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public String getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", price=" + price + ", pCat=" + pCat
				+ ", manufacture_date=" + manufacture_date + ", expire_date=" + expire_date + "]";
	}
	public Product(int pId, String pName, int price, String pCat, String manufacture_date, String expire_date) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.pCat = pCat;
		this.manufacture_date = manufacture_date;
		this.expire_date = expire_date;
	}
	
}
