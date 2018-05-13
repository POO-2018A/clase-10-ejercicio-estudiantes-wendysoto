/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author Wendy Soto
 */
public class Principal {
    
     public static void main (String[] args){
        
        //arreglo de objetos
        Estudiante[] estudiantes = new Estudiante[3];
        //2
        
        
        String [] m1={"m1","m2"};
        String [] m2={"m2","m3","m4"};
        String [] m3={"m2","m3", "m4","m5"};
        
       
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        
        estudiantes[0]= new Estudiante("Wendy", "Soto", "0605478015");  
        System.out.println("Estudiante 1");
        System.out.println("nombre: " + estudiantes[0].getNombre());
        System.out.println("Apellido: " +estudiantes[0].getApellido());
        System.out.println("Cedula: " +estudiantes[0].getCedula());
        System.out.println("materias:" );
       estudiantes [0].setMaterias(m1); 
    
        String[]materiasEstudiante=estudiantes[0].getMaterias();
        for(int i=0; i<materiasEstudiante.length; i++){
           System.out.println(materiasEstudiante[i]); 
           if(materiasEstudiante[i].equals("m1")){
              cont1++;
          } 
           else if(materiasEstudiante[i].equals("m2")){
              cont2++;
          }
        }
          
          
          System.out.println();
        //3materias
        estudiantes[1]= new Estudiante("Maria", "Castro", "1705778023");
        
        System.out.println("Estudiante 2");
        System.out.println("nombre: " + estudiantes[1].getNombre());
        System.out.println("Apellido: " +estudiantes[1].getApellido());
        System.out.println("Cedula: " +estudiantes[1].getCedula());
        System.out.println("materias:" );
        estudiantes [1].setMaterias(m2);
        
        String[]materiaEstudiante=estudiantes[1].getMaterias();
        for(int i=0; i<materiaEstudiante.length; i++){
           System.out.println(materiaEstudiante[i]); 
            if(materiaEstudiante[i].equals("m2")){
              cont2++;
          } 
            
            else if( materiaEstudiante[i].equals("m3")){
              cont3++;
          }
          if(materiaEstudiante[i].equals("m4")){
              cont4++;
          }
        }
       
        
          System.out.println();
        //4 materias
        estudiantes[2]= new Estudiante("Pedro", "Benitez", "1706478034");
        System.out.println("Estudiante 3");
        System.out.println("nombre: " + estudiantes[2].getNombre());
        System.out.println("Apellido: " +estudiantes[2].getApellido());
        System.out.println("Cedula: " +estudiantes[2].getCedula());
        System.out.println("materias:" );
        estudiantes [2].setMaterias(m3);     
         
        String[]matEstudiante=estudiantes[2].getMaterias();
        for(int i=0; i<matEstudiante.length; i++){
           System.out.println(matEstudiante[i]); 
           
           if(matEstudiante[i].equals("m2")){
               cont2++;
           }
           else if(matEstudiante[i].equals("m3")){
               cont3++;
           }
           else if(matEstudiante[i].equals("m4")){
               cont4++;
           }
           else if(matEstudiante[i].equals("m5")){
               cont5++;
           }
        }
        
        System.out.println();
        
      /* for(int i=0; i<estudiantes.length; i++){
           System.out.println("nombre"+ estudiantes[i].getNombre());
           for(int j=0; i<estudiantes[i].length; j++){
               
           }
       }*/
      
      System.out.println("****RESUMEN DE MATERIAS****");
      System.out.println("M1: "+cont1);
      System.out.println("M2: "+cont2);
      System.out.println("M3: "+cont3);
      System.out.println("M4: "+cont4);
      System.out.println("M5: "+cont5);
        
        
        
        
        
        
        
        
    }
    
}
