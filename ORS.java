import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class ORS{
  static Scanner sc = new Scanner(System.in);
static ArrayList<String> userid = new ArrayList<>();
static ArrayList<String> userpassword = new ArrayList<>();
static String loginid1,password1,loginid,password,trainNumber,trainName;
static long randomnumber;

static String classType,dateOfJourney,source,destination;

 static void cf(String loginid,String password,long randomNumber) 
 {
System.out.println("Enter PNR Number:");
 long PNR=sc.nextInt();

     if(PNR!=randomnumber){
System.out.println("Invalid PNR");
}else{
System.out.println("Check Travelling details before cancellation");
details(randomnumber);
System.out.println("press 1 for cancellation:");
int cancel=sc.nextInt();
if(cancel==1)
{
    System.out.println("[[successfully cancelled]]");
}
else{
    System.out.println("invalid choice");
}
}
}

 static void rs(String loginid,String password) 
 {
     String[][] trains = {
            {"123", "Train A"},
            {"456", "Train B"},
            {"789", "Train C"},
            {"012", "Train D"}
     };
     System.out.print("Enter the train number: ");
        trainNumber = sc.nextLine();
        
         trainName = null;
        for (String[] train : trains) {
            if (train[0].equals(trainNumber)) {
                trainName = train[1];
                break;
            }
        }
System.out.print("Enter the class type: ");
         classType = sc.nextLine();

        System.out.print("Enter the date of journey: ");
         dateOfJourney = sc.nextLine();

        System.out.print("Enter the source: ");
         source = sc.nextLine();

        System.out.print("Enter the destination: ");
         destination = sc.nextLine();

        Random random = new Random();
         randomnumber = Math.abs(random.nextLong()) % 1_000_000_000_0L; 
         System.out.println("[[RESERVATION DETAILS]]: ");
         details(randomnumber);
 }
 
 static void details(long number){
        System.out.println("Traveller_name: "+loginid);
        System.out.println("Train number: "+trainNumber);
        System.out.println("Train Name: "+trainName);
        System.out.println("Class type: " + classType);
        System.out.println("Date of journey: " + dateOfJourney);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("PNR number: " + randomnumber);
 }
 

static void Login(){
    System.out.println("[[Enter your credentials to signin]]");
            System.out.println("LOGIN_ID:");
         loginid=sc.nextLine();
       
        System.out.println("PASSWORD:");
         password=sc.nextLine();
         if(userid.contains(loginid)&&userpassword.contains(password)){
         System.out.println("Authentication Successful");
         }
         else
         {
           System.out.println("Authentication Successful");   
         }
        }


static void register()
{
     System.out.println("Enter LOGIN_ID to register:");
        loginid1=sc.nextLine();
        userid.add(loginid1);
        System.out.println("Enter PASSWORD to register:");
        password1=sc.nextLine();
        userpassword.add(password1);
        Login();
}


     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME");
        System.out.println("Are you new user(say 1.yes or 2.no)::");
        int ch=sc.nextInt();
        if(ch==1)
        {
            register();
        }
       else{
           Login();
       }
       do{
                System.out.println("[[Enter your choice of operation]]");
                System.out.println("1.REGISTRATION SYSTEM");
                System.out.println("2.CANCELLATION FORM");
                System.out.println("3.EXIT");
          int choice=sc.nextInt();
           switch(choice)
           {
               case 1:
                   rs(loginid,password);
                   break;
                case 2:
                    cf(loginid,password,randomnumber);
                    break;
                case 3:
                    System.out.println("SUCESSFULLY SIGNED OUT");
                    System.exit(0);
                    break;    
                default:
                System.out.println("Invalid option");
           }  
       }
        while(true);
     }
}