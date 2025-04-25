public class Cliente{
    protected int id; 
    protected String nome;
    protected int anoNascimento;
    protected String telefone;

    public Cliente(int id, String nome, int anoNascimento, String telefone){
        this.id = id;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.telefone = telefone;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
}