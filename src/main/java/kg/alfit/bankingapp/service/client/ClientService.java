package kg.alfit.bankingapp.service.client;

import kg.alfit.bankingapp.domain.entity.Client;
import kg.alfit.bankingapp.service.CommandService;
import kg.alfit.bankingapp.service.QueryService;

public interface ClientService extends QueryService<Client>, CommandService<Client> {
}
