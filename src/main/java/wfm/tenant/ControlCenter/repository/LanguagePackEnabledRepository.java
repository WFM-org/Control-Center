package wfm.tenant.ControlCenter.repository;

import io.micrometer.common.lang.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wfm.tenant.ControlCenter.entity.LanguagePackEnabled;
import wfm.tenant.ControlCenter.entity.LanguagePackEnabledId;
import wfm.tenant.ControlCenter.projection.LanguagePackEnabledProjection;

import java.util.List;
import java.util.UUID;

@Repository
public interface LanguagePackEnabledRepository extends JpaRepository<LanguagePackEnabled, LanguagePackEnabledId> {

    @Query("SELECT l FROM LanguagePackEnabled l WHERE l.tenant.id = :tenant_id")
    List<LanguagePackEnabledProjection> findLanguagePacksByTenantId(@Param("tenant_id") UUID tenantId);

    boolean existsById(@NonNull LanguagePackEnabledId id);
}
