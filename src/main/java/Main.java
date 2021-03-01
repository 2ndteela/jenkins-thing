import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);

        System.out.print(">>> ");

        String cmd = s.nextLine();
        while(cmd.compareTo("exit") != 0) {
            System.out.print(">>>");
            String[] ops = cmd.split(" ");

            if(ops[0].toLowerCase().compareTo("add") == 0)
                System.out.println(c.add(Integer.parseInt(ops[1]), Integer.parseInt(ops[2])));
            else if(ops[0].compareToIgnoreCase("sub") == 0)
                System.out.println(c.subtract(Integer.parseInt(ops[1]), Integer.parseInt(ops[2])));
            else if(ops[0].compareToIgnoreCase("mul") == 0)
                System.out.println(c.multiply(Integer.parseInt(ops[1]), Integer.parseInt(ops[2])));
            else if(ops[0].compareToIgnoreCase("div") == 0)
                System.out.println(c.divide(Integer.parseInt(ops[1]), Integer.parseInt(ops[2])));
            else if(ops[0].compareToIgnoreCase("fib") == 0)
                System.out.println(c.fibonacciNumberFinder(Integer.parseInt(ops[1])));
            else if(ops[0].compareToIgnoreCase("bin") == 0)
                System.out.println(c.intToBinaryNumber(Integer.parseInt(ops[1])));
            else
                System.out.println("invalid");

            cmd = s.nextLine();
        }
    }
}
