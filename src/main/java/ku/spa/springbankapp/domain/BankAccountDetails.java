package ku.spa.springbankapp.domain;

import java.util.Date;

/**
 * Created by chinnonae on 3/4/2560.
 */
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
        return String.format("BankAccountDetails [accountId=%d, balanceAmount=%d, lastTransactionTimestamp=%s]", accountId, balanceAmount, lastTransactionTimestamp);
    }
}
