public class Employee {
    private long EmpId;
    private String EmpName;
    private Double salary;
    private String deptname;

    public Employee(long empId, String empName, Double salary, String deptname) {
        this.EmpId = empId;
        this.EmpName = empName;
        this.salary = salary;
        this.deptname = deptname;
    }

    public long getEmpId() {
        return EmpId;
    }

    public void setEmpId(long empId) {
        this.EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        this.EmpName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

}
