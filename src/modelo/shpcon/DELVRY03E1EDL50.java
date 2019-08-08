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
 * Express Delivery Company - Additional Data
 * 
 * <p>Clase Java para DELVRY03.E1EDL50 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL50">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XSIQUALF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XSITD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VLABDATA" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDL50", propOrder = {
    "xsiqualf",
    "xsitd",
    "vlabdata"
})
public class DELVRY03E1EDL50 {

    @XmlElement(name = "XSIQUALF")
    protected String xsiqualf;
    @XmlElement(name = "XSITD")
    protected String xsitd;
    @XmlElement(name = "VLABDATA")
    protected String vlabdata;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad xsiqualf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSIQUALF() {
        return xsiqualf;
    }

    /**
     * Define el valor de la propiedad xsiqualf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSIQUALF(String value) {
        this.xsiqualf = value;
    }

    /**
     * Obtiene el valor de la propiedad xsitd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSITD() {
        return xsitd;
    }

    /**
     * Define el valor de la propiedad xsitd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSITD(String value) {
        this.xsitd = value;
    }

    /**
     * Obtiene el valor de la propiedad vlabdata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLABDATA() {
        return vlabdata;
    }

    /**
     * Define el valor de la propiedad vlabdata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLABDATA(String value) {
        this.vlabdata = value;
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
