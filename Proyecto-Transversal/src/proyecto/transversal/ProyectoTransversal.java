
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
     
     Connection con = Conexion.getConexion();
     
//    Alumno al = new Alumno(38495098, "Perez", "Paola", LocalDate.of(1990, Month.MARCH, 25), true);
    AlumnoData ad = new AlumnoData();
 //   ad.agregarAlumno(al);

////    CARGAR MATERIA
//    Materia biologia= new Materia("Estadistica",1,true);
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
 

//------------------------------------------------------

  InscripcionData insc = new InscripcionData();
  
  AlumnoData da = new AlumnoData(); 
  MateriaData md = new MateriaData();

  //BUSCAMOS ALUMNO Y MATERIA POR ID 
//   Alumno a =  da.buscarAlumnoPorID(9);
//   Materia e =  md.buscarMateria(6);
   
   //CREAMOS UNA INSCRIPCION 
//   Inscripcion ins = new Inscripcion(a, e, 8);
   
 //CARGAR INSCRIPCION.
  // insc.GuardarInscripcion(ins);


//ACTUALIZAR NOTA POR IDALUMNO , IDMATERIA , NOTA. 
//insc.ActualizarNota(7, 6, 10);

//OBTENER MATERIAS CURSADAS POR ALUMNO 
// insc.ObtenerMateriasCursadas(1);

//BORRAR INSCRIPCION POR IDALUMNO Y IDMATERIA.
//insc.BorrarInscripcionMateriaAlumno(1, 4);
//
//for (Inscripcion inscrip : insc.ObtenerInscripciones()){
//     System.out.println("-------------------------------------");
//     System.out.println("IdInscripcion: "+inscrip.getIdIncripcion());
//     System.out.println("Apellido: "+inscrip.getAlumno().getApellido());
//     System.out.println("Materia "+inscrip.getMateria().getNombre());
//}

//OBTENER MATERIAS CURSADAS 
 insc.ObtenerInscripcionesPorAlumno(1); 

    }
}
