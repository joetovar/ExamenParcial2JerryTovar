package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.SegUsuarioPerfil;
import ec.edu.espe.arquitectura.examen.model.SegUsuarioPerfilPK;



public interface SegUsuarioPerfilRepository extends JpaRepository<SegUsuarioPerfil, SegUsuarioPerfilPK>{
    
    List<SegUsuarioPerfil> findByFechaCreacion(Date fechaCreacion);
    List<SegUsuarioPerfil> findByEsActivo(Boolean esActivo);
}
