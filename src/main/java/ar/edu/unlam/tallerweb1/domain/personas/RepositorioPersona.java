package ar.edu.unlam.tallerweb1.domain.usuarios;

public interface RepositorioPersona {

    Persona obtener(Long id);

    Persona obtener(String nombre);

    Persona obtener(Double peso);

    Persona obtener(Integer edad);

    Persona obtener(Character sexo);

    void guardar(Persona persona);

    void modificar(Persona persona);

    void eliminar(Persona persona);
}
