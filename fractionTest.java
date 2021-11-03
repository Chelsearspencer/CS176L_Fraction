
public class fractionTest {


public static void main(String[] args) {
// TODO Auto-generated method stub
				
		fractionClass f0 = new fractionClass (4,6);
		System.out.println(f0);
				
				
		fractionClass f1 = new fractionClass(5,8);
		fractionClass f2 = new fractionClass(1,9);
		fractionClass f3 = new fractionClass();
				
		
		f3=f3.Add(f1, f2);
		System.out.println( f1 + "+" + f2 + "= " + f3 ); 
		f3= f3.subtract( f1, f2 ); 
		System.out.println( f1 + "-" + f2 + "= " + f3 );		
		f3=f3.multiply(f1, f2);
		System.out.println( f1 + "*" + f2 + "= " + f3 );
		f3=f3.divide(f1, f2);
		System.out.println( f1 + "/" + f2 + "= " + f3 );
	
		
	}

}
