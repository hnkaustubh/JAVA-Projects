package booksshopping;

public class Final extends BuyOrCart implements Payment{
    int account=20000,balance;
    Final(){
        if(price <= account) {
            balance=account-price;
            System.out.println("Total Price of Books:Rs. "+price);
            System.out.println("\nBalance in account after debitting Books' Cost: "+balance);
        }
        else {
            throw new AccountBalanceExceededException("Sorry - Account Balance of Rs.20000 exceeded");
        }
    }
}
