package gestionPublication.gestionPUB.repositories;

import gestionPublication.gestionPUB.entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur,Long> {
}
