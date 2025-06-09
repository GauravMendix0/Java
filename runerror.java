public class runerror {
    public static void main(String[] args) throws ClassNotFoundException {
        
        int num1=1;
        int num2=0;

        try
        {
            System.out.println(num1/num2);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }

        Class.forName("abc");
        


    }
}
