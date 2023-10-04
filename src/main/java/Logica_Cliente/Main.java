/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;


import Logica_Negocio.Empleado;
import java.util.ArrayList;


import java.util.Scanner;



/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion de variables
    String Nombre="";
    String Codigo="";
    int Año_ingreso=0;
    int añoactual=2023;
    int Cantidad=0;
    String Id="";
    int Bandera =0;
    int opc=0;
    
  //crear listaempleados
     ArrayList<Empleado>listaempleados=new ArrayList();
    //creacion del objeto
     Empleado objempleado =new Empleado();
     //fijar informacion
     Scanner scan = new Scanner (System.in);
     
     do{
    System.out.println("Menú de Opciones:");
    System.out.println("1. Registrar empleados");
    System.out.println("2. Listar empleados");
    System.out.println("3. Editar empleados ");
    System.out.println("4. Eliminar empleados ");
    System.out.println("5. Buscar empleados ");
    System.out.println("6. salir"); 
   System.out.print("Seleccione una opción: ");
    opc= scan.nextInt();
    
   
        
  switch (opc) {
    case 1:
//Registro
System.out.println("Digite la cantidad de empleados a registrar");
    Cantidad= scan.nextInt();
    scan.nextLine();
                   
    for (int i = 0; i < Cantidad; i++) {
    System.out.println("Digite el nombre del empleado");
    Nombre= scan.nextLine();
    System.out.println("Digite el codigo del empleado");
    Codigo= scan.nextLine();
    System.out.println("Digite el año de ingreso del empleado");
    Año_ingreso= scan.nextInt();
    
    scan.nextLine();
    objempleado= new Empleado(Nombre,Codigo, Año_ingreso);
    listaempleados.add(objempleado);
}  
    System.out.println("El registro de empleados ha sido exitoso");
break;

case 2: 
// listar 
if (Bandera==0) {
    System.out.println("El empleado no se encuentra registrado o el Id del empleado es incorrecto");
    }

for (int i = 0; i < listaempleados.size(); i++) {
    System.out.println("\n");
    System.out.println("Empleado"+"\t"+(i+1));
    System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
    System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
    System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_ingreso());
}
break;

case 3:
//editar
scan.nextLine();
    System.out.println("Digite el id del empleado a modificar");
    Id=scan.nextLine();
    for (int i = 0; i < listaempleados.size(); i++) {
        if(listaempleados.get(i).getCodigo().equals(Id))
{
        System.out.println("Digite el nombre del empleado");
        Nombre= scan.nextLine();
        System.out.println("Digite el codigo del empleado");
        Codigo= scan.nextLine();
        System.out.println("Digite el año de ingreso del empleado");
        Año_ingreso= scan.nextInt();
                           
        listaempleados.get(i).setNombre(Nombre);
        listaempleados.get(i).setCodigo(Codigo);
        listaempleados.get(i).setAñoingreso(Año_ingreso);
        System.out.println("El empleado ha sido modificado");
        }
   }
for (int i = 0; i < listaempleados.size(); i++) {
    System.out.println("\n");
    System.out.println("Empleado"+"\t"+(i+1));
    System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
    System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
    System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_ingreso());
    }
    break; 
    
case 4:
//eliminar
scan.nextLine();
System.out.println("Digite el codigo del empleado a eliminar");
Id=scan.nextLine();
for (int i = 0; i < listaempleados.size(); i++) {
    if(listaempleados.get(i).getCodigo().equals(Id))
    {
    System.out.println("\n");
    System.out.println("El Empleado "+(i+1)+" ha sido eliminado");
    listaempleados.remove(i);
    }
}
break;

case 5:
//buscar
scan.nextLine();
System.out.println("Digite el codigo del empleado a buscar");
    Id=scan.nextLine();
    double startTime = System.currentTimeMillis();
    for (int i = 0; i < listaempleados.size(); i++) {
        if(listaempleados.get(i).getCodigo().equals(Id))
        {
        
        System.out.println("\n");
        System.out.println("Empleado"+"\t"+(i+1));
        System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
        System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
        System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_ingreso());
    }
}
break;

        case 6:
            System.out.println("Saliendo del programa");
            break;

            default:
            System.out.println("Opción no válida");
            }
        } while (opc!= 6);
     
     
    
}  
}
