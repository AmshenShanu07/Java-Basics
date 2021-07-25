import java.util.Scanner;

public class Exercises {
    
    public static void main(String a[]){
        
        nthDay(10);

    }


    


    static void pyramid(){
        
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter the size of the Pyramid:");
        int size = in.nextInt();
        
        for(int i = 0;i<=size;i++){
    
            for(int j = 0; j<=i;j++){
                System.out.print(j+i+" ");
            }
    
            System.out.print("\n");
    
        }
        
        in.close();

    }


    static int SumOfnNumbers(int num){

        int sum = 0;

        while(num!=0){
            sum = sum + num;
            num--;
        }

        return sum;
    }


    
    static void nthDay(int day){

        switch(day){
            case 1:
                System.out.println("Its Sunday Holiday!");
                break;

            case 2:
                System.out.println("Its Monday!");
                break;

            case 3:
                System.out.println("Its Tuesday!");
                break;

            case 4:
                System.out.println("Its Wednesday!");
                break;

            case 5:
                System.out.println("Its Thurday!");
                break;

            case 6:
                System.out.println("Its Friday!");
                break;

            case 7:
                System.out.println("Its Sturday!");
                break;

            default:
                System.out.println("Enter a Valid number");            
            
        }

    }


}
