public class EmployeeRequest {

    private int empId;
    private String empName;
    private int leaveDays;
    private String status;

    public EmployeeRequest(int empId, String empName, int leaveDays, String status) {
        this.empId = empId;
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.status = status;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public String getStatus() {
        return status;
    }
}
