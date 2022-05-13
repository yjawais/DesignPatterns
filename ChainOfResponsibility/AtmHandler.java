abstract class AtmHandler {

AtmHandler nexth;

int level;
AtmHandler(AtmHandler nexth){
this.nexth=nexth;
}


void handlerequest(Request r){
if(r.amount%100==0){calculate(r.amount,level);}
else{
if(nexth!=null){ nexth.handlerequest(r);}
}
else{ System.out.println("amount not mulitiple of 100");}
}
} 
