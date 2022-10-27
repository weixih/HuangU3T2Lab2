import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();
        String message = "";

        if(num <=0){
            message += "That's not positive!";
        }else{
            if(num%2 == 1){
                if(num%5==0){
                    message += "Divisible by 5!\n";
                }
                if(num%7==0){
                    message +="Divisible by 7!\n";
                }
                if (num%5!=0 && num%7!=0){
                    message = "Not divisible by 5 or 7";
                }
            }else{
                if(num>1000){
                    message += "Big even number!";
                }else if(num >100){
                    message += "Medium even number!";
                }else{
                    message += "Small even number!";
                }
            }

        }
        System.out.println(message);
    }
}
