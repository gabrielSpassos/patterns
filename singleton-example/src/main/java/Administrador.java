public class Administrador {

    private String nome;
    private String cpf;
    private String senha;
    private static Administrador instancia;

    public Administrador() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nome= "tarzan";
        cpf="12345678901";
        senha="jane";
    }

    public static synchronized Administrador getAdmin(){
        if (instancia == null){
            instancia = new Administrador();
        }
        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


}
