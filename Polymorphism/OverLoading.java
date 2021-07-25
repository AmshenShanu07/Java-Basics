package Polymorphism;

///Method OverRiding - methods can be differentiated by arguments

class SampleClass{

    void display(){
        System.out.println("Method without argument");
    }

    void display(int a){
        System.out.println("Method with argument");
    }

    int display(int a, int b){
        System.out.println("Method with argument and return");

        return a+b;
    }

}



public class OverLoading {
    
    
    public static void main(String ar[]){

        SampleClass sample = new SampleClass();

        sample.display();
        sample.display(10);
        System.out.println(sample.display(10,20));

    }

}
