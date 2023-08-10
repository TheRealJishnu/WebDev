import java.util.*;

public class ArrayListSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of ArrayList : ");
        boolean flg;
        int n;
        do{
            n = sc.nextInt();
            flg = n <= 0;
            if(flg) System.out.println("Size should be Greater than 0, Enter Again");
        }while(flg);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + n + " Values : ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        System.out.println("Sum is : " + sum);
        sc.close();

    }
}
