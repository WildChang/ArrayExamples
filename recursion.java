import java.util.Scanner;
class recursion
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOdds(n));
        System.out.println(sumEvens(n));
    }
        
        public static int sumOdds(int n)
        {
            if (n<=1)
            {
                return 1;
            }
               else if (n%2==1)
            {
                return n+sumOdds(n-2);
            }
            else
            {
                return sumOdds(n-1);
            }
        }
        public static int sumEvens(int n)
        {
            if (n<=2)
            {
                return 2;
            }
            else if (n%2==0)
            {
                return n+sumEvens(n-2);
            }
            else
            {
                return sumEvens(n-1);
            }
    }
    
 
     public static int count(int n)
    {
        // Base case AKA Stop Condition
         if (n==0)
             return 0; 
 
         if (n==1)
             return 4;
 
         return 4+count(n-1); 
    } 
    public static int bo(int n)
    {
        // Base case AKA Stop Condition
         if (n==0)
             return 0; 

 
         return 20+bo(n-1); 
    } 
    public int bunnyEars(int bunnies) 
{
    if (bunnies ==0)
    {
      return 0;
    }
    return 10 +bunnyEars(bunnies-1);
}
}