package RefactorGildedRose;

class RegularItem extends UpdatableItem {
    public RegularItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decrementQuality();
        item.sellIn--;
        if (item.sellIn < 0) {
            decrementQuality();
        }
    }

    protected void decrementQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
