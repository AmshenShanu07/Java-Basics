import java.util.Scanner;

class oddOrEven {
    
    public static void main(String a[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = s.nextInt();

        int result = num%2;

        if(num == 0){
            System.out.println(num+" is zero");
        }else if(result ==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num + " is odd");
        }

        s.close();

    }

}
