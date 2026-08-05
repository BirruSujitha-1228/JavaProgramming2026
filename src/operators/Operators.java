package operators;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=18;
		int x= ++a + --a - a++ - b-- + c-- + c++ + --b + b++;
		int y= c++ + --a + --b + --c- ++ b + a + --c;
		System.out.println("a:"+a+"b:"+b+"c:"+c+"x:"+x+"y:"+y);
		System.out.println(++x);
		System.out.println(a++);
		
		a=1;
		b=2;
		c=3;
		x= a-- - --a + --b + --c + c-- + --b + --a - a - b - c;
		y= x-- + a-- + x++ + --x + + b-- - ++c + --b;
		System.out.println("a:"+a+"b:"+b+"c:"+c+"x:"+x+"y:"+y);
		System.out.println(++x);
		System.out.println(a++);

	}

}
