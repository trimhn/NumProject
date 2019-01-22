import java.util.Scanner;

public class PrimeNo {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);

        int x=0;

        boolean isPrime=true;

        System.out.println("Please enter a number: ");

        x = a.nextInt();





        System.out.println("You've entered: " + x);

        // add this statement for complete presentation

        System.out.println("1 is a non-prime number.");



        // outer loop to count the numbers 1 through user input, x

        for(int i=2; i<=x; i++){

            isPrime = true;



            // inner loop to count denominator, from 2 to x-1

            for(int j=2; j<i; j++){



                // condition to test for prime

                int remainder = i%j;

                if(remainder == 0){

                    isPrime = false;

                    break;



                }



            }



            // If isPrime is true print that the number is a prime number

            if (isPrime){

                System.out.println(i + " is a prime number.");

            }else

                System.out.println(i + " is a non-prime number.");



        }



    }
    }

