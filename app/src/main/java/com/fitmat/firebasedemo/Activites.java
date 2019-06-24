package com.fitmat.firebasedemo;

public class Activites {


    String userId,timestamp;
    String bufferStream;
    String minX,minY,maxX,maxY,size,centre,areaCovered,length,width,shape,orientation;
    String actions;



    public Activites(String userId, String timestamp, String bufferStream, String minX, String minY, String maxX, String maxY, String size, String centre, String areaCovered, String length, String width, String shape, String orientation, String actions) {
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
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBufferStream() {
        return bufferStream;
    }

    public void setBufferStream(String bufferStream) {
        this.bufferStream = bufferStream;
    }

    public String getMinX() {
        return minX;
    }

    public void setMinX(String minX) {
        this.minX = minX;
    }

    public String getMinY() {
        return minY;
    }

    public void setMinY(String minY) {
        this.minY = minY;
    }

    public String getMaxX() {
        return maxX;
    }

    public void setMaxX(String maxX) {
        this.maxX = maxX;
    }

    public String getMaxY() {
        return maxY;
    }

    public void setMaxY(String maxY) {
        this.maxY = maxY;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getAreaCovered() {
        return areaCovered;
    }

    public void setAreaCovered(String areaCovered) {
        this.areaCovered = areaCovered;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }
}



