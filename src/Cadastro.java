public class Cadastro {
    private String nome;
    private String telefone;
    private String email;
    private int num;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public void setNumeros(int pos, int num){
        this.num[pos]= num;
    }

    public String toString(){
        String c = " [ ";
        c+= " Nome: " + nome;
        c+= " ,Telefone: " + telefone;
        c+= " ,Email: "+ nome + "@email.com";
        c+= " ]";
        return c;
    }


}
