/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.clase;

import javax.swing.JOptionPane;


public class ProyectoClase {

     
    
    public static void main(String[] args) {
       



        //Ingresamos los carros (placas y marcas) que hay para la venta y el precio
        String[] placas = new String[]{"FGH346","THU622","NJM790","JND0895","QDH290"};
        String[] marcas = new String[]{"Chevrolet","KIA","Chevrolet","Mazda","Renault"};
        int[] precios = new int[]{20500000,35000500,56800000,60700000,69000000};
        String[] clientesCompra = new String[5];
        String[] telefonosCompra = new String[5];
        int[] VehCompra = new int[5];
        int numClientes=0;
        int cont;
        int au,i=0;
        String consAutos,p="0000",contrase馻;
        int total = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de compras de Autos Reparados");
        int opcion=0;
        while(opcion!=3){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" 1. Administrador \n 2. Cliente \n 3. Salir \n \n Digite la opcion a la que desea ingresar"));
            if(opcion<1 | opcion>3){
                JOptionPane.showMessageDialog(null, "Ha escrito una opci贸n incorrecta");
            }
            switch(opcion){
                case 3: //Salir
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                case 1: //opcion administrador. Menu 1
                    
                        contrase馻=JOptionPane.showInputDialog("por favor ingrese la contrase帽a");
                        if(p.equals(contrase馻)){

                            int opcadm=0;
                            while(opcadm!=3){
                               opcadm = Integer.parseInt(JOptionPane.showInputDialog(" 1. Ver ventas totales \n 2. Lista de clientes que han comprado vehiculo \n 3. Regresar \n \n Digite la opcion a la que desea ingresar"));
                                if(opcadm<1 | opcadm>3){
                                    JOptionPane.showMessageDialog(null, "Ha escrito una opci贸n incorrecta");
                                }
                                switch(opcadm){
                                    case 3: //Salir al menu principal
                                        JOptionPane.showMessageDialog(null, "Regresando al menu principal");
                                        opcadm =3;
                                        break;
                                    case 1: //Ver ventas totales. Menu administrador
                                    for(cont=0;cont<precios.length;cont++){
                                         total = total + precios[cont];
                                      }
                                        cont=0;
                                        total=0;
                                        while(cont<numClientes){
                                            total = total + precios[VehCompra[cont]];
                                            cont++;
                                        }
                                        JOptionPane.showMessageDialog(null, "El total de las ventas son: " + total);
                                        break;
                                    case 2: //Ver lista de clientes. Menu administrador
                                        String ConsClientes="";
                                        cont=0;
                                        JOptionPane.showMessageDialog(null, "Han comprado " + numClientes + " clientes el vehiculo de sus suenos");
                                        while(cont<numClientes){
                                            ConsClientes = ConsClientes + "Cliente " + (cont+1) + ": "+ clientesCompra[cont] + ". Telefono: " + telefonosCompra[cont] + ". Placa: " + placas[VehCompra[cont]] + ". Marca: " + marcas[VehCompra[cont]] + ". Precio: " + precios[VehCompra[cont]] + "\n";
                                            cont++;
                                        }
                                        JOptionPane.showMessageDialog(null, ConsClientes);
                                        break;
                                }

                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "error al ingresar la contrase帽a");
                        }   
                    break;
                case 2: //opcion cliente. Menu 1
                    int opccli=0;
                    while(opccli!=2){
                        opccli = Integer.parseInt(JOptionPane.showInputDialog(" 1. Comprar un vehiculo \n 2. Regresar \n \n Digite la opcion a la que desea ingresar"));
                        if(opccli<1 | opccli>2){
                            JOptionPane.showMessageDialog(null, "Ha escrito una opci贸n incorrecta");
                        }
                        switch(opccli){
                            case 2: //Salir al menu principal
                                JOptionPane.showMessageDialog(null, "Regresando al menu principal");
                                break;
                            
                            case 1: //Comprar vehiculo. Menu clientes
                                consAutos="";
                                for(au=0;au<placas.length;au++){
                                    consAutos= consAutos + "El auto " + (au+1) + " es: " + placas[au] + " de la marca " + marcas[au] + " que tiene un precio de " + precios[au] + "\n";
                                }
                                VehCompra[numClientes] = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion del auto que desea comprar:\n\n" + consAutos))-1;
                                if(VehCompra[numClientes]<0 | VehCompra[numClientes]>4){
                                    JOptionPane.showMessageDialog(null, "Ha escrito una opci贸n incorrecta, volviendo al menu anterior");

                                }
                                else{
                                    clientesCompra[numClientes] = JOptionPane.showInputDialog("Ingrese su nombre");
                                    telefonosCompra[numClientes] = JOptionPane.showInputDialog("Ingrese su telefono");
                                    numClientes++;
                                    JOptionPane.showMessageDialog(null, "La compra fue exitosa");
                                }
                                
                                break;
                                    
                        }
                    }
            }
        }
    }
}








        
       


    
                                            
                                           
                                               
                          
       
                                                       
                   
 
                   
          
        
               
            
       
         
    
    
    
    
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

       
                                          
 
       
        
        
    
