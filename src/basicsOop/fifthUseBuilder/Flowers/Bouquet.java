package basicsOop.fifthUseBuilder.Flowers;

import basicsOop.fifthUseBuilder.Wrappings.Wrap;

public class Bouquet {

    private final FlowerType type;
    private final int flowers;
    private final Wrap wrap;
    private boolean isDecor;

    public Bouquet(FlowerType type, int flowers, Wrap wrap,boolean decor) {
        this.type = type;
        this.flowers = flowers;
        this.wrap = wrap;
        this.isDecor = decor;
    }

    public FlowerType getType() {
        return type;
    }

    public int getFlowers() {
        return flowers;
    }

    public Wrap getWrap() {
        return wrap;
    }

    public boolean isDecor() {
        return isDecor;
    }

    public void setDecor(boolean decor) {
        isDecor = decor;
    }

    public String print() {
        return "||" +
                "type=" + type +
                ", flowers=" + flowers +
                ", wrap=" + wrap +
                ", isDecor=" + isDecor +
                "||";
    }
}
