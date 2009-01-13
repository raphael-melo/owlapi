package org.coode.owl.owlxmlparser;

import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClassExpression;
import org.semanticweb.owl.model.OWLClass;

import java.util.Set;
import java.util.HashSet;
/*
 * Copyright (C) 2007, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 10-Apr-2007<br><br>
 */
public class OWLDisjointUnionElementHandler extends AbstractOWLAxiomElementHandler {

    private OWLClass cls;

    private Set<OWLClassExpression> classExpressions;

    public OWLDisjointUnionElementHandler(OWLXMLParserHandler handler) {
        super(handler);
        classExpressions = new HashSet<OWLClassExpression>();
    }


    protected OWLAxiom createAxiom() throws OWLXMLParserException {
        return getOWLDataFactory().getOWLDisjointUnionAxiom(cls, classExpressions);
    }


    public void handleChild(AbstractOWLDescriptionElementHandler handler) throws OWLXMLParserException {
        if(cls == null) {
            OWLClassExpression desc = handler.getOWLObject();
            if(desc.isAnonymous()) {
                throw new OWLXMLParserUnexpectedElementException(getLineNumber(), "Found anonymous class as first child of disjoint union, expected a named class.");
            }
            cls = (OWLClass) desc;
        }
        else {
            classExpressions.add(handler.getOWLObject());
        }
    }


}
