package Polymorphism;


class SampleBaseClass{

    //Constructor of Base class
    SampleBaseClass(){

        System.out.println("Constructor of BaseClass");

    }

}


class SampleSubClass extends SampleBaseClass{

    //Constructor of SubClass
    SampleSubClass(){

        super(); //Calling Constructor of BaseClass
        System.out.println("Constructor of SubClass");
    }

}


public class ConstructorOverRiding {
    
    public static void main(String arg[]){
        //Constructor Running Call
        SampleSubClass sample = new SampleSubClass();

    }

}
