import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        signUn();
    }
    static HashMap<String ,String> sandeep=new HashMap<>();
    public static  void signUn(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("You are now signing up");
        System.out.println("Enter your email please");
        String email= scanner.nextLine();
        System.out.println("Enter your password please");
        String password= scanner.nextLine();
        sandeep.put(email,password);
        System.out.println(sandeep);
        login();
    }
    public static void login(){
        System.out.println("You are now logging in");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your email please");
        String username=scanner.nextLine();
        System.out.println("Enter your password please");
        String password=scanner.nextLine();
        if(sandeep.containsKey(username)&& sandeep.get(username).equals(password)){
            System.out.println("Entering");
        }else {
            System.out.println("Sorry your email and password is not in our database");
            System.out.println("Would you like to sign up or Login?");
            System.out.println("Enter S to sign up and L for Login");
            char x=scanner.next().charAt(0);
            if(x=='S'){
                signUn();

            }else {
                login();
            }

        }
    }
    public static void emailAlreadyDatabase( String email){
        while (sandeep.containsKey(email)) {
            System.out.println("Email already in our database, please Log-In");
            login();

        }
    }


}
