import java.util.Scanner;
public class factsum {
    public static void main(String args [])
    {
        Scanner scan = new Scanner (System.in);
       
        factsum object = new factsum();
        System.out.println("Enter the number ");
        int num =scan.nextInt();
         object.factorial(num);
         object.sum(num);
         
    }
    
    void factorial(int num)
    {
        
       
        
        int  i=1,fact = 1;
        while (i<=num)
        {
          fact = fact*i;
          i++;
        
        }
        System.out.println("Factorial of number is " + fact);
    }
    void sum(int num)
    {
      int s = 0, copy = num;

        while (num != 0) {
            s += num % 10;
            num /= 10;
      }
      System.out.println("Sum of number is"+s);
    }
   

    }
