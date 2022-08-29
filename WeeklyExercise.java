/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */


public class WeeklyExercise {
	protected int days;
	protected double weeklyCalorieTarget;
	protected Fitness[] exerciseList;
	protected Profile profile;

	/**
 * Attributes
 */

	// basically a repeat of daiilyExcercise, once u figure out all methods in that class, can easily do these methods
		// have to use .Class method in the weekly excercise function

/** @param excerciseList gives the excercises 
 * @param duration gives the excercise time 
 * @param calorieTaregt gives the goal calories that should be burned 
 * @param profile gives the info from the profile class
 */
	
	public WeeklyExercise(Fitness[] exerciseList, int days, double weeklyCalorieTarget, Profile profile) {
		// excercise items should be strings 
		//new Fitness[] excerciseList;
		this.days = days;
		this.weeklyCalorieTarget = weeklyCalorieTarget;
		this.exerciseList = exerciseList;
		this.profile = profile; 

		

	}


	/** @param excerciseList gives the excerciseList
	 * @param profile gives the profile info
	 * this is a constructor 
	 */

	public WeeklyExercise(Fitness[] exerciseList, Profile profile) {
		days = 7;
		weeklyCalorieTarget = 3500;
		this.exerciseList = exerciseList;
		this.profile = profile;

	}
		/**@param ex gives the specific excercise
	 * @return void because just adding excercise to the list
	 */

	public void addExercise(Fitness ex){
		Fitness[] addExerciseList = new Fitness[exerciseList.length + 1];

		for(int i = 0; i < exerciseList.length + 1; i ++) {
			
			addExerciseList[i] = ex;
		

		}
		// do u have to check if the excercise is already in there?


	}

	/** @param ex gives the specific excercise being focused on 
 * @return void because just removing the excercise 
 */

	public void removeExercise(Fitness ex) {
		Fitness [] removeExerciseList = new Fitness[exerciseList.length + 1];
		for (int i = 0; i < exerciseList.length + 1; i ++) {
			removeExerciseList[i] = ex;

			if (removeExerciseList[i] == ex) {
				removeExerciseList[exerciseList.length] = null;
			

			}
		}
				// if excercise does not exist, leaves the excercise list unchanged 


	}

	/**@param Fitness gives a list of excercises 
	 * @return void because this is a setter method
	 */

	public void setExerciseList(Fitness[] list){
		this.exerciseList = list;
	}

	/**@param days gives the number of days for the user to reach goal weight 
	 * @return void because this is a setter method
	 */

	public void setDays(int days){
		this.days = days;

	}

	/**@param target gives the target calorie consumption per week 
	 * @return void because this is a setter method
	 */

	public void setWeeklyCalorieTarget(double target){
		this.weeklyCalorieTarget = target;

	}

	/**@param profile gives the profile of the user 
	 * @return void because this is a setter method
	 */

	public void setProfile(Profile profile){
		this.profile = profile;

	}

	/** no parameter because this is a getter 
	 * @return Fitness[] which gives the excercise list 
	 */

	public Fitness[] getExerciseList() {
		return exerciseList;

	}

	/** no parameters
	 * @return int which counts the number of excercises in the excercise list
	 */

	public int getSize(){
		int count = 0;

		count = (this.exerciseList.length + 1);
		
		return count;

	}

	/** no parameter because this is a getter 
	 * @return int which gives the number of days 
	 */

	public int getDays(){
		return days;

	}

	/** no parameter because this is a getter 
	 * @return Profile which gives the profile of the user 
	 */

	public Profile getProfile(){
		return profile;

	}

		/** no parameter because this is a getter 
	 * @return double which gives the weekly calorie burning goal 
	 */

	public double getWeeklyCalorieTarget(){
		return weeklyCalorieTarget;

	}

/**@param intensity gives how hard the excercise was 
 * @return DailyExcercise[] to give all the excercises 
 */

	public DailyExercise[] getWeeklyExercises(Intensity intensity) {
        //creating new array 
        DailyExercise [] finalDays = new DailyExercise[exerciseList.length];
        for (int i = 0; i < finalDays.length; i ++) {
            DailyExercise count = new DailyExercise(exerciseList,days,weeklyCalorieTarget,profile);
            count.setCalorieTarget(weeklyCalorieTarget/days);
            int duration = 0;
            // using if statements to compare the excercise with the different excercise types
            //then using the low intensity values for the formula 
            if (intensity == Intensity.LOW){
            
                if (exerciseList[i] instanceof Swimming) {
                    duration = (int)((count.getCalorieTarget() * 60)/(6.0 * profile.getWeight()));
    
                    count.setDuration(duration);
    
    
    
                }
                if (exerciseList[i] instanceof Cycling){
                    duration = (int)((count.getCalorieTarget() * 60)/(4.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof WeightLifting) {
                    duration = (int)((count.getCalorieTarget() * 60)/(3.5 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof Plyometrics){
                    duration = (int)((count.getCalorieTarget() * 60)/(2.5 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof Yoga){
                    duration = (int)((count.getCalorieTarget() * 60)/(2.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if (exerciseList[i] instanceof TaiChi){
                    duration = (int)((count.getCalorieTarget() * 60)/(1.5 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if(exerciseList[i] instanceof Squat){
                    duration = (int)((count.getCalorieTarget() * 60)/(2.5 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if(exerciseList[i] instanceof PullUp){
                    duration = (int)((count.getCalorieTarget() * 60)/(4.8 * profile.getWeight()));
                    count.setDuration(duration);
    
                }

            }
             // using if statements to compare the excercise with the different excercise types
            //then using the medium intensity values for the formula 
            else if (intensity == Intensity.MEDIUM) {

                if (exerciseList[i] instanceof Swimming) {
                    duration = (int)((count.getCalorieTarget() * 60)/(8.3 * profile.getWeight()));
    
                    count.setDuration(duration);
    
    
    
                }
                if (exerciseList[i] instanceof Cycling){
                    duration = (int)((count.getCalorieTarget() * 60)/(8.5 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof WeightLifting) {
                    duration = (int)((count.getCalorieTarget() * 60)/(5.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof Plyometrics){
                    duration = (int)((count.getCalorieTarget() * 60)/(4.8 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof Yoga){
                    duration = (int)((count.getCalorieTarget() * 60)/(3.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if (exerciseList[i] instanceof TaiChi){
                    duration = (int)((count.getCalorieTarget() * 60)/(3.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if(exerciseList[i] instanceof Squat){
                    duration = (int)((count.getCalorieTarget() * 60)/(5.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if(exerciseList[i] instanceof PullUp){
                    duration = (int)((count.getCalorieTarget() * 60)/(6.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
            }
             // using if statements to compare the excercise with the different excercise types
            //then using the high intensity values for the formula 
            else if (intensity == Intensity.HIGH){
                if (exerciseList[i] instanceof Swimming) {
                    duration = (int)((count.getCalorieTarget() * 60)/(10.0 * profile.getWeight()));
    
                    count.setDuration(duration);
    
    
    
                }
                if (exerciseList[i] instanceof Cycling){
                    duration = (int)((count.getCalorieTarget() * 60)/(14.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof WeightLifting) {
                    duration = (int)((count.getCalorieTarget() * 60)/(6.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof Plyometrics){
                    duration = (int)((count.getCalorieTarget() * 60)/(7.4 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
    
                if (exerciseList[i] instanceof Yoga){
                    duration = (int)((count.getCalorieTarget() * 60)/(4.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if (exerciseList[i] instanceof TaiChi){
                    duration = (int)((count.getCalorieTarget() * 60)/(5.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if(exerciseList[i] instanceof Squat){
                    duration = (int)((count.getCalorieTarget() * 60)/(7.0 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
                if(exerciseList[i] instanceof PullUp){
                    duration = (int)((count.getCalorieTarget() * 60)/(7.5 * profile.getWeight()));
                    count.setDuration(duration);
    
                }
            }
            // addding values to the array 
        finalDays[i] = count;
        }
        return finalDays;
		
        
	


	}

	/**no parameters 
	 * @return DailyExcercise[] gives the list of excercises for when the internsity is low
	 */

	public DailyExercise[] getWeeklyExercises(){
		//creating new array 
        DailyExercise [] finalDays = new DailyExercise[exerciseList.length];
        for (int i = 0; i < finalDays.length; i ++) {
            DailyExercise count = new DailyExercise(exerciseList,days,weeklyCalorieTarget,profile);
            count.setCalorieTarget(weeklyCalorieTarget/days);
            int duration = 0;
            // using if statements to compare the excercise with the different excercise types
            //then using the low intensity values for the formula 
            if (exerciseList[i] instanceof Swimming) {
                duration = (int)((count.getCalorieTarget() * 60)/(6.0 * profile.getWeight()));

                count.setDuration(duration);



            }
            if (exerciseList[i] instanceof Cycling){
                duration = (int)((count.getCalorieTarget() * 60)/(4.0 * profile.getWeight()));
                count.setDuration(duration);

            }

            if (exerciseList[i] instanceof WeightLifting) {
                duration = (int)((count.getCalorieTarget() * 60)/(3.5 * profile.getWeight()));
                count.setDuration(duration);

            }

            if (exerciseList[i] instanceof Plyometrics){
                duration = (int)((count.getCalorieTarget() * 60)/(2.5 * profile.getWeight()));
                count.setDuration(duration);

            }

            if (exerciseList[i] instanceof Yoga){
                duration = (int)((count.getCalorieTarget() * 60)/(2.0 * profile.getWeight()));
                count.setDuration(duration);

            }
            if (exerciseList[i] instanceof TaiChi){
                duration = (int)((count.getCalorieTarget() * 60)/(1.5 * profile.getWeight()));
                count.setDuration(duration);

            }
            if(exerciseList[i] instanceof Squat){
                duration = (int)((count.getCalorieTarget() * 60)/(2.5 * profile.getWeight()));
                count.setDuration(duration);

            }
            if(exerciseList[i] instanceof PullUp){
                duration = (int)((count.getCalorieTarget() * 60)/(4.8 * profile.getWeight()));
                count.setDuration(duration);

            }
            //adding values to the array 
            finalDays[i] = count;
           
        }


        return finalDays;
	}

	/** @param targetWeight gives the goal weight for user
	 * @param withinDays gives the number of days the user would like to lose the weight 
	 * @return String calcultaes a plan for the user in order to meet their goal
	 */

	public String targetedCalorieLoss(double targetWeight, int withinDays) {

        if (targetWeight > profile.getWeight()){
            return ("Only works to lose weight");
        }
		// try calling it to see if it works 
		double finalAnswer;
		double finalWeight;
		finalWeight = profile.getWeight() - targetWeight;
		finalAnswer = (profile.getWeight() - targetWeight) * 7000 / withinDays;






		// using string.format to round to two decimal places 
		return ("You need to lose " + String.format("%.2f", finalAnswer) + " calories per day or decrease your intake from " + String.format("%.2f",(profile.dailyCalorieIntake())) + " to " + String.format("%.2f",(profile.dailyCalorieIntake() - finalAnswer)) +  " in order to lose " + String.format("%.2f", finalWeight) + " kg of weight");

	}
}