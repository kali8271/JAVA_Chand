package zoopack;
import animalspack.*;
public class Zoo 
{
    public static void main(String[] args) 
	{
          Lion l = new Lion("Brown", 200.2f, 13);
          System.out.println(l.isVegetarian()?"Lion, Yes Vegetarian":"Lion, Non-Vegetarian");
          System.out.println(l.canClimb() ?"Yes,Lion can Climb":"Lion cant't climb");
          System.out.println("Lion sound"+l.getSound() );

	  Elephant E = new Elephant("Brown", 400.4f, 15);
          System.out.println(E.isVegetarian()?"Elephant, Yes Vegetarian":"Elephant, Non-Vegetarian");
          System.out.println(E.canClimb() ?"Yes,Elephant can Climb":"Lion cant't climb");
          System.out.println("Elephant sound"+E.getSound() );
    
      }
}
