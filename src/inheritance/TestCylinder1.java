// TestCylinder.java: Use inheritance. The source code of 
// this file is in \chapter8\TestCylinder.java
package inheritance;

public class TestCylinder1 {
  public static void main(String[] args) {
    // Create a Cylinder object and display its properties
    Cylinder1 myCylinder = new Cylinder1(5.0, 2.0);
    System.out.println("The length is " + myCylinder.getLength());
    System.out.println("The radius is " + myCylinder.getRadius());
    System.out.println("The volume of the cylinder is " +
      myCylinder.findVolume());

    System.out.println("The area of the circle is " +
      myCylinder.findArea());
  }
}