package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.examen.model.SegPerfil;


public interface SegPerfilRepository extends JpaRepository<SegPerfil, String>{

    List<SegPerfil> findByNombreOrderByNombre(String nombre);

}
