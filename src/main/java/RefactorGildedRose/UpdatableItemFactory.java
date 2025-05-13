package RefactorGildedRose;

class UpdatableItemFactory {
    public static UpdatableItem create(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieItem(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassItem(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem(item);
            default:
                return new RegularItem(item);
        }
    }
}
