package entornos;
/**@author Sergio Aroca
  * Clase para manejar las entradas de un blog.
  * El codigo está mal, hay que modificar la id al ser negativa da error.
  */

public class EntradaBlog_SAM {
   /**@author Sergio Aroca
	*separador es el carácter que separa ENTRADA DE del
	*nombre del autor
	*/
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**@author Sergio Aroca
	 * Crea una entrada para un blog con los valores proporcionados.
	 * 
	 * @param id El id de la entrada.
	 * @param autor El autor de la entrada.
	 * @param texto El texto de la entrada.
	 * @throws IllegalArgumentException Si el id es negativo habrá error.
	 */
	public EntradaBlog_SAM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**@author Sergio Aroca
	 * Devuelve el id de la entrada.
	 * 
	 * @return El id de la entrada.
	 */
	public int getId(){
		return this.id;
	}
	
	/**@author Sergio Aroca
	 * Devuelve el texto de la entrada.
	 * 
	 * @return El texto de la entrada.
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**@author Sergio Aroca
	 * Devuelve el texto de la entrada en mayusculas.
	 * 
	 * @return El nombre del autor de la entrada en mayusculas.
	 */
	
	public String getAutor(){
		return this.autor.toUpperCase();
	}

	/**@author Sergio Aroca
	 * Devuelve el nombre del autor de la entrada, obsoleto , mejor usar getAutor.
	 * 
	 * @return El autor de la entrada(en este caso no convierte a mayusculas el nombre).
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	

	public static void main(String[] args) {
                /**@author Sergio Aroca
                 * * Este método crea la entrada de un blog.
                 * @param id la identificacion de la entrada.
                 * @param texto el texto de la entrada.
                 * @param autor el autor de la entrada.
                 *  Modificar, el -3 hará que el programa genere estas lineas: 
                 * Exception in thread "main" java.lang.IllegalArgumentException: El id no puede ser negativo
                 * at EntradaBlogJRL.<init>(EntradaBlogJRL.java:19)
                 *  at EntradaBlogJRL.main(EntradaBlogJRL.java:54)
                 */
		EntradaBlog_SAM e1=new EntradaBlog_SAM (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}