package ClassRoom;

public class BadPupil extends Pupil {
    String name;

    @Override
    void study() {
        System.out.println("Bad");
    }

    @Override
    void read() {
        System.out.println("Bad");
    }

    @Override
    void write() {
        System.out.println("Bad");
    }

    @Override
    void relax() {
        System.out.println("Bad");
    }
}
