
import java.util.HashMap;
import java.util.Scanner;
//hi
public class Main {

        public static void main(String[] args) {
            signUp();
        }

        static HashMap<String ,String> sandeep=new HashMap<>();
        public static  void signUp(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("You are now signing up");
            System.out.println("Enter your email please");
            String email= scanner.nextLine();
            while (!acceptedEmail(email)) {
                System.out.println("Your email is invalid please try again");
                email = scanner.nextLine();
                acceptedEmail(email); }
            reenter(email);
            if (sandeep.containsKey(email)) {
                    System.out.println("Your email is already in our database");
                    signUpOrLogin();
                } else {
                    System.out.println("Enter your password please");
                    String password = scanner.nextLine();
                    sandeep.put(email, password);
                    System.out.println(sandeep);
                    login();
                } }
        public static void reenter(String email){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please reenter your email");
            String second=scanner.nextLine();
            if(!second.equals(email)){
                System.out.println("Your emails are not the same please re-enter it");
                signUp();
            }
        }

        static  int count=0;

        public static void login(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("You are now logging in");
            System.out.println("Enter your email please");
            String username=scanner.nextLine();
            System.out.println("Enter your password please");
            String password=scanner.nextLine();
            if(sandeep.containsKey(username)&& sandeep.get(username).equals(password)){
                System.out.println("Entering...");
            }else {
                emailNotThere();
            }

        }

        public static void signUpOrLogin(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Would you like to sign up or Login?");
            System.out.println("Enter S to sign up and L for Login");
            char x=scanner.next().charAt(0);
            if(x=='S'){
                signUp();

            }else {
                login();
            }

        }
        public static void cantEnter(){
            System.out.println("You have exceeded the number of login attempts");
        }
        public static boolean acceptedEmail (String email){
            char [] ss=email.toCharArray();
            for (int i = 0; i < email.length(); i++) {
                if(ss[i]=='@'){
                    return true;
                }

            }return false;
        }
        public static void emailNotThere(){
            System.out.println("Sorry your email and password is not in our database");
            count++;
            if(count>=3){
                cantEnter();
            }else {
                signUpOrLogin();}
        }


}
