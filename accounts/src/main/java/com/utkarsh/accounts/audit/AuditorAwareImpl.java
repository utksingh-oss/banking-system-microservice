package com.utkarsh.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditorAwareImpl implements AuditorAware<String> {
    private static final String ACCOUNTS_MS = "ACCOUNTS_MS";

    /**
     * Returns the current auditor of the application.
     * Leveraged by the Spring Data JPA's @CreatedAt & @CreatedBy Annotations
     *
     * @return the current auditor.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(ACCOUNTS_MS);
    }
}
