// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.8.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model.immutable;

import java.util.List;
import java.util.Map;

/**
 * Contains the plugins informations for the project.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class PluginContainer
{
    public final java.util.List<Plugin> plugins;
    public final java.util.Map<Object, InputLocation> locations;

    public PluginContainer( List<Plugin> plugins, Map<Object, InputLocation> locations )
    {
        this.plugins = plugins;
        this.locations = locations;
    }
}
