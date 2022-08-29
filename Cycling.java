/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */


public class Cycling extends Aerobic {
	/**
 * Attributes
 */


	protected double calorieLoss;
	protected double totalCalories;

	/** no parameters for this method
	 * @return String which informs the type of excercise 
	 */


	@Override
	public String description() {
		return("Cycling");
	}


/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	

	@Override
	// is this how to do it?how to return array 
	public Muscle [] muscleTargeted() {
		Muscle [] muscleTargeted = {Muscle.Glutes, Muscle.Cardio, Muscle.Legs};

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
		if(intensity == Intensity.HIGH) {
			calorieLoss = (14.0 * duration)/60;
			

		}
		else if (intensity == Intensity.MEDIUM) {
			calorieLoss = (8.5 * duration)/60;
		}
		
		else if(intensity == Intensity.LOW) {
			calorieLoss = (4.0 * duration)/60;
		}


		totalCalories = calorieLoss * weight;
		return totalCalories;
		
	}

}