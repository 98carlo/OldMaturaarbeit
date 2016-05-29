import java.util.ArrayList;

public class NeuralNet {
	
	private InputLayer inputLayer;
	private HiddenLayer hiddenLayer;
	private ArrayList <HiddenLayer> listOfHiddenLayer;
	private OutputLayer outputLayer;
	private int numberOfHiddenLayers;
	private double[] [] trainSet;
	private double [] realOutputSet;
	private int maxEpochs;
	private double learningRate;
	private double targetError;
	private double trainingsError;
	private TrainingTypesENUM trainType;
	private ActivationFncENUM activationFnc;
	private ArrayList <Double> listOfMSE = new ArrayList<Double>();
	
	
	

	public static void main(java.lang.String[] args) {
		
		NeuralNet n = new NeuralNet();
		n.initNet();
		n.printNet();

	}
	
	public void initNet(){
		
		inputLayer.initLayer(inputLayer);
		hiddenLayer.initLayer(hiddenLayer, listOfHiddenLayer, outputLayer);
		outputLayer.initLayer(outputLayer);
		
	}
	
	public void printNet(){
		
		inputLayer.printLayer(inputLayer);
		hiddenLayer.printLayer(listOfHiddenLayer);
		outputLayer.printLayer(outputLayer);
	
	}
	
	public NeuralNet trainNet (NeuralNet n){
		return n;
	}
	
	public void printTrainedNetResult (NeuralNet n){
		
	}
	
	public double [] [] getTrainSet(){
		
	}
	
	public double [] getRealOutputSet(){
		
	}
	
	public void setRealOutputSet(double [] realOutputSet){
		
	}
	
	public int getMaxEpochs(){
		
	}
	
	public void setMaxEpochs(int maxEpochs){
		
	}
	
	public double getTargetError(){
		
	}
	
	public void setTargetError (double targetError){
		
	}
	
	public double getLearningRate(){
		
	}
	
	public void setLearningRate (double learningRate){
		
	}
	
	public void setTrainingError (double trainingError){
		
	}
	
	public ActivationFncENUM getActivationFnc(){
		
	}
	
	public void setActivationFnc (ActivationFncENUM activationFnc){
		
	}

	public TrainingTypesENUM getTrainType(){
		
	}
	
	public void setTrainType(TrainingTypesENUM trainType){
		
	}
	
	public ArrayList <Double>getListOfMSE(){
		
	}
	
	public void setListOfMSE(ArrayList<Double> listOfMSE){
		
	}

	public InputLayer getInputLayer() {
		
		return inputLayer;
	}
	
	public OutputLayer getOutputLayer(){
		
		return outputLayer;
	}

	public void setInputLayer(InputLayer inputLayer) {
		
		this.inputLayer = inputLayer;
		
	}
	
}
