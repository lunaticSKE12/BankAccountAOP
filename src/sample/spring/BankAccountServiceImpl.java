package sample.spring;
/**
 * Created by taweesoft on 4/3/2017 AD.
 */
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    static {
        org.apache.log4j.BasicConfigurator.configure();
    }

    private static Logger logger = Logger
            .getLogger(BankAccountServiceImpl.class);
    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        logger.info("createBankAccount method invoked");
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }
}