package com.fitmat.firebasedemo;

import java.util.HashMap;
import java.util.List;

public class Activites {


    String userId,timestamp;
    String bufferStream;
    String minX,minY,maxX,maxY,size,centre,areaCovered,length,width,shape,orientation;
    String actions;

    HashMap<String,String> hashMap = new HashMap<String, String>();

    public Activites(String userId, String timestamp, String bufferStream, String minX, String minY, String maxX, String maxY, String size, String centre, String areaCovered, String length, String width, String shape, String orientation, String actions, HashMap<String, String> hashMap) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.bufferStream = bufferStream;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.size = size;
        this.centre = centre;
        this.areaCovered = areaCovered;
        this.length = length;
        this.width = width;
        this.shape = shape;
        this.orientation = orientation;
        this.actions = actions;
        this.hashMap = hashMap;
    }





}



