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
 * Routes Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL29 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL29">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ROUTE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSART_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSAVL_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSANL_BEZ" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDL29", propOrder = {
    "routebez",
    "vsartbez",
    "vsavlbez",
    "vsanlbez"
})
public class DELVRY03E1EDL29 {

    @XmlElement(name = "ROUTE_BEZ")
    protected String routebez;
    @XmlElement(name = "VSART_BEZ")
    protected String vsartbez;
    @XmlElement(name = "VSAVL_BEZ")
    protected String vsavlbez;
    @XmlElement(name = "VSANL_BEZ")
    protected String vsanlbez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad routebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTEBEZ() {
        return routebez;
    }

    /**
     * Define el valor de la propiedad routebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTEBEZ(String value) {
        this.routebez = value;
    }

    /**
     * Obtiene el valor de la propiedad vsartbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSARTBEZ() {
        return vsartbez;
    }

    /**
     * Define el valor de la propiedad vsartbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSARTBEZ(String value) {
        this.vsartbez = value;
    }

    /**
     * Obtiene el valor de la propiedad vsavlbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSAVLBEZ() {
        return vsavlbez;
    }

    /**
     * Define el valor de la propiedad vsavlbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSAVLBEZ(String value) {
        this.vsavlbez = value;
    }

    /**
     * Obtiene el valor de la propiedad vsanlbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSANLBEZ() {
        return vsanlbez;
    }

    /**
     * Define el valor de la propiedad vsanlbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSANLBEZ(String value) {
        this.vsanlbez = value;
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
