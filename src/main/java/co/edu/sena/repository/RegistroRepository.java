package co.edu.sena.repository;

import co.edu.sena.domain.Registro;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Registro entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {}
