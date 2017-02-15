package main.java.com.Alexandr.practice.modul03.task003;

/**
 * Created by Natus Vincere on 15.02.2017.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSecretKey() {

        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    public SpecialStudent(long secretKey, String email) {

        this.secretKey = secretKey;
        this.email = email;
    }
}
