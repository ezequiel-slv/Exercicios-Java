package arquivos.poo.dominio;

public class Pessoa {
    private int idade;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
        if (nome == null || nome.trim().isEmpty()){
            System.out.println("Adicione um nome");
        }else{
            this.nome = nome;
        }
    }

    public void setIdade(int idade){
        this.idade = idade;
        if (idade < 0){
            System.out.println("Idade inválida");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
