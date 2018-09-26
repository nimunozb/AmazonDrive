/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;
import java.util.TreeMap;
import becker.robots.*;
import java.util.ArrayList;
/**
 *
 * @author Horacio
 */
public class BodegaDrive {
    private City city=new City();
    private  Estantes [] estante=new Estantes [20];
    private  RobotDrive [] robotdrive=new RobotDrive[10];
   private Empleados [] empleado=new Empleados[2];
   private TreeMap<Integer,Productos>productosBodega;
  private   Productos[] produtosaIngresar=new Productos[10];
   
    /**
     * @deprecated: inicializa todos los objetos que estan dentro de la bodega
     */
public BodegaDrive() {
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
   //colocacion de paredes     
        
        for (int i = 0; i < 12; i++) {
            Wall pared = new Wall(city, 2, i+4, Direction.NORTH);
            Wall pared1 = new Wall(city,15, i+4, Direction.SOUTH);
    }
        for (int i = 0; i < 2; i++) {
            Wall pared = new Wall(city, i+4, 2, Direction.WEST);
              Wall pared2 = new Wall(city, 14, 2, Direction.WEST);
            Wall pared1 = new Wall(city,i+4, 17, Direction.EAST);
            Wall pared3 = new Wall(city,14, 17, Direction.EAST);
            
            Wall pared6 = new Wall(city,15 , 2+i, Direction.NORTH);
            Wall pared7 = new Wall(city,15, 16+i, Direction.NORTH);
             Wall pared8 = new Wall(city,3 , 2+i, Direction.SOUTH);
            Wall pared9 = new Wall(city,3, 16+i, Direction.SOUTH);
              
            Wall pared4 = new Wall(city, 15, 4, Direction.WEST);
            Wall pared5 = new Wall(city,15, 15, Direction.EAST);
            }
     
          for (int i = 0; i < 2; i++) {
              Wall pared2 = new Wall(city, i+2, 4, Direction.WEST);
            Wall pared1 = new Wall(city,i+2, 15, Direction.EAST);
       }
         for (int i = 0; i < 7; i++) {
             Wall pared6 = new Wall(city,6+i ,2 , Direction.WEST);
            Wall pared7 = new Wall(city,6+i, 17, Direction.EAST);
        }
            Wall pared6 = new Wall(city,14 , 1, Direction.NORTH);
            Wall pared7 = new Wall(city,14, 18, Direction.NORTH);
            Wall pared8 = new Wall(city,12 , 1, Direction.SOUTH);
            Wall pared9 = new Wall(city,12, 18, Direction.SOUTH);
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  //colocacion de things para estantes       
  for (int i = 2; i < 4; i++) {
              for (int j = 5; j < 15; j++) {
     Thing thing=new Thing(city,i,j);
      }}
 int j=5;int k=0;int kj=9;         
   while(j<15&&k<10&&kj<20){
   this.estante[k]=new Estantes(2, j,k);
    this.estante[kj]=new Estantes(3, j,kj);
    j++;k++;kj++;
   }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
  // colocacion de los robots
  
   int jl=5;int kl=0;        
   while(jl<15&&kl<10){
   this.robotdrive[kl]=new RobotDrive(city,15,jl);
   
    jl++;kl++;
   }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    //colocacion de empleados
    empleado[0]=new Empleados("Nicolas Muñoz","almacenador");
    empleado[1]=new Empleados("Andres Cardenas","empaquetador");
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //colocacion de productos
     produtosaIngresar[0]=new Productos("Refisal","Canasta Familiar");
     produtosaIngresar[1]=new Productos("Samsung Galaxy j7","tecnologia");
      produtosaIngresar[2]=new Productos("Maus","Tecnologia");
     produtosaIngresar[3]=new Productos("computador","tecnologia");
      produtosaIngresar[4]=new Productos("pasta","Canasta Familiar");
     produtosaIngresar[5]=new Productos("smart tv","tecnologia");
      produtosaIngresar[6]=new Productos("huevosFricar","Canasta Familiar");
     produtosaIngresar[7]=new Productos("Multimetro fuke","tecnologia");
      produtosaIngresar[8]=new Productos("lecheecono","Canasta Familiar");
     produtosaIngresar[9]=new Productos("Play station 5","tecnologia");
     
    
    
    }
public Estantes[] getEstante() {
        return estante;
    }
public void setEstante(Estantes[] estante) {
        this.estante = estante;
    }
 public RobotDrive[] getRobotdrive() {
        return robotdrive;
    }
public void setRobotdrive(RobotDrive[] robotdrive) {
        this.robotdrive = robotdrive;
    }
public City getCity() {
        return this.city;
    }
public void setCity(City city) {
        this.city = city;
    }
public int robotsDisponibles(){
        for (int i = 0; i < 10; i++) {
            if(robotdrive[i].isEstado()==false){
                return i;
                
            }
        }
     return 990;   
    }
public Empleados[] getEmpleado() {
        return empleado;
    }
public void setEmpleado(Empleados[] empleado) {
        this.empleado = empleado;
    }
public void caminata(int b,int a,String x){
        for (int i = 0; i < a; i++) {
            robotdrive[b].getRobotDrive().move();
        }robotdrive[b].face(x);
        
    }
public  int estantesDisponibles (){
     for (int i = 0; i < 20; i++) {
         for (int j = 0; j < 3; j++) {
             for (int k = 0; k < 7; k++) {
               if (this.estante[i].getcajonProducto()[j][k]==null&&this.estante[i].isEstado()==false){
                 return i;
               }}}}    
   return -1; 
}
public TreeMap<Integer, Productos> getProductosBodega() {
        return productosBodega;
    }
public void setProductosBodega(TreeMap<Integer, Productos> productosBodega) {
        this.productosBodega = productosBodega;
    }
public Productos[] getProdutosaIngresar() {
        return produtosaIngresar;
    }
public void setProdutosaIngresar(Productos[] produtosaIngresar) {
        this.produtosaIngresar = produtosaIngresar;
    }

    /**
     * @deprecated: funcion creada para buscar un producto[i] en todos los estantes 
     * @param:Productos producto
     * @return 
     */
    public Posicion buscarInventarioProducto(Productos producto){
       for (int i = 0; i < 20; i++) {
         for (int j = 0; j < 3; j++) {
             for (int k = 0; k < 7; k++) {
               if (this.estante[i].getcajonProducto()[j][k]==producto&&this.estante[i].getcajonProducto()[j][k].isEntregado()==false){
                 this.estante[i].getcajonProducto()[j][k].setEntregado(true);
                 
                 producto.getPosicionProducto().setEstante(i);
                  producto.getPosicionProducto().setAvenue(j);
                   producto.getPosicionProducto().setStreed(k);
                 
                   return producto.getPosicionProducto();
                   
                   
               }}}}  
       return null ;
    }

   public  void RecogerEstante(Productos producto[],int productodeInicio, int productoFinal){
     String n="NORTH";
     String s="SOUTH";
     String e="EAST";
     String w="WEST";
     
     int a=robotsDisponibles();
     int b=estantesDisponibles();
     robotdrive[a].setEstado(true);
     estante[b].setEstado(true);
    robotdrive[a].setDir(1);
     robotdrive[a].face(n);
     robotdrive[a].getRobotDrive().move();
     robotdrive[a].face(e);
     
     int as= 15-robotdrive[a].getRobotDrive().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();}
     robotdrive[a].face(n);
     
     as=robotdrive[a].getRobotDrive().getStreet()-estante[b].getPosicion().getStreed();
      for (int i = 0; i < as; i++) {
        robotdrive[a].getRobotDrive().move();}
    robotdrive[a].face(w);
    
    as=robotdrive[a].getRobotDrive().getAvenue()-estante[b].getPosicion().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }if(robotdrive[a].getRobotDrive().canPickThing()==true){robotdrive[a].getRobotDrive().pickThing();}
   
   as=robotdrive[a].getRobotDrive().getAvenue()-4;
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(s);
   
   as=4-robotdrive[a].getRobotDrive().getStreet();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(w);
       
   as=robotdrive[a].getRobotDrive().getAvenue()-2;
           for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(s);
    
   as=13-robotdrive[a].getRobotDrive().getStreet();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }
     
    empleado[0].almacenarProducto(producto, productodeInicio, productoFinal, estante[b]);
     robotdrive[a].face(e);robotdrive[a].getRobotDrive().move();robotdrive[a].getRobotDrive().move();robotdrive[a].face(n);
   
    as=robotdrive[a].getRobotDrive().getStreet()-estante[b].getPosicion().getStreed();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(e);
      
    as=estante[b].getPosicion().getAvenue()-robotdrive[a].getRobotDrive().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].getRobotDrive().putThing();
       
       as=15-robotdrive[a].getRobotDrive().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(s);
       
       as=14-robotdrive[a].getRobotDrive().getStreet();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(w);
       
       as=robotdrive[a].getRobotDrive().getAvenue()-robotdrive[a].getPosicionfija().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }robotdrive[a].face(s);robotdrive[a].getRobotDrive().move();robotdrive[a].face(n);
       
       robotdrive[a].setEstado(false);
        estante[b].setEstado(false);
        
   }
 
  public void enviarProducto(ArrayList<Posicion>posicion){
     String n="NORTH";
     String s="SOUTH";
     String e="EAST";
     String w="WEST";
     int a=robotsDisponibles();
     int b=posicion.get(0).getEstante();
     robotdrive[a].setEstado(true);
     estante[b].setEstado(true);
    robotdrive[a].setDir(1);
     robotdrive[a].face(n);
     robotdrive[a].getRobotDrive().move();
     robotdrive[a].face(e);
    
     int as= 15-robotdrive[a].getRobotDrive().getAvenue();
     caminata(a,as,n);
     as=robotdrive[a].getRobotDrive().getStreet()-estante[b].getPosicion().getStreed();
    caminata(a,as,w);
      
    as=robotdrive[a].getRobotDrive().getAvenue()-estante[b].getPosicion().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }if(robotdrive[a].getRobotDrive().canPickThing()==true){robotdrive[a].getRobotDrive().pickThing();}
     
     
      
  }


}
    
    


