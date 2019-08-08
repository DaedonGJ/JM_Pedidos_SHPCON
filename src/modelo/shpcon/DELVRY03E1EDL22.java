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
 * Delivery Header Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL22 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL22">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VSTEL_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VKORG_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LSTEL_BEZ" minOccurs="0">
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
 *         &lt;element name="LGNUM_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INCO1_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ROUTE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSBED_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRATY_BEZ" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDL22", propOrder = {
    "vstelbez",
    "vkorgbez",
    "lstelbez",
    "vkburbez",
    "lgnumbez",
    "inco1BEZ",
    "routebez",
    "vsbedbez",
    "tratybez"
})
public class DELVRY03E1EDL22 {

    @XmlElement(name = "VSTEL_BEZ")
    protected String vstelbez;
    @XmlElement(name = "VKORG_BEZ")
    protected String vkorgbez;
    @XmlElement(name = "LSTEL_BEZ")
    protected String lstelbez;
    @XmlElement(name = "VKBUR_BEZ")
    protected String vkburbez;
    @XmlElement(name = "LGNUM_BEZ")
    protected String lgnumbez;
    @XmlElement(name = "INCO1_BEZ")
    protected String inco1BEZ;
    @XmlElement(name = "ROUTE_BEZ")
    protected String routebez;
    @XmlElement(name = "VSBED_BEZ")
    protected String vsbedbez;
    @XmlElement(name = "TRATY_BEZ")
    protected String tratybez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad vstelbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSTELBEZ() {
        return vstelbez;
    }

    /**
     * Define el valor de la propiedad vstelbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSTELBEZ(String value) {
        this.vstelbez = value;
    }

    /**
     * Obtiene el valor de la propiedad vkorgbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKORGBEZ() {
        return vkorgbez;
    }

    /**
     * Define el valor de la propiedad vkorgbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKORGBEZ(String value) {
        this.vkorgbez = value;
    }

    /**
     * Obtiene el valor de la propiedad lstelbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSTELBEZ() {
        return lstelbez;
    }

    /**
     * Define el valor de la propiedad lstelbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSTELBEZ(String value) {
        this.lstelbez = value;
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
     * Obtiene el valor de la propiedad lgnumbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGNUMBEZ() {
        return lgnumbez;
    }

    /**
     * Define el valor de la propiedad lgnumbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGNUMBEZ(String value) {
        this.lgnumbez = value;
    }

    /**
     * Obtiene el valor de la propiedad inco1BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCO1BEZ() {
        return inco1BEZ;
    }

    /**
     * Define el valor de la propiedad inco1BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCO1BEZ(String value) {
        this.inco1BEZ = value;
    }

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
     * Obtiene el valor de la propiedad vsbedbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSBEDBEZ() {
        return vsbedbez;
    }

    /**
     * Define el valor de la propiedad vsbedbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSBEDBEZ(String value) {
        this.vsbedbez = value;
    }

    /**
     * Obtiene el valor de la propiedad tratybez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRATYBEZ() {
        return tratybez;
    }

    /**
     * Define el valor de la propiedad tratybez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRATYBEZ(String value) {
        this.tratybez = value;
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
