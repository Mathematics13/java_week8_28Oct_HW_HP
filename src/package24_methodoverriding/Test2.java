package package24_methodoverriding;

//Test class to create objects and call the methods

class Test2
{
   public static void main (String args[])
   {
       SBI s = new SBI();
       ICICI i = new ICICI();
       AXIS a = new AXIS();
       System.out.println("SBI Rate Of Interset :  "   +s.getRateOfInterest());
       System.out.println("ICICI Rate Of Interset :  " +i.getRateOfInterest());
       System.out.println("AXIS Rate Of Interset :  "  +a.getRateOfInterest());
   }
}
