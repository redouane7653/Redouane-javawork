package forloops_break_continue;

public class for_break_continue {

	
	public static void main(String[] args) {
	    for(int i = 0; i < 10; i++) {
	        if(i == 2) {
	            continue;
	        }
	        if(i == 7) {
	            break;
	        }
	        
	        System.out.println(i);
	    }
	}
		
	
	
}


