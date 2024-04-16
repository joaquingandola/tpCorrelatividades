package domain.facultad;

import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscripcion;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Inscripcion(List<Materia> materiasInscripcion) {
        this.materiasInscripcion = materiasInscripcion;
    }

    public List<Materia> getMateriasInscripcion() {
        return materiasInscripcion;
    }

    public Boolean aprobada(Materia materia) {
        return(boolean) this.alumno.getMateriasAprobadas()
                .stream().anyMatch(cualquierMateria -> cualquierMateria.equals(materia));
    }

}
