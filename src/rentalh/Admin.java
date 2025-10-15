package rentalh;

import Config.config;
import java.util.Scanner;


public class Admin 


{public static void viewUsers() {
    String votersQuery = "SELECT * FROM tbl_users";
    String[] votersHeaders = {"ID", "Name", "Email", "Role", "Cnumber", "Status"};
    String[] votersColumns = {"ID", "Name", "Email", "Role", "Cnumber", "Status"};

    config conf = new config();
    conf.viewRecords(votersQuery, votersHeaders, votersColumns);
}

    
    
    Scanner sc = new Scanner(System.in);
    config database = new config();
 
    public void Admin (){
    
    System.out.println("\n=== WELCOME TO ADMIN DASHBOARD ===");
            System.out.println("1. Approve Customer Accounts");
            System.out.println("2. View All Customers");
            System.out.println("3. Manage Properties (Add / Update / Remove)");
            System.out.println("4. View Available Houses");
            System.out.println("5. View Reservations / Bookings");
            System.out.println("6. View or Update Payment Status");
            System.out.println("7. Logout / Exit");
            System.out.print("Enter your choice: ");

            int respo = sc.nextInt();

                                        switch (respo) {
                                            case 1:
                                                viewUsers();
                                                System.out.print("Enter ID to Approve: ");
                                                int ids = sc.nextInt();

                                                String sql = "UPDATE tbl_users SET Status = ? WHERE ID = ?";
                                                database.updateRecord(sql, "Approved", ids);
                                                break;
                                        }
    
    }
    
    
    
}
