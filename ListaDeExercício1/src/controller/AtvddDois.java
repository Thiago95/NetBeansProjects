/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author thiag
 */
public class AtvddDois {
    public int media;
    
    public AtvddDois(){
        
    }
    /**
     * @return the media
     */
    public int getMedia() {
        return media;
    }

    
    public void setMedia(int n1, int n2, int n3) {
        this.media = (n1 + n2 + n3)/3;
    }
    
}
