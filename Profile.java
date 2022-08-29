/**
 * @author<Warisa_Khan>
 * @version<1.8>
 */

public class Profile {

/**
 * Attributes
 */


	protected int age;
	protected double height;
	protected double weight;
	protected Gender gender;

	

	
	
	//weight kgs
	//height in meters
	//gender is in enum gender

	/**@param age gives the age of the user
	 * @param height gives height of user
	 * @param weight gives the weight of the user
	 * @param gender gives the gender of the user 
	 */

	public Profile(int age, double height, double weight, Gender gender) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	/**@param height gives the height of the user
	 * @return void because this is a setter method
	 */

	public void setHeight(double height) {
		this.height = height;
	}

		/**@param weight gives the weight of the user
	 * @return void because this is a setter method
	 */

	public void setWeight(double weight) {
		this.weight = weight;

	}

	/**@param age gives the age of the user
	 * @return void because this is a setter method
	 */

	public void setAge(int age) {
		this.age = age;
	}

	/**@param gender gives the gender of the user
	 * @return void because this is a setter method
	 */
	public void setGender(Gender gender){
		this.gender = gender;
	}

	/** no parameter because this is a getter 
	 * @return double returns the height of the user 
	 */

	public double getHeight(){
		return this.height;
	}

	/** no parameter because this is a getter 
	 * @return double returns the weight of the user 
	 */

	public double getWeight() {
		return this.weight;
	}

	/** no parameter because this is a getter 
	 * @return int returns the age of the user 
	 */

	public int getAge(){
		return this.age;

	}

	/** no parameter because this is a getter 
	 * @return Gender returns the gender of the user 
	 */

	public Gender getGender(){
		return this.gender;
	}


/** no parameters
 * @return String gives all the above info in a string statement
 */
	@Override
	public String toString(){

		return ("Age " + this.age + ", Weight " + this.weight + "kg, Height " + (Math.round(this.height * 10.0)/10.0) + "m, Gender " + this.gender);
	}

/** no parameters
 * @return douvle calculates Basal Metabolic rate of the user 
 */
	public double calcBMI(){
		double bodyMassIndex = 0.0;
	
		bodyMassIndex = this.weight/(Math.pow(this.height, 2));
		return bodyMassIndex;

		//dividing weight by square of height 
	}

	/** no parameters
	 * @return double calculates how much calorie intake is necessary to stay at current weight
	 */

	public double dailyCalorieIntake(){
		double calorieIntake = 0.0;

		if (this.gender == Gender.MALE) {
			calorieIntake = 66.47 + (13.75 * this.weight) + (5.003 * (this.height * 100)) - (6.755 * this.age);

		}

		else if (this.gender == Gender.FEMALE) {
			calorieIntake = 655.1 + (9.563 * this.weight) + (1.85 * (this.height * 100)) - (4.676 * this.age);
		}

		return calorieIntake;

	}
}