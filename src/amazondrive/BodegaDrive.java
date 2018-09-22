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
    private static City city=new City();

    public BodegaDrive() {
         for (int i = 0; i < 12; i++) {
            Wall pared = new Wall(city, 0, i+4, Direction.NORTH);
            Wall pared1 = new Wall(city,16, i+4, Direction.SOUTH);
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
              
            Wall pared4 = new Wall(city, i+15, 4, Direction.WEST);
            Wall pared5 = new Wall(city,i+15, 15, Direction.EAST);
            
        }
     
          for (int i = 0; i < 4; i++) {
              Wall pared2 = new Wall(city, i, 4, Direction.WEST);
            Wall pared1 = new Wall(city,i, 15, Direction.EAST);
       }
         for (int i = 0; i < 7; i++) {
             Wall pared6 = new Wall(city,6+i ,2 , Direction.WEST);
            Wall pared7 = new Wall(city,6+i, 17, Direction.EAST);
        }
       
     
            Wall pared6 = new Wall(city,14 , 1, Direction.NORTH);
            Wall pared7 = new Wall(city,14, 18, Direction.NORTH);
            Wall pared8 = new Wall(city,12 , 1, Direction.SOUTH);
            Wall pared9 = new Wall(city,12, 18, Direction.SOUTH);
        
          
          
        }
    
    

}
