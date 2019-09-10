package cs2340.gatech.edu.lab3.model;

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");
    private String value;
    ClassStanding(String letter) {
        value = letter;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
