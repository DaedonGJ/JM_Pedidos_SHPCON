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
 * Delivery Header Additional Data
 * 
 * <p>Clase Java para DELVRY03.E1EDL21 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL21">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LFART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BZIRK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTLF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFSK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LPRIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BEROT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRAGR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRSPG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AULWE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL23" type="{}DELVRY03.E1EDL23" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL21", propOrder = {
    "lfart",
    "bzirk",
    "autlf",
    "expkz",
    "lifsk",
    "lprio",
    "kdgrp",
    "berot",
    "tragr",
    "trspg",
    "aulwe",
    "e1EDL23"
})
public class DELVRY03E1EDL21 {

    @XmlElement(name = "LFART")
    protected String lfart;
    @XmlElement(name = "BZIRK")
    protected String bzirk;
    @XmlElement(name = "AUTLF")
    protected String autlf;
    @XmlElement(name = "EXPKZ")
    protected String expkz;
    @XmlElement(name = "LIFSK")
    protected String lifsk;
    @XmlElement(name = "LPRIO")
    protected String lprio;
    @XmlElement(name = "KDGRP")
    protected String kdgrp;
    @XmlElement(name = "BEROT")
    protected String berot;
    @XmlElement(name = "TRAGR")
    protected String tragr;
    @XmlElement(name = "TRSPG")
    protected String trspg;
    @XmlElement(name = "AULWE")
    protected String aulwe;
    @XmlElement(name = "E1EDL23")
    protected DELVRY03E1EDL23 e1EDL23;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad lfart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFART() {
        return lfart;
    }

    /**
     * Define el valor de la propiedad lfart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFART(String value) {
        this.lfart = value;
    }

    /**
     * Obtiene el valor de la propiedad bzirk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBZIRK() {
        return bzirk;
    }

    /**
     * Define el valor de la propiedad bzirk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZIRK(String value) {
        this.bzirk = value;
    }

    /**
     * Obtiene el valor de la propiedad autlf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTLF() {
        return autlf;
    }

    /**
     * Define el valor de la propiedad autlf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTLF(String value) {
        this.autlf = value;
    }

    /**
     * Obtiene el valor de la propiedad expkz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPKZ() {
        return expkz;
    }

    /**
     * Define el valor de la propiedad expkz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPKZ(String value) {
        this.expkz = value;
    }

    /**
     * Obtiene el valor de la propiedad lifsk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFSK() {
        return lifsk;
    }

    /**
     * Define el valor de la propiedad lifsk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFSK(String value) {
        this.lifsk = value;
    }

    /**
     * Obtiene el valor de la propiedad lprio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPRIO() {
        return lprio;
    }

    /**
     * Define el valor de la propiedad lprio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPRIO(String value) {
        this.lprio = value;
    }

    /**
     * Obtiene el valor de la propiedad kdgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDGRP() {
        return kdgrp;
    }

    /**
     * Define el valor de la propiedad kdgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDGRP(String value) {
        this.kdgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad berot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEROT() {
        return berot;
    }

    /**
     * Define el valor de la propiedad berot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEROT(String value) {
        this.berot = value;
    }

    /**
     * Obtiene el valor de la propiedad tragr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAGR() {
        return tragr;
    }

    /**
     * Define el valor de la propiedad tragr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAGR(String value) {
        this.tragr = value;
    }

    /**
     * Obtiene el valor de la propiedad trspg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSPG() {
        return trspg;
    }

    /**
     * Define el valor de la propiedad trspg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSPG(String value) {
        this.trspg = value;
    }

    /**
     * Obtiene el valor de la propiedad aulwe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAULWE() {
        return aulwe;
    }

    /**
     * Define el valor de la propiedad aulwe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAULWE(String value) {
        this.aulwe = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL23.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL23 }
     *     
     */
    public DELVRY03E1EDL23 getE1EDL23() {
        return e1EDL23;
    }

    /**
     * Define el valor de la propiedad e1EDL23.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL23 }
     *     
     */
    public void setE1EDL23(DELVRY03E1EDL23 value) {
        this.e1EDL23 = value;
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
