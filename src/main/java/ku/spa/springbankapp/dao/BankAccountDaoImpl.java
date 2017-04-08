package ku.spa.springbankapp.dao;

import ku.spa.springbankapp.domain.BankAccountDetails;
import org.springframework.stereotype.Repository;

/**
 * Created by chinnonae on 3/4/2560.
 */
@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {

        // TODO: create account and return it's primary key.
        return 1;
    }

    @Override
    public void substractFromAccount(int bankAccountId, int amount) {

        // TODO: subtract fixed deposit amount from bank account
    }
}
