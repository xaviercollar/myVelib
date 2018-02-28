package myVelib;

public class BadBicycleCreationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadBicycleCreationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BadBicycleCreationException(String message) {
		super("Le type :"+message+"n'existe pas, veuillez inscrire soit Electrical soit Mecanical");
		// TODO Auto-generated constructor stub
	}


}
