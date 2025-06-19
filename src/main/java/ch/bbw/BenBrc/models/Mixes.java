package ch.bbw.BenBrc.models;
/**
 * Model class for Mixes.
 * This class represents a mix of substances, including its properties such as name, description, type, volume,
 * preparation date, and expiration date.
 * author: Benedict Brück
 * version: 1.0
 * date: 16.06.25
 */
public class Mixes {
    private int mixId;
    private String name;
    private String description;
    private String type; // e.g., "solution", "suspension", etc.
    private double volume; // in liters
    private String preparationDate; // date of preparation
    private String expirationDate; // date of expiration

    // Constructor
    public Mixes(int mixId,
                 String name,
                 String description,
                 String type,
                 double volume,
                 String preparationDate,
                 String expirationDate) {
        this.mixId = mixId;
        this.name = name;
        this.description = description;
        this.type = type;
        this.volume = volume;
        this.preparationDate = preparationDate;
        this.expirationDate = expirationDate;
    }

    // Getters
    public int getMixId() { return mixId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getType() { return type; }
    public double getVolume() { return volume; }
    public String getPreparationDate() { return preparationDate; }
    public String getExpirationDate() { return expirationDate; }

    // Setters
    public void setMixId(int mixId) { this.mixId = mixId; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setType(String type) { this.type = type; }
    public void setVolume(double volume) { this.volume = volume; }
    public void setPreparationDate(String preparationDate) { this.preparationDate = preparationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    @Override
    public String toString() {
        return "Mixes{" +
                "mixId=" + mixId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                ", preparationDate='" + preparationDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
