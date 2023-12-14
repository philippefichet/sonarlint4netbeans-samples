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

import java.util.function.Consumer;
/**
 *
 * @author FICHET Philippe &lt;philippe.fichet@laposte.net&gt;
 */
@SuppressWarnings({"java:S5612", "java:S106"})
public class TriesRules {
    public static void main(String[] a) {
        t((Object ... args) -> {
            System.err.println("error");

            for (Object arg : args) {
                if (arg instanceof Exception) {
                    Exception engineIOException = ((Exception) arg);
                    System.err.println("error : message " + engineIOException.getMessage());
                } else {
                    System.err.println("error : arg " + arg);
                }
            }
        });
        System.getenv().forEach((String k, String v) -> {
            System.out.println("env " + k + " : " + v);
        });
        
    }
    
    
    public static void t(Consumer<Object[]> consumer) {
        consumer.accept(new Object[] {});
    }
}
