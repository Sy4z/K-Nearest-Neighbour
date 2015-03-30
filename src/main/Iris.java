package main;


public class Iris {
/**
 * This Class is a data structure created that holds the values of each Iris Object. These can be inserted into a list
 * and used as a better and cleaner way of dealing with the data.
 * @author syaz
 *
 */


	enum irisType {IrisSetosa, IrisVersicolor, IrisVirginica};	
	private irisType irisType;
	double sepalLength;
	double sepalWidth;
	double petalLength;
	double petalWidth;

	/**
	 * All Parameters are measured in Centimeters(Cm)	
	 * @param sepalLength
	 * @param sepalWidth
	 * @param petalLength
	 * @param petalWidth
	 */
	public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String type){

		//Deals with setting the type of iris pertaining to the current object
		if(type.equals("Iris-setosa")){
			this.irisType = irisType.IrisSetosa;
		}
		else if(type.equals("Iris-versicolor")){
			this.irisType = irisType.IrisVersicolor;
		}
		else if(type.equals("Iris-virginica")){
			this.irisType = irisType.IrisVirginica;
		}
		else{
			System.out.println("One of the input types to the Iris was incorrect");
		}

		//set Sepal Length of the current object
		this.sepalLength = sepalLength;
		//set Sepal Width of the current object
		this.sepalWidth = sepalWidth;
		//set Petal Length of the current object
		this.petalLength = petalLength;
		//set Petal Width of the current object
		this.petalWidth = petalWidth;

	}

	
	/**
	 * Returns the Petal Width of the current Iris in Cm
	 * @return Petal Width of Iris
	 */
	public double getPetalWidth(){
		return this.petalWidth;
	}
	
	/**
	 * Returns the Petal Length of the current Iris in Cm
	 * @return Petal Length of Iris
	 */
	public double getPetalLength(){
		return this.petalLength;
	}
	
	/**
	 * Returns the Sepal Width of the current Iris in Cm
	 * @return Sepal Width of Iris
	 */
	public double getSepalWidth(){
		return this.sepalWidth;
	}
	
	/**
	 * Returns the Sepal Length of the current Iris in Cm
	 * @return Sepal Length of Iris
	 */
	public double getSepalLength(){
		return this.sepalLength;
	}



}
