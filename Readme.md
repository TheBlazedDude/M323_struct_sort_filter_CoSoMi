# M323_sort_struct_data

## Specification
- generate test data (at least 100 entries, should use multiple classes, and have at least 1 complex class)
- create services to handle(sort) the data
- sort the data by different fields (use stream.limit(5)) to get the first 5 entries
- the Readme.md should contain information about the data structure, the services, and how to run the application (especially how to generate Data and sort it)
- the application should run in an IDE like Pycharm or VSCode and outputs directly to the console

## Idea

- since i work at EAWAG (Institute for Water & Environment Quality), i should be able to create test data that represents possible Chemical compounds, Solutions, and Mixtures
- compounds have different attributes:
  -  public Integer compound_CID
  -  public String name
  -  public String formula
  -  public String casNumber
  -  public String description
  -  public String pubChemId
  -  public String MolecularWeight
  -  public String InChIKey
  -  public String InChI
  -  public String SMILES
  -  public Date createdAt
  -  public String IUPACName
- Solutions have different attributes:
  -  private int cid
  -  private String name
  -  private String molecularFormula
  -  private double molecularWeight
  -  private double molecularMass
  -  private String smiles
  -  private String iupacName
  -  private List<String> synonyms
  -  private String inchiKey
  -  private String classification