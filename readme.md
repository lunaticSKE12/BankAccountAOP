## Spring Bank Account
-----

#### Requirements
- IntelliJ (Ultimate)

#### How to use
1. Clone the project into your workspace.
2. Open project in IntelliJ.
3. Run `SpringBankApp.java`

#### Result

```
.
.
.
661 [main] INFO sample.spring.aspects.LoggingAspect  - Entering BankAccountServiceImpl's createBankAccount
661 [main] INFO sample.spring.aspects.LoggingAspect  - args[0] -> 5710546259 sample.spring.BankAccountDetails [accountId=0, balanceAmount=1000, lastTransactionTimestamp=Mon Apr 10 09:45:18 ICT 2017]
661 [main] INFO sample.spring.BankAccountServiceImpl  - createBankAccount method invoked with params (BankAccountDetails=5710546259 sample.spring.BankAccountDetails [accountId=0, balanceAmount=1000, lastTransactionTimestamp=Mon Apr 10 09:45:18 ICT 2017]
661 [main] INFO sample.spring.BankAccountDaoImpl  - createBankAccount method invoked with params (BankAccountDetails=5710546259 sample.spring.BankAccountDetails [accountId=0, balanceAmount=1000, lastTransactionTimestamp=Mon Apr 10 09:45:18 ICT 2017]

Process finished with exit code 0
```

The result shows the log from invoking the methods.

#### What to submit
1. Code.
2. Output. (Don't forget to change `signature` value in BankAccountDetails.java to your student id)
3. `applicationContext.xml`
