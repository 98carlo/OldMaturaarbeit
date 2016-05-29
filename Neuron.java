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
		
		for (int i = 0; i<2;i++){
			listOfWeightIn.set(i, Math.random());
		}
		
	}
	
	public void setListOfWeightOut(ArrayList <Double> listOfWeightOut){
		
		for (int i = 0;i<2; i++){
			listOfWeightOut.set(i, Math.random());
		}
		
	}
	
	public ArrayList<Double>getlistOfWeightIn(){
		
		return ListofWeightIn;
	}
	
	public ArrayList<Double>getListOfWeightOut(){
		
		return ListofWeightOut;
	}
}
