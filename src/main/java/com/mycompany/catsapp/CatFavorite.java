/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catsapp;

/**
 *
 * @author soycarlosherrera
 */
public class CatFavorite {
    
    String id;
    String image_id;
    String apiKey = "live_tBTR3LD77CFUQMU6A5wA4lrZmx64hRJX8L1bLwYqBSh818ycgNCck3tgsTIlxFrU";
    ImageFavorite image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public ImageFavorite getImageFavorite() {
        return image;
    }

    public void setImageFavorite(ImageFavorite image) {
        this.image = image;
    }
    
    
    
}
