package main;

import java.io.File;

public class Algorithm {
	
// 1,2,3,4 in test t1,t2,t3,t4 and training s1,s2,s3,s4
//Formula for k nearest neighbour distance checking [t1-s1)^2]/R where R is the range for that feature
// SqRt([t1-s1)^2]/R^2 + [t2-s2)^2]/R^2 + .... + [(t.n)(s.n))^2]/R^2) where n is the number of values to be compared
	
	public Algorithm(File testSet, File trainingSet) {
		
	}

	/**
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

}
