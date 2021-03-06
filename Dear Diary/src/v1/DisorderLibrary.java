package v1;
import java.util.ArrayList;

/**
 * Disorder Library defines all the disorders of the library
 * @author HarmanRansi
 * @version 3/7/2020
 */
public class DisorderLibrary {

	protected static ArrayList<Disorder> disorders;
	
	/**
	 * Constructor instantiates the ArrayList
	 */
	public DisorderLibrary() {
		disorders = new ArrayList<>();
	}

	/**
	 * Method adds Disorder to disorder library
	 * @param disorder The disorder being added
	 */
	public void addDisorder(Disorder disorder) {
		disorders.add(disorder);
	}
	
	/**
	 * Gets disorder
	 * @param disorder Selected disorder
	 * @return The disorder and its details
	 */
	public Disorder getDisorder(Disorder disorder) {
		for (Disorder x: disorders) {
			if (x.toString().equals(disorder.toString())) {
				return x;
			} else {
				return null;
			}
		}
		return null;
	}
	
	/**
	 * Method returns all the disorders (in a list)
	 * @return List of disorders
	 */
	public ArrayList<Disorder> getDisorders(){
		return disorders;
	}
}
