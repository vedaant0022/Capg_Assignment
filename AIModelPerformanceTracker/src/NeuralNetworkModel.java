import java.lang.reflect.Method;

public class NeuralNetworkModel extends AIModel {
    private int hiddenLayers;
    private String optimizer;
    private boolean gpuEnabled;

   //Include a nine argument constructor
   //Fill the code here

    public int getHiddenLayers() {
		return hiddenLayers;
	}
	public void setHiddenLayers(int hiddenLayers) {
		this.hiddenLayers = hiddenLayers;
	}
	public String getOptimizer() {
		return optimizer;
	}
	public void setOptimizer(String optimizer) {
		this.optimizer = optimizer;
	}
	public boolean getGpuEnabled() {
		return gpuEnabled;
	}
	public void setGpuEnabled(boolean gpuEnabled) {
		this.gpuEnabled = gpuEnabled;
	}

    public double calculateModelEfficiency() {
        //Fill the code here
        
        
        return 0;
    }

    public double estimateDeploymentCost() {
        //Fill the code here
        
        
        return 0;
    }

	
}
