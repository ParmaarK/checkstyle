////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2018 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.coding;

import com.puppycrawl.tools.checkstyle.StatelessCheck;

/**
 * <p>
 * Checks that an overriding clone() method invokes super.clone().
 * Does not check native methods, as they have no possible java defined implementation.
 * </p>
 * <p>
 * Reference:<a
 * href="https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone--">
 * Object.clone</a>.
 * </p>
 * <p>
 * An example of how to configure the check is:
 * </p>
 * <pre>
 * &lt;module name="SuperClone"/&gt;
 * </pre>
 */
@StatelessCheck
public class SuperCloneCheck extends AbstractSuperCheck {

    @Override
    protected String getMethodName() {
        return "clone";
    }

}
