package busRese;

public class bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }
    //get and set method

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean val) {
        ac = val;
    }
    public void displayInfo(){
        System.out.println("bus no:" + busNo + " Ac:" + ac + " Capacity:" + capacity);
    }
}
