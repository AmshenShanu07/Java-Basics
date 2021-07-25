package Static;


class SampleClassOne{
    int a=10;
    int b=20;

    void display(int a ,int b){

        System.out.println("Value passed with Arguments are "+a+"  "+b);
        System.out.println("Value in This Class "+this.a+"   "+this.b);


    }
}


public class staticClass {
    
    public static void main(String sr[]){

        SampleClassOne sample = new SampleClassOne();

        sample.display(100, 200);

    }

}
