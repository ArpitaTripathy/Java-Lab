interface A
{void showA();}
interface B extends A
{
void showB();
}
class C implements B
{
public void showA()
{
System.out.println("Interface A");
}
public void showB()
{
System.out.println("Interface B");
}
public static void main(String args[])
{
C a=new C();
a.showA();
a.showB();
}
}