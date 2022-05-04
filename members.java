package Java_Lab_6;

import java.util.Scanner;

public class members {
    String MID;
    String mfname;
    String mlname;
    String memail;
    String mcontact;
    String pswd = new String();
    String mgender;
    int age;
    String city;
    String WID;

    members(String PID, String pfname, String plname, String pemail, String pcontact, String pgender, int age,
            String city, String WID) {
        this.MID = PID;
        this.mfname = pfname;
        this.mlname = plname;
        this.memail = pemail;
        this.mcontact = pcontact;
        this.mgender = pgender;
        this.age = age;
        this.city = city;
        this.WID = WID;
    }

    public int fetchMember() {
        System.out.println("\nPID: " + this.MID + "\nName: " + this.mfname + " " + this.mlname + "\n");
        return 0;
    }

    public int setDefaultPassword(String strength) {
        if (strength == "medium") {
            StringBuffer defaultPswd = new StringBuffer(this.mcontact);
            defaultPswd.append((int) (Math.random() * 99));
            this.pswd = defaultPswd.toString();
            System.out.println("Password set to: " + this.pswd + "\n");
            return 0;
        } else {
            StringBuilder defaultPswd = new StringBuilder(this.mcontact);
            int i;
            for (i = 0; i < 10; i += 1) {
                defaultPswd.append((int) (Math.random() * 9));
            }
            this.pswd = defaultPswd.toString();
            System.out.println("Password set to: " + this.pswd + "\n");
            return 0;
        }
    }

    public int setPassword(String pswd, String conPswd) {
        this.pswd = pswd;
        if (confirmPassword(conPswd)) {
            System.out.println("Password set to: " + this.pswd + "\n");
            return 0;
        }
        System.out.println("Password doesn't match");
        return 1;
    }

    public boolean confirmPassword(String pswd) {
        if (this.pswd.equals(pswd)) {
            return true;
        }
        return false;
    }

}
