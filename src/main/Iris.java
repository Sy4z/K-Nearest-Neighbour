package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Iris {
/**
 * This Class is a data structure created that holds the values of each Iris Object. These can be inserted into a list
 * and used as a better and cleaner way of dealing with the data.
 * @author syaz
 *
 */


	enum irisType {IrisSetosa, IrisVersicolor, IrisVirginica};	
	private irisType irisType;
	private irisType amendedIrisType = null; //If it is null, it has not yet been changed.
	double sepalLength;
	double sepalWidth;
	double petalLength;
	double petalWidth;
	boolean isTraining = false;
	HashMap<Iris, Double> nearestNeighbours = new HashMap<Iris, Double>();

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
	 * Returns the type of the Iris in String Format
	 * @return
	 */
	public String getType(){
		if(irisType == irisType.IrisSetosa){
			return "Setosa";
		}
		else if(irisType == irisType.IrisVersicolor){
			return "Versicolor";
		}
		else{
			return "Virginica";
		}
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
	
	/**
	 * If the iris type gets changed by the algorithm, this method will get called.
	 * @param type
	 */
	public void setNewIrisType(String type){
		if(type == "Setosa"){
			this.amendedIrisType = irisType.IrisSetosa;
		}
		else if(type == "Versicolor"){
			this.amendedIrisType = irisType.IrisSetosa;
			
		}
		else if(type == "Virginica"){
			this.amendedIrisType = irisType.IrisVirginica;
			}
	}
	
	/**
	 * Setter to turn on the check inside this object to tell whether its from the Training set, or not.
	 */
	public void setTraining(){
		isTraining = true;
	}


	/**
	 * Adds an Iris to the set of nearest neighbours. Used by Algorithm
	 * @param neighbour
	 */
	public void addNeighbour(Iris neighbour, double distance){
		nearestNeighbours.put(neighbour, new Double(distance));
	}
	
	/**
	 * Returns the list of nearest neighbours so Algorithm can see it.
	 * @return
	 */
	public HashMap<Iris, Double> getNeighbours(){
		return nearestNeighbours;
	}

}
