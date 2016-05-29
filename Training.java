import java.util.ArrayList;



public class Training {
	
	private int epochs;
	private double error;
	private double mse;
	
	public enum TrainingTypesENUM{
		PERCEPTRON, ADALINE;
	}

	public enum ActivationFncENUM{
		STEP,LINEAR,SIGLOG,HYPERTAN;
	}
	
	public NeuralNet train (NeuralNet n){
		ArrayList<Double> inputWeightIn = new ArrayList<Double>();
		int rows = n.getTrainSet().length;
		int cols = n.getTrainSet()[0].length;
		
		while (this.getEpochs() < n.getMaxEpochs()){
			double estimatedOutput = 0.0;
			double realOutput = 0.0;
			
			for (int i = 0; i< rows; i++){
				
				double netValue = 0.0;
				
				for (int j = 0; j < cols; j++){
					inputWeightIn = n.getInputLayer().getlistOfNeurons().get(j).getListOfWeightIn();
					double inputWeight = inputWeightIn.get(0);
					netValue = netValue + inputWeight * n.getTrainSet() [i] [j];
				}
				estimatedOutput = this.activationFnc (n.getActivationFnc(), netValue);
				realOutput = n.getRealOutputSet()[i];
				this.setError(realOutput - estimatedOutput); 
				
				if (Math.abs(this.getError()) > n.getTargetError()) {
					InputLayer inputLayer = new InputLayer();
					inputLayer.setListOfNeurons(this.teachNeuronsOfLayer(cols, i, n, netValue));
					n.setInputLayer(inputLayer);
				}
				
			}
			
			this.setMse (Math.pow(realOutput - estimatedOutput, 2.0));
			n.getListOfMSE().add(this.getMse());
			this.setEpochs(this.getEpochs() + 1);
		}
		
		n.setTrainingError(this.getError());
		return n;
	}
	
	private double calcNewWeight(TrainingTypesENUM trainType, double inputWeightOld, NeuralNet n, double error, double trainSample, double newValue){
		switch (trainType) {
		case PERCEPTRON:
			return inputWeightOld + n.getLearningRate() * error * trainSample;
		case ADALINE:
			return inputWeightOld + n.getLearningRate() * error * trainSample * derivativeActivationFnc(n.getActivationFnc(), newValue);
		default:
			throw new IllegalArgumentException(trainType + "does not exist in TrainingTypesENUM");
		}
	}
	
	public ArrayList<Neuron>teachNeuronsOfLayer (int numberOfInputNeurons, int line, NeuralNet n, double netValue){
		return ;
	}
	
	public double activationFnc (ActivationFncENUM fnc, double value){
		return value;
	}
	
	public double derivativeActivationFnc (ActivationFncENUM fnc, double value){
		return value;
	}
	 
	private double fncStep (double v){
		return v;
	}
	
	private double fncLinear(double v){
		return v;
	}
	
	private double fncSigLog(double v){
		return v;
	}
	
	private double fncHyperTan(double v){
		return v;
	}
	
	private double derivativeFncLinear (double v){
		return v;
	}

	private double derivativeFncSigLog (double v){
		return v;
	}
	
	private double derivativeFncHyperTain (double v){
		return v;
	}
	
	public void printTrainedNetResult (NeuralNet trainedNet){
		
	}
	
	public int getEpochs(){
		int Epochs = 0;
		return Epochs;
	}
	
	public void setEpochs (int epochs){
		
	}
	
	public double getError(){
		return error;
	}
	
	public void setError(double error){
		this.error = error;
	}
	
	public double getMse (){
		return mse;
	}
	
	public void setMse (double mse){
		this.mse = mse;
	}

}
