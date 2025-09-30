package Ejercicio1;
public class Prueba {
    
       public static void main(String[] args) {
          
           //Aquí creé los nuevos objtos (Empleados)
        Empleado emp1 = new Empleado("Isaac", 1500);
        Empleado emp2 = new Empleado("Ana", -500); 
        
              //Con esto podemos acceder a las propiedades
        emp1.mostrarInfo();
        emp2.mostrarInfo();
        
           //Con esto podemos modificar el salario
        emp2.setSalario(2000);
        emp2.mostrarInfo();
        
      // Acceso directo a nombre (porque es público)
        emp1.nombre = "Isaac David";
        emp1.mostrarInfo();
    }
}
