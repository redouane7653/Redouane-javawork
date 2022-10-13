package array;

public class Array_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare
		// Instantiate
		// initialise
		
		String[] student;//Declare
		student=new String[5];//instantiate
		student[0]="Hilda";//initialise
		student[1]="Hasan";//
		student[2]="Kev";//
		student[3]="Arifi";//
		student[4]="Edith";//
	
		String[]	City=new String[5];
		
		String[] fruits= {"Banana","Apple","Grapes","Guava", "Pineapple","Avocado"};
		System.out.println("Students--------");
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
			
		}
		System.out.println("Fruits--------");
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
		System.out.println("zipcode------");
		int[] zipcode= {234,634,474645,74648,57857,5746,64536,74657};
		for(int i=0;i<zipcode.length;i++)
		{
			System.out.println(zipcode[i]);
		}

}
}