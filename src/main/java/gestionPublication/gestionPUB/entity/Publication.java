package gestionPublication.gestionPUB.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private Date date;
    private String versionNum;
    private String resume;
    private String categorie;
    private String discipline;

    @ManyToMany(mappedBy = "publication")
    private List<Auteur> auteurs;


    public Publication() {
    }

    public Publication(Long id, String titre, Date date, String versionNum, String resume, String categorie, String discipline) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.versionNum = versionNum;
        this.resume = resume;
        this.categorie = categorie;
        this.discipline = discipline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
