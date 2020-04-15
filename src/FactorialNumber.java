/*
This program calculates factorial of a number.
 */

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 10;
        int result = 1;

        if(num == 0){
            result = 1;
        }
        else{
            for(int i = 1; i <= num; i++){
                result *= i;
            }
        }

        System.out.println("Factorial of " + num + " or (" + num + "!) = " + result);
    }
}
