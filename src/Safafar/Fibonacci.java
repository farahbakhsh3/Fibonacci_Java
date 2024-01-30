package fibonacci;
        
  public class Fibonacci {
 
    public static long Fibonacci (int n) {
        if (n <= 1) return n; 
        else return Fibonacci (n-1) + Fibonacci(n-2);
    }
 
  
    public static void main(String[] args) {
        int N = 30;
        for (int i = 0; i <= N; i++)
            System.out.println(Fibonacci (i)); 
    } 
}
