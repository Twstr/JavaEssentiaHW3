package ClassRoom;

public class Main {
    public static void main(String[] args) {
        GoodPupil goodPupil = new GoodPupil();
        BadPupil badPupil = new BadPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();

        ClassRoom classRoom = new ClassRoom(goodPupil, badPupil, excelentPupil);
        classRoom.pupil1.read();
        classRoom.pupil2.read();
        classRoom.pupil3.read();
    }
}
