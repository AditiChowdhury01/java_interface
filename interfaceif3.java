interface if1{
int x = 1;
public void show();
}
interface if2{
int y = 2;
public void show();
}

class c1 implements if1,if2{
public void show(){
System.out.println(if2.y);
}
/*public void display(){
System.out.println(if1.x);
}*/
public void result(){
System.out.println(x*y);
}
}
public class interfaceif3{
public static void main(String[] args){
c1 c = new c1();
c.show();
//c.display();
c.result();
}
}