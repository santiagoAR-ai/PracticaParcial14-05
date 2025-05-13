package RefactorGildedRose;

class BackstagePassItem extends UpdatableItem {
    public BackstagePassItem(Item item) {
        super(item);
    }

    @Override
    public void update() {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < 50) item.quality++;
            if (item.sellIn < 6 && item.quality < 50) item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
