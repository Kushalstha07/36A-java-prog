public class SwitchCase {

    public static void main(String[] args) {
        
        int day = 5;
        switch(day){

            // day==0
            case 0:
             System.out.println("Sunday");
             break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
             System.out.println("Tuesday");
             break;
            default:
              System.out.println("Unknown day");
              break;
        }
        
        
        // nested switch statement
        String beverage="Coke";
        char gender= 'M';
        switch(beverage){
            case "Coke":
              switch(gender){
                 case 'M':
                 System.out.println("Male");
                 break;
                 case 'F':
                 System.out.println("Female");
                 break;
            }
              System.out.println("Black");
              break;

            default:
            System.out.println("Unkown bevrage");
            break;
        }

        // switch case or
        int status= 404;
        switch(status){

            // status = 200 || status == 201|| status == 202
            case 200:
            case 201:
            case 202:
             System.out.println("Sucess");
             break;
            // status == 401 || status ==404
            case 401:
            case 404:
             System.out.println("Not found");
              break;
            default:
            System.out.println("Unknown status");
        }


        // Task

        int month=4;
        switch(month){
            case 0:
             System.out.println("Jan");
             break;
            
            case 1:
             System.out.println("Feb");
             break;
            
            case 2:
             System.out.println("March");
             break;

            case 3:
             System.out.println("April");
             break;

            case 4:
             System.out.println("May");
             break;

            case 5:
             System.out.println("June");
             break;

            case 6:
             System.out.println("July");
             break;

            case 7:
             System.out.println("August");
             break;

            case 8:
             System.out.println("September");
             break;

            case 9:
             System.out.println("October");
             break;

            case 10:
             System.out.println("November");
             break;

            case 11:
             System.out.println("December");
             break;

             default:
              System.out.println("Unkown month");


        }

        // Task 2

        String locale="np";

        switch(locale){

            case "en":
            case "en/us":
            case "en/uk":
              System.out.println("Selected english");
              break;

            case "in":
              System.out.println("Selected Indian");
              break;

            case "jp":
              System.out.println("Selected Japnese");
              break;

            case "np":
              System.out.println("Selected Nepali");
              break;

            default:
            System.out.println("Unknown locale");
            break;
        }


         


    }

    


    }
    

