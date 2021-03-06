/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.swtbot.ui.page;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton;

/**
 * @author Terry Jia
 * @author Ashley Yuan
 */
public class View extends AbstractPart
{

    private final boolean isId;

    public View( SWTWorkbenchBot bot, String viewIdentifier )
    {
        this( bot, viewIdentifier, false );
    }

    public View( SWTWorkbenchBot bot, String identifier, boolean isId )
    {
        super( bot, identifier );

        this.isId = isId;
    }

    public void clickToolbarButton( String btnLabel )
    {
        toolbarBtn( btnLabel ).click();
    }

    protected SWTBotView getPart()
    {
        if( isId )
        {
            return ( (SWTWorkbenchBot) bot ).viewById( label );
        }
        else
        {
            return ( (SWTWorkbenchBot) bot ).viewByTitle( label );
        }
    }

    public SWTBotToolbarButton toolbarBtn( String btnLabel )
    {
        return getPart().toolbarButton( btnLabel );
    }

}
