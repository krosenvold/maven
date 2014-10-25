// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model.immutable;

import java.util.List;
import java.util.Map;

/**
 * Section for management of default dependency information for use
 * in a group of
 *         POMs.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class DependencyManagement
{

    private java.util.List<Dependency> dependencies;
    private java.util.Map<Object, InputLocation> locations;


    public DependencyManagement( List<Dependency> dependencies, Map<Object, InputLocation> locations )
    {
        this.dependencies = dependencies;
        this.locations = locations;
    }
}
