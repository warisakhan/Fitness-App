/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class PullUp extends Endurance {
	/**
 * Attributes
 */
	protected double calorieLoss;
	protected double totalCalories;


	/** no parameters for this method
	 * @return String which informs why the excercise type
	 */
	@Override
	public String description(){
		return("PullUp");
		
	}

	/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	

	@Override
	public Muscle[] muscleTargeted(){
		Muscle [] muscleT = {Muscle.Biceps, Muscle.Arms};
		return muscleT;
	}

	/** 
 * @param intensity gives the intensity level (High, Medium, Low) of the excercise
 * @param weight gives the weight of the user
 * @param duration gives the length of time of the excercise 
 * @return double that gives the total amount of calories burned 
 */

	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if (intensity == Intensity.HIGH) {
			calorieLoss = (7.5 * duration)/60;
		}
		else if (intensity == Intensity.MEDIUM){
			calorieLoss = (6.0 * duration)/60;
		}

		else if (intensity == Intensity.LOW) {
			calorieLoss = (4.8 * duration)/60;
		}

		totalCalories = calorieLoss * weight;
		return totalCalories;

	}
}