package ro.jademy.carrental.car;

public class Engine {
    public int horsePawer;
    public int capacity;

    public Engine(int horsePawer,int capacity) {
        this.horsePawer=horsePawer;
        this.capacity = capacity;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePawer=" + horsePawer +
                ", capacity=" + capacity +
                '}';
    }
}
