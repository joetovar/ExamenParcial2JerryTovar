package ec.edu.espe.arquitectura.examen.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;


@Entity
@Table(name = "SEG_PREFIL")
public class SegPerfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String codigo;
    @Column(name = "NOMBRE", length = 100)
    private String nombre;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public SegPerfil() {
    }

    public SegPerfil(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        SegPerfil other = (SegPerfil) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfil [codigo=" + codigo + ", nombre=" + nombre + ", version=" + version + "]";
    }
    
}
