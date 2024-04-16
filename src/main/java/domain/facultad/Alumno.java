package domain.facultad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;
    private Inscripcion inscripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasInscripcion(Materia ... materias) {
        Collections.addAll(this.inscripcion.getMateriasInscripcion(), materias);
    }

    public void agregarMateriasAprobadas(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
}
