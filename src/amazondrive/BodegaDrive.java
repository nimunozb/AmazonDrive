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
     produtosaIngresar[0]=new Productos(1,"Refisal","Canasta Familiar");
     produtosaIngresar[1]=new Productos(2,"Samsung Galaxy j7","tecnologia");
      produtosaIngresar[2]=new Productos(3,"Maus","Tecnologia");
     produtosaIngresar[3]=new Productos(4,"computador","tecnologia");
      produtosaIngresar[4]=new Productos(5,"pasta","Canasta Familiar");
     produtosaIngresar[5]=new Productos(6,"smart tv","tecnologia");
      produtosaIngresar[6]=new Productos(8,"huevosFricar","Canasta Familiar");
     produtosaIngresar[7]=new Productos(7,"Multimetro fuke","tecnologia");
      produtosaIngresar[8]=new Productos(10,"lecheecono","Canasta Familiar");
     produtosaIngresar[9]=new Productos(9,"Play station 5","tecnologia");
     
    
    
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
/**
 * @deprecated: busca los robot que estar sin hacer nada y los pone a hacer algo
 * @return 
 */
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
/**
 * @deprecated: para no poner tanto codigo repetido se utiliza esta para que el robot camine ciertas posiciones
 * @param b
 * @param a
 * @param x 
 */
public void caminata(int identificadorrobot,int totalmov,String posicion){
        for (int i = 0; i < totalmov; i++) {
            robotdrive[identificadorrobot].getRobotDrive().move();
        }robotdrive[identificadorrobot].face(posicion);
        
    }
 /**
 *  @deprecated: busca los estantes que tienen espacios para poner productos, retorna el identificador del estante que permite obtener la posicion
 * @return 
 */
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
     * @deprecated: lo que se queria llegar con este metodo era que pudiera meter en un Treemap todos los productos que estaban en los estantes 
     * para que se pudiera hacer un inventario; pero hay un null punter.exeption o como sea no compila
     * @return 
     */
     public TreeMap inventario(){
         for (int i = 0; i < 20; i++) {
         for (int j = 0; j < 3; j++) {
             for (int k = 0; k < 7; k++) {
              if(this.estante[i].getcajonProducto()[j][k]!=null){   
              this.productosBodega.put(this.estante[i].getcajonProducto()[j][k].getIdentificador(),this.estante[i].getcajonProducto()[j][k]);
           }}}}
    return this.productosBodega;
    }  
    
     /**
      * @deprecated: lo que se quria hacer con este metodo era  mostar todos los productos que estan disponibles, en el inventario
      * para que el usuario pudiera saber el identificador del producto y asi pudiera pedirlo a amazaon; como se hace en la vida real
      */
    public void mostrarInventario(){
        inventario();
        for (int i = 0; i < this.productosBodega.size(); i++) {
            System.out.println("la"+this.productosBodega.get(i)+"lo"+i);
        }
  
        
        
    }
    


    /**
     * @deprecated: funcion creada para buscar un producto[i] en todos los estantes mediante un identificador 
     * metodo utilizado en amazon, pero no compila es una idea para abordar el envio de un producto
     * @param:Integer identificadorProducto
     * @return 
     */
    
    public Posicion buscarInventarioProducto(int identificadorProducto){
       inventario();
      return this.productosBodega.get(identificadorProducto).getPosicionProducto();
       
               
    }

    /**
     * @deprecated: metodo utilizado para  meter los productos que se encuentran un un array y meterlos en los estantes
     * el robot hace todo el procedimiento pertinente ylo lleva hacia el ekpleado quien es el que mete los productos en los estantes
     * @param producto
     * @param productodeInicio
     * @param productoFinal 
     */
   public  void RecogerEstante(Productos producto[],int productodeInicio, int productoFinal){
     String n="NORTH";
     String s="SOUTH";// para hacer la programacion mas facil
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
     
     int as= 15-robotdrive[a].getRobotDrive().getAvenue();// juego de sumas y restas
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
     
    empleado[0].almacenarProducto(producto, productodeInicio, productoFinal, estante[b]);// el empleado guarda los productos seleccionados en los estantes
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
 /**
  * @deprecated: este metodo aborda el envio del producto, hace que el robot recoja el estante disponible; no obstante falla a la hora 
  * de buscar el producto dentro de los estantes para poder enviarlos
  * @param posicion 
  */
  public void enviarProducto(ArrayList<Posicion>posicion){
     String n="NORTH";// para hacer la programacion mas facil
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
    
     int as= 15-robotdrive[a].getRobotDrive().getAvenue();// juego de sumas y restas
     caminata(a,as,n);
     as=robotdrive[a].getRobotDrive().getStreet()-estante[b].getPosicion().getStreed();
    caminata(a,as,w);
      
    as=robotdrive[a].getRobotDrive().getAvenue()-estante[b].getPosicion().getAvenue();
       for (int i = 0; i < as; i++) {
           robotdrive[a].getRobotDrive().move();
       }if(robotdrive[a].getRobotDrive().canPickThing()==true){robotdrive[a].getRobotDrive().pickThing();}
      robotdrive[a].face(e);
      
      as=15-robotdrive[a].getRobotDrive().getAvenue();
      caminata(a,as,s);
      caminata(a,2,e);
      caminata(a,2,s);
      caminata(a,9,s);
      
      empleado[1].entregaProducto(estante[b], posicion); // ESTO ES LO QUE HP NO COMPILA
      
     
      
  }


}
    
    


