public class Main {
    String myString = "Hello My Name is Keerthana";
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.encrypt(obj.myString));
        System.out.println(obj.decrypt(obj.encrypt(obj.myString)));
    }
    public String encrypt(String str){
        String s = "";
        int i = 48;
        for (i = 0 ; i < str.length() ; i++){
            char x = str.charAt(i);
            int a = (int)x;
            a = a - 18;
            s += (char)(a);
        }
        return s;
    }
    public String decrypt(String str){
        String s = "";
        for(int i = 0 ; i < str.length() ; i++){
            char x = str.charAt(i);
            int a = (int)x;
            a = a + 18;
            s += (char)a;
        }
        return s;
    }
}