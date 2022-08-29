/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */


public class Yoga extends Flexibility {

/**
 * Attributes
 */
	protected double calorieLoss;
	protected double totalCalories;

	/** no parameters for this method
	 * @return String which informs why the type of excercise 
	 */
	
	@Override
	public String description(){
		return ("Yoga");
		// do u return thr string for flexibility here?
	}

/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	

	@Override
	public Muscle[] muscleTargeted(){
		Muscle [] muscleTargeted = {Muscle.Triceps, Muscle.Biceps};
		return muscleTargeted;
	}

/** 
 * @param intensity gives the intensity level (High, Medium, Low) of the excercise
 * @param weight gives the weight of the user
 * @param duration gives the length of time of the excercise 
 * @return double that gives the total amount of calories burned 
 */

	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if (intensity == Intensity.HIGH){
			calorieLoss = (4.0 * duration) /60;
		}

		else if (intensity == Intensity.MEDIUM) {
			calorieLoss = (3.0 * duration) / 60;

		}

		else if (intensity == Intensity.LOW) {
			calorieLoss = (2.0 * duration)/60;
		}

		totalCalories = calorieLoss * weight;
		return totalCalories;
		
	}
}