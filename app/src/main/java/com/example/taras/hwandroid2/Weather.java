package com.example.taras.hwandroid2;

/**
 * Created by Taras on 26.11.2016.
 */

public class Weather {

    private Direction direction;
    private int windSpeed;
    private int temperature;
    private CloudCover cloudCover;
    private int rainFall;

    public Weather(Direction direction, int windSpeed, int temperature, CloudCover cloudCover,
                   int rainFall) {
        this.direction = direction;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.cloudCover = cloudCover;
        this.rainFall = rainFall;
    }

    public Weather saveParams(Direction D, int wS, int t, CloudCover cC, int rF){
        this.direction = D;
        this.windSpeed = wS;
        this.temperature = t;
        this.cloudCover = cC;
        this.rainFall = rF;
        return this;
    }

    public void print (){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Weather{" +
                "direction=" + direction +
                ", windSpeed=" + windSpeed +
                ", temperature=" + temperature +
                ", cloudCover=" + cloudCover +
                ", rainFall=" + rainFall +
                '}';
    }

}
