import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		fruitBasketList.add(fbObj);


	}

    public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
        return fruitBasketStream
                .mapToInt(fb -> fb.getWeightInKgs() * fb.getPricePerKg())
                .sum();
    }

}
