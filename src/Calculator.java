public class Calculator {

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