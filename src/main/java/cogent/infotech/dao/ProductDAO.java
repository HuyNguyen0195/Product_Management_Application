package cogent.infotech.dao;

public interface ProductDAO {
	public void addProduct(int pId,
			String pName,
			int price, 
			String category,
			String manufactur_date,
			String expire_date);
	public void deleteProductById(int pId);
	public void deleteProductByCat(String pCat);
	public void findCheapestProductInCat(String pCat);
	public void findProductByCat(String pCat);
	public void findProductById(int pId);
	public void updateProductById(int pId,
			String pName,
			int price, 
			String category,
			String manufactur_date,
			String expire_date);
}
