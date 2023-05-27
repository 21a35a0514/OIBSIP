
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ATM
{
  public static ArrayList<String> Customernames = new ArrayList<>();
static ArrayList<Integer> Customerpin = new ArrayList<>();
static ArrayList<Integer> Customercash = new ArrayList<>();
   static int ch,status,depoamount,tamount,a,t;
static String username,ach;
   static int pin,x,y,p,q,z,withamount;
   static Scanner sc=new Scanner(System.in);
 static  ArrayList<String> dephistory = new ArrayList<>();
 static  ArrayList<String> withhistory = new ArrayList<>();
 static  ArrayList<String> thistory = new ArrayList<>();


static void validation(String username,int pin)
{
    Customernames.add(username);
    Customerpin.add(pin);
    Customercash.add(0);
        System.out.println("Authentication Successfull!!");
}


static void Withdraw(String username,int pin)
{
 y=Customernames.indexOf(username);
    System.out.println("Enter Amount to withdraw:");
         withamount=sc.nextInt();
        q=Customercash.get(y)-withamount;
        if(q>0){
      Customercash.set(y,q);
        }
         else{
System.out.println("Invalid transaction");
}
      System.out.println("Rupees "+withamount+" withdrawed");
      System.out.println("Your current balance is:"+q);
      String whistr = String.valueOf(q);
       String statement="  WITHDRAWED SUCCESSFULLY";
       String wh=whistr+statement; 
        withhistory.add(x,wh);
}


static void Transfer(String username,int pin)
{

           z=Customernames.indexOf(username);


        System.out.println("Enter the transfer amount: ");
                tamount = sc.nextInt();


               a=Customercash.get(z)-tamount;
if(a>0){
               Customercash.set(z,a);}
else{
System.out.println("Invalid transaction");
}
System.out.println("Rupees "+tamount+" Transferred.");
      System.out.println("Your current balance is:"+a);
       String thistr = String.valueOf(tamount);
       String statement=" TRANSFERED SUCCESSFULLY";
       String th=thistr+statement; 
        thistory.add(x,th);
}

static void TransactionHistory(String username,int pin){
    
   int g=Customernames.indexOf(username);

System.out.println(username+"---"+"TRANSACTION HISTORY :");
    System.out.println(dephistory.get(g));
System.out.println(thistory.get(g));
    System.out.println(withhistory.get(g));
    

}


static void quit()
{
    System.out.println("THANK YOU VISIT US AGAIN :)");
    System.exit(0);
}

static void deposit(String username,int pin){
    x=Customernames.indexOf(username);
        System.out.println("Enter Amount to Deposit:");
        depoamount=sc.nextInt();
        p=Customercash.get(x)+depoamount;
        Customercash.set(x,p);
        System.out.println("Rupees "+depoamount+" deposited");
        System.out.println("Your current balance is:"+p);
        String Dhistr = String.valueOf(p);
        String statement=" DEPOSITED";
        String dh=Dhistr+statement; 
        dephistory.add(x,dh);
   }


public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME!");
         System.out.println("[Dear Customer please enter credentials to proceed]");
         System.out.println("Enter your Username:");
         username=sc.nextLine();
         System.out.println("Enter pin to validate:");
         pin=sc.nextInt();
         validation(username,pin);
         while(true){
         System.out.println("1. Transaction History");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
         switch (choice) {
                case 1:
                    TransactionHistory(username,pin);
                    break;
                case 2:
                    deposit(username,pin);
                    break;
                case 3:
                    Withdraw(username,pin);
                    break;
                case 4:{
                    System.out.println("Enter Reciever's Account_NUMBER:");
                    int ach = sc.nextInt();
                    Transfer(username,pin);
                    break;
}
                case 5:
                    quit();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
         }
    }
}




