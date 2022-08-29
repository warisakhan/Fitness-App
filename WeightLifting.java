/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */


public class WeightLifting extends Anaerobic {

	/**
 * Attributes
 */

	protected double calorieLoss = 0;
	protected double totalCalories = 0;

/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	

	@Override
	public Muscle [] muscleTargeted(){
		Muscle [] muscleTargeted = {Muscle.Shoulders,Muscle.Legs,Muscle.Arms,Muscle.Triceps};
		return muscleTargeted;
	}
	
	/** no parameters for this method
	 * @return String which informs the type of excercise 
	 */


	@Override
	public String description(){
		return ("WeightLifting");
	}


/** 
 * @param intensity gives the intensity level (High, Medium, Low) of the excercise
 * @param weight gives the weight of the user
 * @param duration gives the length of time of the excercise 
 * @return double that gives the total amount of calories burned 
 */
	@Override
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if (intensity == Intensity.HIGH) {
			calorieLoss = (6.0 * duration) / 60;
		}

		else if (intensity == Intensity.MEDIUM) {
			calorieLoss = (5.0 * duration) / 60;
		}

		else if (intensity == Intensity.LOW) {
			calorieLoss = (3.5 * duration)/ 60;
		}

		totalCalories = calorieLoss * weight;
		return totalCalories;
	}


}