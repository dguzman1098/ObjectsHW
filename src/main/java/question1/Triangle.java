package question1;

public class Triangle {

    //properties
    int side1;
    int side2;
    int height;
    int base;


    //constructor
    public Triangle(int side1, int side2, int height, int base){
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.base = base;
    }

    //Area = x^2
    public int calculateArea(){
        return (height*base)/2;
    }

    //Perimeter = a + b + c
    public int calculatePerimeter(){
        return this.side1 + this.side2 + this.base;
    }


}

