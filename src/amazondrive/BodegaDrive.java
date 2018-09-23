/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazondrive;
import becker.robots.*;
/**
 *
 * @author Horacio
 */
public class BodegaDrive {
    private City city=new City();
    private  Estantes [] estante=new Estantes [20];
    public RobotDrive [] robotdrive=new RobotDrive[10];
   
    
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
  // int j=5;int k=0;int kj=9;         
   //while(j<15&&k<10&&kj<20){
   //this.estante[k].setPosicion(2, j);
    //this.estante[kj].setPosicion(3, j);
    //j++;k++;kj++;
  // }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
  // colocacion de los robots
  
   int jl=5;int kl=0;        
   while(jl<15&&kl<10){
   this.robotdrive[kl]=new RobotDrive(city,15,jl);
   
    jl++;kl++;
   }
  
    
    
    }

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    public  Posicion estantesDisponibles (){
     for (int i = 0; i < 20; i++) {
         for (int j = 0; j < 3; j++) {
             for (int k = 0; k < 7; k++) {
               if (this.estante[i].getProducto()[j][k]==null&&this.estante[i].isEstado()==false){
                 return this.estante[i].getPosicion();
               }}}}    
   return null; 
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




}
    
    


