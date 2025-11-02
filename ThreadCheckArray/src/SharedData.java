import java.util.ArrayList;


/**
 * SharedData class initializes the main fields  
 */
public class SharedData {
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	
	/** 
	 * SharedData(ArrayList<Integer> array, int b) constructor to initialize the array and the wanted sum
	 * 
	 * @param ArrayList<Integer>  actual inputed array
	 * @param int b   wanted sum
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}
	/** 
	 * setWinArray() returns the winArray
	 * @return winArray 	checks if the numbers are part of sum subset	
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/** 
	 * setWinArray(boolean[] winArray) sets the winArray 
	 * 
	 * @param winArray checks if the numbers are part of sum subset
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/** 
	 * getArray() method returns the array
	 * 
	 * @return array 	actual array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	/** 
	 * getB() method returns the the wanted sum
	 * 
	 * @return b 	wanted sum
	 */
	public int getB() 
	{
		return b;
	}
	/** 
	 * getFlag() returns the flag  
	 * 
	 * @return flag		checks if a solution (subset) is found
	 */
	public boolean getFlag() 
	{
		return flag;
	}
	/** 
	 * getFlag(boolean flag) returns the flag
	 * 
	 * 
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
