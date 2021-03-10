package payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    Employee employee;
    @BeforeEach
    void newEmployee(){
        employee = new Employee();
    }

    @Test
    void testSetTitleFalse(){
        assertThrows(IllegalArgumentException.class,()->employee.setTitle("wrongEntry"));
    }
    @Test
    void testSetTitleTrue(){
        employee.setTitle("Mr");
        assertEquals("Mr",employee.getTitle());
        employee.setTitle("Mrs");
        assertEquals("Mrs",employee.getTitle());
        employee.setTitle("Ms");
        assertEquals("Ms",employee.getTitle());
    }
    @Test
    void testSetNameFalse(){
        assertThrows(IllegalArgumentException.class,()->employee.setName("aa"));
    }
    @Test
    void testSetNameTrue(){
        employee.setName("Mohamed");
        assertEquals("Mohamed",employee.getName());
        employee.setName("Mohamed Otaki");
        assertEquals("Mohamed Otaki",employee.getName());
    }
    @Test
    void testSetPPSIDFalse(){
        assertThrows(IllegalArgumentException.class,()->employee.setPpsID("123456789"));
    }
    @Test
    void testSetPPSIDTrue(){
        employee.setPpsID("12345678");
        assertEquals("12345678",employee.getPpsID());
    }
    @Test
    void testSetPhoneFalse(){
        assertThrows(IllegalArgumentException.class,()->employee.setPhone(12345678));
    }
    @Test
    void testSetPhoneTrue(){
        employee.setPhone(123456789);
        assertEquals(123456789,employee.getPhone());
    }
    @Test
    void testSetEmploymentTypeFalse(){
        assertThrows(IllegalArgumentException.class,()->employee.setEmploymentType("wrongEntry"));
    }
    @Test
    void testSetEmploymentTypeTrue(){
        employee.setEmploymentType("Full-Time");
        assertEquals("Full-Time",employee.getEmploymentType());
        employee.setEmploymentType("Part-Time");
        assertEquals("Part-Time",employee.getEmploymentType());
        employee.setEmploymentType("Contract");
        assertEquals("Contract",employee.getEmploymentType());
    }
    @Test
    void testSetAgeFalse(){
        assertThrows(IllegalArgumentException.class,()->employee.setAge(16));
    }
    @Test
    void testSetAgeTrue(){
        employee.setAge(17);
        assertEquals(17,employee.getAge());
    }
}
