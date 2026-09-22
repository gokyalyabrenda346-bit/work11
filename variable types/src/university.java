import java.sql.SQLOutput;

public class university {
    String name;
    Double student;
    int attendance;
    static String Lecturer;
    static  String room;
    public university(String n,Double s,int a,String L,String r){
        name=n;
        student=s;
        attendance=a;
       university. Lecturer=L;
       university. room=r;

    }
    public void money(){
        System.out.println("CourseName="+name);
        System.out.println("StudentName="+student);
        System.out.println("Attendance="+attendance);
        System.out.println("LecturerName="+Lecturer);
        System.out.println("RoomNumber="+room);
    }
}
