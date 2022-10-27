import lombok.Getter;
import lombok.Setter;

// javabean
// pojo: plain old java object
@Getter
@Setter
public class Pessoa {
    private int codigo;
    private String nome;
    private int idade;
    private String hobby;

public static void main(String[] args){
    Pessoa p = new Pessoa();
    p.setNome("Alfa");
    System.out.println(p.getNome());
}

}