package cogent.infotech.controller;

import cogent.infotech.dao.ProductDaoImpl;

public class ProductController {
	ProductDaoImpl dao=new ProductDaoImpl();
	public void create(int pId, String pName, int price, 
			String category, String manufactur_date,
			String expire_date) {
		dao.addProduct(pId, pName, price, category, manufactur_date, expire_date);
	}
	public void delete(int pId) {
		dao.deleteProductById(pId);
	}
	public void deleteByCat(String pCat) {
		dao.deleteProductByCat(pCat);
	}
	public void cheapestByCat(String pCat) {
		dao.findCheapestProductInCat(pCat);
	}
	public void findByCat(String pCat) {
		dao.findProductByCat(pCat);
	}
	public void findById(int pId) {
		dao.findProductById(pId);
	}
	public void updateById(int pId, String pName, int price, String category, String manufactur_date,
			String expire_date) {
		dao.updateProductById(pId, pName, price, category, manufactur_date, expire_date);
	}
}
