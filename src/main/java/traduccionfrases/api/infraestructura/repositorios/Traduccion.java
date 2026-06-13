package traduccionfrases.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import traduccionfrases.api.dominio.entidades.TraduccionId;

@Repository
public interface Traduccion extends JpaRepository<Traduccion, TraduccionId> {

}
