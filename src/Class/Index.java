/**
 * 
 */
package Class;

/**
 * @author leonardoca
 *
 */
public class Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cidade cid = new Cidade();
		cid.setPrefeito("Avancio");
		cid.setGovernador("Cancelieri");
		cid.setPresidente("Leonardo");
		
		System.out.println(cid.getPresidente() + 
				" - " + cid.getGovernador() + 
				" - " + cid.getPrefeito());
	}

}
