/*
 * sonarlint4netbeans-sample-mavenproject: Sample for SonarLint integration for Apache Netbeans
 * Copyright (C) 2023 Philippe FICHET.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package com.mycompany.mavenproject1;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * 
 * @author FICHET Philippe &lt;philippe.fichet@laposte.net&gt;
 */
public class JUnit4WithTestCaseTest extends TestCase {

    public void tryTest()
    {
        Assert.assertTrue(true);
    }

    // standalone java:S1123 and java:S1133 issues
    @Deprecated
    public void testTry()
    {
        
    }

    // standalone java:S1186 and java:S1845
    public void testtry()
    {
        
    }

    // standalone java:S1186
    public void testimonial()
    {
        
    }
    
}
