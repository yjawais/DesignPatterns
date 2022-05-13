class Demo{

public static void main(String[] args)
{

MonsterRegistry.loadData();
Monster m=null;
//String ar[];
String landscape=args[0];

if(landscape.equals("Air")){
m=MonsterRegistry.getMonster("1");
System.out.println("air monster created");

}
if(landscape.equals("Water")){
m=MonsterRegistry.getMonster("2");

System.out.println("water monster created");
}

System.out.println("new monster created");
}




}
