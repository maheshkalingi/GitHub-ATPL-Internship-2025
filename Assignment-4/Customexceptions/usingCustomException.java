package Customexceptions;

import java.util.Scanner;

public class usingCustomException {

    public static void login(String username, String password) throws LoginFailedException{
        if(username.equals("XYZ") && password.equals("123")){
            System.out.println("Hii Welcome To This World!");
        }else{
            
            throw new LoginFailedException("Incorrect Credentials.Please Provide Correct Credentials!");
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your UserName:");
        String username=sc.next();
        System.out.println("enter your Password:");
        String password=sc.next();
        if(username!=" " && password!=" "){
            try{
                login(username, password);
            }
            catch(LoginFailedException e){
                System.out.println(e);
            }
        }
        
   sc.close();
    }
}
