package methods.constructors;

public class Product {
	int pro_id;
	String pro_name;
	double price;
	int quantity;
	String description;
	
	void productInfo() {
		System.out.println("product Id :"+pro_id);
		System.out.println("product Name :"+pro_name);
		System.out.println("product price :"+price);
		System.out.println();
		//System.out.println("Quantity"+quantity);
		//System.out.println("description"+description);
	}
	Product(int pro_id,String pro_name, double price ){
		this.pro_id=pro_id;
		this.pro_name=pro_name;
		this.price=price;
	}
	Product(int pro_id,String pro_name, double price,int quantity,String description){
		  this(pro_id,pro_name,price);
          this.quantity=quantity;
		  this.description=description;
	}
	void productInfo2() {
		System.out.println("product Id :"+pro_id);
		System.out.println("product Name :"+pro_name);
		System.out.println("product price :"+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("description: "+description);
	}
	
	public static void main(String[] args) {
		//Product p1=new Product(101,"mobile",500);
		Product p2=new Product(101,"mobile",500,2,"vivo");
		//p1.productInfo();
		p2.productInfo2();            
	}
}
/* OUTPUT
product Id :101
product Name :mobile
product price :500.0
product Id :0
product Name :null
product price :0.0
Quantity : 2
description: vivo
*/
