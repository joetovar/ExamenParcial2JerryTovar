package ec.edu.espe.arquitectura.examen.service;


import java.util.List;


import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.SegPerfil;
import ec.edu.espe.arquitectura.examen.repository.SegPerfilRepository;


@Service
public class PerfilService {
    
     private final SegPerfilRepository segPerfilRepository;

    public PerfilService(SegPerfilRepository segPerfilRepository) {
        this.segPerfilRepository = segPerfilRepository;
    }
    public List<SegPerfil> listByNombre(String nombre) {
        return this.segPerfilRepository.findByNombreOrderByNombre(nombre);
    }
}
