import java.util.*;

class MonsterRegistry{
static Hashtable<String,Monster> monsterList=new Hashtable<String,Monster>();

static Monster getMonster(String id){
Monster m=monsterList.get(id);
return((Monster)m.clone());

}
static void loadData(){
BirdMonster bm=new BirdMonster("bird monster");
bm.setId("1");
monsterList.put(bm.getId(),bm);

FishMonster fm=new FishMonster("fish monster");
fm.setId("2");
monsterList.put(fm.getId(),fm);

}






}


