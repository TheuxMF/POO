
import java.util.ArrayList;
import java.util.List;
public class Aluno extends Pessoa {
    private String matricula;
    private String dataNascimento;
    private List<Diciplina> diciplinas = new ArrayList<>();
    private Curso curso;
    private List<Avaliacao> avaliacaos = new ArrayList<>();

    //Construtor
    public Aluno(int id,String nome, String cpf, String celular, String matricula, String dataNascimento, Curso curso) {
        super(id,nome, cpf, celular);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
    }

    //Metodos de acesso
    @Override
    public void setId(int id) {
        super.setId(id);
        id +=id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
 
    public List<Diciplina> getDiciplina() {
        return diciplinas;
    }

    public void setDiciplina(Diciplina diciplina) {
        this.diciplinas.add(diciplina);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(Avaliacao avaliacaos) {
        this.avaliacaos.add(avaliacaos);
    }

    //Metodo para listar as disciplinas cadastradas no aluno   
    public void listarDiciplinas(){
        for(Diciplina diciplinaTemp : this.diciplinas){
            System.out.println(diciplinaTemp.getId() +diciplinaTemp.getNomeDiciplina());
        }

    }
    //metodo para imprimir a situação do aluno
    public void imprimirSituacao(){
        for(Avaliacao avaliacao : avaliacaos){
            System.out.println("---------------------------------------------------------/n");
            System.out.println("nome : "+ avaliacao.getAluno().getNome());
            System.out.println("data : "+ avaliacao.getData());
            System.out.println("nota 1 : "+ avaliacao.getNotas().get(0));
            System.out.println("nota 2 : "+ avaliacao.getNotas().get(1));
            System.out.println("nota 3 : "+ avaliacao.getNotas().get(2));
            System.out.println("Media : "+ avaliacao.getMedia());
            if (avaliacao.getMedia()>=7) {
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado"); 
            }
            System.out.println("---------------------------------------------------------/n");    
        }
    }


}
