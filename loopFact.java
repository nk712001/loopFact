import java.util.Scanner;
public class loopFact {

        public static void main(String[] args) {
         int fact,num;

            Scanner input = new Scanner(System.in);

            System.out.println("enter a number: ");
            num = input.nextInt();
            fact=num;
            for (int i=num;i>1;i--) {
                num--;
                fact *= num;
            }
            System.out.println("factorial is "+fact);
        }

}
