package Model;

public class Computer {
    private int ram;
    private String processor;
    private int memory;

    public Computer(int ram,String processor, int memory){
        this.ram = ram;
        this.processor = processor;
        this.memory = memory;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getProcessor(){
        return processor;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }
}
