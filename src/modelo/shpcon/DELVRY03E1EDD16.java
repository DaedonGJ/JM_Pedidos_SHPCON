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
 * DG item data descriptions 3 (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD16 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD16">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGGRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COWED" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORM_PHYS_CHEM_D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
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
@XmlType(name = "DELVRY03.E1EDD16", propOrder = {
    "aggrt",
    "cowed",
    "formphyschemd"
})
public class DELVRY03E1EDD16 {

    @XmlElement(name = "AGGRT")
    protected String aggrt;
    @XmlElement(name = "COWED")
    protected String cowed;
    @XmlElement(name = "FORM_PHYS_CHEM_D")
    protected String formphyschemd;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad aggrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGGRT() {
        return aggrt;
    }

    /**
     * Define el valor de la propiedad aggrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGGRT(String value) {
        this.aggrt = value;
    }

    /**
     * Obtiene el valor de la propiedad cowed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOWED() {
        return cowed;
    }

    /**
     * Define el valor de la propiedad cowed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOWED(String value) {
        this.cowed = value;
    }

    /**
     * Obtiene el valor de la propiedad formphyschemd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMPHYSCHEMD() {
        return formphyschemd;
    }

    /**
     * Define el valor de la propiedad formphyschemd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMPHYSCHEMD(String value) {
        this.formphyschemd = value;
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
