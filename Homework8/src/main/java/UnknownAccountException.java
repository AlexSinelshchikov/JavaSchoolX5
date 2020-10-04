public class UnknownAccountException extends Exception{
    public UnknownAccountException(int accountId) {
        super("Аккаунт не найден");
    }
}