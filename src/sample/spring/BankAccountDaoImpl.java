package sample.spring;

import org.springframework.stereotype.Repository;
/**
 * Created by taweesoft on 4/3/2017 AD.
 */
@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {

    @Override
    public int createBankAccount(final BankAccountDetails bankAccountDetails) {

        //--create account and return it's primary key.
        return 1;
    }

    public void subtractFromAccount(int bankAccountId, int amount) {
        //-- subtract fixed deposit amount from bank account
    }
}
