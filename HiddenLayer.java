import java.util.ArrayList;

public class HiddenLayer {

	
	public ArrayList <HiddenLayer> initLayer (HiddenLayer hiddenLayer,ArrayList <HiddenLayer> listOfHiddenLayer, OutputLayer outputLayer){
		int numberOfHiddenLayers = 3;
		int NumberOfNeuronsInInputLayer = inputLayer.getNumberOfNeuronsInLayer();
		int NumberOfNeuronsInOutputLayer = outputLayer.getNumberOfNeuronsInLayer();
		ArrayList <Double> weightIn = new ArrayList <Double> ();
		ArrayList <Double> weightOut = new ArrayList <Double> ();
		for (int j = 0; j < numberOfHiddenLayers ; j++){
		hiddenLayer = new HiddenLayer();
		ArrayList <Neuron> ListOfNeurons = new ArrayList <Neuron> ();
		Layer layer = new Layer ();
		layer.setNumberOfNeuronsInLayer(4);
		int NeuronsInLayer = layer.getNumberOfNeuronsInLayer();
		for ( int k = 0; k < NeuronsInLayer; k++){
			Neuron neuron = new Neuron();
		for ( int i = 0 ; i < NumberOfNeuronsInInputLayer ; i++){
			double WeightIn = neuron.initNeuron();
			weightIn.add(WeightIn);
		}
		for (int o = 0; o < NumberOfNeuronsInOutputLayer; o++){
			double WeightOut = neuron.initNeuron();
			weightOut.add(WeightOut);
		}
		neuron.setListOfWeightIn(weightIn);
		neuron.setListOfWeightOut(weightOut);
		ListOfNeurons.add(neuron);
		}
		listOfHiddenLayer.add(hiddenLayer);
		}
		return listOfHiddenLayer;
		
	}
	
	public void printLayer (ArrayList <HiddenLayer> listOfHiddenLayer){
		
	}

}
