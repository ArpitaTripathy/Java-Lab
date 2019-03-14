abstract class Animal
{
String name,species;
Animal(String s,String n)
{
name=n;
species=s;
}
void eat(String fooditem)
{
System.out.println(species+" "+name+"likes to have "+fooditem);
}
abstract void sound();
}
class Lion extends Animal
{
Lion()
{
super("Lion","Asiatic Lion");
}
void sound()
{
System.out.println("Roar Roar!");
}
public static void main(String[] args)
{
Lion l=new Lion();
l.eat("flesh");
l.sound();
}
}