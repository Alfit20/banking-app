package kg.alfit.bankingapp.repository;

import kg.alfit.bankingapp.events.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<AbstractEvent, UUID> {
}
