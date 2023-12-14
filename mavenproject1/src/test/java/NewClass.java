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
// standalone java:S1598
package com.mycompany.mavenproject1;

public class NewClass {
    private static String resource;
    public static final String const_convition_violation = "TEST";

    /**
     * 
     * @deprecated
     */
    @Deprecated
    public void deprecatedMethod() {}

    public void MethodName_Convention_Violation() {}

    // FIXME test
    public static String getInstance() {
        if (resource == null) {
            synchronized (NewClass.class) {
                if (resource == null)
                    resource = "";
            }
        }
        return resource;
    }
    
    public static void lambdaTest()
    {
        String t = "toto";
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(t.trim());
            }
        };
        new Thread(r).start();
    }
    
    public static void tooManyParameter(int param1, int param2, int param3, String param4, long param5, int param6, int param7, int param8, String param9) {
        System.out.println("test");
    }
}
