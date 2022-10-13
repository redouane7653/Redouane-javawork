package forloops_break_continue;

public class public_class_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int A = 100; A < 200; A++) {
            if(A > 200) {
                continue;
            }
           if(A > 200) {
              break;
            }
            System.out.println(A);
        }
    }
}