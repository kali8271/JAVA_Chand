class Father 
{
     void income()
     {
        System.out.println("Father's income ");
     }
     void age()
     {
        System.out.println("Fathers age");
     }
     void relation()
     {
        System.out.println("Have a fabulous family");
     }
}

class Son extends Father
{
    void income()
    {
        System.out.println("Son's income");
    }
    void age()
    {
        System.out.println("Son's age");
    }
    void relation()
    {
        System.out.println("Have a good family");
    }
    void personal()
    {
        System.out.println("Wife");
    }
}

public class overide {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.income();
        obj.age();
        obj.relation();
        obj.personal();

    }
}
