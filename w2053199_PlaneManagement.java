import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class w2053199_PlaneManagement {

    static int[] row_A = new int[14];
    static int[] row_B = new int[12];
    static int[] row_C = new int[12];
    static int[] row_D = new int[14];
    static Ticket[] info_RowA = new Ticket[14];
    static Ticket[] info_RowB = new Ticket[12];
    static Ticket[] info_RowC = new Ticket[12];
    static Ticket[] info_RowD = new Ticket[14];
    static int[][] seatArray = {row_A, row_B, row_C, row_D};


    static int totalTicketsSold = 0;
    static double totalprice = 0.0;

    // main method
public static void main(String[] args){
    Scanner SelectOption = new Scanner(System.in);
    int option = 9;
    while (option != 0){
        try{
            print_options();
            System.out.print(" Please Select an Option : ");
            option = SelectOption.nextInt();


            switch (option) {

                case 1:
                    buy_seat();
                    break;
                case 2:
                    cancel_seat();
                    break;
                case 3:
                    find_first_available();
                    break;
                case 4:
                    seat_Plan();
                    break;
                case 5:
                    print_ticket_info();
                    break;
                case 6:
                    search_ticket();
                    break;

                case 0:
                    System.out.println(" Program Exit , GOOD BYE ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Input must be a letter & Input correct option ");
            }
        } catch (InputMismatchException e){
            System.out.println("Input must be a letter & Input correct option ");
            SelectOption.next();
        }
    }
}

}