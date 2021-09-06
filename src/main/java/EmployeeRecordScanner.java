import config_mgr.ConfigMgr;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeRecordScanner {
    private static final Logger logger = LogManager.getLogger(EmployeeRecordScanner.class);
    // File reading object
    private final EmployeeFileReader employeeFileReader = new EmployeeFileReader();

    //
    public List<String[]> generateRawEmployeeData(){
        List<String[]> employeeRawData = new ArrayList<>();
        // Scanner obj simply takes our file reader obj and prepares a scanner obj to work with our file
        logger.debug("Start Employees csv Scanner");
        Scanner scanner = new Scanner(employeeFileReader.empFileReader(ConfigMgr.employeeFileLocation()));
        scanner.nextLine();
        while (scanner.hasNext()) {
            // Here we are looping and adding each item from our scanner into our employee data Arraylist
            employeeRawData.add(scanner.nextLine().split(","));
        }
        logger.debug("Employees Scanner finished");
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
