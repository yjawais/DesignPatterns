import java.util.HashMap;
import java.util.Map;
public class TreeSeed{

private static Map<String,Tree> flyweights=new HashMap<>();

public static Tree getTree(String key){
if(flyweights.containsKey(key)){return flyweights.get(key);}

Tree t;

switch(key){
case "neem":
	t=new FlyWeightNeem();
	t.name="Neem";
	t.color="Green";
	t.height=250;
	break;
case "mango":
	t=new FlyWeightMango();
	t.name="mango";
	t.color="dark green";
	t.height=300;
	break;
default:
	throw new IllegalArgumentException("wrong tree type");
}
flyweights.put(key,t);
return t;

}

}

