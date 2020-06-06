package gestionPublication.gestionPUB.repositories;
import gestionPublication.gestionPUB.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository  extends JpaRepository<Publication,Long> {
}
