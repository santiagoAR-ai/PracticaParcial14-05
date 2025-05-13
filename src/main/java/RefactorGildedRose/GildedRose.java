package RefactorGildedRose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdatableItem updatable = UpdatableItemFactory.create(item);
            updatable.update();
        }
    }
}

