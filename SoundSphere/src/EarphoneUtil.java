import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EarphoneUtil {

	public Stream<Earphone> getEarphonesByBrandName(Stream<Earphone> earphoneStream, String brandName) {
		
		return earphoneStream.filter(x -> x.getBrandName().equals(brandName));
		
	}

	public List<Earphone> getEarphonesWithinPriceRange(Stream<Earphone> earphoneStream, double minimumPrice, double maximumPrice) {
		return
				earphoneStream.filter(x-> x.getPrice() >= minimumPrice && x.getPrice() <= maximumPrice).collect(Collectors.toList());
	}
}
