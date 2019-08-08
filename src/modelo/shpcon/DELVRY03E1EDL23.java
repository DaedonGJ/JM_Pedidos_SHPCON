//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.08 a las 01:36:33 PM CEST 
//


package modelo.shpcon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Deliv.Header Addit.Data Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL23 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL23">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LFART_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LPRIO_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BZIRK_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFSK_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDGRP_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRAGR_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRSPG_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AULWE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SEGMENT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELVRY03.E1EDL23", propOrder = {
    "lfartbez",
    "lpriobez",
    "bzirkbez",
    "lifskbez",
    "kdgrpbez",
    "tragrbez",
    "trspgbez",
    "aulwebez"
})
public class DELVRY03E1EDL23 {

    @XmlElement(name = "LFART_BEZ")
    protected String lfartbez;
    @XmlElement(name = "LPRIO_BEZ")
    protected String lpriobez;
    @XmlElement(name = "BZIRK_BEZ")
    protected String bzirkbez;
    @XmlElement(name = "LIFSK_BEZ")
    protected String lifskbez;
    @XmlElement(name = "KDGRP_BEZ")
    protected String kdgrpbez;
    @XmlElement(name = "TRAGR_BEZ")
    protected String tragrbez;
    @XmlElement(name = "TRSPG_BEZ")
    protected String trspgbez;
    @XmlElement(name = "AULWE_BEZ")
    protected String aulwebez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad lfartbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFARTBEZ() {
        return lfartbez;
    }

    /**
     * Define el valor de la propiedad lfartbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFARTBEZ(String value) {
        this.lfartbez = value;
    }

    /**
     * Obtiene el valor de la propiedad lpriobez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPRIOBEZ() {
        return lpriobez;
    }

    /**
     * Define el valor de la propiedad lpriobez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPRIOBEZ(String value) {
        this.lpriobez = value;
    }

    /**
     * Obtiene el valor de la propiedad bzirkbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZIRKBEZ() {
        return bzirkbez;
    }

    /**
     * Define el valor de la propiedad bzirkbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZIRKBEZ(String value) {
        this.bzirkbez = value;
    }

    /**
     * Obtiene el valor de la propiedad lifskbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFSKBEZ() {
        return lifskbez;
    }

    /**
     * Define el valor de la propiedad lifskbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFSKBEZ(String value) {
        this.lifskbez = value;
    }

    /**
     * Obtiene el valor de la propiedad kdgrpbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDGRPBEZ() {
        return kdgrpbez;
    }

    /**
     * Define el valor de la propiedad kdgrpbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDGRPBEZ(String value) {
        this.kdgrpbez = value;
    }

    /**
     * Obtiene el valor de la propiedad tragrbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAGRBEZ() {
        return tragrbez;
    }

    /**
     * Define el valor de la propiedad tragrbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAGRBEZ(String value) {
        this.tragrbez = value;
    }

    /**
     * Obtiene el valor de la propiedad trspgbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSPGBEZ() {
        return trspgbez;
    }

    /**
     * Define el valor de la propiedad trspgbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSPGBEZ(String value) {
        this.trspgbez = value;
    }

    /**
     * Obtiene el valor de la propiedad aulwebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULWEBEZ() {
        return aulwebez;
    }

    /**
     * Define el valor de la propiedad aulwebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULWEBEZ(String value) {
        this.aulwebez = value;
    }

    /**
     * Obtiene el valor de la propiedad segment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENT() {
        if (segment == null) {
            return "1";
        } else {
            return segment;
        }
    }

    /**
     * Define el valor de la propiedad segment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENT(String value) {
        this.segment = value;
    }

}
