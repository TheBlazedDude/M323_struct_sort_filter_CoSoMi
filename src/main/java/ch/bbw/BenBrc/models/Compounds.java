package ch.bbw.BenBrc.models;

import java.util.*;
/**
 * Model class for chemical compounds.
 * This class represents a chemical compound with various properties such as name, formula, CAS number, description,
 * pubChemId, molecular weight, InChI key, InChI, SMILES notation, creation date, and IUPAC name.
 * author: Benedict Brück
 * version: 1.0
 * date: 13.06.25
 */
public class Compounds {
    private Integer compound_CID;
    private String name;
    private String formula;
    private String casNumber;
    private String description;
    private String pubChemId;
    private String MolecularWeight;
    private String InChIKey;
    private String InChI;
    private String SMILES;
    private Date createdAt;
    private String IUPACName;

    // constructor
    public Compounds(int compound_CID,
                     String name,
                     String formula,
                     String casNumber,
                     String description,
                     String pubChemId,
                     String molecularWeight,
                     String inChIKey,
                     String inChI,
                     String SMILES,
                     Date createdAt,
                     String IUPACName) {
        this.compound_CID = compound_CID;
        this.name = name;
        this.formula = formula;
        this.casNumber = casNumber;
        this.description = description;
        this.pubChemId = pubChemId;
        this.MolecularWeight = molecularWeight;
        this.InChIKey = inChIKey;
        this.InChI = inChI;
        this.SMILES = SMILES;
        this.createdAt = createdAt;
        this.IUPACName = IUPACName;
    }

    // Getters
    public String getCasNumber() {return casNumber;}
    public Date getCreatedAt() {return createdAt;}
    public Integer getCompound_CID() {return compound_CID;}
    public String getDescription() {return description;}
    public String getFormula() {return formula;}
    public String getInChI() {return InChI;}
    public String getInChIKey() {return InChIKey;}
    public String getIUPACName() {return IUPACName;}
    public String getMolecularWeight() {return MolecularWeight;}
    public String getName() {return name;}
    public String getPubChemId() {return pubChemId;}
    public String getSMILES() {return SMILES;}

    // Setters
    public void setCasNumber(String casNumber) {this.casNumber = casNumber;}
    public void setCreatedAt(Date createdAt) {this.createdAt = createdAt;}
    public void setCompound_CID(Integer compound_CID) {this.compound_CID = compound_CID;}
    public void setDescription(String description) {this.description = description;}
    public void setFormula(String formula) {this.formula = formula;}
    public void setInChI(String inChI) {this.InChI = inChI;}
    public void setInChIKey(String inChIKey) {InChIKey = inChIKey;}
    public void setIUPACName(String IUPACName) {this.IUPACName = IUPACName;}
    public void setMolecularWeight(String molecularWeight) {MolecularWeight = molecularWeight;}
    public void setName(String name) {this.name = name;}
    public void setPubChemId(String pubChemId) {this.pubChemId = pubChemId;}
    public void setSMILES(String SMILES) {this.SMILES = SMILES;}

    @Override
    public String toString() {
        return "Compounds{" +
                "compound_CID=" + compound_CID +
                ", name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", casNumber='" + casNumber + '\'' +
                ", description='" + description + '\'' +
                ", pubChemId='" + pubChemId + '\'' +
                ", MolecularWeight='" + MolecularWeight + '\'' +
                ", InChIKey='" + InChIKey + '\'' +
                ", InChI='" + InChI + '\'' +
                ", SMILES='" + SMILES + '\'' +
                ", createdAt=" + createdAt +
                ", IUPACName='" + IUPACName + '\'' +
                '}';
    }
}
