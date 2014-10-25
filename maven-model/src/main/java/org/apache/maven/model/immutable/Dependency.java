// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model.immutable;

import java.util.List;
import java.util.Map;

/**
 * 
 *         
 *         The <code>&lt;dependency&gt;</code> element contains
 * information about a dependency
 *         of the project.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Dependency
{

    private String groupId;
    private String artifactId;
    private String version;
    private String type = "jar";
    private String classifier;
    private String scope;
    private String systemPath;
    private java.util.List<Exclusion> exclusions;
    private String optional;
    private java.util.Map<Object, InputLocation> locations;

    public Dependency( String groupId, String artifactId, String version, String type, String classifier, String scope,
                        String systemPath, List<Exclusion> exclusions, String optional,
                        Map<Object, InputLocation> locations )
    {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.type = type;
        this.classifier = classifier;
        this.scope = scope;
        this.systemPath = systemPath;
        this.exclusions = exclusions;
        this.optional = optional;
        this.locations = locations;
    }

    public static Dependency createDependency( String groupId, String artifactId, String version, String type,
                                               String classifier, String scope, String systemPath,
                                               List<Exclusion> exclusions, String optional,
                                               Map<Object, InputLocation> locations )
    {
        return new Dependency( groupId, artifactId, version, type, classifier, scope, systemPath, exclusions, optional,
                               locations );
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

        Dependency that = (Dependency) o;

        if ( artifactId != null ? !artifactId.equals( that.artifactId ) : that.artifactId != null )
        {
            return false;
        }
        if ( classifier != null ? !classifier.equals( that.classifier ) : that.classifier != null )
        {
            return false;
        }
        if ( exclusions != null ? !exclusions.equals( that.exclusions ) : that.exclusions != null )
        {
            return false;
        }
        if ( groupId != null ? !groupId.equals( that.groupId ) : that.groupId != null )
        {
            return false;
        }
        if ( optional != null ? !optional.equals( that.optional ) : that.optional != null )
        {
            return false;
        }
        if ( scope != null ? !scope.equals( that.scope ) : that.scope != null )
        {
            return false;
        }
        if ( systemPath != null ? !systemPath.equals( that.systemPath ) : that.systemPath != null )
        {
            return false;
        }
        if ( type != null ? !type.equals( that.type ) : that.type != null )
        {
            return false;
        }
        if ( version != null ? !version.equals( that.version ) : that.version != null )
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = groupId != null ? groupId.hashCode() : 0;
        result = 31 * result + ( artifactId != null ? artifactId.hashCode() : 0 );
        result = 31 * result + ( version != null ? version.hashCode() : 0 );
        result = 31 * result + ( type != null ? type.hashCode() : 0 );
        result = 31 * result + ( classifier != null ? classifier.hashCode() : 0 );
        result = 31 * result + ( scope != null ? scope.hashCode() : 0 );
        result = 31 * result + ( systemPath != null ? systemPath.hashCode() : 0 );
        result = 31 * result + ( exclusions != null ? exclusions.hashCode() : 0 );
        result = 31 * result + ( optional != null ? optional.hashCode() : 0 );
        return result;
    }
}
