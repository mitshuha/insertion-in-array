import java.util.Scanner;

public class array_insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int array[]=new int[size+1];
        System.out.println("enter the element in array");
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the existing array");
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        System.out.println("enter the location where you want to insert the element");

        int loc=sc.nextInt();
        loc=loc-1;
        System.out.println("enter the element");
        int number=sc.nextInt();

        for (int i=size;i>=loc;i--){
            array[i]=array[i-1];
        }
        array[loc]=number;
        size++;

        System.out.println("array after insertion");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }



    }
}
