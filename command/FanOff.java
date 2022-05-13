class FanOff implements Command{




Fan fan ;
FanOff(Fan fan){this.fan=fan;}

public void execute(){
fan.switchOff();


}
}
