package wfm.tenant.ControlCenter.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AssignLanguagePackDTO {

    @NotNull(message = "Tenant ID cannot be null")
    private UUID id;

    @NotNull(message = "Language Pack ID cannot be null")
    private String languagePackId;
}

