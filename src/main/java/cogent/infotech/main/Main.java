package cogent.infotech.main;

import java.util.Scanner;

import cogent.infotech.dao.ProductDaoImpl;

public class Main {
	public static void main(String[] args) {
		ProductDaoImpl pdi=new ProductDaoImpl();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1-Add");
			System.out.println("2-Add");
			System.out.println("3-Add");
			System.out.println("4-Add");
			System.out.println("5-Exit");
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
				System.out.println("manufacture date");
				String manuDate=sc.next();
				System.out.println("expire date");
				String expire=sc.next();
				pdi.addProduct(id, name, price, category, manuDate, expire);
				break;
			case 5: System.exit(0);
			default:
				break;
			}
		}while(choice!=5);
		sc.close();
	}
}
