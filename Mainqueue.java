package com.company;
import java.util.LinkedList;
import java.util.Queue;

public class Mainqueue {

    public void queueEx(){

            Queue my = new LinkedList();
            my.add("java");
            my.add("dotnet");
            my.offer("php");
            my.offer("html");

            System.out.println("List " +my);


            System.out.println("remove: " + my.remove());
            System.out.println("element: " + my.element());
            System.out.println("poll: " + my.poll());
            System.out.println("peek: " + my.peek());
        }

    public static void main(String[] args){


        new Mainqueue().queueEx();

    }


}

