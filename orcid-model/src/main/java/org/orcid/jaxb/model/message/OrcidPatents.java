/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}orcid-patent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}scope"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "orcidPatent" })
@XmlRootElement(name = "orcid-patents")
public class OrcidPatents implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "orcid-patent")
    protected List<OrcidPatent> orcidPatent;
    @XmlAttribute
    protected Scope scope;

    /**
     * Gets the value of the orcidPatent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orcidPatent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrcidPatent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrcidPatent }
     * 
     * 
     */
    public List<OrcidPatent> getOrcidPatent() {
        if (orcidPatent == null) {
            orcidPatent = new ArrayList<OrcidPatent>();
        }
        return this.orcidPatent;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link Scope }
     *     
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scope }
     *     
     */
    public void setScope(Scope value) {
        this.scope = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrcidPatents)) {
            return false;
        }

        OrcidPatents that = (OrcidPatents) o;

        if (orcidPatent != null ? !orcidPatent.equals(that.orcidPatent) : that.orcidPatent != null) {
            return false;
        }
        if (scope != that.scope) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = orcidPatent != null ? orcidPatent.hashCode() : 0;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        return result;
    }
}
