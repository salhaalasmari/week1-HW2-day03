public class Totorial2 {
    public static void main(String[] args) {
        System.out.println(".....First Question.....");

        int prime=5;
        String resultOfPrime=primeArray(prime);
        System.out.println("check is it prime ?"+resultOfPrime);
        System.out.println();

        System.out.println("....Second Question....");
        double price=500.0;
        System.out.println("The Tax of this price "+price+" is :"+calculateTax(price));
        System.out.println(".....Third Question.....");
        System.out.println("we check this name BOB "+checkpalindrome("BOB"));

    }
    public static double calculateTax(double price){
      double tax=0;
        if (price>=100&&price<=500){
            tax= price*15/100;
        } else {
            System.out.println("Sorry");
        }
        return tax ;
    }
    public  static String checkpalindrome(String name){
        name=name.toLowerCase();
        String reserve="";
        for ( int i = name.length() - 1; i >= 0; i-- )
            reserve = reserve + name.charAt(i);
        if (reserve.equals(name))
           return "it is a palindrome.";
        else
            return "it is not a palindrome.";
    }
public  static String primeArray(int num){
    for (int i = 2; i <num ; i++) {
        if(num%i==0){
            return "No, it is not a prime number";
        }
    }
    return "Prime number";
    }
}



