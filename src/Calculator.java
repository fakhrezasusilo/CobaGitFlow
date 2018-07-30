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

            
}
