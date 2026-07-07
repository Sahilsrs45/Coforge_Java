package com.coforge.Day_07_07_2026;

import java.io.IOException;

public class LoginSessionDemo {

    public static void validate(String uname, String pwd) {

        if (uname.equals("Sahil") && pwd.equals("Sahil1202")) {

            try (LoginSession session = new LoginSession()) {

                session.login();
                session.accessPages();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Invalid Username or Password");
        }
    }

    public static void main(String[] args) {

        String uname = "Sahil";
        String pwd = "Sahil1202";

        validate(uname, pwd);
    }
}