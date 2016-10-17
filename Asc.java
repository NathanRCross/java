class Asc   {

   public static void main (String args[]){
      int n;
      char c;
      String hex;
      String bin;
      n = 65;
     
      while (n < (65+5)){
         c = (char)n; 
         System.out.print("\t");
         System.out.print(n);
         System.out.print("\t");
         System.out.print(c);
         System.out.print("\t");
         hex = Integer.toHexString(c);//int to hex
         bin = Integer.toBinaryString(c);
         System.out.print(hex);
         System.out.print("\t");
         System.out.print(bin);
         System.out.print("\t");
         System.out.println();
         n = n + 1;
    }
   }       



}
