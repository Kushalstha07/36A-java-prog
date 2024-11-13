public class Operator {

    public static void main(String[] args) {
        
        // arithmetic opertor
        // *,-,+,/,%

        int intVar1= 10, intVar2=20;
        int addOpr= intVar1+intVar2; // 10+20
        int minusOper= intVar1-intVar2; //10-20
        int muloper= intVar1*intVar2; // 10*20
        int divoper= intVar1 / intVar2; //10/20
        int modoper= intVar1 & intVar2; //10%20


        // assignment operator
         int assignVar=10;
          assignVar += 20; // 10+20-->30
          assignVar -= 15 ; // 30-15--> 15
          assignVar *= 2; // 15*2--> 30
          assignVar /= 10; // 30/10--> 3
          assignVar %= 2; // 3%2--> 1

          // Unary operator

          int unaryVar=20;
          unaryVar ++; // unaryVar += 1; 20+1;21
          unaryVar --; // unaryVar -=1; 21-1;20

          // Relational operator
           int relVar1= 20 ,relVar2= 30;
           boolean equalOper= relVar1== relVar2 ; // 20=30? false
           boolean greaterOper= relVar1>relVar2; // 20>30? false
           boolean lessEqualOper = relVar2 <=30; //30<=30? true
           boolean notEqual= 20 != 10; // ture

           // Logical Operator
           int logVar1= 10, logVar2=20, logVar3=23;
            boolean andOper= true && true;
            boolean andOperVar= (logVar1<logVar2)&& (logVar3== logVar2);// true and false
            boolean orOper= false || false || true;
            boolean notOper =! (logVar1<logVar2); // !true--> false
            boolean OrOperVar= (logVar1<logVar2)|| (logVar3==logVar2);//


            // Ternary operator

            /*
             * String status
             * int marking =40;
             * if(marking=40){
             *   status = "Pass"}
             * else{
             *  status="Fail"}
            
             * 
             */

            int marking =40;
            String status =(marking>40) ? "Pass" : "Fail";
            System.out.println("Status :"+ status);


            // Task

            int oopMarking= 40;
            int architectureMarking=50;
            int databaseMarking= 55;
            int CreativeThinkingMarking=80;

            float avg;
            avg= (oopMarking+architectureMarking+databaseMarking+CreativeThinkingMarking)/4;

            boolean check= oopMarking>=40 && architectureMarking>=40 && databaseMarking>=40 && CreativeThinkingMarking>=40
            && avg>50;

            String result = check ? "Good Job": "Bad JOb";
            System.out.println(result);

           




    }
    
}
