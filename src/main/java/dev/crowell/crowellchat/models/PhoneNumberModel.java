package dev.crowell.crowellchat.models;

import java.util.Objects;

public class PhoneNumberModel {
    private Long id;
    private String countryCode;
    private String areaCode;
    private String regionCode;
    private String lineNumber;
    private String extension;

    public PhoneNumberModel() {
        this(null, null, null, null, null, null);
    }

    public PhoneNumberModel(Long id, String countryCode, String areaCode, String regionCode, String lineNumber, String extension) {
        this.id = id;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.regionCode = regionCode;
        this.lineNumber = lineNumber;
        this.extension = extension;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumberModel that = (PhoneNumberModel) o;
        return Objects.equals(id, that.id) && Objects.equals(countryCode, that.countryCode) && Objects.equals(areaCode, that.areaCode) && Objects.equals(regionCode, that.regionCode) && Objects.equals(lineNumber, that.lineNumber) && Objects.equals(extension, that.extension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryCode, areaCode, regionCode, lineNumber, extension);
    }

    @Override
    public String toString() {
        return "PhoneNumberModel{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", lineNumber='" + lineNumber + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
