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

/**
 *
 * @author FICHET Philippe &lt;philippe.fichet@laposte.net&gt;
 */
public class TotoTest {

    public static final String ttt = ";";
    
    /**
     * @param ttt testes
     * @return test
     */
    public void test2()
    {
        new NewClass().deprecatedMethod();
        
        
        boolean condition1 = false;
        boolean condition2 = true;
        boolean condition3 = true;
        boolean condition4 = false;
        boolean condition5 = true;

        int i = 0; int j = 1;
        
        if (((condition1 && condition2) || (condition3 && condition4)) && condition5) {

        }
        
        if (condition2) {
            if (condition1) {
                
            }
        }
        
    }
    
    public void test()
    {
        System.out.println("test");
        // Test
        
    }
}
