//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 11:29:18 AM GMT 
//


package xmlns.org.eurocris.cerif_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cfPersName__Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cfPersName__Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfPersNameId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *         &lt;element name="cfFamilyNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfFirstNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfOtherNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="cfPersName_Pers">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cfPersId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClass__Group"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfPersName__Type", propOrder = {
    "cfPersNameId",
    "cfFamilyNames",
    "cfFirstNames",
    "cfOtherNames",
    "cfPersNamePers"
})
public class CfPersNameType {

    @XmlElement(required = true)
    protected String cfPersNameId;
    protected String cfFamilyNames;
    protected String cfFirstNames;
    protected String cfOtherNames;
    @XmlElement(name = "cfPersName_Pers")
    protected List<CfPersNameType.CfPersNamePers> cfPersNamePers;

    /**
     * Gets the value of the cfPersNameId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfPersNameId() {
        return cfPersNameId;
    }

    /**
     * Sets the value of the cfPersNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfPersNameId(String value) {
        this.cfPersNameId = value;
    }

    /**
     * Gets the value of the cfFamilyNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfFamilyNames() {
        return cfFamilyNames;
    }

    /**
     * Sets the value of the cfFamilyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfFamilyNames(String value) {
        this.cfFamilyNames = value;
    }

    /**
     * Gets the value of the cfFirstNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfFirstNames() {
        return cfFirstNames;
    }

    /**
     * Sets the value of the cfFirstNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfFirstNames(String value) {
        this.cfFirstNames = value;
    }

    /**
     * Gets the value of the cfOtherNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfOtherNames() {
        return cfOtherNames;
    }

    /**
     * Sets the value of the cfOtherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfOtherNames(String value) {
        this.cfOtherNames = value;
    }

    /**
     * Gets the value of the cfPersNamePers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfPersNamePers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfPersNamePers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfPersNameType.CfPersNamePers }
     * 
     * 
     */
    public List<CfPersNameType.CfPersNamePers> getCfPersNamePers() {
        if (cfPersNamePers == null) {
            cfPersNamePers = new ArrayList<CfPersNameType.CfPersNamePers>();
        }
        return this.cfPersNamePers;
    }


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
     *         &lt;element name="cfPersId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClass__Group"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cfPersId",
        "cfClassId",
        "cfClassSchemeId",
        "cfStartDate",
        "cfEndDate"
    })
    public static class CfPersNamePers {

        @XmlElement(required = true)
        protected String cfPersId;
        @XmlElement(required = true)
        protected String cfClassId;
        @XmlElement(required = true)
        protected String cfClassSchemeId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;

        /**
         * Gets the value of the cfPersId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfPersId() {
            return cfPersId;
        }

        /**
         * Sets the value of the cfPersId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfPersId(String value) {
            this.cfPersId = value;
        }

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfClassSchemeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId() {
            return cfClassSchemeId;
        }

        /**
         * Sets the value of the cfClassSchemeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId(String value) {
            this.cfClassSchemeId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

    }

}
