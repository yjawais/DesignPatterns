class FanOn implements Command{




Fan fan ;
FanOn(Fan fan){this.fan=fan;}

public void execute(){
fan.switchOn();


}
}
