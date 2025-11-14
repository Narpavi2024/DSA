package Bitmanipulation1;

public class findmagicnumber {
    public static void main(String[] args) {
      int  A = 3;
        System.out.println(magicnum(A));
    }

    private static int magicnum(int A) {
        int ans = 0;
        int r = 0;
        int power = 5;
        while (A>0){
            r = A%2;
            A = A/2;

            ans += r * power;
            power *= 5;
        }
        return ans;
    }
}
