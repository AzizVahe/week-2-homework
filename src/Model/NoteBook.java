package Model;

public class NoteBook extends Computer{
    private String charger;
    private String webcam;
    public NoteBook(String charger,String webcam, int ram, String processor, int memory){
        super(ram, processor, memory);
        this.charger = charger;
        this.webcam = webcam;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getWebcam() {
        return webcam;
    }

    public void setWebcam(String webcam) {
        this.webcam = webcam;
    }
}
