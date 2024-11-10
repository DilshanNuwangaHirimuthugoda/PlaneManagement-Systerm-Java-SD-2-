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

        //buy seat method
    public static void buy_seat() {

        try {
            Scanner buy_seat = new Scanner(System.in);
            System.out.print("  input a row letter  : ");
            String seat_number_row_letter = buy_seat.nextLine().toUpperCase(Locale.ROOT);
            System.out.print("  input a seat number : ");
            int seat_number = buy_seat.nextInt();
            switch (seat_number_row_letter) {
                case "A":
                    if ((row_A[seat_number - 1]) == 0) {
                        row_A[seat_number - 1] = 1;
                        buy_seat.nextLine();
                        System.out.print("Enter Your Name: ");
                        String name = buy_seat.nextLine();
                        System.out.print(" Enter Your surname : ");
                        String surname = buy_seat.nextLine();
                        System.out.print(" Enter Your email : ");
                        String email = buy_seat.nextLine();
                        System.out.println();
                        System.out.println("Your Seat Booked Successfully...");
                        Person info = new Person(name, surname, email);
                        int priceA = SeatPrice(seat_number);
                        Ticket infoUser = new Ticket("A", priceA, seat_number, info);
                        info_RowA[seat_number - 1] = infoUser;
                        infoUser.Save_File();

                        totalTicketsSold++;
                    } else {
                        System.out.println("This seat already booked...");
                    }
                    break;
                case "B":
                    if ((row_B[seat_number - 1]) == 0) {
                        row_B[seat_number - 1] = 1;
                        buy_seat.nextLine();
                        System.out.print("Enter Your Name: ");
                        String name = buy_seat.nextLine();
                        System.out.print(" Enter Your surname : ");
                        String surname = buy_seat.nextLine();
                        System.out.print(" Enter Your email : ");
                        String email = buy_seat.nextLine();
                        System.out.println();
                        System.out.println(" Your Seat Booked Successfully...");
                        Person info = new Person(name, surname, email);
                        int priceB = SeatPrice(seat_number);
                        Ticket infoUser = new Ticket("B", priceB, seat_number, info);
                        info_RowB[seat_number - 1] = infoUser;
                        infoUser.Save_File();
                        totalTicketsSold++;
                    } else {
                        System.out.println("This seat already booked...");
                    }
                    break;
                case "C":
                    if ((row_C[seat_number - 1]) == 0) {
                        row_C[seat_number - 1] = 1;
                        buy_seat.nextLine();
                        System.out.print("Enter Your Name: ");
                        String name = buy_seat.nextLine();
                        System.out.print(" Enter Your surname : ");
                        String surname = buy_seat.nextLine();
                        System.out.print(" Enter Your email : ");
                        String email = buy_seat.nextLine();
                        System.out.println();
                        System.out.println("Your Seat Booked Successfully...");
                        Person info = new Person(name, surname, email);
                        int priceC = SeatPrice(seat_number);
                        Ticket infoUser = new Ticket("C", priceC, seat_number, info);
                        info_RowC[seat_number - 1] = infoUser;
                        infoUser.Save_File();
                        totalTicketsSold++;
                    } else {
                        System.out.println("This seat already booked...");
                    }
                    break;
                case "D":
                    if ((row_D[seat_number - 1]) == 0) {
                        row_D[seat_number - 1] = 1;
                        buy_seat.nextLine();
                        System.out.print("Enter Your Name: ");
                        String name = buy_seat.nextLine();
                        System.out.print(" Enter Your surname : ");
                        String surname = buy_seat.nextLine();
                        System.out.print(" Enter Your email : ");
                        String email = buy_seat.nextLine();
                        System.out.println();
                        System.out.println("Your Seat Booked Successfully...");
                        Person info = new Person(name, surname, email);
                        int price = SeatPrice(seat_number);
                        Ticket infoUser = new Ticket("D", price, seat_number, info);
                        info_RowD[seat_number - 1] = infoUser;
                        infoUser.Save_File();
                        totalTicketsSold++;
                    } else {
                        System.out.println("This seat already booked...");
                    }
                    break;
                default:
                    System.out.println("Invalid Row Number...");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid Seat Number...");
        }

    }
       //cancel seat method
    public static void cancel_seat() {
        Scanner cancel_seat = new Scanner(System.in);
        try {
            System.out.print("  input a row letter  : ");
            String seat_number_row_letter = cancel_seat.nextLine().toUpperCase(Locale.ROOT);
            System.out.print("  input a seat number : ");
            int seat_number = cancel_seat.nextInt();
            switch (seat_number_row_letter) {
                case "A":
                    if ((row_A[seat_number - 1]) == 1) {
                        row_A[seat_number - 1] = 0;
                        cancel_seat.nextLine();
                        info_RowA[seat_number-1].delete();
                        System.out.println();
                        System.out.println("Seat Cancel...");

                        totalTicketsSold--;
                    } else {
                        System.out.println("This seat is not booked...");
                    }
                    break;
                case "B":
                    if ((row_B[seat_number - 1]) == 1) {
                        row_B[seat_number - 1] = 0;
                        info_RowB[seat_number-1].delete();
                        cancel_seat.nextLine();
                        System.out.println();
                        System.out.println("Seat Cancel...");
                        totalTicketsSold--;
                    } else {
                        System.out.println("This seat is not booked...");
                    }
                    break;
                case "C":
                    if ((row_C[seat_number - 1]) == 1) {
                        row_C[seat_number - 1] = 0;
                        info_RowC[seat_number-1].delete();
                        cancel_seat.nextLine();
                        System.out.println();
                        System.out.println("Seat Cancel...");
                        totalTicketsSold--;
                    } else {
                        System.out.println("This seat is not booked...");
                    }
                    break;
                case "D":
                    if ((row_D[seat_number - 1]) == 1) {
                        row_D[seat_number - 1] = 0;
                        info_RowD[seat_number-1].delete();
                        cancel_seat.nextLine();
                        System.out.println();
                        System.out.println("Seat Cancel...");
                        totalTicketsSold--;
                    } else {
                        System.out.println("This seat is not booked...");
                    }
                    break;
                default:
                    System.out.println("Invalid Row Number...");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid Seat Number...");
        }
    }
  //find_first_available method
    public static void find_first_available() {
        boolean find_seat = false;
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                if (seatArray[i][j] == 0) {
                    System.out.println("First available seat is " + (char) ('A' + i) + ", Seat " + (j + 1));
                    find_seat = true;
                    break;
                }
            }
            if (find_seat) break;
        }
        if (!find_seat) System.out.println("No available seats found.");
    }
    // Seat Plan method
    static void seat_Plan() {
        System.out.println();
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                if (seatArray[i][j] == 0) {
                    System.out.print(" O ");

                } else if (seatArray[i][j] == 1) {
                    System.out.print(" X ");
                }
            }

            System.out.println();
        }

    }
    //print ticket info method
    public static void print_ticket_info() {


        // Loop through the soldTickets array and print ticket information
        System.out.println();
        System.out.println("********* Tickets Information *******");
        System.out.println();
        System.out.println("Total Tickets Sold : " + totalTicketsSold);
        System.out.println();
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                if (seatArray[i][j] == 1) {
                    switch (i) {
                        case 0:
                            info_RowA[j].print_Ticket();
                            totalprice+=info_RowA[j].getPrice();
                            break;
                        case 1:
                            info_RowB[j].print_Ticket();
                            totalprice+=info_RowB[j].getPrice();
                            break;
                        case 2:
                            info_RowC[j].print_Ticket();
                            totalprice+=info_RowC[j].getPrice();
                            break;
                        case 3:
                            info_RowD[j].print_Ticket();
                            totalprice+=info_RowD[j].getPrice();
                            break;
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("total price: £ " + totalprice);


    }

    // search_ticket method
    static void search_ticket() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the Row:");
            String SearchRow = input.next().toUpperCase();

            System.out.print("Enter the seat number:");
            int SearchSeat = input.nextInt();
            SearchSeat -= 1;
            switch (SearchRow) {
                case "A":
                    SeatSearch(SearchSeat, info_RowA, row_A);
                    return;
                      case "B":
                    SeatSearch(SearchSeat, info_RowB, row_B);
                    return;
                case "C":
                    SeatSearch(SearchSeat, info_RowC, row_C);
                    return;
                case "D":
                    SeatSearch(SearchSeat, info_RowD, row_D);
                    return;
                default:
                    System.out.println("Invalid option.");
                    return;
            }
        } catch (InputMismatchException e) {
            System.out.print("Row must be a letter");
            input.next();
        }

        //SeatSearch method
    public static void SeatSearch(int Input1, Ticket[] InputArray, int[] seat_row_entered) {
        if (seat_row_entered[Input1] == 0) {
            System.out.println("Seat is available");
        } else if (seat_row_entered[Input1] == 1) {
            System.out.println("Ticket is already booked");
            InputArray[Input1].print_Ticket();
        } else {
            System.out.println("Invalid input or seat status");
        }
    }

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

//SeatPrice method
public static int SeatPrice(int seat) {
    if (seat <= 4) {
        return  200;
    } else if (seat < 9) {
        return 150;
    } else if (seat < 14) {
        return 180;
    }
    return seat;
}
}


}