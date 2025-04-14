/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_1;

/**
 *
 * @author khutso-pollen-masekwameng
 */
import Assignment_1.Login;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ForFun{
    
   
    

    
    public static void main(String[] args){
        
        
                
                
	String first_name =  JOptionPane.showInputDialog(null, "Enter your firstname:","REGISTRATION" , JOptionPane.QUESTION_MESSAGE);
        String last_name =  JOptionPane.showInputDialog(null, "Enter your lastname:" , "REGISTRATION" ,JOptionPane.QUESTION_MESSAGE);
        String username = JOptionPane.showInputDialog(null , "Enter your username:","REGISTRATION", JOptionPane.QUESTION_MESSAGE);
        String password = JOptionPane.showInputDialog(null, "Enter Your Password:" , "REGISTRATION", JOptionPane.QUESTION_MESSAGE);
        String phone =  JOptionPane.showInputDialog(null, "Enter Phone Number (starting with South African international code (+27)): ", "REGISTRATION", JOptionPane.QUESTION_MESSAGE);
        
        
	
		
	Login login = new Login();//Create and instantiate Login object
        
	boolean  validatePhone = login.checkCellPhoneNumber(phone);
	boolean  validateUsername = login.checkUserName(username);
	boolean  validatePassword = login.checkPasswordComplexity(password);
        
        //Checks and validate username
	if(validateUsername == true){
	    JOptionPane.showMessageDialog(null, "Username successfully captured.");
	}else{
           JOptionPane.showMessageDialog( null ,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", "Error" , JOptionPane.ERROR_MESSAGE);
	}
		
        
	if(validatePassword == true){
	    JOptionPane.showMessageDialog(null,"Password  successfully captured.");
	}else{
	    JOptionPane.showMessageDialog(null, "Password  is not correctly formatted; please ensure that the password contains at least eight characters, a capital and small letter, a number, and a special character.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
	
        //Checks and validate phone number
	if(validatePhone == true){
	    JOptionPane.showMessageDialog(null,"Cell phone number successfully added.");
	}else{
	   JOptionPane.showMessageDialog(null , "Cell phone number incorrectly formatted or does not contain international code.", "Error", JOptionPane.ERROR_MESSAGE);
	}
        
        
        if(validateUsername ==true && validatePassword == true && validatePhone == true ){
        
                JOptionPane.showMessageDialog(null, "You have registerd successfully");
                
                String Login_username = JOptionPane.showInputDialog(null , "Enter your Username : " , "LOGIN" , JOptionPane.QUESTION_MESSAGE);
                String Login_password = JOptionPane.showInputDialog(null, "Enter your Password : " , "LOGIN" , JOptionPane.QUESTION_MESSAGE);
                
                if(Login_username.equals(username) && Login_password.equals(password)){
                    
                    JOptionPane.showMessageDialog(null , "Wecome, " +  last_name +  "," + first_name + " it is nice to see you again");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password,  Please enter correct username & password");
                }
        }else {
            JOptionPane.showMessageDialog(null, " Account Registration was unsuccessful" , "Error" , JOptionPane.ERROR_MESSAGE);
            main(null);
        }
    }
    
    }
    
   
	
