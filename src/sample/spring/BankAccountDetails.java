package sample.spring; /**
 * Created by taweesoft on 4/3/2017 AD.
 */
import java.util.Date;

public class BankAccountDetails {
    private int accountId;
    private int balanceAmount;
    private Date lastTransactionTimestamp;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Date getLastTransactionTimestamp() {
        return lastTransactionTimestamp;
    }

    public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {
        this.lastTransactionTimestamp = lastTransactionTimestamp;
    }

    @Override
    public String toString() {
        return "sample.spring.BankAccountDetails [accountId=" + accountId
                + ", balanceAmount=" + balanceAmount
                + ", lastTransactionTimestamp=" + lastTransactionTimestamp
                + "]";
    }
}