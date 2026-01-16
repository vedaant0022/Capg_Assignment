import java.util.*;
 
public class Car {
 
	private Map<String,Integer> carMap = new TreeMap<String,Integer>();
 
	// Include getter and setter
	public Map<String, Integer> getCarMap(){
	    return carMap;
	}
	public void setCarMap(Map<String, Integer> carMap){
	    this.carMap = carMap;
	}
 
	public void addCar(String name,int num)
	{
		// Code here
		String key = name.toLowerCase();
		
		if(!carMap.containsKey(key)){
		    carMap.put(key, num);
		}
	}
	
	public int carByName(String name)
	{
		// Code here
		return carMap.getOrDefault(name.toLowerCase(), -1);
	}
	
	public List<String> carByCount(int count)
	{
		// Code here
		List<String> cars = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : carMap.entrySet()){
		    if(entry.getValue() >= count){
		        cars.add(entry.getKey());
		    }
		}
		return cars.isEmpty() ? null : cars ;
	}
	
	public int totalCarsSold()
	{
		// Code here
		int total = 0;
		for(int num : carMap.values()){
		    total += num;
		}
		return total;
	}
	
}