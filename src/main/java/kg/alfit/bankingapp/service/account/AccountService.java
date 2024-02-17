package kg.alfit.bankingapp.service.account;

import kg.alfit.bankingapp.domain.entity.Account;
import kg.alfit.bankingapp.service.CommandService;
import kg.alfit.bankingapp.service.QueryService;

public interface AccountService extends QueryService<Account>, CommandService<Account> {
}
