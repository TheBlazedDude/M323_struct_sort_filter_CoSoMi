package ch.bbw.BenBrc.models;

import java.util.Date;
import java.util.List;

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
    private List<Solutions> components;
    private Date preparationDate; // date of preparation
    private Date expirationDate; // date of expiration

    // Constructor
    public Mixes(int mixId,
                 String name,
                 String description,
                 String type,
                 double volume,
                 List<Solutions> components,
                 Date preparationDate,
                 Date expirationDate) {
        this.mixId = mixId;
        this.name = name;
        this.description = description;
        this.type = type;
        this.volume = volume;
        this.components = components;
        this.preparationDate = preparationDate;
        this.expirationDate = expirationDate;
    }


    // Getters
    public int getMixId() { return mixId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getType() { return type; }
    public double getVolume() { return volume; }
    public List<Solutions> getComponents() { return components; }
    public Date getPreparationDate() { return preparationDate; }
    public Date getExpirationDate() { return expirationDate; }

    // Setters
    public void setMixId(int mixId) { this.mixId = mixId; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setType(String type) { this.type = type; }
    public void setVolume(double volume) { this.volume = volume; }
    public void setComponents(List<Solutions> components) { this.components = components; }
    public void setPreparationDate(Date preparationDate) { this.preparationDate = preparationDate; }
    public void setExpirationDate(Date expirationDate) { this.expirationDate = expirationDate; }

    @Override
    public String toString() {
        return "Mixes{" +
                "mixId=" + mixId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                ", components=" + components + '\'' +
                ", preparationDate='" + preparationDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
