import java.util.*;

public class Products {

	private List<String> productList=new ArrayList<String>();


	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public void addProductToList(String product)
	{
		productList.add(product);
	}
	
	public void sortProductList()
	{
		Collections.sort(productList);
	}
}