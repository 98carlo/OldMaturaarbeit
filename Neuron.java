import java.util.ArrayList;

public class Neuron {
	
	private ArrayList <Double> ListofWeightIn;
	private ArrayList <Double> ListofWeightOut;

	
	public double initNeuron()
	{
		double initNeuronNumber = Math.random();
		return initNeuronNumber;
		
	}
	
	public void setListOfWeightIn (ArrayList<Double>listOfWeightIn){
		//set the WeightsIn equal to the parameters
		//used to change the Weights
		this.ListofWeightIn = listOfWeightIn;
		
	}
	
	public void setListOfWeightOut(ArrayList <Double> listOfWeightOut){
		//set the WeightsOut equal to the parameters
		//used to change the Weights
		this.ListofWeightOut = listOfWeightOut;
	}
	
	public ArrayList<Double>getlistOfWeightIn(){
		//used for getting the current WeightsIn
		return this.ListofWeightIn;
	}
	
	public ArrayList<Double>getListOfWeightOut(){
		//used for getting the current WeightsOut
		return this.ListofWeightOut;
	}
}
