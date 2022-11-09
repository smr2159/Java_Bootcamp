package com.ramsay.accessmodifier;

// This class can access the public emailValidator method, but an error will be generated if the
// emailValidator method has a private access modifier or no modifier.

import com.ramsay.email.EmailValidator;

public class AccessModifierTest {
    public static void main (String[] args) {
        EmailValidator emailChecker = new EmailValidator();
        System.out.println(emailChecker.emailValidator("SRamsay@SUNY.edu"));
    }
}
