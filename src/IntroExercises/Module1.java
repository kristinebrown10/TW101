package IntroExercises;

/**
 * Exercises for Module 1
 */
public class Module1 {
    public static void main(String[] args)
    {
        TriangleExercises tri = new TriangleExercises();
        tri.oneAsterisk();
        tri.horizontalLine(5);
        tri.verticalLine(6);
        tri.rightTriangle(4);

        DiamondExercises dia = new DiamondExercises();
        dia.isoscelesTriangle(3);
        dia.diamond(5);
        dia.diamondWithName(4);

        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz();

        PrimeFactorsExercise prime = new PrimeFactorsExercise();
        prime.generate(2310);
    }
}
