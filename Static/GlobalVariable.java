package Static;


class SampleClass{
    // Here is where magic comming
    static int a=10;
    static int b=20;

}

public class GlobalVariable {
    
    public static void main(String ar[]){

        SampleClass sampleOne = new SampleClass();
        SampleClass sampleTwo = new SampleClass();


        sampleOne.a = 100;

        System.out.println(sampleOne.a);
        System.out.print(sampleTwo.a); //if it's not static it should be 10

    }

}
