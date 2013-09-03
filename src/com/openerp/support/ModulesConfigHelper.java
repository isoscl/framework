/*
 * OpenERP, Open Source Management Solution
 * Copyright (C) 2012-today OpenERP SA (<http://www.openerp.com>)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * 
 */
package com.openerp.support;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ModulesConfigHelper.
 */
public class ModulesConfigHelper {

	/** The modules. */
	ArrayList<Module> modules = new ArrayList<Module>();

	/**
	 * Adds the module to list.
	 * 
	 * @param module
	 *            the module
	 */
	public void add(Module module) {
		modules.add(module);
	}

	/**
	 * Modules.
	 * 
	 * @return the array list
	 */
	public ArrayList<Module> modules() {
		return modules;
	}

}
