import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {

            int primaryArg = promptInt("Enter primary arg: ");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("Enter command (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Enter secondary arg: ");
                    calculator.mult(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Enter secondary arg: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Result = %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Again? (y/n) : ");
            if (cmd.equals("y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    private int promptInt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return Integer.parseInt(in.nextLine());
    }
}
