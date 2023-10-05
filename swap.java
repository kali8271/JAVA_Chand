class swap
{
  public static void main(String args[])
  {
   int x = Integer.parseInt(args[0]); // x = first number
   int y = Integer.parseInt(args[1]); // y = Second number
   System.out.println("First number before swaping : " +x);
   System.out.println("Second number before swaping : " +y);

   x = x+y;
   y = x-y;
   x = x-y;
   System.out.println("First number after swaping : " +x);
   System.out.println("Second nummber after swaping : " +y);
  }
}