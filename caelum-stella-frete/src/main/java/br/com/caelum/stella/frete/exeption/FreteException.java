package br.com.caelum.stella.frete.exeption;


public class FreteException extends Exception{
	private static final long serialVersionUID = 4624995677824779368L;
	private int codigo;
	
	public FreteException(int codigo,String mensagem){
		super(mensagem);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getMensagem(){
		return super.getMessage();
	}
}
