package kg.alfit.bankingapp.service.card;

import kg.alfit.bankingapp.domain.entity.Card;
import kg.alfit.bankingapp.service.CommandService;
import kg.alfit.bankingapp.service.QueryService;

public interface CardService extends QueryService<Card>, CommandService<Card> {
}
