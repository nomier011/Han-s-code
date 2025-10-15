package rentalh;

import Config.config;
import java.util.Scanner;


public class Customer {
    
    Scanner sc = new Scanner(System.in);
    config database = new config();
    
    public void Customer (){
        
        System.out.println("1. View Available Houses");
        System.out.println("2. Make a Booking");
        System.out.println("3. View My Bookings");
        System.out.println("4. Make Payments");
        System.out.println("5. Request Maintenance");
        System.out.println("6. Logout / Exit");
        System.out.print("Enter your choice: ");
        int respo = sc.nextInt();
        
    }
}
                                    
                                    
                                
                          

