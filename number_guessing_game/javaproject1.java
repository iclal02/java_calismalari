import java.util.Random;
import java.util.Scanner;

public class javaproject1{
    public static void main(String[] args){
        
               //  project1 number guessing game
        
               Scanner input= new Scanner(System.in);
               Random random= new Random();
               int Random= (int)(Math.random()*10);
               int count=1;
               int guess=1;
        
               do {
                
                System.out.println("guess the number: ");
                guess= input.nextInt();
                
                if(guess<Random)  System.out.println("guess is low");
                else if (guess>Random) System.out.println("guess is high");
                else break;
                count++;
        
               } while (guess!=Random);
        
            
               System.out.println("congratulation, you got it on the " + count + ". try" );
            }
        }
    
