package dev.crowell.crowellchat.models;

import java.util.Objects;

public class ChatterModel {
    private Long id;
    private LoginRequestModel credentials;

    public ChatterModel() {
        this(null, null);
    }

    public ChatterModel(Long id, LoginRequestModel credentials) {
        this.id = id;
        this.credentials = credentials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoginRequestModel getCredentials() {
        return credentials;
    }

    public void setCredentials(LoginRequestModel credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatterModel that = (ChatterModel) o;
        return Objects.equals(id, that.id) && Objects.equals(credentials, that.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, credentials);
    }

    @Override
    public String toString() {
        return "ChatterModel{" +
                "id=" + id +
                ", credentials=" + credentials +
                '}';
    }
}
