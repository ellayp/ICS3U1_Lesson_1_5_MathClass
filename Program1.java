class Program1 extends ConsoleProgram {

  /**
  * Lets you enter the two sides of a right angled triangle, and then print the hypotenuse.
  * @author: E.Yap
  */
  
  public void run() {
    // Create variables for sideA, sideB, hypotenuse
    double dblSideA;
    double dblSideB;

    double dblHypSqrd;
    double dblHypotenuse;

    // Get values for sideA, sideB
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of side B: ");

    // Compute hypotenuse**2 = sideA**2 + sideB**2
    dblHypSqrd = Math.pow(dblSideA,2) + Math.pow(dblSideB,2);
    dblHypotenuse = Math.sqrt(dblHypSqrd);

    // Output hypotenuse
    System.out.println("The hypotenuse of the right triangle is " + dblHypotenuse);
  }
}
