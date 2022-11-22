public class Epsilon {
    public static void main(String[] args) {

        // int x = 1;
        // int y = 0;

        // while (1 + x > 1) {
        // x = x / 2;
        // y = y + 1;
        // }
        // System.out.println("The value of the epsilon is " + x);

        // double epsilon = 1.0;
        // while(epsilon + 1 > 1)
        // {
        // epsilon = epsilon / 2;
        // epsilon = epsilon * 2;

        // }
        // System.out.println("The value of the epsilon is " + epsilon);

        double epsilon = 1.0f;

        do{
            epsilon /= 2.0f;
        }
        while ((1.0 + (epsilon / 2.0)) != 1.0);
        
        System.out.println("The value of the epsilon is " + epsilon);

     

    }

}
