package sample.spring;

/**
 * Created by taweesoft on 4/3/2017 AD.
 */
public interface BankAccountDao {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    void subtractFromAccount(int bankAccountId, int amount);
}