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

import com.liferay.ide.swtbot.ui.eclipse.page.TreeDialog;
import com.liferay.ide.swtbot.ui.page.Table;
import com.liferay.ide.swtbot.ui.page.Text;

import org.eclipse.swtbot.swt.finder.SWTBot;

/**
 * @author Ashley Yuan
 */
public class InterfaceSelectionDialog extends TreeDialog
{

    private Text itemToOpen;
    private Table matchItems;

    public InterfaceSelectionDialog( SWTBot bot )
    {
        super( bot );

        itemToOpen = new Text( bot );
        matchItems = new Table( bot );
    }

    public Text getItemToOpen()
    {
        return itemToOpen;
    }

    public Table getMatchItems()
    {
        return matchItems;
    }

}
