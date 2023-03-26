package dev.crowell.crowellchat.models;

import java.util.Objects;

public class ContactInformationModel {
    private Long id;
    private EmailAddressModel emailAddress;
    private PhoneNumberModel phoneNumber;

    public ContactInformationModel() {
        this(null, null, null);
    }

    public ContactInformationModel(Long id, EmailAddressModel emailAddress, PhoneNumberModel phoneNumber) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmailAddressModel getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddressModel emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PhoneNumberModel getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumberModel phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInformationModel that = (ContactInformationModel) o;
        return Objects.equals(id, that.id) && Objects.equals(emailAddress, that.emailAddress) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emailAddress, phoneNumber);
    }

    @Override
    public String toString() {
        return "ContactInformationModel{" +
                "id=" + id +
                ", emailAddress=" + emailAddress +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
