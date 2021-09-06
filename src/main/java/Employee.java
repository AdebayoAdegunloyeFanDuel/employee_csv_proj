public class Employee {
    private String employeeID;
    private String namePrefix;
    private String fName;
    private String mName;
    private String lName;
    private String gender;
    private String email;
    private String DOB;
    private String dateOfJoining;
    private int salary;

    public Employee(String[] employeeRawData){
        this.employeeID = employeeRawData[0];
        this.namePrefix = employeeRawData[1];
        this.fName = employeeRawData[2];
        this.mName = employeeRawData[3];
        this.lName = employeeRawData[4];
        this.gender = employeeRawData[5];
        this.email = employeeRawData[6];
        this.DOB = employeeRawData[7];
        this.dateOfJoining = employeeRawData[8];
        this.salary = Integer.parseInt(employeeRawData[9]);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getDOB() {
        return DOB;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    // NO setters because we are not interested in setting or changing any data.


}
