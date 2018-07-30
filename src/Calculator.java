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