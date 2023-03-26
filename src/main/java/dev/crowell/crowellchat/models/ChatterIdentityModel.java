package dev.crowell.crowellchat.models;

import java.util.LinkedList;
import java.util.Objects;

public class ChatterIdentityModel {
    private Long id;
    private LinkedList<PraenomenModel> givenNames;
    private CognomenModel surname;
    private ContactInformationModel contactInformation;

    public ChatterIdentityModel() {
        this(null, null, null, null);
    }

    public ChatterIdentityModel(Long id, LinkedList<PraenomenModel> givenNames, CognomenModel surname, ContactInformationModel contactInformation) {
        this.id = id;
        this.givenNames = givenNames;
        this.surname = surname;
        this.contactInformation = contactInformation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LinkedList<PraenomenModel> getGivenNames() {
        return givenNames;
    }

    public void setGivenNames(LinkedList<PraenomenModel> givenNames) {
        this.givenNames = givenNames;
    }

    public CognomenModel getSurname() {
        return surname;
    }

    public void setSurname(CognomenModel surname) {
        this.surname = surname;
    }

    public ContactInformationModel getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformationModel contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatterIdentityModel that = (ChatterIdentityModel) o;
        return Objects.equals(id, that.id) && Objects.equals(givenNames, that.givenNames) && Objects.equals(surname, that.surname) && Objects.equals(contactInformation, that.contactInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, givenNames, surname, contactInformation);
    }

    @Override
    public String toString() {
        return "ChatterIdentityModel{" +
                "id=" + id +
                ", givenNames=" + givenNames +
                ", surname=" + surname +
                ", contactInformation=" + contactInformation +
                '}';
    }
}
