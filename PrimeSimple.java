class PrimeSimple {
    public static void main(String args[]){
        boolean prime ;
        long n;
        long count;
        double ddiv;
        int div;
        int pivot ;
        n = 2;
        while (n < 1000){
        prime = true;
        pivot = (int)Math.sqrt(n);
        for (div = 2; div < pivot+1;div++){
			    ddiv= div;
			    if ((n % 2 == 0) && (n > 2)) {
						prime = false;
						break;
				}
				if ((n / ddiv) == (n / div)) {
					prime = false;
					break;
				}
			}				
			if(prime)System.out.println(n+ " is prime ");
			
		n++;
	 }		
	} 
}	
