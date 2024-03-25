public class ExceptionCases {
    public static void main(String args[]) {

        try {
            throw new CustomException();
        } catch (CustomException ex) {
            System.out.println("Got the Custom Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
class CustomException extends Exception {
}
