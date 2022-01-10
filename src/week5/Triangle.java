package week5;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    private boolean isTriangleValid(int sideA, int sideB, int sideC) {
        if (sideA + sideB == sideC) {
            return true;
        }
        return false;
    }

    private int maxSide(int sideA, int sideB, int sideC) {
        int max = sideA;
        if (max < sideB) {
            max = sideB;
        }
        if (max < sideC) {
            max = sideC;
        }
        return max;
    }
    public boolean check(){
        if(maxSide(sideA,sideB,sideC) == sideA){
            if(Math.pow(sideA,2)==Math.pow(sideB,2)+Math.pow(sideC,2)){
                return true;
            }
        }
        if(maxSide(sideA,sideB,sideC) == sideB){
            if(Math.pow(sideB,2)==Math.pow(sideA,2)+Math.pow(sideC,2)){
                return true;
            }
        }
        if(maxSide(sideA,sideB,sideC) == sideC){
            if(Math.pow(sideC,2)==Math.pow(sideB,2)+Math.pow(sideA,2)){
                return true;
            }
        }
        return false;
    }


    public Triangle(int sideA, int sideB, int sideC) {
        if (isValidSide(sideA)) {
            this.sideA = sideA;
        }
        if (isValidSide(sideB)) {
            this.sideB = sideB;
        }
        if (isValidSide(sideC)) {
            this.sideC = sideC;
        }
    }

    private boolean isValidSide(int side) {
        if (side >= 1 && side <= 20) {
            return true;
        }
        return false;
    }

    public void setSideA(int sideA) {
        if (isValidSide(sideA)) {
            this.sideA = sideA;
        }
    }

    public int getSideA() {
        return sideA;
    }


    public void setSideB(int sideB) {
        if (isValidSide(sideB)) {
            this.sideB = sideB;
        }
    }

    public int getSideB() {
        return sideB;
    }


    public void setSideC(int sideC) {
        if (isValidSide(sideC)) {
            this.sideC = sideC;
        }
    }

    public int getSideC() {
        return sideC;
    }


}
