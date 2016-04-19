import javax.faces.bean.ManagedBean;
@ManagedBean
public class UsuarioBean {
private Sring nome;
private String senha;
private String email;
public UsuarioBean(){
	
	
}
public getNome(){
	
	return this.nome;
}
public getSenha(){
	
	return this.senha;
}
public getEmail(){
	
	return this.email;
}
public setNome(String nome){
	
	this.nome = nome;
}
public setSenha(String senha){
	
	this.senha = senha;
}
public setEmail(String email){
	
	this.email = email;
}
public void gravar(){
	System.out.println(this.nome);
	
}
}
