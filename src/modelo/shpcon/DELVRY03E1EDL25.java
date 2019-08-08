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
 * Delivery Item Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL25 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL25">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGORT_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LADGR_BEZ" minOccurs="0">
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
 *         &lt;element name="VKBUR_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VKGRP_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VTWEG_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPART_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFRGR_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
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
@XmlType(name = "DELVRY03.E1EDL25", propOrder = {
    "lgortbez",
    "ladgrbez",
    "tragrbez",
    "vkburbez",
    "vkgrpbez",
    "vtwegbez",
    "spartbez",
    "mfrgrbez"
})
public class DELVRY03E1EDL25 {

    @XmlElement(name = "LGORT_BEZ")
    protected String lgortbez;
    @XmlElement(name = "LADGR_BEZ")
    protected String ladgrbez;
    @XmlElement(name = "TRAGR_BEZ")
    protected String tragrbez;
    @XmlElement(name = "VKBUR_BEZ")
    protected String vkburbez;
    @XmlElement(name = "VKGRP_BEZ")
    protected String vkgrpbez;
    @XmlElement(name = "VTWEG_BEZ")
    protected String vtwegbez;
    @XmlElement(name = "SPART_BEZ")
    protected String spartbez;
    @XmlElement(name = "MFRGR_BEZ")
    protected String mfrgrbez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad lgortbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGORTBEZ() {
        return lgortbez;
    }

    /**
     * Define el valor de la propiedad lgortbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGORTBEZ(String value) {
        this.lgortbez = value;
    }

    /**
     * Obtiene el valor de la propiedad ladgrbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLADGRBEZ() {
        return ladgrbez;
    }

    /**
     * Define el valor de la propiedad ladgrbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLADGRBEZ(String value) {
        this.ladgrbez = value;
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
     * Obtiene el valor de la propiedad vkburbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKBURBEZ() {
        return vkburbez;
    }

    /**
     * Define el valor de la propiedad vkburbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKBURBEZ(String value) {
        this.vkburbez = value;
    }

    /**
     * Obtiene el valor de la propiedad vkgrpbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKGRPBEZ() {
        return vkgrpbez;
    }

    /**
     * Define el valor de la propiedad vkgrpbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKGRPBEZ(String value) {
        this.vkgrpbez = value;
    }

    /**
     * Obtiene el valor de la propiedad vtwegbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTWEGBEZ() {
        return vtwegbez;
    }

    /**
     * Define el valor de la propiedad vtwegbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTWEGBEZ(String value) {
        this.vtwegbez = value;
    }

    /**
     * Obtiene el valor de la propiedad spartbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPARTBEZ() {
        return spartbez;
    }

    /**
     * Define el valor de la propiedad spartbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPARTBEZ(String value) {
        this.spartbez = value;
    }

    /**
     * Obtiene el valor de la propiedad mfrgrbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFRGRBEZ() {
        return mfrgrbez;
    }

    /**
     * Define el valor de la propiedad mfrgrbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFRGRBEZ(String value) {
        this.mfrgrbez = value;
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
