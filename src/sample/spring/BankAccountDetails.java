package sample.spring; /**
 * Created by napong dungduangsasitorn
 */
import java.util.Date;

public class BankAccountDetails {
    private int accountId;
    private int balanceAmount;
    private Date lastTransactionTimestamp;
    private final String signature = "5710546216";

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
        return signature + " sample.spring.BankAccountDetails [accountId=" + accountId
                + ", balanceAmount=" + balanceAmount
                + ", lastTransactionTimestamp=" + lastTransactionTimestamp
                + "]";
    }
}