package question1;

public class Square {

    //properties
    int number;

    //constructor
    public Square(int number){
        this.number = number;
    }

    //Area = x^2
    public int calculateArea(){
        return this.number * this.number;
    }

    //Perimeter = 4x
    public int calculatePerimeter(){
        return 4 * this.number;
    }


}
