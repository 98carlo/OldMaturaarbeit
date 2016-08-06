
public class OutputLayer {

	
	private ArrayList <Neuron> ListOfNeurons = new ArrayList <Neuron> ();
	private int NumberOfNeuronsInLayer;
	
	public OutputLayer initLayer (OutputLayer outputLayer){
		outputLayer = new OutputLayer();
		ArrayList <Double> weightOut = new ArrayList <Double> ();
		for (int i = 0; i < NumberOfNeuronsInLayer; i++){
			Neuron neuron = new Neuron();
			double WeightOut = neuron.initNeuron();
			weightOut.clear();
			weightOut.add(WeightOut);
			neuron.setListOfWeightIn(weightOut);
			ListOfNeurons.add(neuron);
		}
		return outputLayer;
	
	public void printLayer (OutputLayer outputLayer){
		
	}
	
	public void setNumberOfNeuronsInLayer (int numberOfNeuronsInLayer){
		NumberOfNeuronsInLayer = numberOfNeuronsInLayer;
		ListOfNeurons.ensureCapacity(NumberOfNeuronsInLayer);
	}

	public int getNumberOfNeuronsInLayer() {
		return this.NumberOfNeuronsInLayer;
	}

}
