package ec.edu.espe.arquitectura.examen.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.SegUsuario;
import ec.edu.espe.arquitectura.examen.repository.SegUsuarioRepository;
import ec.edu.espe.arquitectura.examen.exception.CreateException;

@Service
public class UsuarioService {
    
    private final SegUsuarioRepository segUsuarioRepository;

    public UsuarioService(SegUsuarioRepository segUsuarioRepository) {
        this.segUsuarioRepository = segUsuarioRepository;
    }

    @Transactional
    public void createUsuario(SegUsuario segUsuario) {
        Optional<SegUsuario> mailOpt = this.obtenerPorMail(segUsuario.getMail());
        if (!mailOpt.isPresent()) {
            this.segUsuarioRepository.save(segUsuario);
        } else {
            throw new CreateException("El mail: " + segUsuario.getMail() + " ya existe");
        }
    }

    public Optional<SegUsuario> obtenerPorMail(String mail) {
        return this.segUsuarioRepository.findAll(mail);
    }
}
