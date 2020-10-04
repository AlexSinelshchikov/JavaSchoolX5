public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException () {
        super("Необходимо пополнить баланс");
    }
}