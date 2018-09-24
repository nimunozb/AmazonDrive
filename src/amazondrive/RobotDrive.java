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
public class RobotDrive {
    private Robot robotDrive;
    private boolean estado;
    private Posicion posicionfija;
    private  int dir;
  
    public RobotDrive(City city,int a, int b) {
       robotDrive=new Robot(city,a,b,Direction.NORTH,0);
       dir=1;
      posicionfija=new Posicion(a,b);
       estado=false;
    }

    public Posicion getPosicionfija() {
        return posicionfija;
    }

    public void setPosicionfija(Posicion posicionfija) {
        this.posicionfija = posicionfija;
    }

    public Robot getRobotDrive() {
        return robotDrive;
    }

    public void setRobotDrive(Robot robotDrive) {
        this.robotDrive = robotDrive;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

   

    public RobotDrive(Robot robotDrive, boolean estado) {
        this.robotDrive = robotDrive;
        this.estado = estado;
    }

  

  
   


  public  void face(String a){
          
    switch(a)   {
        case"NORTH": if (dir==4) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
            }
            if (dir==3) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
            }
            if (dir==2) {
                this.robotDrive.turnLeft();
            }dir=1;break;
    case"EAST":
            if (dir==1) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
            }
            if (dir==4) {
               this.robotDrive.turnLeft();
               this.robotDrive.turnLeft();
            }
            if (dir==3) {
               this.robotDrive.turnLeft();
            }dir=2;break;
            
        
    case"SOUTH":
            if (dir==2) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
               this.robotDrive.turnLeft();
            }
            if (dir==1) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
            }
            if (dir==4) {
                this.robotDrive.turnLeft();
            }dir=3;break;
            
        
    case "WEST":
            if (dir==3) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
            }
            if (dir==2) {
                this.robotDrive.turnLeft();
                this.robotDrive.turnLeft();
            }
            if (dir==1) {
               this.robotDrive.turnLeft();
            }dir=4;break;
            
        }}
  
  



}