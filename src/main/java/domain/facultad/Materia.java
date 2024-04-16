package domain.facultad;

import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer id;
    private List<Materia> materiasCorrelativas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Materia(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public void agregarCorrelativas(Materia ... materias) {
        Collections.addAll(this.materiasCorrelativas, materias);
 }
}
