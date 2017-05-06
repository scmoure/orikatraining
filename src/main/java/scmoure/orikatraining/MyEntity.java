package scmoure.orikatraining;

/**
 * Created by Santi on 06/05/2017.
 */
public class MyEntity {

    private Long id;

    private Long version;

    private String code;

    private String libelle;

    private String description;

    private String otherData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "MyEntity{" +
                "id=" + id +
                ", version=" + version +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}
