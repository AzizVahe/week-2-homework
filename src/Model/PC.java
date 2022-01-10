package Model;

public class PC extends Computer{
    private String monitor;
    private String casse;

    public PC(String monitor, String casse, int ram, String processor,int memory){
        super(ram, processor, memory);
        this.monitor = monitor;
        this.casse = casse;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCasse() {
        return casse;
    }

    public void setCasse(String casse) {
        this.casse = casse;
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor='" + monitor + '\'' +
                ", casse='" + casse + '\'' +
                ", ram='" + getRam() + '\'' +
                ", processor='" + getProcessor() + '\'' +
                ", memory='" + getMemory() + '\'' +
                '}';
    }
}
