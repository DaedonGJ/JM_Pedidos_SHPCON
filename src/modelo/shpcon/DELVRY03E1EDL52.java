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
 * Delivery Item External Release Number
 * 
 * <p>Clase Java para DELVRY03.E1EDL52 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL52">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUALF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRODN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ITMNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SQUNT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
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
@XmlType(name = "DELVRY03.E1EDL52", propOrder = {
    "qualf",
    "prodn",
    "itmnr",
    "squnt"
})
public class DELVRY03E1EDL52 {

    @XmlElement(name = "QUALF")
    protected String qualf;
    @XmlElement(name = "PRODN")
    protected String prodn;
    @XmlElement(name = "ITMNR")
    protected String itmnr;
    @XmlElement(name = "SQUNT")
    protected String squnt;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad qualf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUALF() {
        return qualf;
    }

    /**
     * Define el valor de la propiedad qualf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUALF(String value) {
        this.qualf = value;
    }

    /**
     * Obtiene el valor de la propiedad prodn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODN() {
        return prodn;
    }

    /**
     * Define el valor de la propiedad prodn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODN(String value) {
        this.prodn = value;
    }

    /**
     * Obtiene el valor de la propiedad itmnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITMNR() {
        return itmnr;
    }

    /**
     * Define el valor de la propiedad itmnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITMNR(String value) {
        this.itmnr = value;
    }

    /**
     * Obtiene el valor de la propiedad squnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSQUNT() {
        return squnt;
    }

    /**
     * Define el valor de la propiedad squnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSQUNT(String value) {
        this.squnt = value;
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
