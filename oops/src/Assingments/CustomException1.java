package Assingments;


public class CustomException1 {
    static void Salary(int x) throws Salarycheck{
        if(x<2000){
            throw new Salarycheck("you need to work hard");
        }else if(2100 <= x& x <= 5000) {
            System.out.println("your salary is somehow good");
        } else if (5100<=x& x<=9000){
            System.out.println("salary is good");

            }
        else{
            System.out.println("beyond the limt");
        }

        }

    public static void main(String[] args){
        try{
            Salary(7000);
        }
        catch (Exception m){
            System.out.println(m.getMessage());
        }
        System.out.println("rest of the code");
}}
class Salarycheck extends Exception{
    

	Salarycheck(String s){
        super(s);
    }
}
