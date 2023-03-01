package bookExamples.chapter12;

public enum Language {

    HY("Armenia"),
    RU("Russia"),
    ENG("US"),
    FR;

    private String country;

    Language(String country){
        this.country = country;
    }
    Language(){}

    public String getCountry() {
        return country;
    }
}
