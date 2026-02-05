package JavaCode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID nakren : ");
        String ID = input.nextLine();

        System.out.print("Enter Name nakren : ");
        String Name = input.nextLine();
        
        System.out.print("Enter Name Age : ");
        int Age = input.nextInt();
        input.nextLine();

        Class nakren = new Class(ID , Name , Age) ;

        System.out.println("Sawaddee");
        System.out.println("Gayaungkanr");


    }
}