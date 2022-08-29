/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class DailyExercise {


/**
 * Attributes
 */

	protected int duration;
	protected double calorieTarget;
	protected Profile profile;
	protected Fitness[] exerciseList;


/** @param excerciseList gives the excercises 
 * @param duration gives the excercise time 
 * @param calorieTaregt gives the goal calories that should be burned 
 * @param profile gives the info from the profile class
 */
	public DailyExercise(Fitness [] exerciseList, int duration, double calorieTarget, Profile profile) {
		this.duration = duration;
		this.calorieTarget = calorieTarget;
		this.exerciseList = exerciseList;
		this.profile = profile;


	}

	/** @param excerciseList gives the excerciseList
	 * @param profile gives the profile info
	 * this is a constructor 
	 */

	public DailyExercise(Fitness[] exerciseList, Profile profile) {
		// is duration in terms of minutes or hours?
		// should i use the this. method?
		duration = 60;
		calorieTarget = 500;
		this.exerciseList = exerciseList;
		this.profile = profile;

	}

	/** no parameters
	 * @return int which counts the number of excercises in the excercise list
	 */

	public int getSize() {
		int count = 0;

		count = (this.exerciseList.length + 1);
		


		
		return count;
		//returns number of of excercises in the excercise list
	}

	/**@param ex gives the specific excercise
	 * @return void because just adding excercise to the list
	 */

	public void addExercise(Fitness ex) {
		Fitness addExerciseList[] = new Fitness[exerciseList.length + 1];
		for(int i = 0; i < exerciseList.length + 1; i++) {
			addExerciseList[i] = ex;
		}
		// do u have to check if the excercise is already in there?


	}
/** @param ex gives the specific excercise being focused on 
 * @return void because just removing the excercise 
 */
	public void removeExercise(Fitness ex) {
		// if excercise does not exist, leaves the excercise list unchanged 
		Fitness removeExerciseList[] = new Fitness[exerciseList.length + 1];
		for (int i = 0; i < exerciseList.length + 1; i ++) {
			removeExerciseList[i] = ex;

			if (removeExerciseList[i] == ex) {
				removeExerciseList[exerciseList.length] = null;
			

			}
			

	}




	}

	/**@param list gives a list of excercises 
	 * @return void because this is a setter method
	 */

	public void setExerciseList(Fitness[] list) {
		list = exerciseList;
	}

	/**@param duration gives the lenght of time of excercise 
	 * @return void because this is a setter method
	 */

	public void setDuration(int duration) {
		// change this based on if defining variables was correct 
		this.duration = duration;
	}

	/**@param target gives the amount of calories that need to be burned
	 * @return void because this is a setter method
	 */

	public void setCalorieTarget(double target) {
		// do i have to do the this. ? how would that work with default parameters
		this.calorieTarget = target;

	}

	/**@param profile gives the entire profile of the user 
	 * @return void because this is a setter method
	 */

	public void setProfile(Profile profile) {
		this.profile = profile; 

		//returns profile of user
	}

	/** no parameter because this is a getter 
	 * @return Fitness[] which gives the excercise list 
	 */

	public Fitness[] getExerciseList() {

		return exerciseList;
	} 

	/** no parameter because this is a getter 
	 * @return int returns the lenght of time of the excercise 
	 */

	public int getDuration() {
		return duration;
	}

	/** no parameter because this is a getter 
	 * @return double returns the goal amount of calories that need to be burned
	 */

	public double getCalorieTarget(){
		return calorieTarget;

	}

	/** no parameter because this is a getter 
	 * @return Profile returns the info of the user 
	 */

	public Profile getProfile(){
		return profile;

	}

	/** @param targetMuscle gives the muscles user is trying to work 
	 * @return Fitness gives a list of excercises user can do to use those muscles
	 */

	public Fitness[] getExercises(Muscle[] targetMuscle) {
		// take length filled and put it into new array 
	Fitness finalList[] = new Fitness[exerciseList.length];
	Squat s = new Squat();

	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < s.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == s.muscleTargeted()[j]) {
	 				finalList[0] = s;

	 			}
		}
	}
	Swimming swim = new Swimming();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < swim.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == swim.muscleTargeted()[j] && swim.getSwimmingType()== SwimmingType.Breaststroke) {
	 				finalList[0] = swim;

	 			}

				else if (targetMuscle[i] == swim.muscleTargeted()[j] && swim.getSwimmingType() == SwimmingType.Freestyle) {
					finalList[0] = swim;
				}

				else if (targetMuscle[i] == swim.muscleTargeted()[j] && swim.getSwimmingType() == SwimmingType.Butterflystroke) {
					finalList[0] = swim;
				}
		}
	}

	Cycling c = new Cycling();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < c.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == c.muscleTargeted()[j]) {
	 				finalList[0] = c;

	 			}
		}
	}

	Yoga y = new Yoga();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < y.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == y.muscleTargeted()[j]) {
	 				finalList[0] = y;

	 			}
		}
	}

	TaiChi tc = new TaiChi();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < tc.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == tc.muscleTargeted()[j]) {
	 				finalList[0] = tc;

	 			}
		}
	}

	PullUp pu = new PullUp();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < pu.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == pu.muscleTargeted()[j]) {
	 				finalList[0] = pu;

	 			}
		}
	}

	WeightLifting wl = new WeightLifting();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < wl.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == wl.muscleTargeted()[j]) {
	 				finalList[0] = wl;

	 			}
		}
	}

	Plyometrics plyo = new Plyometrics();
	for (int i = 0; i < targetMuscle.length; i ++) {
		for (int j = 0; j < plyo.muscleTargeted().length; j ++) {
	 			if (targetMuscle[i] == plyo.muscleTargeted()[j]) {
	 				finalList[0] = plyo;

	 			}
		}
	}


	return finalList ;

	}







}