import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of ArrayList : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("ArrayList Before Modification : " + arr);
        for (int i = 0; i < n; i++) {
            arr.set(i, arr.get(i) + 5);
        }
        System.out.println("ArrayList After Modification : " + arr);

    }
}
