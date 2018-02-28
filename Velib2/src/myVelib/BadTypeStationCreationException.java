package myVelib;

public class BadTypeStationCreationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadTypeStationCreationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BadTypeStationCreationException(String message) {
		super("Le type :"+message+"n'existe pas, veuillez inscrire soit standard soit plus");
		// TODO Auto-generated constructor stub
	}

}
