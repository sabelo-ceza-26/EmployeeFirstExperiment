package za.ac.cput.domain;

public class Manager extends Employee {
    protected String department;
    protected double bonus;

    private Manager() {
    }
    private Manager(Builder builder) {
        super(builder); // Calls Employee constructor with Builder
        this.department = builder.department;
        this.bonus = builder.bonus;
    }

    public String getDepartment() {
        return department;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartment: " + department +
                "\nBonus: R" + bonus;
    }

    public static class Builder extends Employee.Builder {
        protected String department;
        protected double bonus;

        public Builder setEmployeeNumber(String employeeNumber) {
            super.setEmployeeNumber(employeeNumber);
            return this;
        }

        public Builder setFirstName(String firstName) {
            super.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            super.setLastName(lastName);
            return this;
        }

        public Builder setEmail(String email) {
            super.setEmail(email);
            return this;
        }
        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setBonus(double bonus) {
            this.bonus = bonus;
            return this;
        }

        public Manager.Builder copy(Manager manager) {
            super.copy(manager);
            this.department = manager.department;
            this.bonus = manager.bonus;
            return this;
        }
        public Manager build(){
            return new Manager(this);
        }
    }
}
