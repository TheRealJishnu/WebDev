import java.util.*;

class DynArray{
    int size, n;
    int arr[];
    Scanner sc = new Scanner(System.in);
    public DynArray(int s){
        size=s;
        arr = new int[size];
        n = 0;
    }
    void input(){
        do{
            System.out.print("Enter Number of Elements To Enter : ");
            n = sc.nextInt();
            if(n > size){
                System.out.println("Entered Size is More than Capacity");
            }
        }while(n > size);
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    int insertion(){
        if(n == size){
            System.out.println("Array is Full, Insertion Not Possible");
            return 0;
        }

        System.out.print("Enter Index Number : ");
        int ind = sc.nextInt();
        if(ind > n){
            System.out.println("Cannot Insert in This Index");
            return 0;
        }

        for (int i = n; i >= ind; i--) {
            arr[i] = arr[i-1];
        }
        System.out.print("Enter Element to Insert : ");
        arr[ind] = sc.nextInt();
        n++;
        return 1;
    }

    int deletion(){
        if(n == 0){
            System.out.println("Array is Empty, Cannot Delete");
            return 0;
        }
        System.out.print("Enter index to Delete : ");
        int ind = sc.nextInt();
        if(ind < 0 || ind >=n){
            System.out.println("Invalid Index for Deletion");
            return 0;
        }

        for (int i = ind; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("Deletion at index " + ind + " Successfully");
        n--;
        return 1;
    }

    int display(){
        if(n == 0){
            System.out.println("No Element to Display");
            return 0;
        }
        System.out.print("Displaying Elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return 1;
    }
}

public class DynamicArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        DynArray a = new DynArray(size);
        while (true) {
            System.out.println("---------------MENU------------------");
            System.out.println("Enter 1 to Input Array");
            System.out.println("Enter 2 to Insert an Element in Array");
            System.out.println("Enter 3 to Delete an Element in Array");
            System.out.println("Enter 4 to Display Array");
            System.out.println("Enter 5 to Exit Program");
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a.input();
                    break;
                case 2:
                    a.insertion();
                    break;
                case 3:
                    a.deletion();
                    break;
                case 4:
                    a.display();
                    break;
                case 5:
                    System.out.println("Program Closed Successfully");
                    System.exit(0);
                default:
                    System.out.println("Please Enter A Valid Choice");
                    break;
            }
        }
    }
}
