// for Loop
// Program to print a sentence 10 times

class ForLoop {
   public static void main(String[] args) {
      /*
	  String myVar = "Nothing";		//create an obj, memory as myVar, "Nothing" is immutable
      for (int i = 1; i <= 10; ++i) {		//when reassigned it create new memory 
         System.out.println("My var at Line " + i + " with Value :" + myVar);
         myVar += "-" + i;
        */
         
       StringBuilder sb = new StringBuilder(10);
       sb.append("Nothing");
       System.out.println("sb:" + sb);
       
       for (int i = 1; i <= 10; ++i) {		
           System.out.println("sb at Line " + i + " with Value :" + sb);
           sb.append("-" + i);
    
      }
   }
}
