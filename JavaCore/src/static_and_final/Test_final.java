package static_and_final;

public class Test_final {

	public static void main(String[] args) {
 Sample_Final obj=new Sample_Final();
 System.out.println(obj.x);
 System.out.println(obj.y);


 
 Sample_Final obj1=new Sample_Final(444);
 System.out.println(obj1.x);
 System.out.println(obj1.y);
 
 
 Sample_Final obj2=new Sample_Final(111,666);
 System.out.println(obj2.x);
 System.out.println(obj2.y);
 
 Country India=new Country(30);
 Country USA=new Country(40);
 Country UK=new Country(20);
 Country xx=new Country();



	}

}
