public class MathTeacher implements Teacher{

    @Override
    public String teach() {
        return "math";
    }

    @Override
    public Boolean reproveStudent() {
        return true;
    }
}
