interface Area 
{   
    float pi = 3.14f;

    void FindArea(float a, float b);
}

class Circle implements  Area
{
    public void FindArea(float a, float b)
    {
        
        System.out.println("Area of Circle : "+(pi*a*a));
    
    }
}

class Rectangle implements Area
{
    public void FindArea(float a, float b)
    {
         System.out.println("Area of Rectangle : "+(a*b));
    }

}

class Triangle implements Area
{
    public void FindArea(float a, float b)
    {
        System.out.println("Area of Triangle : "+((a*b)/2));
        
    }
}

public class Shapes {
    public static void main(String[] args) {
        Area obj = new Circle();    // upcasting
        obj.FindArea(23.4f, 45.6f);

        Area obj1 = new Rectangle();
        obj1.FindArea(34.5f, 56.6f);

        Area obj2 = new Triangle();
        obj2.FindArea(23.4f, 78.9f);
    }
}
