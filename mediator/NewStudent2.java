  
public class NewStudent2 extends Student {  
      
    private String name;  
    private Group chat;  
      
     
    public void sendMsg(String msg) {  
    chat.showMsg(msg,this);  
          
    }  
  
     
    public void setname(String name) {  
        this.name=name;  
    }  
  
  
    public String getName() {  
        return name;  
    }  
      
    public NewStudent2(Group chat){  
        this.chat=chat;  
    }     
      
}
