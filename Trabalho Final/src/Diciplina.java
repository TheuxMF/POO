import java.util.ArrayList;
import java.util.List;

public class Diciplina {
    private int id;
    private String nomeDiciplina;
    private String cargaHoraria;
    private Curso curso;
    private Professor professor;
    private List<Aluno> aluno = new ArrayList<>();

    public Diciplina(int id,String nomeDiciplina, String cargaHoraria, Curso curso) {
        this.id=id;
        this.nomeDiciplina = nomeDiciplina;
        this.cargaHoraria = cargaHoraria;
        this.curso = curso;
    }

    //Metodos de Acesso

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id += id;
    }

    public String getNomeDiciplina() {
        return nomeDiciplina;
    }
    public void setNomeDiciplina(String nomeDiciplina) {
        this.nomeDiciplina = nomeDiciplina;
    }
    
    public String getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
     
    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public void listAlunos(){
        for(Aluno alunoTemp : this.aluno){
            System.out.println(alunoTemp.getId() + ". " +alunoTemp.getNome());
        }
    }

    
}
