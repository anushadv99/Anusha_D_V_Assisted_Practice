package string2;
import java.util.Scanner;

public class String_userdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"anusha","harini","manoj"};
        System.out.println("Enter the string to search :");
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        for (int i=0;i< arr.length;i++){
            if (arr[i].equals(str)){
                System.out.println("The item is present");
                break;
            }
            else {
                System.out.println("Not found");
                break;
            }
        }

	}

}
