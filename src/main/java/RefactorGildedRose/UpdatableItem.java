package RefactorGildedRose;

abstract class UpdatableItem {
    protected Item item;

    public UpdatableItem(Item item) {
        this.item = item;
    }

    public abstract void update();
}
