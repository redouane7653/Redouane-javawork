package strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLiteral = "Hello World!";
        System.out.println(strLiteral); // output will be: Hello World!
	}

	{

String strObject = new String("Hello World!");
System.out.println(strObject); // output will be: Hello World!
}



{

    // Method 1     
    String str1 = "I like strings";
    String str2 = "I like strings";
    System.out.println(str1 == str2); // output will be: true

    // Method 2
    String str3 = new String("I like strings");
    String str4 = new String("I like strings");
    System.out.println(str3 == str4); // output will be: false
    
    
    {
    	
    	
    
    String str5 = new String("I like strings");
    String str6 = new String("I like strings");
    System.out.println(str5.equals(str6));  // output will be: true
    
    
    
    {
    	
    	String myStr = "I like strings";
        int stringLength = myStr.length();
        System.out.println("String Length is " + stringLength);
        // output will be: String Length is 14
    	
    	
    	
    }
    
    
    
    
    
    
    
    }
    
 }
}