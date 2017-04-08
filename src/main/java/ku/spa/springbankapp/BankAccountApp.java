package ku.spa.springbankapp;

import ku.spa.springbankapp.domain.BankAccountDetails;
import ku.spa.springbankapp.service.BankAccountService;
import ku.spa.springbankapp.service.BankAccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by chinnonae on 3/4/2560.
 */
public class BankAccountApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/spring/applicationContext.xml");
        BankAccountService bankAccountService = context.getBean(BankAccountServiceImpl.class);
        BankAccountDetails bankAccountDetails = new BankAccountDetails();
        bankAccountDetails.setBalanceAmount(1000);
        bankAccountDetails.setLastTransactionTimestamp(new Date());

        bankAccountService.createBankAccount(bankAccountDetails);
    }
}
