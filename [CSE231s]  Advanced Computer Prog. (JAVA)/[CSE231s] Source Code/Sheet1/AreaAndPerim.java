public class AreaAndPerim{
    // a) rectangle method
    public void rectangle(float width, float height){
        float perimeter = 2*(width + height);
        float area = width * height;
        System.out.println("The rectangle's perimeter = 2 x ("+ width +" + "+ height +") = " + perimeter);
        System.out.println("The rectangle's area = "+ width + " x " + height + " = " + area);
    }

    // b) square method
    public void square(float side){
        float perimeter = 4 * side;
        float area = side * side;
        System.out.println("The square's perimeter = 4 x " + side + " = " + perimeter);
        System.out.println("The square's area = " + side + " x " + side + " = " + area);
    }

    // c) circle method
    public void circle(float radius){
        float perimeter = (float) (2 * Math.PI * radius); // cast to "float" because Math.PI is originally a "double" value
        float area = (float) (Math.PI * radius * radius);
        System.out.println("The circle's circumference = 2 x pi x " + radius + " = " + perimeter);
        System.out.println("The circle's area = " + "pi x " + radius + " x " + radius + " = " + area);

    }

    // main method:
    public static void main(String[] args){
        AreaAndPerim testCases = new AreaAndPerim();
        testCases.rectangle(4.0f,5.5f);
        testCases.square(10.0f);
        testCases.circle(3.2f);
    }
}
