public class UserInputUsingArgs {

    public static void main(String[] args) {
        
         // The parameter String[] args takes array of input
         // when running from command line
         // you can compile java file with
         // java FileName.java
         // java FileName args1 args2
         // or
         // java FileName.java args1 args2

         System.out.println("First Args "+ args[0]);
         System.out.println("Second Args "+args[1]);

         // the args are in datatype String to convert or parse any args

         int argsParse1= Integer.parseInt(args[0]);
         int argsParse2= Integer.parseInt(args[1]);
         System.out.println("Sum of args "+ (argsParse1+argsParse2));



         /*
          * Task
          create a new file resultInput
          create scanner oject to ask user for input
          oop --> int
          database --> int
          architecture --> int
          resit --> boolean
          calculate the avg
          is resit is true cap the avg to 40 is the value more than 40
          using printf print each marking
          also print if the avg is greater or equal to 40 --> "Good" else "Bad"
          */



    }
    
}
