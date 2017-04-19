package com.aan.netty.com.xml;

/**
 * Created by lainc on 4/19/2017.
 */
public class SimpleBean {
    String x;
    String y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
