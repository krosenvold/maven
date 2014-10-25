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
 *         The <code>&lt;execution&gt;</code> element contains
 * informations required for the
 *         execution of a plugin.
 *         
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class PluginExecution
    extends ConfigurationContainer
{

    public final String id;
    public final  String phase;
    public final java.util.List<String> goals;

    public PluginExecution( String inherited, Object configuration, Map<Object, InputLocation> locations, String id,
                            String phase, List<String> goals )
    {
        super( inherited, configuration, locations );
        this.id = id;
        this.phase = phase;
        this.goals = goals;
    }
}
