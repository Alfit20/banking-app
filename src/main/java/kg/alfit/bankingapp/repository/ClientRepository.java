package kg.alfit.bankingapp.repository;

import kg.alfit.bankingapp.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
