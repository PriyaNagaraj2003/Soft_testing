package st.project;

import java.util.regex.*;

public class Junittesting {

    public String name(String s) {
        boolean a = Pattern.matches("[a-zA-Z]+", s);
        if (a == true) {
            return "success";
        } else {
            return "name is required";
        }
    }

    public String dob(String d, String m, String y) {
        if (d == "" && m == "" && y == "") {
            return "select date, month, year";
        } else if (d == "" && m == "") {
            return "select date, month";
        } else if (d == "" && y == "") {
            return "select date, year";
        } else if (m == "" && y == "") {
            return "select month, year";
        } else if (d == "") {
            return "select date";
        } else if (m == "") {
            return "select month";
        } else if (y == "") {
            return "select year";
        } else {
            return "success";
        }
    }

    public String gender(String g) {
        String gen[] = {"Male", "Female", "Other"};
        for (int i = 0; i < gen.length; i++) {
            if (g.equals(gen[i])) {
                return "success";
            }
        }
        if (g == "") {
            return "select gender";
        } else {
            return "";
        }
    }

    public String mobile(String m) {
        boolean a = Pattern.matches("[6-9]{1}[0-9]{9}", m);
        if (m == "") {
            return "mobile number is required";
        } else if (a == true) {
            return "success";
        } else {
            return "invalid mobile number";
        }
    }

    public String pin(String p) {
        boolean a = Pattern.matches("[0-9]{6}", p);
        if (p == "") {
            return "security pin is required";
        } else if (a == true) {
            return "success";
        } else {
            return "invalid pin must 6 be digit only";
        }
    }

    public String email(String e) {
        boolean b = Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z.-]+$", e);
        if (e == "") {
            return "email is required";
        } else if (b == true) {
            return "success";
        } else {
            return "invalid email address";
        }
    }

    public String aadhar(String a) {
        boolean b = Pattern.matches("[0-9]{12}", a);
        if (a == "") {
            return "aadhar number is required";
        } else if (b == true) {
            return "success";
        } else {
            return "invalid aadhar must be 12 digit only";
        }
    }

}
