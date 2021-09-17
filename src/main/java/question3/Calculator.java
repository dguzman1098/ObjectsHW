package question3;

public class Calculator {
    double num1;
    double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return this.num1 + this.num2;
    }

    public double subtract(){
        return this.num1 - this.num2;
    }
    public double multiply(){
        return this.num1 * this.num2;
    }
    public double divide(){
        return this.num1 / this.num2;
    }

    public double exponent(){
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 10);
        System.out.println(calc.add());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
        System.out.println(calc.exponent());


    }




}
