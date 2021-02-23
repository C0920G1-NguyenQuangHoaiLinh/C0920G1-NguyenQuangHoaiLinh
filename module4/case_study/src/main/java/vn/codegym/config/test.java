package vn.codegym.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {
        public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String pass = bCryptPasswordEncoder.encode("123");
        System.out.println(pass);
    }
}
