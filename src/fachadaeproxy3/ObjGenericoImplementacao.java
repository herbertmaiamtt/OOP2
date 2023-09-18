package fachadaeproxy3;

public class ObjGenericoImplementacao implements ObjetoGenerico{
	
	public ObjGenericoImplementacao() {
		configurandoObjeto();
	}

	public void configurandoObjeto() {
		System.out.println("Iniciando configuracao");
	}
	
	@Override
	public void processo() {
		System.out.println("Processamento completo");
	}
	
}
