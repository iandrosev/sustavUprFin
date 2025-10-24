package entities;
import java.math.BigDecimal;

public class Item {
    private String itemName;
    private BigDecimal cijena;

    public Item( String itemName, BigDecimal cijena){
        this.itemName = itemName;
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
}
