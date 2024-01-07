package Ex3;

public class Utilisateur extends Personne{
    private String login;
    private String password;
    private String service;
    private Profile profile;

    public Utilisateur(String nom, String prenom, String email,
                       String telephone, double salaire, String login, String password,
                       String service, Profile profile) {
        super(nom, prenom, email, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profile = profile;
    }
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public double calculerSalaire(){

        if(this.profile.getCode().equals("MN")) return this.salaire + 0.1 * this.salaire;
        if(this.profile.getCode().equals("DG")) return this.salaire + 0.4 * this.salaire;
        return this.salaire;
    }
    public void afficher(){
        super.afficher();
        System.out.println(" "+profile.getLibelle()+" "+ calculerSalaire());
    }
}
