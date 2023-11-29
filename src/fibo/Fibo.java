package fibo;

public class Fibo {

    static int fibonachi(int n){
        if ((n==0) || (n==1))
                return 1;
        return fibonachi(n-1)+fibonachi(n-2);
    }
    public static void main(String[] args) {
            int n = 45;
            System.out.println(String.format("fibo(%d) = %d", n, fibonachi(n)));
    }
}




