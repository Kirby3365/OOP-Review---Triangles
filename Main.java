//OOP Review example
//MATH! Trig calculator

class Main {
  public static void main(String[] args) {
    double[] rightSides = {3d, 4d, 5d};
    Triangle RIGHT = new Triangle("A", rightSides);
    System.out.println("Triangle " + RIGHT.getName() + " with sides of:");
    System.out.println(RIGHT.getSide(0) + " , " + RIGHT.getSide(1) + " , and " + RIGHT.getSide(2));

    System.out.println("Triangle " + RIGHT.getName() + " with angles of:");
    System.out.println(RIGHT.getAngle(0) + " , " + RIGHT.getAngle(1) + " , and " + RIGHT.getAngle(2));

    System.out.println("");
    System.out.println("");

    double[] equalSides = {3d, 3d, 5d};
    Isoceles Iso = new Isoceles("B", equalSides);

    System.out.println("Triangle " + Iso.getName() + " with sides of:");
    System.out.println(Iso.getSide(0) + " , " + Iso.getSide(1) + " , and " + Iso.getSide(2));

    System.out.println("Triangle " + Iso.getName() + " with angles of:");
    System.out.println(Iso.getAngle(0) + " , " + Iso.getAngle(1) + " , and " + Iso.getAngle(2));
  }
}