package wfm.tenant.ControlCenter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "locale")
public class Locale {
    @Id
    @Column(name = "localeid", nullable = false, length = 10)
    private String localeId;

    @Column(name = "name", nullable = false, length = 32)
    private String localeName;

}