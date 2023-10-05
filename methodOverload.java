class Calculator 
{
  void add(int a , int b)
  {
    System.out.println("Sum is : "+(a+b));
  }
  void add(int a, float b)
  {
    System.out.println("Subtract is : "+(a-b));
  }
  void add(float a, float b )
  {
   System.out.println("Multiply is : "+(a*b));
  }
  void add(double a, double b)
  {
   System.out.println("Divide is : "+(a/b));
  }
} // end class calculator
 
class methodOverload
{
 public static void main(String args[])
  {
    Calculator m = new Calculator();
    m.add(20,47);  m.add(56,45.6f);   m.add(45.6f, 56.5f);  m.add(23.45, 34.678);
  }
}