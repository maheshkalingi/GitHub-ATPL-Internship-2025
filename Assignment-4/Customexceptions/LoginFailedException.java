package Customexceptions;
class LoginFailedException extends  Exception{
    public LoginFailedException(String msg){
      super(msg);
    }
}