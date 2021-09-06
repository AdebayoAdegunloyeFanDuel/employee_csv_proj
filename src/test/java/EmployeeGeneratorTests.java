import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class EmployeeGeneratorTests {
    private static Employee randomEmployee;
    private static Map<String, Employee> employeeMap;

    @BeforeAll
    public static void setUp(){
        // returning our employee map
        employeeMap = new EmployeeGenerator().generateEmployeesMap();
        // returning our employees raw data
        List<String[]> employeeRawData = new EmployeeRecordScanner().generateRawEmployeeData();
        // Instantiating the random to generate random for us
        Random random = new Random();
        // utimilizing random by passing our raw data array as size to generate our number within the bounds of info
//        System.out.println(new Employee((employeeRawData.get(2)))); similar to below.
        // then adding
        randomEmployee = new Employee(employeeRawData.get(random.nextInt(employeeRawData.size())));
    }

    @Test
    public void employeeRandomTest(){
        assertEquals(randomEmployee.getfName(), employeeMap.get(randomEmployee.getEmployeeID()).getfName());
    }
}
