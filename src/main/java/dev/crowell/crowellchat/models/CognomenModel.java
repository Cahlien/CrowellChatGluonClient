package dev.crowell.crowellchat.models;

import java.util.Objects;

public class CognomenModel {
    private Long id;
    private String value;

    public CognomenModel() {
        this(null, null);
    }

    public CognomenModel(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CognomenModel that = (CognomenModel) o;
        return Objects.equals(id, that.id) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

    @Override
    public String toString() {
        return "CognomenModel{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}