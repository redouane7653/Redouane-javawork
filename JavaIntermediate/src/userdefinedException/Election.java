package userdefinedException;

public class Election {

	public void CheckEligibility(int age) throws InvalidAgeException {

		if (age < 18)
			throw new InvalidAgeException("You should be 18 to vote");
		else
			System.out.println("Please cast your vote");

	}

}
