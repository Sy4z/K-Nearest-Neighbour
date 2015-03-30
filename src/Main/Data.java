package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Data {
	// 1,2,3,4 in test t1,t2,t3,t4 and training s1,s2,s3,s4
	//Formula for k nearest neighbour distance checking [t1-s1)^2]/R where R is the range for that feature
// [t1-s1)^2]/R + [t2-s2)^2]/R + .... + [(t.n)(s.n))^2]/R where n is the number of values to be compared

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Input data file to be put into the algorithm
	 * Takes a filename and looks for a file
	 * @param filename Name of the file in String format
	 * @return BufferedReader with file data
	 */

	public static BufferedReader readData(String filename){
		BufferedReader reader = null;


		try{
			reader = new BufferedReader(new FileReader(filename));
		}
		catch(FileNotFoundException e){


		}
		return reader;
	}

}
