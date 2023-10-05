class Incometax
   {
     public static void main(String args[])
     {
      float income = Integer.parseInt(args[0]);
      String gender = args[1];
      float tax = 0.0f;
      if(gender.equalsIgnoreCase("male"))
      {
        if(income >= 0 && income <= 180000)
        {
          System.out.println("Tax is : " +tax);
        }
        else if(income > 190000 && income <= 500000)
        {
          tax = income *0.1f;
          System.out.println("Tax is : " +tax);
        }
        else if(income > 500000 && income <= 800000)
        {
          tax = income *0.2f;
          System.out.println("Tax is : " +tax);
        }
        else
        {
          tax = income *0.3f;
          System.out.println("Tax is : " +tax);
        }
      }
      else if(gender.equalsIgnoreCase("female"))
      {
        if(income >= 0 && income <= 180000)
        {
          System.out.println("Tax is : " +tax);
        }
        else if(income > 180000 && income <= 500000)
        {
          tax = income *0.1f;
          System.out.println("Tax is : " +tax);
        }
        else if(income > 500000 && income <= 800000)
        {
          tax = income *0.2f;
          System.out.println("Tax is : " +tax);
        }
        else
        {
          tax = income *0.3f;
          System.out.println("Tax is : " +tax);
        }
      }
     }
  }
        

