/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.catsapp;

import javax.swing.JOptionPane;

/**
 *
 * @author soycarlosherrera
 */
public class CatsApp {

    public static void main(String[] args) {
        
        int optionMenu = -1;
        String[] buttons = {" 1. Ver Gatos "," 2. Salir "};
        
        do{
            
            String option = (String) JOptionPane.showInputDialog(null,"Cats Java","Menu Principal",JOptionPane.INFORMATION_MESSAGE,null,buttons,buttons[0]);
            
            for(int i=0;i<buttons.length;i++){
                if(option.equals(buttons[i])){
                    optionMenu = i;
                }
            }    
            
            switch(optionMenu){
                case 0:
                    break;
                default:
                    break;
            }
            
        }while(optionMenu != 1);        
        
    }
}
