package exercises.part1;

/* 15. Write a Java program to swap two variables.*/
public class Exercise15 {
    public static void main(String[] args) {
        String variableA = "Orange";
        String variableB = "Grape";
        String temporary;

        System.out.println("variableA: " + variableA);
        System.out.println("variableB: " + variableB);


        temporary = variableA;
        variableA = variableB;
        variableB = temporary;
        System.out.println("==========================================================================");
        System.out.println("variableA: " + variableA);
        System.out.println("variableB: " + variableB);
    }

}
