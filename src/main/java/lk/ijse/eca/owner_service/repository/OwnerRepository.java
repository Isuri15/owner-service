package lk.ijse.eca.owner_service.repository;

import lk.ijse.eca.owner_service.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}