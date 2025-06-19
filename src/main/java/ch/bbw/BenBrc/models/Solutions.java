package ch.bbw.BenBrc.models;

import java.util.*;
/**
 * Model class for chemical solutions.
 * This class represents a chemical solution with various properties such as CID, name, molecular formula, molecular weight,
 * molecular mass, SMILES notation, IUPAC name, synonyms, InChI key, and classification.
 * author: Benedict Brück
 * version: 1.0
 * date: 13.06.25
 */
public class Solutions {
    private int cid;
    private String name;
    private String molecularFormula;
    private double molecularWeight;
    private double molecularMass; // NEW
    private String smiles;
    private String iupacName;
    private List<String> synonyms;
    private String inchiKey;
    private String classification;

    // Constructor
    public Solutions(int cid,
                     String name,
                     String molecularFormula,
                     double molecularWeight,
                    double molecularMass,
                     String smiles,
                     String iupacName,
                     List<String> synonyms,
                     String inchiKey,
                     String classification) {
        this.cid = cid;
        this.name = name;
        this.molecularFormula = molecularFormula;
        this.molecularWeight = molecularWeight;
        this.molecularMass = molecularMass;
        this.smiles = smiles;
        this.iupacName = iupacName;
        this.synonyms = synonyms;
        this.inchiKey = inchiKey;
        this.classification = classification;
    }

    // Getters and Setters
    public int getCid() { return cid; }
    public String getName() { return name; }
    public String getMolecularFormula() { return molecularFormula; }
    public double getMolecularWeight() { return molecularWeight; }
    public double getMolecularMass() { return molecularMass; } // NEW
    public String getSmiles() { return smiles; }
    public String getIupacName() { return iupacName; }
    public List<String> getSynonyms() { return synonyms; }
    public String getInchiKey() { return inchiKey; }
    public String getClassification() { return classification; }

    // Setters
    public void setCid(int cid) { this.cid = cid; }
    public void setName(String name) { this.name = name; }
    public void setMolecularFormula(String molecularFormula) { this.molecularFormula = molecularFormula; }
    public void setMolecularWeight(double molecularWeight) { this.molecularWeight = molecularWeight; }
    public void setMolecularMass(double molecularMass) { this.molecularMass = molecularMass; } // NEW
    public void setSmiles(String smiles) { this.smiles = smiles; }
    public void setIupacName(String iupacName) { this.iupacName = iupacName; }
    public void setSynonyms(List<String> synonyms) { this.synonyms = synonyms; }
    public void setInchiKey(String inchiKey) { this.inchiKey = inchiKey; }
    public void setClassification(String classification) { this.classification = classification; }

    @Override
    public String toString() {
        return "Solutions{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", molecularFormula='" + molecularFormula + '\'' +
                ", molecularWeight=" + molecularWeight +
                ", molecularMass=" + molecularMass + // NEW
                ", smiles='" + smiles + '\'' +
                ", iupacName='" + iupacName + '\'' +
                ", synonyms=" + synonyms +
                ", inchiKey='" + inchiKey + '\'' +
                ", classification='" + classification + '\'' +
                '}';
    }
}
