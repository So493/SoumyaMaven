package com.task2;
class Sweet1 implements Compa{
int weight=1;
String name="";
String color="yellow";
float calories=100;
public int compareTo(Object o) {
return 0;
}
}
class chocolate extends Sweet1{}
class FiveStar extends chocolate
{
FiveStar ()
{
this.name="FiveStar";
}
}
class KitKat extends chocolate{
KitKat()
{
this.name="KitKat Delicious";
}
}
public class Allchocks {
public static void main(String[] args) {
Sweet1[]  allsweets = new Sweet1[3];
allsweets [0]= new FiveStar();
allsweets [1]= new FiveStar();
allsweets [2]= new KitKat();
float tw =0;
for (int i = 0; i < allsweets.length; i++) {
Sweet1 s = allsweets[i];
tw += s.weight;
}
System.out.println(" total weight  = "+tw);
System.out.println(" Printing the chocloates ");
for (int i = 0; i < allsweets.length; i++) {
Sweet s = allsweets[i];
System.out.println(s.name);
}
System.out.println("all chocolates sorted");
}}

