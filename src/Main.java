import stack.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string >>  ");
        String str = scanner.nextLine();
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case '(':
                case '[':
                case '{': stack.push(str.charAt(i)); break;
                case ')':{
                    if (!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else{
                        System.out.println("Unexpected symbol not ) ;");
                    }
                    break;
                }
                case ']':{
                    if (!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }
                    else{
                        System.out.println("Unexpected symbol 2 not ];");
                    }
                    break;
                }
                case '}':{
                    if (!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else{
                        System.out.println("Unexpected symbol 3 not };");
                    }
                    break;
                }
            }
        }

    }
}
