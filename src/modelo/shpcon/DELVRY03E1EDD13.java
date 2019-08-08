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
 * Hazard notes on item level (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD13">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EDIQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DAIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DAID" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDD13", propOrder = {
    "ediq",
    "dain",
    "daid"
})
public class DELVRY03E1EDD13 {

    @XmlElement(name = "EDIQ")
    protected String ediq;
    @XmlElement(name = "DAIN")
    protected String dain;
    @XmlElement(name = "DAID")
    protected String daid;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad ediq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDIQ() {
        return ediq;
    }

    /**
     * Define el valor de la propiedad ediq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDIQ(String value) {
        this.ediq = value;
    }

    /**
     * Obtiene el valor de la propiedad dain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAIN() {
        return dain;
    }

    /**
     * Define el valor de la propiedad dain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAIN(String value) {
        this.dain = value;
    }

    /**
     * Obtiene el valor de la propiedad daid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAID() {
        return daid;
    }

    /**
     * Define el valor de la propiedad daid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAID(String value) {
        this.daid = value;
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
