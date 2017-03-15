class TrigTableRad {
		public static void main (String args[]){
		double c,s,t;
		int d = 0;
		double r=0, rround = 0;
		double pi = 3.141592653589793238462643383279502884197169399375105820974;
		double i = (pi/12);
		String un = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\trad \t|\tcos\t|\tsin\t|\ttan");
		System.out.println("----------------------------------------------------------------------");
		while (r <= (2*pi)){
				//convert angle t to radians r
				c = Math.cos(r);
				c = Math.round(c*1000.0)/1000.0;
				s = Math.sin(r);
				s = Math.round(s*1000.0)/1000.0;
				t = Math.tan(r);
				t = Math.round(t*1000.0)/1000.0;
				rround = (Math.round(r*1000.0))/1000.0;
				
				if ((rround == 1.571) || (rround == 4.712))
					{ System.out.println("\t"+rround+ "\t|\t"+ c +"\t|\t"+ s +"\t|\t UN");
				}else{	
				System.out.println("\t"+rround+ "\t|\t"+ c +"\t|\t"+ s +"\t|\t" +t);
			}
				r = r + i;
			}
		}
	}			
