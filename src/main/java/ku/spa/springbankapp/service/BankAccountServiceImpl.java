package ku.spa.springbankapp.service;

import ku.spa.springbankapp.dao.BankAccountDao;
import ku.spa.springbankapp.domain.BankAccountDetails;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chinnonae on 3/4/2560.
 */
@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    private static Logger logger = Logger.getLogger(BankAccountServiceImpl.class);

    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        logger.info("createBankAccount method invoked.");
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }
}
