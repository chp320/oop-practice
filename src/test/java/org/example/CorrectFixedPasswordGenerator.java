package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    public String generatePassword() {
        return "abcdefgh";  // 8글자
    }
}
