
package proyecto.transversal.entidades;

public class Inscripcion {
    private int idIncripcion; 
    private Alumno alumno; 
    private Materia materia; 
    private double nota; 

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int idIncripcion, Alumno alumno, Materia materia, double nota) {
        this.idIncripcion = idIncripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdIncripcion() {
        return idIncripcion;
    }

    public void setIdIncripcion(int idIncripcion) {
        this.idIncripcion = idIncripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idIncripcion=" + idIncripcion + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
    }
    
    
    
    
    
    
    
}
