package Inheritance;

class SampleB extends SampleA{

    void displayB(){
        System.out.println("Method from SampleB");
    }

}

public class Run {
    
    public static void main(String arg[]){

        SampleB sampleB =  new SampleB();
        
        //You can get both the functions from  SampleA and SampleB
        sampleB.displayA();
        sampleB.displayB();
        

    }

}
