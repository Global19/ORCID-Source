/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
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

package org.orcid.jaxb.model.record;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "contributorOrcid", "creditName", "contributorEmail", "contributorAttributes" })
@XmlRootElement(name = "contributor", namespace = "http://www.orcid.org/ns/funding")
public class FundingContributor implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "contributor-orcid")
    protected ContributorOrcid contributorOrcid;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding", name = "credit-name")
    protected CreditName creditName;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding", name = "contributor-email")
    protected ContributorEmail contributorEmail;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding", name = "contributor-attributes")
    protected FundingContributorAttributes contributorAttributes;

    /**
     * Gets the value of the contributorOrcid property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorOrcid }
     *     
     */
    public ContributorOrcid getContributorOrcid() {
        return contributorOrcid;
    }

    /**
     * Sets the value of the contributorOrcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorOrcid }
     *     
     */
    public void setContributorOrcid(ContributorOrcid value) {
        this.contributorOrcid = value;
    }

    /**
     * Gets the value of the creditName property.
     * 
     * @return
     *     possible object is
     *     {@link CreditName }
     *     
     */
    public CreditName getCreditName() {
        return creditName;
    }

    /**
     * Sets the value of the creditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditName }
     *     
     */
    public void setCreditName(CreditName value) {
        this.creditName = value;
    }

    /**
     * Gets the value of the contributorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorEmail }
     *     
     */
    public ContributorEmail getContributorEmail() {
        return contributorEmail;
    }

    /**
     * Sets the value of the contributorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorEmail }
     *     
     */
    public void setContributorEmail(ContributorEmail value) {
        this.contributorEmail = value;
    }

    /**
     * Gets the value of the fundingContributorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ContributorAttributes }
     *     
     */
    public FundingContributorAttributes getContributorAttributes() {
        return contributorAttributes;
    }

    /**
     * Sets the value of the fundingContributorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributorAttributes }
     *     
     */
    public void setContributorAttributes(FundingContributorAttributes value) {
        this.contributorAttributes = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FundingContributor)) {
            return false;
        }

        FundingContributor that = (FundingContributor) o;

        if (contributorAttributes != null ? !contributorAttributes.equals(that.contributorAttributes) : that.contributorAttributes != null) {
            return false;
        }
        if (contributorEmail != null ? !contributorEmail.equals(that.contributorEmail) : that.contributorEmail != null) {
            return false;
        }
        if (contributorOrcid != null ? !contributorOrcid.equals(that.contributorOrcid) : that.contributorOrcid != null) {
            return false;
        }
        if (creditName != null ? !creditName.equals(that.creditName) : that.creditName != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = contributorOrcid != null ? contributorOrcid.hashCode() : 0;
        result = 31 * result + (creditName != null ? creditName.hashCode() : 0);
        result = 31 * result + (contributorEmail != null ? contributorEmail.hashCode() : 0);
        result = 31 * result + (contributorAttributes != null ? contributorAttributes.hashCode() : 0);
        return result;
    }
}
