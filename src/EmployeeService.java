import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);

    public void submitRequest() {
        try {
            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String empName = sc.nextLine();

            System.out.print("Enter Leave Days: ");
            int leaveDays = sc.nextInt();

            String status = AIRuleEngine.evaluateLeave(leaveDays);

            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO employee_requests(emp_id, emp_name, leave_days, status) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, empId);
            ps.setString(2, empName);
            ps.setInt(3, leaveDays);
            ps.setString(4, status);

            ps.executeUpdate();

            System.out.println("Leave Request Status: " + status);
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
