import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();

        meuFilme.setNome("Duna");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setDuracaoEmMinutos(120);


       meuFilme.avalia(8);
       meuFilme.avalia(9);
       meuFilme.avalia(10);
       meuFilme.avalia(3);
       meuFilme.avalia(5);

       meuFilme.exibeFichaTecnica();
    }
}