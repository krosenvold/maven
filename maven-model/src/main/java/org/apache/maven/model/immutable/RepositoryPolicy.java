// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model.immutable;

import java.util.Map;

public class RepositoryPolicy
{
    public final String enabled;
    public final String updatePolicy;
    public final String checksumPolicy;
    public final Map<Object, InputLocation> locations;

    public RepositoryPolicy( String enabled, String updatePolicy, String checksumPolicy,
                             Map<Object, InputLocation> locations )
    {
        this.enabled = enabled;
        this.updatePolicy = updatePolicy;
        this.checksumPolicy = checksumPolicy;
        this.locations = locations;
    }
}
