// Written by Jürgen Moßgraber - mossgrabers.de
// (c) 2017-2018
// Licensed under LGPLv3 - http://www.gnu.org/licenses/lgpl-3.0.txt

package de.mossgrabers.framework.daw.data;

import de.mossgrabers.framework.daw.ObserverManagement;


/**
 * Interfacxe to a scene.
 *
 * @author J&uuml;rgen Mo&szlig;graber
 */
public interface IScene extends ObserverManagement
{
    /**
     * Get the index.
     *
     * @return The index
     */
    int getIndex ();


    /**
     * Does the slot exist?
     *
     * @return True if it exists
     */
    boolean doesExist ();


    /**
     * Get the name of the scene.
     *
     * @return The name of the scene
     */
    String getName ();


    /**
     * Get the name of the scene.
     *
     * @param limit Limit the text to this length
     * @return The name of the scene
     */
    String getName (int limit);


    /**
     * Is the slot selected?
     *
     * @return True if selected
     */
    boolean isSelected ();


    /**
     * Get the color of the channel.
     *
     * @return The color in RGB
     */
    double [] getColor ();


    /**
     * Set the color of the track as a RGB value.
     *
     * @param red The red part of the color
     * @param green The green part of the color
     * @param blue The blue part of the color
     */
    void setColor (double red, double green, double blue);

}