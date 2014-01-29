package com.devspark.sidenavigation;

/**
 * Item of side navigation.
 * 
 * @author johnkil
 * 
 */
class SideNavigationItem {

    public static int DEFAULT_ICON_VALUE = -1;

    private int id;
    private String text;
    private int icon = DEFAULT_ICON_VALUE;
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
