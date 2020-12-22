package com.irisida.lang.exercises.windowclass;

public class Window {
    // attributes
    private int defaultHeight = 400;
    private int defaultWidth = 600;
    private int currentHeight;
    private int currentWidth;
    private boolean maximised;
    private String[] menuOptions;

    public int getDefaultHeight() {
        return this.defaultHeight;
    }

    public int getDefaultWidth() {
        return this.defaultWidth;
    }

    public int getCurrentHeight() {
        return this.currentHeight;
    }

    public void setCurrentHeight(int currentHeight) {
        this.currentHeight = currentHeight;
    }

    public int getCurrentWidth() {
        return this.currentWidth;
    }

    public void setCurrentWidth(int currentWidth) {
        this.currentWidth = currentWidth;
    }

    public boolean isMaximised() {
        return this.maximised;
    }

    public void setMaximised(boolean maximised) {
        this.maximised = maximised;

        if (maximised) {
            this.setCurrentHeight(1080);
            this.setCurrentWidth(1920);
        } else {
            this.currentHeight = getDefaultHeight();
            this.currentWidth = getDefaultWidth();
        }
    }

    public String[] getMenuOptions() {
        return this.menuOptions;
    }

    public void setMenuOptions(String[] menuOptions) {
        this.menuOptions = menuOptions;
    }

}
