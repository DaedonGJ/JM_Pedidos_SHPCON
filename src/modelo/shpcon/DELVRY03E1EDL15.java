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
 * IDOC: Batch Characteristic
 * 
 * <p>Clase Java para DELVRY03.E1EDL15 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL15">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATINN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATNAM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATBEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATWRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATWTB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EWAHR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
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
@XmlType(name = "DELVRY03.E1EDL15", propOrder = {
    "atinn",
    "atnam",
    "atbez",
    "atwrt",
    "atwtb",
    "ewahr"
})
public class DELVRY03E1EDL15 {

    @XmlElement(name = "ATINN")
    protected String atinn;
    @XmlElement(name = "ATNAM")
    protected String atnam;
    @XmlElement(name = "ATBEZ")
    protected String atbez;
    @XmlElement(name = "ATWRT")
    protected String atwrt;
    @XmlElement(name = "ATWTB")
    protected String atwtb;
    @XmlElement(name = "EWAHR")
    protected String ewahr;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad atinn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATINN() {
        return atinn;
    }

    /**
     * Define el valor de la propiedad atinn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATINN(String value) {
        this.atinn = value;
    }

    /**
     * Obtiene el valor de la propiedad atnam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATNAM() {
        return atnam;
    }

    /**
     * Define el valor de la propiedad atnam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATNAM(String value) {
        this.atnam = value;
    }

    /**
     * Obtiene el valor de la propiedad atbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATBEZ() {
        return atbez;
    }

    /**
     * Define el valor de la propiedad atbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATBEZ(String value) {
        this.atbez = value;
    }

    /**
     * Obtiene el valor de la propiedad atwrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATWRT() {
        return atwrt;
    }

    /**
     * Define el valor de la propiedad atwrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATWRT(String value) {
        this.atwrt = value;
    }

    /**
     * Obtiene el valor de la propiedad atwtb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATWTB() {
        return atwtb;
    }

    /**
     * Define el valor de la propiedad atwtb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATWTB(String value) {
        this.atwtb = value;
    }

    /**
     * Obtiene el valor de la propiedad ewahr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEWAHR() {
        return ewahr;
    }

    /**
     * Define el valor de la propiedad ewahr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEWAHR(String value) {
        this.ewahr = value;
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
