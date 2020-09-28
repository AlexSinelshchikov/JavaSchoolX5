import java.io.*;
import java.util.Scanner;


public class Main {

    private static File file = new File("Homework7" + File.separator + "src" + File.separator + "AccountFile.txt");

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

    public static void main(String[] args) throws IOException {

        boolean fileExists = file.exists();

        if (!fileExists){

            System.out.println("Нет данных");

            boolean newFile = file.createNewFile();

            System.out.println("Создать " + newFile);

        }

        try (
                Scanner scanner = new Scanner(System.in);

                BufferedReader reader = new BufferedReader(new FileReader(file));
        )
        {
            Management accounts = new Management(reader, fileExists);

            workScreen();

            while (run(scanner, accounts)) {
            }
            try (

                    PrintWriter writer = new PrintWriter(new FileWriter(file));
            ) {

                accounts.completionOfFile(writer);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}











