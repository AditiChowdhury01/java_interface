import java.util.*;
interface threed{
double pi = 3.14;
public double surface_area();
public double volume();
}

class sphere implements threed{
double r;
public sphere(){
Scanner sc = new Scanner(System.in);
System.out.println("enter radius");
r = sc.nextDouble();
}
public double surface_area(){
return pi*r*r*4;
}
public double volume(){
return (pi*r*r)*4/3;
}
}

class cylinder implements threed{
double r;
double h;
public cylinder(){
Scanner sc = new Scanner(System.in);
System.out.println("enter radius");
r = sc.nextDouble();
System.out.println("enter height");
h = sc.nextDouble();
}
public double surface_area(){
return 2*pi*r*(h+r);
}
public double volume(){
return pi*r*r*h;
}
}
class cone implements threed{

double r;
double h; 
public cone(){
Scanner sc = new Scanner(System.in);
System.out.println("enter radius");
r = sc.nextDouble();
System.out.println("enter height");
h = sc.nextDouble();
}
public double surface_area(){
return pi*r*(r+Math.sqrt(h*h+r*r));
}
public double volume(){
return (pi*r*r*h)/3;
}
}

public class interface1{
public static void main(String[] args){

sphere s = new sphere();
System.out.println("the surface area is"+s.surface_area());
System.out.println("the surface area is"+s.volume());

cylinder cy = new cylinder();
System.out.println("the surface area is"+cy.surface_area());
System.out.println("the surface area is"+cy.volume());

cone co = new cone();
System.out.println("the surface area is"+co.surface_area());
System.out.println("the surface area is"+co.volume());

}
}