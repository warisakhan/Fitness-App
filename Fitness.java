/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public interface Fitness {
/**
 * Attributes
 */

	
/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	

	public Muscle [] muscleTargeted();

	
/** 
 * @param intensity gives the intensity level (High, Medium, Low) of the excercise
 * @param weight gives the weight of the user
 * @param duration gives the length of time of the excercise 
 * @return double that gives the total amount of calories burned 
 */
	public double calorieLoss(Intensity intensity, double weight, int duration);
	
		



	/** no parameters for this method
	 * @return String which informs why the excercise is useful
	 */

	public String description();
}