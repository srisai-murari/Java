package oops.Inheritance;

public class BoxParent {
    private double noAccess;//private is something only that particular class can have access to
    double l;
    double h;
    double w;


    double weight;


    BoxParent(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
        this.noAccess = -1; //works coz noAccess is in same class
        // and this "noAccess" can be modified through constructor calls
        //this "noAccess" cannot be called from outside this class
    }

    //cube
    BoxParent(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    //cuboid
    BoxParent(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //contains a private element
    BoxParent(double l, double h, double w, double noAccess){
        this.l = l;
        this.h = h;
        this.w = w;
        this.noAccess = noAccess;
    }

    //object
    BoxParent(BoxParent object){
        this.l = object.l;
        this.h = object.h;
        this.w = object.w;
    }




}
