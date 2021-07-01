import java.util.HashMap;
import java.util.Scanner;

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
            while (!acceptedEmail(email)){
                System.out.println("Your email is invalid please try again");
                email=scanner.nextLine();
                acceptedEmail(email);
            }
            if(sandeep.containsKey(email)){
                System.out.println("Your email is already in our database");
                signUpOrLogin();
            }
            else {
                System.out.println("Enter your password please");
                String password = scanner.nextLine();
                sandeep.put(email, password);
                System.out.println(sandeep);
                login();
            }
        }
        public static void login(){
            System.out.println("You are now logging in");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your email please");
            String username=scanner.nextLine();
            System.out.println("Enter your password please");
            String password=scanner.nextLine();
            if(sandeep.containsKey(username)&& sandeep.get(username).equals(password)){
                System.out.println("Entering...");
            }else {
                System.out.println("Sorry your email and password is not in our database");
                signUpOrLogin();

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
        public static boolean acceptedEmail (String email){
            char [] ss=email.toCharArray();
            for (int i = 0; i < email.length(); i++) {
                if(ss[i]=='@'){
                    return true;
                }

            }return false;
        }


}
