package Ex3;

public class Profile {
    private int id;
    private String code;
    private String libelle;
    private static int comp;
    public Profile(String code, String libelle) {
        comp++;
        this.id = comp;
        this.code = code;
        this.libelle = libelle;
    }
    public Profile(){
        comp++;
        this.id = comp;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
