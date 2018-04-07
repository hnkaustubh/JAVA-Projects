package booksshopping;

public class AccountBalanceExceededException extends RuntimeException{
    AccountBalanceExceededException(String msg){
        super(msg);
    }
}
