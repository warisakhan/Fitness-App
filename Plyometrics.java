/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */


public class Plyometrics extends Anaerobic {

/**
 * Attributes
 */


	/** no parameters for this method
	 * @return String which informs why the type of excercise 
	 */

	@Override
	public String description(){
		return ("Plyometrics");
	}

/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	


	@Override
	public Muscle [] muscleTargeted(){
		Muscle [] muscleTargeted = {Muscle.Abs, Muscle.Legs, Muscle.Glutes};
		return muscleTargeted;
	}

/** 
 * @param intensity gives the intensity level (High, Medium, Low) of the excercise
 * @param weight gives the weight of the user
 * @param duration gives the length of time of the excercise 
 * @return double that gives the total amount of calories burned 
 */

	public double calorieLoss(Intensity intensity, double weight, int duration) {
		double calorieLoss = 0.0;
		double totalCalories = 0.0;
		if(intensity == Intensity.HIGH) {
			calorieLoss = (7.4 * duration)/60.0;

		}
		else if(intensity == Intensity.MEDIUM){
			calorieLoss = (4.8 * duration)/60.0;

		}

		else if(intensity == Intensity.LOW) {
			calorieLoss = (2.5 * duration)/60.0;
		}

		totalCalories = calorieLoss * weight;
		return totalCalories;

	}

	
}