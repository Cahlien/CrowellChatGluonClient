package dev.crowell.crowellchat.models;

import java.util.Objects;

public class EmailAddressModel {
    private Long id;
    private String accountName;
    private String domainName;
    private String topLevelDomain;

    public EmailAddressModel() {
        this(null, null, null, null);
    }

    public EmailAddressModel(Long id, String accountName, String domainName, String topLevelDomain) {
        this.id = id;
        this.accountName = accountName;
        this.domainName = domainName;
        this.topLevelDomain = topLevelDomain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddressModel that = (EmailAddressModel) o;
        return Objects.equals(id, that.id) && Objects.equals(accountName, that.accountName) && Objects.equals(domainName, that.domainName) && Objects.equals(topLevelDomain, that.topLevelDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountName, domainName, topLevelDomain);
    }

    @Override
    public String toString() {
        return "EmailAddressModel{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", domainName='" + domainName + '\'' +
                ", topLevelDomain='" + topLevelDomain + '\'' +
                '}';
    }
}
