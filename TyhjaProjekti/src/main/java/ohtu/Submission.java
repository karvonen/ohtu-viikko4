package ohtu;

public class Submission {
    private String student_number;
    private String week;
    private String hours;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;
    private String a7;
    private String a8;
    private String a9;
    private String a10;
    private String a11;
    private String a12;
    private String a13;

    private int count;
    
    public String getWeek() {
        return week;
    }

    public String getHours() {
        return hours;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public String getA4() {
        return a4;
    }

    public String getA5() {
        return a5;
    }

    public String getA6() {
        return a6;
    }

    public String getA7() {
        return a7;
    }

    public String getA8() {
        return a8;
    }

    public String getA9() {
        return a9;
    }

    public String getA10() {
        return a10;
    }

    public String getA11() {
        return a11;
    }

    public String getA12() {
        return a12;
    }

    public String getA13() {
        return a13;
    }

    
    public void setWeek(String week) {
        this.week = week;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }


    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getCount() {
        return this.count;
    }
    
    @Override
    public String toString() {
        return createString();
    }
    
    private String createString() {
        String doneAssignemnts = done();
        String str = " viikko " + week + ": tehtyjä tehtäviä yhteensä: " + count + ", aikaa kului " + hours + " tuntia, tehdyt tehävät:" + doneAssignemnts;
        
        return str;
    }

    private String done() {
        count = 0;
        String str = "";
        if (a1 != null) str += " 1";
        if (a2 != null) str += " 2";
        if (a3 != null) str += " 3";
        if (a4 != null) str += " 4";
        if (a5 != null) str += " 5";
        if (a6 != null) str += " 6";
        if (a7 != null) str += " 7";
        if (a8 != null) str += " 8";
        if (a9 != null) str += " 9";
        if (a10 != null) str += " 10";
        if (a11 != null) str += " 11";
        if (a12 != null) str += " 12";
        if (a13 != null) str += " 13";
        count = str.length() / 2;
        return str;
    }
}