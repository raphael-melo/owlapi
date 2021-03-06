/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, Ulm University
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, Ulm University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.uulm.ecs.ai.owlapi.krssparser;

import org.semanticweb.owlapi.model.OWLOntologyFormat;

/**
 *
 * Author: Olaf Noppens<br>
 * Ulm University<br>
 * Institute of Artificial Intelligence<br>
 */
@SuppressWarnings("javadoc")
public class KRSS2OntologyFormat extends OWLOntologyFormat {
    private static final long serialVersionUID = 30405L;
    public static final String IGNORE_ONTOLOGYURI = "ignoreOntologyURI";

    @Override
	public String toString() {
        return "KRSS2 Syntax";
    }

    public boolean isIgnoreOntologyURI() {
        return (Boolean) getParameter(IGNORE_ONTOLOGYURI, false);
    }

    public void setIgnoreOntologyURI(boolean ignore) {
        setParameter(IGNORE_ONTOLOGYURI, ignore);
    }
}