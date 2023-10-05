class item
  {
  public static void main(String args[])
    {
     int N = Integer.parseInt(args[0]);
     int Gross = N/144;
     int reminder = N%144;
     int dozen = reminder/12;
     int leftout = reminder%12;
     System.out.println("Gross : " +Gross+ "Dozen : " +dozen+ "Leftout : " +leftout);
    }
  }
      
