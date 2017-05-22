package String.ToStringAndNewString;



import java.io.IOException;

import javax.swing.JPasswordField;



 

public class test {
    public static void main(String args[]) throws IOException {
    	JPasswordField pwdField = new JPasswordField("1234");
    	  System.out.println(pwdField.getPassword().toString());//输出的结果为[C@23d256fa
    	  System.out.println(new String(pwdField.getPassword()));//输出的结果为1234

    }

} 
