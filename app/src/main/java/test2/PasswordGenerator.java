package test2;

import com.cemiltokatli.passwordgenerate.Password;

public class PasswordGenerator {
    
    public static void main(String[] args){
        Password pass = Password.createPassword();
        System.out.println(pass.generate());
}
}
