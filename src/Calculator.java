import java.util.ArrayList;

public class Calculator {



    public Calculator() {

    }

    public int plus(int a , int b){
        return a + b;
    }

    public int  kali (int a , int b){
        return a * b;
    }

    public int minus (int a , int b){
        return a - b;
    }

    public double bagi (int a , int b){
        return a / b;
    }

    public int minimum(int [] list){
        int TempValue = 50;
        for (int i : list){


            if ( TempValue > i ){
                TempValue = i;

            }

        }
        return TempValue;
    }

}
