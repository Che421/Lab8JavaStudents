import java.util.Scanner;

/**
 * @author Cheo Rowzee
 *
 */
public class AboutJavaStudents {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
	String[] names = {"Michelle", "Tiffany", "Camila", "Joseph"};
	String[] hometowns = {"Hong Kong", "Detriot", "Brazil", "Dearborn"};
	String[] favoriteFoods = {"sushi", "olives", "chocolate", "pasta"};
	int userNum = 0;
	String userInput = null;
	String knowMore = "yes";
	//System.out.println("Which student would you l ike to know more about? (1-4)");
	userNum = Validator.getInt(scnr, "Which student would you l ike to know more about? (1-4)", 1, 4);
	//scnr.nextLine();
	
	while (knowMore.equalsIgnoreCase("Yes")) {
		System.out.println("Student " + userNum + " is " + names[userNum - 1] + ".");
		System.out.println("what would you like to know about " + names[userNum - 1]);
		userInput = Validator.getString(scnr, "\"hometown\" or \"food?\"");
		switch (userInput) {
		case "Hometown":
			System.out.println(hometowns[userNum - 1]);
			break;
		case "food":
			System.out.println(favoriteFoods[userNum - 1]);
			break;
		default:
			System.out.println("Invalid input");
		}
		knowMore = Validator.getString(scnr, "Would you like to know more about this student? Yes or No");
	}
	
	System.out.println("Goodbye!!");
	
	}

}
