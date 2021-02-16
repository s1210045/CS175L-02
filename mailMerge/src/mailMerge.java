import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System. in) ;
		
		//PrompText
		System.out.println("Please enter your first name:");
		String first = in.nextLine();
		
		System.out.println("Please enter your last name:");
		String last = in.nextLine();
		
		System.out.println("Please enter your house number:");
		String number = in.nextLine();
		
		System.out.println("Please enter your street: ");
		String street = in.nextLine();
		
		System.out.println("Is this address correct? ");
		String address = in.nextLine();
			
		//replace something in a string
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		
		replaceText1 = replaceText1.replace("<firstName>",first);
		replaceText1 = replaceText1.replace("<lastName>",last);
		replaceText2 = replaceText2.replace("<houseNumber>",number);
		replaceText2 = replaceText2.replace("<street>",street);
		replaceText3 = replaceText3.replace("<yORn>",address);

		//Final output
        System.out.println(replaceText1);
        System.out.println(replaceText2);
        System.out.println(replaceText3);
       
		
		
		
		
		
		
		
	
		
		
		
		
		     


}
}
