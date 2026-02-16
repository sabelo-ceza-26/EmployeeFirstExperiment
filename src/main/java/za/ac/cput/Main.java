package za.ac.cput;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Manager;
import za.ac.cput.factory.AddressFactory;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.factory.ManagerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Address x = AddressFactory.createAddress("14","Station road",
                "Cape Town","7450");

        Employee emp = EmployeeFactory.createEmployee("220054665",
                "Regina",
                "Kenny","reginak@cput.ac.za",x);
        Manager manager = ManagerFactory.createManager("25468","Sabelo",
                "Ceza", "sabeloceza@gmail.com", x, "Information Technology",
                50000.00);

        System.out.println(manager.toString());






        }
    }
