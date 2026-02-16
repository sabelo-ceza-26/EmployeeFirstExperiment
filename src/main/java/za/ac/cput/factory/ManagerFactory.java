package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Manager;

public class ManagerFactory {

    public static Manager createManager(String employeeNumber, String firstName,
                                        String lastName, String email, Address address, String department,
                                        double bonus) {
        return new Manager.Builder()
                .setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .setDepartment(department)
                .setBonus(bonus)
                .build();


    }
}
