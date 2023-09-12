
package proyecto.transversal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import proyecto.transversal.accesoADatos.AlumnoData;
import proyecto.transversal.accesoADatos.Conexion;
import proyecto.transversal.accesoADatos.InscripcionData;
import proyecto.transversal.accesoADatos.MateriaData;
import proyecto.transversal.entidades.Alumno;
import proyecto.transversal.entidades.Inscripcion;
import proyecto.transversal.entidades.Materia;



public class ProyectoTransversal {
//los cambio
  
    
    public static void main(String[] args) {
        String holass;
        String HOLA;
        String ComoEstas;
        String Hola; 
//        Connection con = Conexion.getConexion();
    Alumno al = new Alumno(1,44444444, "Suarez", "Fernando", LocalDate.of(1990, Month.MARCH, 25), true);
    AlumnoData ad = new AlumnoData();
    ad.agregarAlumno(al);

////    CARGAR MATERIA
//   Materia biologia= new Materia(1,"Biologia",1,true);
//    MateriaData mate=new MateriaData();
//    mate.guardarMateria(biologia);


////    MODIFICAR MATERIA
//mate.modificarMateria(biologia);

////    BORRAR MATERIA
//    mate.eliminarMateria(-Colocar ID-);
    
////  BUSCAR MATERIA
//    Materia materiaEncontrada = mate.buscarMateria(-Colocar ID-);
//    
//    if(materiaEncontrada!=null){
//        System.out.println("nombre: "+materiaEncontrada.getNombre());
//        System.out.println("año: "+materiaEncontrada.getAnioMateria());
//        System.out.println("estado: "+materiaEncontrada.isActivo());
//    }

// ARRAY DE ALUMNOS

//MateriaData mate = new MateriaData();
//for(Materia materia:mate.listarMaterias()){
//
//    System.out.println("id: "+materia.getIdMateria());
//    System.out.println("nombre: "+materia.getNombre());
//    System.out.println("año: "+materia.getAnioMateria());
//    System.out.println("estado"+materia.isActivo());
//    System.out.println("----------");
//}    
    
//CARGAR INSCRIPCION 
//  Inscripcion ins = new Inscripcion(al , biologia, 8);
//  InscripcionData insc = new InscripcionData();
//  insc.GuardarAlumno(ins);
   
    }
}
