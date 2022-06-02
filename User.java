public class User{
    private String password;
    private String login;
    public User(String pass, String log){
       password=pass;
        login=log;
    }
    public boolean Authentified(String pwd){
        if(password.equals(pwd))  return true;
          
        else return false;
        
    

}
}