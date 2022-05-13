class Test{

public static void main(String args[])  
    {  
          
          Group chat = new GroupChat();  
      
          NewStudent1 u1=new NewStudent1(chat);  
          u1.setname("student1");  
          u1.sendMsg(" how are you?");  
        
                
          NewStudent2 u2=new NewStudent2(chat);  
          u2.setname("Student2");  
          u2.sendMsg("I am Fine ! You tell?");  
    }  
}
