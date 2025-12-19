import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        AdminService adminService = new AdminService();

        while (true) {
            System.out.println("\n=== SmartOps Back Office Automation ===");
            System.out.println("1. Employee Leave Request");
            System.out.println("2. Admin View Requests");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    employeeService.submitRequest();
                    break;
                case 2:
                    adminService.viewRequests();
                    break;
                case 3:
                    System.out.println("Exiting System...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
