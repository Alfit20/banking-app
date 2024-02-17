package kg.alfit.bankingapp.events;

import kg.alfit.bankingapp.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);
}
