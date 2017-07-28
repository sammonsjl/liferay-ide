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

package com.liferay.ide.swtbot.liferay.ui.page.dialog;

import org.eclipse.swtbot.swt.finder.SWTBot;

import com.liferay.ide.swtbot.ui.page.SelectionDialog;

/**
 * @author Li Lu
 */
public class TempalteSelectionDialog extends SelectionDialog
{

    public TempalteSelectionDialog( SWTBot bot )
    {
        super( bot );
    }

    public boolean containsItem( String... items )
    {
        return getSelcetFileTree().hasTreeItem( items );
    }

    public String getValidationMsg()
    {
        return bot.clabel().getText();
    }

    public void select( String... items )
    {
        getSelcetFileTree().selectTreeItem( items );
    }

}