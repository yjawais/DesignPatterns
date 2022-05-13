import java.util.HashMap;
import java.util.Map;
public class CarFactory{

private static Map<String,RaceCar> flyweights=new HashMap<>();

public static RaceCar getRaceCar(String key){
if(flyweights.containsKey(key)){return flyweights.get(key);}

RaceCar racecar;

switch(key){
case "Audi":
	racecar=new FlyWeightAudi();
	racecar.name="audi";
	racecar.speed=100;
	racecar.horsepower=250;
	break;
case "BMW":
	racecar=new FlyWeightBmw();
	racecar.name="bmw";
	racecar.speed=120;
	racecar.horsepower=300;
	break;
default:
	throw new IllegalArgumentException("wrong car type");
}
flyweights.put(key,racecar);
return racecar;

}

}

