package ku.spa.springbankapp.dao;


import ku.spa.springbankapp.domain.BankAccountDetails;

/**
 * Created by chinnonae on 3/4/2560.
 */
public interface BankAccountDao {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    void substractFromAccount(int bankAccountId, int amount);
}
