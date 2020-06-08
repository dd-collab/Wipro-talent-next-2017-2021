class Fruit
{
    String name,taste,size;
    Fruit(String a,String b,String c)
    {
        name = a;
        taste =b;
        size =c;
    }
    void eat()
    {
        System.out.print(name+" "+taste);
    }

}
class Apple extends Fruit
{
    Apple(String a,String b,String c)
    {
    super(a,b,c);
    
}
@Override
void eat()
{
      System.out.print(name+" "+taste);
}
}
class Orange extends Fruit
{
    Orange(String a,String b,String c)
    {
    super(a,b,c);
    }
 @Override
void eat()
{
      System.out.print(name+" "+taste);
}  
    
}
class Fruitcheck
{
    public static void main(String args[])
    {
        Apple a =  new Apple("Apple","Sweet","Heart");
        Orange o =  new Orange("Orange","Sweet","Round");
        a.eat();
        o.eat();
    }
}
    
    
