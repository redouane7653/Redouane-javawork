package whileLoops;

public class Switch {

	
	public static void main(String[] args) {
        String card = "Upasana";
        switch (card) {
        case "club":
            System.out.println("you got a club");
            break;
        case "diamond":
            System.out.println("you got a diamond");
            break;
        case "spade":
            System.out.println("you got a spade");
            break;
        case "heart":
            System.out.println("you got a heart");
            break;
        default :
            System.out.println("Not a valid card");
        }
    }
}
