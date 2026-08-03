package methods.constructors;

public class ConstructorChainingDemo {

			int pro_id;
			String pro_name;
			double price;
			int quantity;
			String description;
			double saleprice;
			double totalprice;
			void display() {
				System.out.println("product Id :"+pro_id);
				System.out.println("product Name :"+pro_name);
				System.out.println("product price :"+price);
				System.out.println("Quantity: "+quantity);
				System.out.println("description : "+description);
				System.out.println("saleprice : "+saleprice);
				System.out.println("toatalprice : "+totalprice);
			}
			ConstructorChainingDemo(){
				System.out.println("--------constructor chaining----------");
			}
			ConstructorChainingDemo(double saleprice,double totalprice){
				this();
				this.saleprice=saleprice;
				this.totalprice=totalprice;
			}
			ConstructorChainingDemo(int pro_id,String pro_name, double price ,double saleprice,double totalprice){
				this(saleprice,totalprice);
				this.pro_id=pro_id;
				this.pro_name=pro_name;
				this.price=price;
			}
			ConstructorChainingDemo(int pro_id,String pro_name, double price,int quantity,String description,double saleprice,double totalprice){
				  this(pro_id,pro_name,price,saleprice,totalprice);
		          this.quantity=quantity;
				  this.description=description;
			}
			
			public static void main(String[] args) {
				ConstructorChainingDemo p1=new ConstructorChainingDemo(101,"mobile",500,2,"vivo",5000,1000);
				p1.display();          
			}

		/* OUTPUT
		product Id :101
        product Name :mobile
        product price :500.0
        Quantity: 2
        description : vivo
        saleprice : 5000.0
        toatalprice : 1000.0
		*/


	}

