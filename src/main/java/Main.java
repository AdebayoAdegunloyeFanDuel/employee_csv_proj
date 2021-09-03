public class Main {

    public static void main(String[] args) {
        EmployeeGenerator employeeGenerator = new EmployeeGenerator();
        System.out.println(employeeGenerator.generateEmployeesMap().get("198429").getfName());
    }

}
