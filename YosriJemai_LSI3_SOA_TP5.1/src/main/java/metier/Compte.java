package metier;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;
// Classe représentant un compte
//@WebService
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private int solde;
    private Date dateCreation;

    public Compte() {}

    public Compte(int code, int solde, Date dateCreation) {
        super();
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
