import Account.Account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Management implements AccountService {
    private BufferedReader reader;
    private Map<Integer, Account> accountFile = new HashMap<>();

    public Management (BufferedReader bufferedReader, boolean fileExists) throws IOException {

        this.reader = bufferedReader;

        if (!fileExists) {
            initializeValues();
        } else {
            readFile();
        }
    }

    @Override

    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {

        Account account = accountFile.get(accountId);

        if (account != null) {

            if (account.getAmount() >= amount) {

                account.setAmount(account.getAmount() - amount);

            } else {

                throw new NotEnoughMoneyException();
            }

        } else {

            throw new UnknownAccountException(accountId);
        }
    }

    @Override

    public void balance(int accountId) throws UnknownAccountException {

        if (accountFile.get(accountId) != null) {

            System.out.println(accountFile.get(accountId).getAmount());

        } else {

            throw new UnknownAccountException(accountId);
        }
    }

    @Override

    public void deposit(int accountId, int amount) throws UnknownAccountException {

        Account account = accountFile.get(accountId);

        if (account != null) {

            account.setAmount(account.getAmount() + amount);

        } else {

            throw new UnknownAccountException(accountId);
        }
    }


    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account fromAccount = accountFile.get(from);

        Account toAccount = accountFile.get(to);

        if (fromAccount != null && toAccount != null) {

            if (fromAccount.getAmount() >= amount) {

                toAccount.setAmount(toAccount.getAmount() + amount);

                fromAccount.setAmount(fromAccount.getAmount() - amount);
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            if (fromAccount == null) {
                throw new UnknownAccountException (fromAccount.getId());
            } else {
                throw new UnknownAccountException(toAccount.getId());
            }
        }
    }

    public void initializeValues() {
        for (int i = 0; i < 10; i++) {
            Account account = new Account(i + 1, "Holder №" + (i + 1), Math.round(Math.random() * 100000));
            accountFile.put(i + 1, account);
        }
    }

    public void readFile() throws IOException {

        String line;

        while ((line = reader.readLine()) != null) {

            String[] arr = line.split(",");

            int id = Integer.parseInt(arr[0]);

            accountFile.put(id, new Account(id, arr[1], Double.parseDouble(arr[2])));
        }
    }

    public void completionOfFile(PrintWriter printWriter) {

        for (Integer id : accountFile.keySet()) {

            printWriter.println(accountFile.get(id));
        }
    }
}