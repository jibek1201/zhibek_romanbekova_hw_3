import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.5, 6.1, -3.2, 7.5, 1.6, 9.3, -5.1, 18.6, -95.9, 10.7, -0.8, 56.2,31.4, 12.5, -34.3};
        int cnt = 0;
        double sum = 0;
        boolean flag = false;
        for(double x : numbers){
            if( x < 0){
                flag = true;
            }
            if( flag){
                if( x > 0){
                    cnt++;
                    sum+= x;
                }
            }
        }

        System.out.println(sum/cnt);
    }
}