package resources;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Car {
    
    private Make make;
    private Model model;
    private int year;
    private int price;
    private int miles;
    private boolean isUsed;
    private Color color;
    
    public Car(Make make, Model model, int year, int price, int miles, boolean isUsed, Color color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.miles = miles;
        this.isUsed = isUsed;
        this.color = color;
    }
    
    /**
     * Don't crash!
     */
    public void testDrive() {
        this.miles += 10;
    }
    
    public void crash() {
        this.price = Math.min(this.price / 2, 1000);
        this.isUsed = true;
    }
    
    @Override
    public String toString() {
        String toReturn = isUsed ? "Used" : "New";
	    return toReturn + String.format("% d %s %s %s, Price: $%d, Miles: %d", this.year, colorMap.get(this.color), this.make, this.model, this.price, this.miles);
    }
    
    
    /**
     * @return the make
     */
    public Make getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(Make make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the miles
     */
    public int getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(int miles) {
        this.miles = miles;
    }

    /**
     * @return the isUsed
     */
    public boolean isUsed() {
        return isUsed;
    }

    /**
     * @param isUsed the isUsed to set
     */
    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    private static final Map<Color, String> colorMap = new HashMap<>();

    static {
       colorMap.put(Color.RED, "RED");
        colorMap.put(Color.BLUE, "BLUE");
        colorMap.put(Color.GREEN, "GREEN");
        colorMap.put(Color.YELLOW, "YELLOW");
        colorMap.put(Color.CYAN, "CYAN");
        colorMap.put(Color.MAGENTA, "MAGENTA");
        colorMap.put(Color.WHITE, "WHITE");
        colorMap.put(Color.BLACK, "BLACK");
        colorMap.put(Color.ORANGE, "ORANGE");
        colorMap.put(Color.PINK, "PINK");
        colorMap.put(Color.LIGHT_GRAY, "LIGHT_GRAY");
        colorMap.put(Color.DARK_GRAY, "DARK_GRAY");
        colorMap.put(Color.GRAY, "GRAY");
    }
    
    

}
