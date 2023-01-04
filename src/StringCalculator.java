import java.util.Scanner;

public class StringCalculator {




    public static int add(String numbers) throws Exception{
        int number;
        int sum=0;

        if(numbers.equals("")){
            return 0;
        }
        else{
            String []s= numbers.split(",");

            for(int i=0;i<s.length;i++){
                number=Integer.parseInt(s[i]);
                if(number<0){
                    throw new Exception("Negative is not allowed");
                }
                sum+=number;
            }

        }
        return sum;
    }




    public static void main(String[] args) throws Exception {
        String number="";
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter two number with separation by comma , ");
        System.out.println("for example \"1,2\" ");
        number=input.next();

        sum= add(number);

        System.out.println("the resulting sum is = "+sum);





    }

}