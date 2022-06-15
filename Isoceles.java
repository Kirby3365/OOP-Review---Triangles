public class Isoceles extends Triangle{
  //A subclass of triangle would inherit the properties and methods of the parent class.
  
  Isoceles(String label, double[] SSS){
    super(label, SSS);
    if(SSS[0] != SSS[1] && SSS[0] != SSS[2] && SSS[1] != SSS[2]){
      System.out.println("Error, Isoceles triangle doesn't have 2 equal sides");
    }
  }
}