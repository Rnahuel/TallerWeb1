package ar.edu.unlam.tallerweb1.domain.usuarios;

import javax.persistence.*;

@Entity
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false, length = 1)
    private String sexo;

    public Persona(){};

    public Persona(Long id, String nombre, Integer edad, Double peso, String sexo){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) { this.peso = peso; }

    public String getSexo() { return sexo; }

    public void setSexo(String sexo) { this.sexo = sexo; }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}
