public abstract class ContatoBase implements Contato {
    String nome;
    String telefone;
    String email;
}

public ContatoBase(String nome,String telefone,String email){
   setNome(nome) nome;
   this.telefone = telefone;
   this.email = email;
}
public String getNome(){return nome;}

public void setNome(String nome){
    if(nome == null){
        system.out.printfln("O nome deve ter pelomenos 1 caractere");
    }
    this.nome = nome;
}

public String getTelefone(){return telefone;}