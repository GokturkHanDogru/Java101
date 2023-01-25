package Entry;

public class MainEmployee {
    public static void main(String[] args) {

        Employee alex = new Employee("Alex", 2000, 45, 2021);
        alex.raiseSalary();
        alex.bonus();
        alex.tax();
        alex.printInfo();
    }
}
