package za.ac.cput.domain;

//Plain old Java Object
public class Employee {
    protected String employeeNumber;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected Address address; //composition

    public Employee() {
    }
    public Employee(String employeeNumber, String firstName, String lastName, String email, Address address) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
    private Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        }


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
    public Address getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return
                "Employee Details: "+
                "\nEmployeeNumber: " + employeeNumber +
                        "\nFirst Name: " + firstName +
                        "\nLast Name: " + lastName+
                        "\nEmail: " + email+ "\nAddress: "+address;
    }
    public static class Builder{
        protected String employeeNumber;
        protected String firstName;
        protected String lastName;
        protected String email;
        protected Address address;


        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
        public Builder copy(Employee employee){
                this.employeeNumber = employee.employeeNumber;
                this.firstName = employee.firstName;
                this.lastName = employee.lastName;
                this.email = employee.email;
                this.address = employee.address;
                return this;
        }
        public Employee build(){
                return new Employee(this);
            }
        }

    }
