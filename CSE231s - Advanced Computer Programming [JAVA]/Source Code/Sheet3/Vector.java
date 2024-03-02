import java.util.Scanner;
public class Vector {
    double x;
    double y;
    
    // Default constructor
    public Vector(){
        x = 0;
        y = 0;
    }
    // Parametrized constructor
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }
    // x & y getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    // x & y setters
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    // Magnitude method
    double magnitude(){
        return Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
    }
    // Angle method
    double angle(){
        return Math.toDegrees(Math.atan(y / x));
    }
    // printing method
    void print(){
        System.out.println("Vector in cartesian form: " + x + "i + " + y + "j");
        System.out.println("Vector in polar form: " + magnitude() + "[" + angle() + "]");
    }
    
    // toString method ->> will be called in Line2D.java
    @Override
    public String toString() {
        return "Vector: (" + x + ", " + y + ")";
    }

    // Vector STATIC addition method
    static Vector add(Vector v1, Vector v2){
        double newX = v1.x + v2.x;
        double newY = v1.y + v2.y;
        return new Vector(newX, newY);
    }
    // Vector STATIC subtraction method
    static Vector sub(Vector v1, Vector v2){
        double newX = v1.x - v2.x;
        double newY = v1.y - v2.y;
        return new Vector(newX,newY);
    }
    // Read method
    void read(double x,double y){
        this.x = x;
        this.y = y;
    } 

    /** Main method */
    public static void main(String[] args){
        // test cases
        Vector myVector = new Vector(4,5); // vector declaration
        double xValue = myVector.getX(); // x value getter
        double yValue = myVector.getY(); // y value getter
        System.out.println("x: " + xValue + " y: " + yValue); // print x & y values
        myVector.print(); // print method
        myVector.setX(3); // x value setter
        myVector.setY(2); // y value setter
        System.out.println("new x: " + myVector.getX() + " new y: " + myVector.getY()); // print new x & y values
        myVector.print(); // print method
        double magValue = myVector.magnitude(); // magnitude method
        double angleValue = myVector.angle(); // angle method
        System.out.println("magnitude = " + magValue + " angle = " + angleValue); // print magnitude & angle
        Vector myVector2 = new Vector(1,1); // new vector declaration
        Vector summedVector = add(myVector, myVector2); // STATIC vector addition method
        summedVector.print(); // print method
        Vector subbedVector = sub(myVector, myVector2); // STATIC vector subtraction method
        subbedVector.print(); // print method
        myVector2.read(5,9); // read method
        myVector2.print();
        
        System.out.println("-------------------------------------------------");
        // test for a user input:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x value: ");
        double x = input.nextDouble();
        System.out.println("Enter y value: ");
        double y = input.nextDouble();
        input.close();
        Vector userVector = new Vector(x,y);
        userVector.print();
    }
}