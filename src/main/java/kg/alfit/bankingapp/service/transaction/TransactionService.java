package kg.alfit.bankingapp.service.transaction;

import kg.alfit.bankingapp.domain.entity.Transaction;
import kg.alfit.bankingapp.service.CommandService;
import kg.alfit.bankingapp.service.QueryService;

public interface TransactionService extends QueryService<Transaction>, CommandService<Transaction> {
}
