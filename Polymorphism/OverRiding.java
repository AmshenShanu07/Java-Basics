package Polymorphism;

// Base Class
class SampleClassTwo{

    void display(){
        System.out.println("Display from SampleClassTwo");
    }

}

// Sub Class
class SampleClassOne extends SampleClassTwo{

    void display(){
        
        // Calling display method from SampleClassTwo
        super.display();
        System.out.println("Display from SampleClassOne ");
    }

}


//Public main class
public class OverRiding {
    
    public static void main(String ar[]){

        SampleClassOne sample = new SampleClassOne();

        sample.display();

    }

}