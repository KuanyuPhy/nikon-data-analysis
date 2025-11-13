public class MeasurementData {

    // 項目
    private final int itemId; 
    private final String itemName; 
    private final double measuredValue; 
    private final double standardValue;
    
    // measure - standard   
    private final double diffValue;


    public MeasurementData(int itemId, String itemName, double measuredValue,
                            double standardValue){
        this.itemId = itemId;
        this.itemName = itemName;
        this.measuredValue = measuredValue;
        this.standardValue = standardValue;

        this.diffValue = measuredValue - standardValue;
    }

    public int getItemID() { return itemId;}
    public String getItemName() { return itemName; }
    public double getMeasuredValue() { return measuredValue;}
    public double getStandardValue() {return standardValue;}
    

    public double getDiffValue() {return diffValue;}

    public String analyzeTolerance(){
        if (measuredValue > 1000){
            return "FAIL";
        }else{
            return "PASS";
        }
    }

    @Override
    public String toString(){
        return String.format(
            "Item %d (%s): Value=%.4f, Standard=%.4f, Diff=%.4f, Result=%s", 
            itemId, itemName, measuredValue, standardValue, diffValue, analyzeTolerance());
    }
}