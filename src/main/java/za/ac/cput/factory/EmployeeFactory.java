package za.ac.cput.factory;


import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;

public class EmployeeFactory {
    public static Employee createEmployee(String employeeNumber, String firstName, String lastName,
                                          String email,Address address) {
        return new Employee.Builder()
                .setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .build();
    }
}
