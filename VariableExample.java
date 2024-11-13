public class VariableExample {

    // instance variable
     int instanceVariable =100;
     // instanaceVariable can only be accessed with object
     // static Variable
     static boolean staticVariable= false;
      // staticVariable an be accessede with class directly

      


       void firstFunction(){
        int localVaribel= 300;
        // Local Variable are made inside a funciton/ constructor scope/ block
        System.out.println("local Variable :"+localVaribel);

       }

    public static void main(String[] args) {

        int localVaribel2=500;
        System.out.println("Local Variable :"+ localVaribel2);
        // to use the instance variable of a class, make object
        // syntax: ClassName objVariable = new ClassName();
         VariableExample variableExampleObj= new VariableExample();
         // the variable of VariableExample is called object , here VaribelExampleObj
         System.out.println("Instance Varibel:"+ variableExampleObj.instanceVariable);
         // static variable can be accessed with, ClassName.VariableName
         System.out.println("Static Variable :"+ VariableExample.staticVariable);

         // Hava TypeCasting Primitive Datatype
         // Widening Casting/ Implicit Casting / automatic 
         // Conversion of smaller datatype to large datatype (size/capacity)
         // byte --> short--> char--> int--> long--> float--> double
         byte byteVariable =10;
         short shortVariable = byteVariable; // here byoteis automatically converted to short 

         int  mathMark=20;
         double mathConverted = mathMark; // int is automatically converted to double --> 20.0
         System.out.println("Int to double "+ mathConverted);

         // Narrowing Casting/Explicit Casting/ Manual
         // Conversion of larger dataype to smaller datatype
         double gpa =3.4;
         int gpaInt= (int) gpa;
         System.out.println("Var Int "+ gpaInt);
         int floatConversion= (int)400.33f; // 400

         // Calculation
         float mathCal =1/2;
          System.out.println(mathCal);

          float mathCalSolve=1.0f/2; // either one vlaue float
          float mathCalSolve2=(float) 1/2; // or manual cast


          /*
           * Task 
           * Make an instance varible firstName
           * Make a new object and print the firstname
           * Calculate and print the following
           * double avg=13/2
           * float pct=411/100
           */

         



        
        
    }
    
}
