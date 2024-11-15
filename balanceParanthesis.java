package DSAPractice;

public class balanceParanthesis {

    public static String checkBalance(String str) {
        int balance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
            balance++;
        } else if (str.charAt(i) == ')') {
                balance--;
        }
            if (balance < 0) {
                return "Not Balanced";
            }
        }
        return balance == 0 ? "Balanced" : "Not Balanced";

    }

    public static void main(String[] args) { System.out.println(checkBalance("((()))()()"));
        System.out.println(checkBalance("())((())"));
    }
}

