package static_and_final;

public class Sample_Final {
	
	final int x=100;// declaration
	final int y;
	
	//static final int big=555;
	
	public Sample_Final() {//in the constructor
		this.y=333;
	}
	public Sample_Final(int temp) {// in the constructor
		this.y=temp;
		
		
	}
	public Sample_Final(int a, int b) {// in the constructor
		b++;
		this.y=a;
		

}
}
