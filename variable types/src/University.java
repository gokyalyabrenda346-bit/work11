public class University {
    String name;
    Double student;
    int attendance;
    static String Lecturer;
    static  String room;
    public University(String n,Double s,int a,String L,String r){
        name=n;
        student=s;
        attendance=a;
       University. Lecturer=L;
       University. room=r;

    }
    public void money(){
        System.out.println("CourseName="+name);
        System.out.println("StudentName="+student);
        System.out.println("Attendance="+attendance);
        System.out.println("LecturerName="+Lecturer);
        System.out.println("RoomNumber="+room);
    }
}
