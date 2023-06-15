package ec.edu.espe.arquitectura.examen.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Temporal;
import jakarta.persistence.Version;
@Entity
@Table(name = "SEG_USUARIO_PERFIL")
public class SegUsuarioPerfil implements Serializable{

    @EmbeddedId
    private SegUsuarioPerfilPK pk;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ES_ACTIVO", nullable = false)
    private Boolean esActivo;
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;
    @Version
    private Long version;

    @ManyToOne
    @JoinColumn(name="COD_PERFIL", insertable = false, updatable = false, nullable = false)
    @JoinColumn(name="COD_USUARIO", insertable = false, updatable = false, nullable = false)
    private SegPerfil segPerfil;
    
    public SegUsuarioPerfil(SegUsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public SegUsuarioPerfil() {
    }

    public SegUsuarioPerfilPK getPk() {
        return pk;
    }

    public void setPk(SegUsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public Boolean getEsActivo() {
        return esActivo;
    }

    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public SegPerfil getSegPerfil() {
        return segPerfil;
    }

    public void setSegPerfil(SegPerfil segPerfil) {
        this.segPerfil = segPerfil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegUsuarioPerfil other = (SegUsuarioPerfil) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegUsuarioPerfil [pk=" + pk + ", esActivo=" + esActivo + ", fechaCreacion=" + fechaCreacion
                + ", version=" + version + ", segPerfil=" + segPerfil + "]";
    }

    
    
}
