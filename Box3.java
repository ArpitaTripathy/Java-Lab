class Box3
{
double width,height,depth;
int boxNo;
Box3(double w,double h,double d,int num)
{
width=w;
height=h;
depth=d;
boxNo=num;
}
Box3()
{
width=height=depth=0;
}
Box3(int num)
{
this();
boxNo=num;
}
public static void main(String args[])
{
Box3 box1=new Box3(1);
System.out.println(box1.width);
}
}