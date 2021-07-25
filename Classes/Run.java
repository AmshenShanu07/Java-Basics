package Classes;

public class Run {
    
    public static void main(String a[]){

        Sample S1 = new Sample(); 
        Sample S2 = new Sample();

        S1.a = 5;
        S2.a = 10;
        S1.b = 15;
        S2.b = 35;

        S1.difference();
        S2.difference();

    }

}
