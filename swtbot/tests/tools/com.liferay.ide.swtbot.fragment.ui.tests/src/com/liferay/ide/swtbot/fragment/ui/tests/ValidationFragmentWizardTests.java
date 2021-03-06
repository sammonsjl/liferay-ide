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

package com.liferay.ide.swtbot.fragment.ui.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.liferay.ide.swtbot.liferay.ui.SwtbotBase;
import com.liferay.ide.swtbot.liferay.ui.page.wizard.project.NewFragmentWizard;
import com.liferay.ide.swtbot.liferay.ui.util.ValidationMsg;

import java.io.File;
import java.io.IOException;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Vicky Wang
 * @author Ying Xu
 */
public class ValidationFragmentWizardTests extends SwtbotBase
{

    static String fullClassname = new SecurityManager()
    {

        public String getClassName()
        {
            return getClassContext()[1].getName();
        }
    }.getClassName();

    static String currentClassname = fullClassname.substring( fullClassname.lastIndexOf( '.' ) ).substring( 1 );

    NewFragmentWizard newFragmentWizard = new NewFragmentWizard( bot );

    @BeforeClass
    public static void init() throws IOException
    {
        Assume.assumeTrue( currentClassname.equals( runTest ) || runAllTests() );
    }

    @Test
    public void validationProjectName()
    {
        wizardAction.openNewFragmentWizard();

        for( ValidationMsg msg : getValidationMsgs(
            new File( getValidationFolder(), "new-fragment-wizard-project-name.csv" ) ) )
        {
            newFragmentWizard.getProjectName().setText( msg.getInput() );

            assertEquals( msg.getExpect(), wizardAction.getValidationMsg( 2 ) );
        }

        wizardAction.cancel();
    }

    @Test
    public void checkBuildType()
    {
        final String[] expectedBuildTypes = { GRADLE, MAVEN };

        wizardAction.openNewFragmentWizard();

        final String[] buildTypes = newFragmentWizard.getBuildTypes().items();

        assertEquals( expectedBuildTypes.length, buildTypes.length );

        for( int i = 0; i < buildTypes.length; i++ )
        {
            assertTrue( buildTypes[i].equals( expectedBuildTypes[i] ) );
        }

        wizardAction.cancel();
    }

}
