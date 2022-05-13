class Test{
public static void main(String args[]){


RaceClient racecars[]={
new RaceClient("Audi"),
new RaceClient("Audi"),
new RaceClient("BMW"),
new RaceClient("BMW"),
new RaceClient("Audi"),
new RaceClient("BMW")
};

racecars[0].movecar(20,120);
racecars[1].movecar(20,150);
racecars[2].movecar(20,155);
racecars[3].movecar(20,170);
racecars[4].movecar(20,190);
racecars[5].movecar(20,110);

System.out.println("audi instances "+ FlyWeightAudi.num);
System.out.println("bmw instances "+ FlyWeightBmw.num);
}


}
