package com.devspark.sidenavigation;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Item of side navigation.
 * 
 * @author johnkil
 * 
 */
class SideNavigationItem {

    public static int DEFAULT_ICON_VALUE = -1;
    public static int BITMAP_ICON_VALUE = -2;

    private int id;
    private String text;
    private int icon = DEFAULT_ICON_VALUE;
    private Bitmap iconBitmap;
    private ImageView.ScaleType scaleType;
    private int backgroundColor;
    private int iconBackgroundColor;
    private boolean toggle;
    private boolean opened;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
    
    public Bitmap getIconBitmap() {
    	return iconBitmap;
    }
    
    public void setIconBitmap(Bitmap bitmap) {
    	this.icon = BITMAP_ICON_VALUE;
    	this.iconBitmap = bitmap;
    }
    
    public ImageView.ScaleType getScaleType() {
    	return scaleType;
    }
    
    public void setScaleType(ImageView.ScaleType scaleType) {
    	this.scaleType = scaleType;
    }
    
    public void setBackgroundColor(int color) {
    	this.backgroundColor = color;
    }
    
    public int getBackgroundColor() {
    	return backgroundColor;
    }
    
    public void setIconBackgroundColor(int color) {
    	this.iconBackgroundColor = color;
    }
    
    public int getIconBackgroundColor() {
    	return iconBackgroundColor;
    }
    
    public boolean isToggle() {
    	return toggle;
    }
    
    public void setToggle(boolean toggle) {
    	this.toggle = toggle;
    }

    public boolean isOpened() {
    	return opened;
    }
    
    public void setOpened(boolean opened) {
    	this.opened = opened;
    }
}
