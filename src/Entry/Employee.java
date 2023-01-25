package Entry;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax =tax;
    }

   public void tax() {
       if(this.salary>=1000){
           tax=(salary*0.03);
       }else{
           tax =0;
       }
    }

    public void bonus() {
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }else{
            bonus=0;
        }
    }

    void raiseSalary() {
        if ((2021-hireYear) < 10) {
            raiseSalary = salary * 0.05;
        }
        if ((2021-hireYear) >= 10 && (2021-hireYear) < 20) {
            raiseSalary = salary * 0.1;
        }
        if ((2021-hireYear)>=20){
            raiseSalary = salary*0.15;
        }
    }
    void printInfo(){

        System.out.println("Name :\t"+this.name);
        System.out.println("Salary :\t"+this.salary);
        System.out.println("Working Hour :\t"+this.workHours);
        System.out.println("Start Year :\t"+this.hireYear);
        System.out.println("Tax Value :\t"+this.tax);
        System.out.println("Bonus :\t"+this.bonus);
        System.out.println("Raising Salary :\t"+ this.raiseSalary);
        System.out.println("Net Worth After Tax and Bonus :\t"+(this.salary-this.tax+this.bonus));
        System.out.println("New Salary : \t"+(this.salary+this.raiseSalary));
    }
}