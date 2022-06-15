import java.lang.Math;

public class Triangle {
  //Properties

  private String name;

  private double[] sides = new double[3];

  private double[] angles = new double[3]; //Angles and their corresponding sides are OPPOSITE. 

  //Encapsulation - private variables can't be read or changed unless get() or set() methods are used. 

  String getName(){
    return name;
  }

  double getAngle(int index){
    return angles[index];
  }

  double getSide(int index){
    return sides[index];
  }

  //No SET methods because changing one angle or side would mean you no longer have a triangle. 

  //Constructor - to make a triangle
  Triangle(String label, double[] SSS){
    name = label;

    //Construct a triangle from all 3 sides. 

    sides = SSS;

    double cos0 = (sides[1]*sides[1] + sides[2]*sides[2] - sides[0]*sides[0])/(2*sides[1]*sides[2]);

    double angle0 = Math.acos(cos0)*180/Math.PI;

    double cos1 = (sides[0]*sides[0] + sides[2]*sides[2] - sides[1]*sides[1])/(2*sides[0]*sides[2]);

    double angle1 = Math.acos(cos1)*180/Math.PI;

    double cos2 = (sides[0]*sides[0] + sides[1]*sides[1] - sides[2]*sides[2])/(2*sides[0]*sides[1]);

    double angle2 = Math.acos(cos2)*180/Math.PI;

    angles[0] = angle0;
    angles[1] = angle1;
    angles[2] = angle2;

  }

  //Polymorphism
  Triangle(String label, double side0, double angle0, double angle1){
    name = label;
    sides[0] = side0;

    angles[0] = angle0;
    angles[1] = angle1;

    //Solve the other 3 unknown things.
    double angle2 = 180 - angle0 - angle1;

    double side1 = side0 * Math.sin(angle1) / Math.sin(angle0);

    double side2 = side1 * Math.sin(angle2) / Math.sin(angle1);

    sides[1] = side1;
    sides[2] = side2;
    angles[2] = angle2;
  }

  //Polymorphism is when two or more methods have the same NAME but behave differently in different contexts. 
  Triangle(String label, double[] SASSides, double SASAngle){
    name = label;
    sides[0] = SASSides[0];
    sides[1] = SASSides[1];

    angles[2] = SASAngle;

    //Solve the other 3 unknown things.

  }
}