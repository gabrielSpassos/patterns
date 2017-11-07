public class TeacherFactory {

    public Teacher createTeacher(String type){
        switch (type){
            case "M": return new MathTeacher();
            case "S": return new SociologyTeacher();
            default: throw new IllegalArgumentException("invalid type");
        }
    }
}
