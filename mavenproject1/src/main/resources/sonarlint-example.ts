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
import A from 'a';      // Noncompliant, A isn't used
import { B1 } from 'b';

console.log(B1);

let x = (y / 2 + 1);

if (a && ((x+y > 0))) {

}

return ((x + 1));

var x = 1;; // Noncompliant

function foo() {
};  // Noncompliant
