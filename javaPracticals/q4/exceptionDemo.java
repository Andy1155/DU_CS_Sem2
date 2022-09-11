package q4;

class UnderAgeException extends Exception{
    public UnderAgeException(String s){
        super(s);
        System.out.println("Under Age : ");
    }
}

public class exceptionDemo{
    public static void main(String[] args){
        try{
            test(19);
            test(10);
            test(2);
        }
        catch(UnderAgeException e){
            System.out.println(e.getMessage());
        }
    }
    public static void test(int age) throws UnderAgeException{
        if (age < 18) {
            throw new UnderAgeException(String.valueOf(age) + " is less than 18");
        }
    }
}
