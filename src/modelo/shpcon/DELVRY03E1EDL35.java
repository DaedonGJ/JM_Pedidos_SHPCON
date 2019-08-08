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
 * Export Data Delivery Item
 * 
 * <p>Clase Java para DELVRY03.E1EDL35 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL35">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAWN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPRF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HERKL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HERKR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GRWRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PREFE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL36" type="{}DELVRY03.E1EDL36" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL35", propOrder = {
    "stawn",
    "exprf",
    "exart",
    "herkl",
    "herkr",
    "grwrt",
    "prefe",
    "e1EDL36"
})
public class DELVRY03E1EDL35 {

    @XmlElement(name = "STAWN")
    protected String stawn;
    @XmlElement(name = "EXPRF")
    protected String exprf;
    @XmlElement(name = "EXART")
    protected String exart;
    @XmlElement(name = "HERKL")
    protected String herkl;
    @XmlElement(name = "HERKR")
    protected String herkr;
    @XmlElement(name = "GRWRT")
    protected String grwrt;
    @XmlElement(name = "PREFE")
    protected String prefe;
    @XmlElement(name = "E1EDL36")
    protected DELVRY03E1EDL36 e1EDL36;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad stawn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAWN() {
        return stawn;
    }

    /**
     * Define el valor de la propiedad stawn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAWN(String value) {
        this.stawn = value;
    }

    /**
     * Obtiene el valor de la propiedad exprf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPRF() {
        return exprf;
    }

    /**
     * Define el valor de la propiedad exprf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPRF(String value) {
        this.exprf = value;
    }

    /**
     * Obtiene el valor de la propiedad exart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXART() {
        return exart;
    }

    /**
     * Define el valor de la propiedad exart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXART(String value) {
        this.exart = value;
    }

    /**
     * Obtiene el valor de la propiedad herkl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHERKL() {
        return herkl;
    }

    /**
     * Define el valor de la propiedad herkl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHERKL(String value) {
        this.herkl = value;
    }

    /**
     * Obtiene el valor de la propiedad herkr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHERKR() {
        return herkr;
    }

    /**
     * Define el valor de la propiedad herkr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHERKR(String value) {
        this.herkr = value;
    }

    /**
     * Obtiene el valor de la propiedad grwrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRWRT() {
        return grwrt;
    }

    /**
     * Define el valor de la propiedad grwrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRWRT(String value) {
        this.grwrt = value;
    }

    /**
     * Obtiene el valor de la propiedad prefe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREFE() {
        return prefe;
    }

    /**
     * Define el valor de la propiedad prefe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREFE(String value) {
        this.prefe = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL36.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL36 }
     *     
     */
    public DELVRY03E1EDL36 getE1EDL36() {
        return e1EDL36;
    }

    /**
     * Define el valor de la propiedad e1EDL36.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL36 }
     *     
     */
    public void setE1EDL36(DELVRY03E1EDL36 value) {
        this.e1EDL36 = value;
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
