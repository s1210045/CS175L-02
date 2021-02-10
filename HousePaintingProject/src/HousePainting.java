import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args)
	{
	Scanner in = new Scanner(System. in) ;
	
//inputs of house, window, door
	System.out.println ("Enter cost per square foot: ");
	double SqFtcost  = in.nextInt();
	System.out.println ("Enter length of the house: ");
	int length = in.nextInt();
	System.out.println ("Enter width of the house: ");
	int width = in.nextInt();
	System.out.println ("Enter height of the house: ");
	int height = in.nextInt();	
	System.out.println ("Enter number of Windows: ");
	int numWindows = in.nextInt();
	System.out.println ("Enter length of windows: ");
	int lengthWindow = in.nextInt();
	System.out.println ("Enter width of windows: ");
	int widthWindow = in.nextInt();	
	System.out.println ("Enter number of doors: ");
	int numDoors = in.nextInt();
	System.out.println ("Enter length of doors: ");
	int lengthDoor = in.nextInt();
	System.out.println ("Enter width of door: ");
	int widthDoor = in.nextInt();

//Math for the output
	int windowSqFt = (widthWindow*lengthWindow*numWindows);
	int doorSqFt = (widthDoor * lengthDoor*numDoors);
	int peakSideSqFt = (int) (width * length + (.5 * (length * (height - width))))*2;
	int normalSideSqFt = (length * width)*2;	
	int totalSqFt = (int) normalSideSqFt + peakSideSqFt - doorSqFt - windowSqFt;
	double CostToPaint = (int) (totalSqFt * SqFtcost);

//Output of the system
	System.out.println("Your total paintable surface area is: " + totalSqFt);
	System.out.println("Your estimate is " + CostToPaint + " dollars.");
}
	}