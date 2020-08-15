/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package height_inch_program;

/**
 *
 * @author Asus
 */
public class Height_inch_program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float Height,weight;
        Height=heightConvertor(5,11);
        weight=weightConvertor(60);
        System.out.println("Output 1:");
        System.out.println("Height in cm "+Height);
        System.out.println("weight in pounds:"+weight);
        System.out.println();
        Height=heightConvertor(5,0);
        weight=weightConvertor(101);
        System.out.println("Output 2:");
        System.out.println("Height in cm "+Height);
        System.out.println("weight in pounds:"+weight);
       
    }
        static float heightConvertor(int heightFeetPart,int heightInchPart)
        {
            
         return (float) ((heightFeetPart*12+heightInchPart)*2.54);
        }
        static float weightConvertor(int weight)
        {
            return (float) (weight*2.2);
        }
    }
    

