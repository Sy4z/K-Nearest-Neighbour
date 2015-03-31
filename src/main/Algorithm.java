package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm {

	// 1,2,3,4 in test t1,t2,t3,t4 and training s1,s2,s3,s4
	//Formula for k nearest neighbour distance checking [t1-s1)^2]/R where R is the range for that feature
	// SqRt([t1-s1)^2]/R^2 + [t2-s2)^2]/R^2 + .... + [(t.n)(s.n))^2]/R^2) where n is the number of values to be compared

	double rangePetalLength;
	double rangePetalWidth;
	double rangeSepalLength;
	double rangeSepalWidth;
	List<Iris> trainingSet = new ArrayList<Iris>(); //Contains Training Set
	List<Iris> testSet = new ArrayList<Iris>(); //Contains Test Set
	public int k = 3; //k value (How many of the nearest test values will be used to decide on the type of the training value)

	public Algorithm(File testSetFile, File trainingSetFile) {
		//Build TestSet from File
		enumerateFromFile(testSetFile, this.testSet);
		//Build Training Set from File
		enumerateFromFile(trainingSetFile, this.trainingSet);

		List<Iris> nearestNeighbours = new ArrayList<Iris>(); //will be filled to K within the loop below
		double minPetalLength = 0; //Smallest value
		double maxPetalLength = 0;
		double minPetalWidth = 0;
		double maxPetalWidth = 0;
		double minSepalLength = 0;
		double maxSepalLength = 0;
		double minSepalWidth = 0;
		double maxSepalWidth = 0;
		for(Iris z: trainingSet){//figure out the range
			if(z.getPetalLength() < minPetalLength){
				minPetalLength = z.getPetalLength();
			}
			if(z.getPetalLength() > maxPetalLength){
				maxPetalLength = z.getPetalLength();
			}
			if(z.getPetalWidth() < minPetalWidth){
				minPetalWidth = z.getPetalWidth();
			}
			if(z.getPetalWidth() > maxPetalWidth){
				maxPetalWidth = z.getPetalWidth();
			}
			if(z.getSepalLength() < minSepalLength){
				minSepalLength = z.getSepalLength();
			}
			if(z.getSepalLength() > maxSepalLength){
				maxSepalLength = z.getSepalLength();
			}
			if(z.getSepalWidth() < minSepalWidth){
				minSepalWidth = z.getSepalWidth();
			}
			if(z.getSepalWidth() > maxSepalWidth){
				maxSepalWidth = z.getSepalWidth();
			}
		}
		//The minimum and maximum values should be calculated, so now we have to calculate the four ranges
		
		rangePetalWidth = maxPetalWidth-minPetalWidth;
		rangePetalLength = maxPetalLength - minPetalLength;
		rangeSepalWidth = maxSepalWidth - minSepalWidth;
		rangeSepalLength = maxSepalLength - minSepalLength;
		
		
		
		//Loop around Irises (For each Iris in testset, loop through each Iris in trainingset
		for(Iris i:testSet){
			for(Iris x:trainingSet){


				//Calculate lengths between the two objects based on distance formula
				double distance = Math.sqrt((Math.pow((i.getPetalWidth()-x.getPetalWidth()),2)/Math.pow(rangePetalWidth,2)) + (Math.pow((i.getPetalLength()-x.getPetalLength()),2)/Math.pow(rangePetalLength,2)) + (Math.pow((i.getSepalWidth()-x.getSepalWidth()),2)/Math.pow(rangeSepalWidth,2)) + (Math.pow((i.getSepalLength()-x.getSepalLength()),2)/Math.pow(rangeSepalLength,2)));
				//Loop until K to find the K nearest neighbours based on calculated distance
				for(int c = 0; c < k ; c++){
					
				}
				//inside loop,if the set of neighbours contains less than K values, add the current training iris.
				//Else add the curent training Iris iff it has a closer distance than the one at current point in the loop

				//now that the K nearest neighbours are found, find what the values are classified as, based on the nearest neighbours
				//Update the training set with the new classifications.
			}
		}


	}

	/**
	 * Main method, takes the test and training sets from command line parameters.
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			new Algorithm(new File(args[0]),(new File(args[1])));
		}
		catch(ArrayIndexOutOfBoundsException e){

			throw new ArrayIndexOutOfBoundsException("Arguments Invalid: Please enter two files. Format: (Test Set, Training Set");
		}

	}

	public void enumerateFromFile(File file, List<Iris> set){
		Iris tempIris;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				tempIris = new Iris(sc.nextDouble(),sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.next()); //Creates a new data structure, reading in the values from the file
				set.add(tempIris);	//adds the new data structure to the list of irises
			}
			sc.close();//Efficiency
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







}
