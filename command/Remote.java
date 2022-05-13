class Remote{

Command command;
void setCommand(Command command){this.command=command;}

void pressButton(){command.execute();}

}
