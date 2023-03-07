/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vanioh Berjaya
 */
public class Utilitaire {
    String url = "";
    
    public static String getUrl(String url){
        String separator = "/";
        String[] spliter = url.split(separator);
        return spliter[spliter.length-1];
    
    }
}
