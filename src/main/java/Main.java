import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);

        System.out.print(">>>");

        String cmd = s.nextLine();
        while(cmd.compareTo("exit") != 0) {
            System.out.print(">>>");
            String[] ops = cmd.split(" ");
            if(ops[0].toLowerCase() == "add")
                c.add(Integer.parseInt(ops[1]), Integer.parseInt(ops[2]));
            else if(ops[0].toLowerCase() == "sub")
                c.subtract(Integer.parseInt(ops[1]), Integer.parseInt(ops[2]));
            else if(ops[0].toLowerCase() == "mul")
                c.multiply(Integer.parseInt(ops[1]), Integer.parseInt(ops[2]));
            else if(ops[0].toLowerCase() == "div")
                c.divide(Integer.parseInt(ops[1]), Integer.parseInt(ops[2]));
            else if(ops[0].toLowerCase() == "fib")
                c.fibonacciNumberFinder(Integer.parseInt(ops[1]));
            else if(ops[0].toLowerCase() == "bin")
                c.intToBinaryNumber(Integer.parseInt(ops[1]));
            else
                System.out.println("invalid");
        }
    }
}
