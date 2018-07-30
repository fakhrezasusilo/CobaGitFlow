import java.util.ArrayList;

public class Calculator {
	
	public double ratarata(int[] nums){
        
        double dt = 0;
        double avg = 0;
        for(int val : nums){
            avg += val;
            dt++;
        }
        
        return avg/dt;
        
    }


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

    int max, min;
    void nilaiMaxMin (int b1, int a[]){
        max = a[];
        min = a[];

        for(int i=1; i<b1; i++)
            if(max<a[i]){
                max = a[i];
            } else if (min > a[i]){
                min = a[i];
            }
    }
}