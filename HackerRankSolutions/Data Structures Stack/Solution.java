import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            
            System.out.println(isValidInput(input));
        
		}
        sc.close();
		
	}
    static boolean isValidInput(String str) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        Stack<Character> s3 = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') s1.push('(');
            else if (c == '[') s2.push('[');
            else if (c == '{') s3.push('{');
            else if (c == ')') {
                if (s1.isEmpty()) return false;
                s1.pop();
            } else if (c == ']') {
                if (s2.isEmpty()) return false;
                s2.pop();
            } else if (c == '}') {
                if (s3.isEmpty()) return false;
                s3.pop();
            }
        }
        return s1.isEmpty() && s2.isEmpty() && s3.isEmpty();
    }

}

