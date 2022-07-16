class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language (String language, int speakers, String regions, String order) {
        this.name = language;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = order;
    }

    public Language(String Mayan, int speakers, String guatemala) {
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " +  this.numSpeakers + " people, mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder);
    }
    public static void main(String[]args){

        Mayan mam = new Mayan("mam", 600000);
        mam.getInfo();

        Language french = new Language("French", 321000000, "Europe, Africa, Canada, Asia, Middle East", "subject-verb-object");
        french.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();

    }

}

