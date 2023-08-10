import java.util.*;

public class ArrayListInsertDelete {
    static ArrayList<Integer> arr = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void insert(){
        boolean flg;
        int i;
        do{
            System.out.print("Enter Index to Insert : ");
            i = sc.nextInt();
            flg = i < 0 || i > arr.size();
            if(flg) System.out.println("Index Cannot be less than 0 or Greater than Size, Enter Again");
        }while(flg);
        System.out.print("Enter Value for Insertion : ");
        arr.add(i, sc.nextInt());
    }
    public static void delete(){
        boolean flg;
        int i;
        do{
            System.out.print("Enter Index to Insert : ");
            i = sc.nextInt();
            flg = i < 0 || i > arr.size()-1;
            if(flg) System.out.println("Index Cannot be less than 0 or Greater than Size, Enter Again");
        }while(flg);
        arr.remove(i);
    }
    public static void main(String[] args) {
        
        System.out.println("Enter Input Size : ");
        boolean flg;
        int n;
        do{
            n = sc.nextInt();
            flg = n <= 0;
            if(flg) System.out.println("Size should be Greater than 0, Enter Again");
        }while(flg);
        
        System.out.println("Enter " + n + " Values : ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        while(true){
            System.out.println("Enter 1 for Insertion\nEnter 2 for Deletion");
            System.out.println("Enter 3 for Display\nEnter 4 for Exit");
            System.out.print("Enter Choice : ");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    System.out.println("ArrayList : " + arr);
                    break;
                case 4:
                    System.out.println("Program Exited Successfully");
                    System.exit(0);
                default:
                    System.out.println("Choice Invalid, Enter a valid choice");
                    break;
            }
        }

    }
}
