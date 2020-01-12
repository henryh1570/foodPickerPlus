package fpp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class' function is to pick out a random data value from a data set and perform statistical operations.
 * @author henry
 *
 */
public class Randomizer {

	private int limit; // This variable is used to cut the data set off.
					   // Preconditions: limit =/= 0, dataSet.size =/= 0, limit < dataSet.size
	
	private ArrayList<String> dataSet;
	
	public Randomizer(int limit, String filename) {
		this.limit = limit;
		initializeDataSet(filename);
	}
	
	// A Method to quickly verify the data set's contents.
	public void printAll() {
		for (String str : dataSet) {
			System.out.println(str);
		}
	}
	
	// Output the requested ammount of random data elements.
	// Limit should not be greater than dataset size
	public String getRandomLimit() {
		ArrayList<String> chosenData = new ArrayList<String>();
		String output = "";
		
		// Randomly insert chosen data into new list. Do not add repeats.
		while (chosenData.size() < limit) {
			int randomNumber = Math.abs(ThreadLocalRandom.current().nextInt() % dataSet.size());
			String nextData = dataSet.get(randomNumber);
			if (!chosenData.contains(nextData)) {
				chosenData.add(nextData);
				output += (nextData + "\n");
			}
		}
		
		return output;
	}
	
	// Outputs a random value in the dataset
	public String getRandom() {
		int randomNumber = Math.abs(ThreadLocalRandom.current().nextInt() % dataSet.size());
		return dataSet.get(randomNumber);
	}
	
	/**
	 * Called in the constructor to populate the dataSet.
	 */
	private boolean initializeDataSet(String filename) {
		try {
			dataSet = new ArrayList<String>();
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String nextDataEntry = br.readLine();
			while(nextDataEntry != null) {
				dataSet.add(nextDataEntry);
				nextDataEntry = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.err.print(e);
			return false;
		}
		
		return true;
	}
	
}
