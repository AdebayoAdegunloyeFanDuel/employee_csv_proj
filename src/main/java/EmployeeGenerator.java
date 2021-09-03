import java.util.HashMap;
import java.util.Map;

public class EmployeeGenerator {
    private final EmployeeRecordScanner employeeRecordScanner = new EmployeeRecordScanner();

    public Map<String, Employee> generateEmployeesMap(){
        Map<String, Employee> employeeMap = new HashMap<>();

        for(String[] employee: employeeRecordScanner.generateRawEmployeeData()){
            Employee rawEmployee = new Employee(employee);
            employeeMap.put(rawEmployee.getEmployeeID(), rawEmployee);
        }
        return employeeMap;
    }

}
