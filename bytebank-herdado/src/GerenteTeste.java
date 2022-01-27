public class GerenteTeste {

    public static void main(String[] args) {



        Gerente nicolli = new Gerente();

        nicolli.setNome("Nicolli Avellar");
        nicolli.setCpf("111.111.111-11");
        nicolli.setSalario(5000);

        System.out.println(nicolli.getNome());
        System.out.println(nicolli.getBonificacao());


    }
}
