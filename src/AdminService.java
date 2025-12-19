import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminService {

    public void viewRequests() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee_requests");

            System.out.println("\n--- Employee Leave Requests ---");

            while (rs.next()) {
                System.out.println("------------------------------");
                System.out.println("Employee ID   : " + rs.getInt("emp_id"));
                System.out.println("Employee Name : " + rs.getString("emp_name"));
                System.out.println("Leave Days    : " + rs.getInt("leave_days"));
                System.out.println("Status        : " + rs.getString("status"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
