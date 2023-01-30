package cogent.infotech.dao;

public interface ProductDAO {
	public void addProduct(int pId,
			String pName,
			int price, 
			String category,
			String manufactur_date,
			String expire_date);
}
