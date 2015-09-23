/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package com.github.rustdt.ide.ui.text;
import org.eclipse.swt.graphics.RGB;

import melnorme.lang.ide.ui.text.coloring.ColoringItemPreference;

public interface RustColorPreferences {
	
	String PREFIX = "editor.coloring."; 
	
	// Defaults mostly based from "pre.rust." of http://static.rust-lang.org/doc/master/rust.css
	
	ColoringItemPreference DEFAULT = new ColoringItemPreference(PREFIX + "default",
		true, new RGB(0, 0, 0), false, false, false);
	
	ColoringItemPreference COMMENTS = new ColoringItemPreference(PREFIX + "comment",
		true, new RGB(0x8E, 0x90, 0x8C), false, false, false);
	ColoringItemPreference DOC_COMMENTS = new ColoringItemPreference(PREFIX + "doc_comment",
		true, new RGB(63, 95, 191), false, false, false);
	
	ColoringItemPreference STRINGS = new ColoringItemPreference(PREFIX + "string",
		true, new RGB(0x71, 0x8C, 0x00), false, false, false);
	ColoringItemPreference CHARACTER = new ColoringItemPreference(PREFIX + "character",
		true, new RGB(0x71, 0x8C, 0x00), false, false, false);
	ColoringItemPreference NUMBERS = new ColoringItemPreference(PREFIX + "number",
		true, new RGB(0x71, 0x8C, 0x00), false, false, false);
	
	ColoringItemPreference KEYWORDS = new ColoringItemPreference(PREFIX + "keyword",
		true, new RGB(0x89, 0x59, 0xA8), true, false, false);
	ColoringItemPreference KEYWORDS_VALUES = new ColoringItemPreference(PREFIX + "keyword_literals",
		true, new RGB(0x89, 0x59, 0xA8), false, false, false);
	ColoringItemPreference LIFETIME = new ColoringItemPreference(PREFIX + "lifetime",
		true, new RGB(0xB7, 0x65, 0x14), false, false, false);
	ColoringItemPreference ATTRIBUTE = new ColoringItemPreference(PREFIX + "attribute",
		true, new RGB(0xC8, 0x28, 0x29), false, false, false);
	ColoringItemPreference MACRO_CALL = new ColoringItemPreference(PREFIX + "macro_call",
		true, new RGB(0x3E, 0x99, 0x9F), false, false, false);
	
}