package ec.edu.espe.arquitectura.examen.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import ec.edu.espe.arquitectura.examen.model.SegUsuario;


public interface SegUsuarioRepository extends JpaRepository<SegUsuario, Integer>{
    
    List<SegUsuario> findByNombreOrderByNombre(String nombre);
    List<SegUsuario> findBySueldoGreaterThan(BigDecimal sueldo);
}
