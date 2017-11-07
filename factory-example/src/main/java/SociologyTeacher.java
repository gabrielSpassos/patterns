public class SociologyTeacher implements Teacher{

    @Override
    public String teach() {
        return "Sociology";
    }

    @Override
    public Boolean reproveStudent() {
        return false;
    }
}
