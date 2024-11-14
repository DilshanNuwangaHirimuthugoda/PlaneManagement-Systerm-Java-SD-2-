
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//attributes
public class Ticket {


    private String row;
    private int seat;
    private double price;
    private Person person;
//Constructor
    public Ticket(String row, int price, int seat, Person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }
//print_Ticket method
    public void print_Ticket() {
        System.out.println("Row: " + row);
        System.out.println("Seat: " + seat);
        System.out.println("Price: £" + price);
        System.out.println(("Name:" + person.getName()));
        System.out.println(("Surname:" + person.getSurname()));
        System.out.println(("Email:" + person.getEmail()));


    }

    //Get row as String
    public String getRow() {
        return row;
    }
    //Set row as String
    public void setRow(String row) {
        this.row = row;
    }
    //Get seat as String
    public int getSeat() {
        return seat;
    }
    //set seat as String
    public void setSeat(int seat) {
        this.seat = seat;
    }
    //Get price as String
    public double getPrice() {
        return price;
    }
    //Set price as String
    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
