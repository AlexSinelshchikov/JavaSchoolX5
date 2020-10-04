import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    public static void workScreen() {

        System.out.println(" balance [id] - Информация о счёте ");

        System.out.println(" withdraw [id] [amount] - Снять указанную сумму ");

        System.out.println(" deposit [id] [amount] - Внести указанную сумму ");

        System.out.println(" transfer [from] [to] [amount] - Перевести сумму с одного счета на другой ");

        System.out.println(" exit - Выход из программы ");

    }

    public static boolean run(Scanner scanner, AccountService accounts) throws UnknownAccountException, NotEnoughMoneyException {
        System.out.println(" ");
        System.out.println(" Что хотите осуществить?");

        String[] command = scanner.nextLine().split(" ");

        String operation = command[0];

        switch (operation) {

            case "help":
                workScreen();
                break;

            case "balance":
                accounts.balance(Integer.parseInt(command[1]));
                break;

            case "withdraw":
                accounts.withdraw(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                break;

            case "deposit":
                accounts.deposit(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                break;

            case "transfer":
                accounts.transfer(Integer.parseInt(command[1]), Integer.parseInt(command[2]), Integer.parseInt(command[3]));
                break;

            case "exit":
                return false;

            default:

                System.out.println("Ошибка выбора операции.");

        } return true;
    }

    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:h2:./src/main/java/AccountFile");
                Scanner scanner = new Scanner(System.in);
                )
         {
            HelpfulBase.savingTable(connection);
            HelpfulBase.initialize(connection);
            HelpfulBase.specifyValues(connection);
            System.out.println();
            AccountService accountServiceBase = new AccountServiceBase(connection);

            workScreen();

            while (run(scanner, accountServiceBase)) {
            }

        } catch (SQLException | UnknownAccountException | NotEnoughMoneyException exception) {
            exception.printStackTrace();
        }
    }
}




