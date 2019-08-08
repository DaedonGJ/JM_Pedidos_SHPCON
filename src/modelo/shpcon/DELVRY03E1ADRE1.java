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
 * Central Address Segment Group, Additional Data Segment
 * 
 * <p>Clase Java para DELVRY03.E1ADRE1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1ADRE1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXTEND_Q" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXTEND_D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="70"/>
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
@XmlType(name = "DELVRY03.E1ADRE1", propOrder = {
    "extendq",
    "extendd"
})
public class DELVRY03E1ADRE1 {

    @XmlElement(name = "EXTEND_Q")
    protected String extendq;
    @XmlElement(name = "EXTEND_D")
    protected String extendd;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad extendq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTENDQ() {
        return extendq;
    }

    /**
     * Define el valor de la propiedad extendq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTENDQ(String value) {
        this.extendq = value;
    }

    /**
     * Obtiene el valor de la propiedad extendd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTENDD() {
        return extendd;
    }

    /**
     * Define el valor de la propiedad extendd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTENDD(String value) {
        this.extendd = value;
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
