import java.util.ArrayList;

public class InputLayer {
	
	private int numberOfNeuronsInLayer;
	private static ArrayList <Neuron> ListOfNeurons;
	
	@SuppressWarnings("null")
	public void initLayer (InputLayer inputLayer){
		
		for (int i = 0; i < numberOfNeuronsInLayer; i++){
			ArrayList <Double> inputLayerNeurons = null;
			inputLayerNeurons.add(Math.random());
		}
		
	} 
	
	public void printLayer(InputLayer inputLayer){
		System.out.println("------ InputLayer ------");
		System.out.println(ListOfNeurons);
	}
	
	public void setNumberOfNeuronsInLayer (int numberOfNeuronsInLayer){
		this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
	}
	
	public int getNumberOfNeuronsInLayer(){
		return numberOfNeuronsInLayer;
	}

	public void setListOfNeurons (ArrayList<Neuron> teachNeuronsOfLayer) {
		 for (int i = 0; i < numberOfNeuronsInLayer; i++){
			 this.ListOfNeurons.add(i, teachNeuronsOfLayer.get(i));
		 }
		
	}

	public ArrayList<Neuron> getlistOfNeurons() {
		return this.ListOfNeurons;
	}

}
