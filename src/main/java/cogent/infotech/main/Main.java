package cogent.infotech.main;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import cogent.infotech.controller.ProductController;
import cogent.infotech.dao.ProductDaoImpl;

public class Main {
	public static void main(String[] args) {
		ProductController pController=new ProductController();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1-Add");
			System.out.println("2-Delete By Id");
			System.out.println("3-Delete By Category");
			System.out.println("4-find cheapest by cat");
			System.out.println("5-find by Category");
			System.out.println("6-find by Id");
			System.out.println("7-update product by id");
			System.out.println("8-find expired products");
			System.out.println("9-Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("product id");
				int id=sc.nextInt();
				System.out.println("product name");
				String name=sc.next();
				System.out.println("price");
				int price = sc.nextInt();
				System.out.println("category");
				String category=sc.next();
				System.out.println("manufacture date yyyy-mm-dd");
				String manuDate=sc.next();
				System.out.println("expire date yyyy-mm-dd");
				String expire=sc.next();
				pController.create(id, name, price, category, manuDate, expire);
				break;
			case 2:
				System.out.println("enter id to delete");
				int idDelete=sc.nextInt();
				pController.delete(idDelete);
				break;
			case 3:
				System.out.println("enter category to delete");
				String catDel=sc.next();
				pController.deleteByCat(catDel);
				break;
			case 4:
				System.out.println("enter category to find cheapest product");
				String catFind=sc.next();
				pController.cheapestByCat(catFind);
				break;
			case 5:
				System.out.println("enter category to find product");
				String cat5=sc.next();
				pController.findByCat(cat5);
				break;
			case 6:
				System.out.println("enter id to find product");
				int id6=sc.nextInt();
				pController.findById(id6);
				break;
			case 7:
				System.out.println("enter id product to update");
				int id7=sc.nextInt();
				System.out.println("product name");
				String name7=sc.next();
				System.out.println("price");
				int price7 = sc.nextInt();
				System.out.println("category");
				String category7=sc.next();
				System.out.println("manufacture date yyyy-mm-dd");
				String manuDate7=sc.next();
				System.out.println("expire date yyyy-mm-dd");
				String expire7=sc.next();
				pController.updateById(id7, name7, price7, category7, manuDate7, expire7);
				break;
			case 8:
				System.out.println("expired products:");
				pController.expiredProducts();;
				break;
			case 9: System.exit(0);
			default:
				break;
			}
		}while(choice!=9);
		sc.close();
	}
}
