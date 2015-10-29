package com.example;
import java.util.Scanner;

public class MyClass
{
    String camera1;
    String camera2;
    String camera3;
    String activity;

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What activity are you doing today? Choose from surfing, mountain biking, " +
                "or sky diving.");

        //Choose which activity here
        MyClass activity = new MyClass("surfing");

        activity.cameraName("Hero 4 Session");
        activity.cameraName2("Hero 4 Black");
        activity.cameraName3("Hero 4 Silver");
    }

    public MyClass(String activity)
    {
        this.activity = activity;
    }

    public void cameraName(String camera) //surfing
    {
        camera1 = camera;
        if (activity == "surfing")
        {
            System.out.println("\nBecause you are " + activity + " you need the " + camera1);
        }
    }

    public void cameraName2(String camera) //mountain biking
    {
        camera2 = camera;
        if (activity == "mountain biking")
        {
            System.out.println("\nBecause you are " + activity + " you need the " + camera2);
        }
    }

    public void cameraName3(String camera) //sky diving
    {
        camera3 = camera;
        if (activity == "sky diving")
        {
            System.out.println("\nBecause you are " + activity + " you need the " + camera3);
        }
    }
}


