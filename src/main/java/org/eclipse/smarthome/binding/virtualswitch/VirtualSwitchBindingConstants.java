/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.virtualswitch;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link VirtualSwitchBinding} class defines common constants, which are 
 * used across the whole binding.
 * 
 * @author Moritz Kammerer - Initial contribution
 */
public class VirtualSwitchBindingConstants {

    public static final String BINDING_ID = "virtualswitch";
    
    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_SAMPLE = new ThingTypeUID(BINDING_ID, "sample");

    // List of all Channel ids
    public final static String VIRTUAL_SWITCH_CHANNEL = "virtual_switch";

}
