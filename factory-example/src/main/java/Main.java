public class Main {

    public static void main(String[] args) {
        TeacherFactory teacherFactory = new TeacherFactory();
        try {
            Teacher mathTeacher = teacherFactory.createTeacher("M");
            Teacher sociologyTeacher = teacherFactory.createTeacher("S");
            System.out.println("What do you teach: "+mathTeacher.teach()+"  Do you reprove: "+mathTeacher.reproveStudent());
            System.out.println("What do you teach: "+sociologyTeacher.teach()+"  Do you reprove: "+sociologyTeacher.reproveStudent());
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

    }
}
