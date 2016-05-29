import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//probably the algorithm I'm going to use for my project
//overrides the method from the Training class

public class Kohonen {
	
	public NeuralNet train (NeuralNet n){
		
		int rows = n.getTrainSet().length;
		int cols = n.getTrainSet()[0].length;
		ArrayList <Double> listOfDistances = new ArrayList <Double>();
		
		for (int epoch = 0; epoch < n.getMaxEpochs(); epoch++){
			
			for (int row_i = 0; row_i < rows; row_i++){
				listOfDistances = calcEuclideanDistance(n, trainData, row_i);
				int winnerNeuron = listOfDistances.indexOf (Collections.min(listOfDistances));
				n = fixWinnerWeights (n, winnerNeuron, row_i);
			}
		}
		return n;
	}
	
	private NeuralNet initNet (NeuralNet n){
		return n;
	}
	
	private ArrayList <Double> calcEuclideanDistance (NeuralNet n, double [] [] data, int row){
		ArrayList <Double> listOfDistances = new ArrayList <Double>();
		int weight_i = 0;
		for (int cluster_i = 0; cluster_i < n.getOutputLayer().getNumberOfNeuronsInLayer(); cluster_i++){
			
			double distance = 0.0;
			
			for (int input_j = 0; input_j < n.getInputLayer().getNumberOfNeuronsInLayer(); input_j++){
				
				double weight = n.getInputLayer().getlistOfNeurons().get(0).getListOfWeightOut().get(weight_i);
				distance = distance + Math.pow(data[row][input_j] - weight, 2.0);
				weight_i++;
			}
			listOfDistances.add(distance);
		}
		return listOfDistances;
	}
	
	private NeuralNet fixWinnerWeights (NeuralNet n, int winnerNeuron, int trainSetRow){
		int start, last;
		start = winnerNeuron * n.getInputLayer().getNumberOfNeuronsInLayer();
		if (start < 0){
			start = 0;
		}
		last = start + n.getInputLayer().getNumberOfNeuronsInLayer();
		List<Double>listOfOldWeights = new ArrayList<Double>();
		listOfOldWeights = n.getInputLayer().getlistOfNeurons().get(0).getListOfWeightOut().subList(start, last);
		ArrayList<Double>listOfWeights = new ArrayList<Double>();
		listOfWeights = n.getInputLayer().getlistOfNeurons().get(0).getListOfWeightOut();
		int col_i = 0;
		for (int j = start; j < last; j++){
			double trainSetValue = n.getTrainSet()[trainSetRow][col_i];
			double newWeight = listOfOldWeights.get(col_i) + n.getLearningRate() * (trainSetValue - listOfOldWeights.get(col_i));
			listOfWeights.set(j, newWeight);
			col_i++;
		}
		n.getInputLayer().getlistOfNeurons().get(0).setListOfWeightOut(listOfWeights);
		return n;
	}
}
