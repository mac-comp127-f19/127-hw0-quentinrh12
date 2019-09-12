package basicjava;

public class BasicStuff {
    public static void main(String[] args) {
        double age1 = 19;
        double age0 = 19;
        double sumOfAges = (age1 + age0);
        System.out.println("We are " + age0 + " and " + age1 + " years old!");
        System.out.println("The sum of our ages is " + sumOfAges + "!");
        System.out.println("The sum of our ages is " + (age1 + age0) + "!");
        System.out.println(6/3);
        System.out.println(6/4); //prints 1 instead of 1.5 because division rounds down to the nearest integer
                                 //to print 1.5 we would make 6 or 4 a floating point
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE); 
        System.out.println(Integer.MIN_VALUE - 1);
    }
}
