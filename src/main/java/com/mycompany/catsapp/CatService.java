/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catsapp;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author soycarlosherrera
 */
public class CatService {
    
    public static void showCat() throws IOException{
        
        //Traer datos de la API
        OkHttpClient client = new OkHttpClient();
        
        Request request = new Request.Builder().url("https://api.thecatapi.com/v1/images/search").get().build();
        
        Response response = client.newCall(request).execute();
        
        String catJson = response.body().string();
        
        //Cortar los corchetes del Json
        catJson = catJson.substring(1,catJson.length()-1);

        //Crear un objeto Gson
        Gson gson = new Gson();
        Cat cat = gson.fromJson(catJson, Cat.class);
        
        //Redimensionar imagen en caso necesario
        Image image = null;
        
        try{
            
            URL url = new URL(cat.getUrl());
            image = ImageIO.read(url);
            
            ImageIcon catImage = new ImageIcon(image);
            
            if(catImage.getIconWidth()>800){
                
                //Redimensionamos
                Image catBase = catImage.getImage();
                Image catRefactor = catBase.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                
                catImage = new ImageIcon(catRefactor);
                
            }
            
            String menu = "...Opciones:  \n"
                        + " 1. Ver otra imagen. \n"
                        + " 2. Favorito. \n"
                        + " 3. Volver. \n";
            
            String[] button = {"Ver otra imagen","Favorito","Volver"};            
            String id_cat = cat.getId();
            String option = (String) JOptionPane.showInputDialog(null,menu,id_cat,JOptionPane.INFORMATION_MESSAGE,catImage,button,button[0]);
            
            int selection = -1;
            
            for(int i=0;i<button.length;i++){
                if(option.equals(button[i])){
                    selection = i;
                }
            } 
            
            switch(selection){
                case 0:
                    showCat();
                    break;
                case 1:
                    favoriteCat(cat);
                    break;
                default:
                    break;
            }
            
        }catch(IOException e){
            System.out.println(e);
        }  
        
    }
    
    public static void favoriteCat(Cat cat){
            
    }
    
}
