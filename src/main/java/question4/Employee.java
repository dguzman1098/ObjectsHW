package question4;

public class Employee {

    int hoursWorked;
    double hourlyPay;

    public Employee(int hoursWorked, double hourlyPay) {
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

    public double pay(){
        return hoursWorked * hourlyPay;
    }

    public static void main(String[] args) {
        Employee worker1 = new Employee(40, 21.50);
        Employee worker2 = new Employee(34, 23.70);
        System.out.println(worker1.pay());
        System.out.println(worker2.pay());

    }
}
