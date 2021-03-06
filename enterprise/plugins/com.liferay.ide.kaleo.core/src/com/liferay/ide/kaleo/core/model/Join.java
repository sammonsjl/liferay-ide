/**
 * Copyright (c) 2014 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the End User License
 * Agreement for Liferay IDE ("License"). You may not use this file
 * except in compliance with the License. You can obtain a copy of the License
 * by contacting Liferay, Inc. See the License for the specific language
 * governing permissions and limitations under the License, including but not
 * limited to distribution rights of the Software.
 */
package com.liferay.ide.kaleo.core.model;

import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.modeling.annotations.Image;

/**
 * @author Gregory Amerson
 */
@Image( path = "images/join_16x16.png" )
public interface Join extends ActionTimer, MustTransition
{

    ElementType TYPE = new ElementType( Join.class );

}
