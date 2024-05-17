interface if1{
int x = 1;
public void show();
}
interface if2{
int y = 2;
public void display();
}
interface if3 extends if1,if2{
int z = x+y;
}

class c1 implements if3{
public void show(){
System.out.println(z);
}
public void display(){
System.out.println(x * y);
}
}
public class multi_interface{
public static void main(String[] args){
c1 c = new c1();
c.show();
c.display();
}
}