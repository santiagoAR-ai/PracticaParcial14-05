package RefactorGildedRose;

class AgedBrieItem extends UpdatableItem {
    public AgedBrieItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        incrementQuality();
        item.sellIn--;
        if (item.sellIn < 0) {
            incrementQuality();
        }
    }

    protected void incrementQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
