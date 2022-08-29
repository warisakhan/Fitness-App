/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class Swimming extends Aerobic {
/**
 * Attributes
 */


	protected SwimmingType type;
	//protected Muscle [] muscleT = {};


	





/** constructor
 */
	public Swimming(SwimmingType type) {
		
		 this.type = type;

		// create the enum inside here?
		



	}

	/** sets the base swim style as freestyle
	 */

	public Swimming() {
		type = SwimmingType.Freestyle;

	}

	/** @return void because this is just a setter method for the type of swimming
	 */

	public void setSwimmingType(SwimmingType type){
		this.type = type;


	}

	/** @return Swimmingtype returns the value for the type
	 */

	public SwimmingType getSwimmingType() {
		return type;

	}

	/** no parameters for this method
	 * @return String which informs the type of excercise 
	 */

	@Override
	public String description(){
		// do u do it like this or like a string 

		return ("Swimming");
		
	}

/** no parameters for this method
 * @return Muscle which gives the Muscles affected by the specific excercise 
 */	


	public Muscle [] muscleTargeted(){
		//Muscle [] rmuscleT = {};

		if (this.type == SwimmingType.Butterflystroke){
			Muscle[] muscleT = {Muscle.Abs, Muscle.Back, Muscle.Shoulders, Muscle.Biceps, Muscle.Triceps};
			return muscleT;
			//rmuscleT = muscleT;

		}

		else if(this.type == SwimmingType.Breaststroke){
			Muscle [] muscleT = {Muscle.Glutes, Muscle.Cardio};
			return muscleT;
			//rmuscleT = muscleT;
		}

		else if(this.type == SwimmingType.Freestyle) {
			Muscle[] muscleT = {Muscle.Arms, Muscle.Legs, Muscle.Cardio};
			return muscleT;
			//rmuscleT = muscleT;
		}

		return null;
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
		if (intensity == Intensity.HIGH) {
			calorieLoss = (10.0 * duration)/60.0;
		}

		else if (intensity == Intensity.MEDIUM){
			calorieLoss =(8.3 * duration)/60.0;
		}

		else if (intensity == Intensity.LOW) {
			calorieLoss = (6.0 * duration)/60.0;
		}

		totalCalories = calorieLoss * weight;
		return totalCalories;

	}
}