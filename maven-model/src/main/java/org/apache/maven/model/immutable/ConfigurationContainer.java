// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model.immutable;

import java.util.Map;

public class ConfigurationContainer
{
    public final String inherited;
    public final Object configuration;
    public final Map<Object, InputLocation> locations;

    public ConfigurationContainer( String inherited, Object configuration, Map<Object, InputLocation> locations )
    {
        this.inherited = inherited;
        this.configuration = configuration;
        this.locations = locations;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        ConfigurationContainer that = (ConfigurationContainer) o;

        if ( configuration != null ? !configuration.equals( that.configuration ) : that.configuration != null )
        {
            return false;
        }
        if ( inherited != null ? !inherited.equals( that.inherited ) : that.inherited != null )
        {
            return false;
        }
        if ( locations != null ? !locations.equals( that.locations ) : that.locations != null )
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = inherited != null ? inherited.hashCode() : 0;
        result = 31 * result + ( configuration != null ? configuration.hashCode() : 0 );
        result = 31 * result + ( locations != null ? locations.hashCode() : 0 );
        return result;
    }
}
