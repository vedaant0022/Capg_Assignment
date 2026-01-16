public class SteelBero extends Bero {

    private int beroHeight;

    public SteelBero(String beroType, String beroColour, int beroHeight) {
        super(beroType, beroColour);
        this.beroHeight = beroHeight;
    }

    public int getBeroHeight() {
        return beroHeight;
    }

    public void setBeroHeight(int beroHeight) {
        this.beroHeight = beroHeight;
    }

    @Override
    public void calculatePrice() {
        if (beroHeight == 3) {
            setPrice(5000);
        } else if (beroHeight == 5) {
            setPrice(8000);
        } else if (beroHeight == 7) {
            setPrice(10000);
        }
    }
}
