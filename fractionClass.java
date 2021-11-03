
public class fractionClass {

	
		
		private int numerator;
		private int denominator;
		
		fractionClass(int n, int d) {
			
		this.numerator= n;
		this.denominator= d;
		
		reduce();
		}
		
		fractionClass() {
			
		this.numerator=0;
		this.denominator=0;
		}
		
	
	private void reduce(){
		int gcf = Math.min(numerator, denominator);
		while(gcf > 1) {
    		if(this.numerator % gcf == 0 && this.denominator % gcf == 0) {
    			break;
    		}
    		
    		gcf--;
	}

		this.numerator = this.numerator/gcf;
		this.denominator = this.denominator/gcf;
	
	}
	
	
	public String toString() {
		return this.numerator+"/"+this.denominator;
	}
	
	public fractionClass Add(fractionClass f1,fractionClass f2) {
		int numeratorSum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
    	int denominatorSum = f1.denominator * f2.denominator;
    	return new fractionClass(numeratorSum, denominatorSum);
	}
	
	public fractionClass subtract(fractionClass f1, fractionClass f2) {
		int differentNumerator = f1.numerator * f2.denominator - f1.denominator * f2.numerator;
    	int differentDenominator = f1.denominator * f2.denominator;
    	return new fractionClass(differentNumerator, differentDenominator);
	}
	
	
	public fractionClass multiply(fractionClass f1, fractionClass f2) {
		int numeratorProduct =f1.numerator*f2.numerator;
		int denomoinatorProduct=f1.denominator*f2.denominator;
		return new fractionClass(numeratorProduct,denomoinatorProduct);
	}
	
	public fractionClass divide(fractionClass f1,fractionClass f2) {
		int numeratorDivide=f1.numerator*f2.denominator;
		int demonmoinatorDivide=f2.numerator*f1.denominator;
		return new fractionClass (numeratorDivide,demonmoinatorDivide);
	}
	
	
	
	
	
	
	
	
}	
	
	
	
	
