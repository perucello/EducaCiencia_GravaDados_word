package manipulando_diretorio_java;

public class Main {

    public static void main(String[] args) {

        //Endereço - path
        String pasta = "C:\\EducaCienciaFastCode\\";
        //Nome do arquivo
        String nomeArquivo = "Manipulando_diretorio_java";
        //para Write
        String nome = "EducaCiencia - ";
        String email = "educaciencia_fastcode@outlook.com.br";

        Gravar_dados_doc gravaWord = new Gravar_dados_doc();
        gravaWord.gravar(pasta, nomeArquivo, nome, email);


    }
}
