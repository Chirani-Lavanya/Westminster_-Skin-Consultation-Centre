import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        String selectedMenuOption;
        while (true) {
            System.out.println("\n");
            System.out.println("---Select an option from the following Menu---");
            System.out.println("\n");
            System.out.println("A :  Add a new doctor");
            System.out.println("D :  Delete a doctor");
            System.out.println("A :  Add Consultation");
            System.out.println("C :  Cancel Consultation");
            System.out.println("P :  Print the list of the doctors"
             );
            System.out.println("S :  Save in a file ");
            System.out.println("\n");
            System.out.print("Enter your Option: ");
            selectedMenuOption = input.nextLine().toUpperCase();
            switch (selectedMenuOption) {
//                case "V" -> viewDetailsOfCabins(cabins);
//                case "A" -> addPassengerToACabin(cabins);
//                case "E" -> displayEmptyCabin(cabins);
//                case "D" -> deletePassengerFromCabin(cabins);
//                case "F" -> findCabinByPassenger(cabins);
//                case "S" -> storeDataIntoFile(cabins);
//                case "L" -> loadDataFromFile();
//                case "O" -> sortPassengersByName(cabins);
                case "Q" -> System.exit(0);
                default -> System.out.println("Please check the menu option you entered and try again \n");
            }
        }
    }
}
