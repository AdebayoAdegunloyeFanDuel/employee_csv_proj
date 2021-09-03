import config_mgr.ConfigMgr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordScanner {
    // File reading object
    private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

    //
    public List<String[]> generateRawEmployeeData(){
        List<String[]> employeeRawData = new ArrayList<>();
        // Scanner obj simply takes our file reader obj and prepares a scanner obj to work with our file
        Scanner scanner = new Scanner(employeeFileReader.empFileReader(ConfigMgr.employeeFileLocation()));
        scanner.nextLine();
        while (scanner.hasNext()) {
            // Here we are looping and adding each item from our scanner into our employee data Arraylist
            employeeRawData.add(scanner.nextLine().split(","));
        }

        return employeeRawData;
    }

    public static void main(String[] args) {
        EmployeeRecordScanner employeeRecordScanner = new EmployeeRecordScanner();
        employeeRecordScanner.generateRawEmployeeData();

        for (String[] employee: employeeRecordScanner.generateRawEmployeeData()){
            System.out.println(Arrays.toString(employee));
        }

    }
}
