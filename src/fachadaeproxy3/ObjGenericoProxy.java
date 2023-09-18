package fachadaeproxy3;

public class ObjGenericoProxy implements ObjetoGenerico{

	private ObjetoGenerico obj;
	
	@Override
	public void processo() {
		if(obj == null) {
			obj = new ObjGenericoImplementacao();
		}
		obj.processo();
	}
	
}
