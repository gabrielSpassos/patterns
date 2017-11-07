import java.sql.Time;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        Time horaAtual = Time.valueOf(now);
        System.out.println("** Sem usar o Singleton**");
        System.out.println("Hora antes de instanciar os 3 adm: "+horaAtual);
        Administrador admin = new Administrador();
        Administrador admin2 = new Administrador();
        Administrador admin3 = new Administrador();

        System.out.println(admin.getNome() + "   "+ admin.getCpf());
        now = LocalTime.now();
        Time horaFinal = Time.valueOf(now);
        System.out.println("Hora após instanciar os 3 adm: "+horaFinal);

        System.out.println("** Usando o Singleton**");
        Administrador adminSingleton = Administrador.getAdmin();
        Administrador admin2Singleton = Administrador.getAdmin();
        Administrador admin3Singleton = Administrador.getAdmin();

        now = LocalTime.now();
        Time horaFinalSingleton = Time.valueOf(now);
        System.out.println("Hora após instanciar os 3 adm: "+horaFinalSingleton);
        System.out.println(admin3Singleton.getNome() + "   "+ admin3Singleton.getCpf());
        System.out.println(admin2Singleton);

        System.out.println("Comparando endereço de memoria de duas instancias");
        Administrador a = new Administrador();
        System.out.println(a);

        Administrador b = new Administrador();
        System.out.println(b);

        System.out.println("Comparando endereço de memoria de duas instancias com singlenton");
        Administrador c = Administrador.getAdmin();
        System.out.println(c);

        Administrador d = Administrador.getAdmin();
        System.out.println(d);


    }

}
