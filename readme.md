
#### Result

```
.
.
.
661 [main] INFO sample.spring.aspects.LoggingAspect  - Entering BankAccountServiceImpl's createBankAccount
661 [main] INFO sample.spring.aspects.LoggingAspect  - args[0] -> 5710546216 sample.spring.BankAccountDetails [accountId=0, balanceAmount=1000, lastTransactionTimestamp=Mon Apr 10 14:27:38 ICT 2017]
661 [main] INFO sample.spring.BankAccountServiceImpl  - createBankAccount method invoked with params (BankAccountDetails=5710546216 sample.spring.BankAccountDetails [accountId=0, balanceAmount=1000, lastTransactionTimestamp=Mon Apr 10 14:27:38 ICT 2017]
661 [main] INFO sample.spring.BankAccountDaoImpl  - createBankAccount method invoked with params (BankAccountDetails=5710546216 sample.spring.BankAccountDetails [accountId=0, balanceAmount=1000, lastTransactionTimestamp=Mon Apr 10 14:27:38 ICT 2017]

Process finished with exit code 0
```

The result shows the log from invoking the methods.
