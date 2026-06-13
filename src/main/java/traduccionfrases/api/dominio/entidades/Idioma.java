package traduccionfrases.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "idioma")
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_idioma") // Generación automática del ID utilizando una secuencia
    @SequenceGenerator(name = "secuencia_idioma", sequenceName = "secuencia_idioma", allocationSize = 1) // Configuración de la secuencia para generar IDs únicos

    @Column(name = "id") // Columna para el ID del idioma
    private int id; // Campo para almacenar el ID del idioma

    @Column(name = "idioma", length = 100, nullable = false, unique = true)
    private String nombre;

    public Idioma() {
    }

    public Idioma(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
