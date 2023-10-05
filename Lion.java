package animalspack;
public class Lion {
    
    private String color;
    private float weight;
    private int age;

    public Lion(String color, float weight, int age )
    {
        this.color = color;
        this.weight = weight;
        this.age = age;
        System.out.println("Lion color : "+ color+ " Lion Weight : "+ weight+ " Lion age : "+age);

    }
    public boolean isVegetarian()
    {
        return false;
    }
    public boolean canClimb()
    {
        return false;
    }
    public String getSound()
    {
        return "Roaring";
    }
}
