import java.util.Scanner;
public class numberg {
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1+(int) (100*Math.random());
        int k=3;
        int i, guess;
        System.out.println("A number is chosen "+"between 1 to 100 ."+ "Guess the number "+ "within 3 trials.");
        for (i=0; i<k ; i++)
        {
            System.out.println("Guess the number: ");
            guess= sc.nextInt();
            if (number== guess)
            {
                System.out.println("Congratulations!!" + "You guessed the correct number"  );
                break;
            }
            else if ( number> guess && i!= k-1)
            {
                System.out.println("The number is "+"greater than " +guess);
            }
            else if ( number< guess && i!= k-1)
            {
                System.out.println("The number is "+"less than " +guess);
            }
        }
        if (i== k)
        {
            System.out.println("You have exhausted  "+"k trials" );
            System.out.println("The number was actually : " +number);
        }
    }
    public static void main (String[] args)
    {
        guessingNumberGame();
    }
}
