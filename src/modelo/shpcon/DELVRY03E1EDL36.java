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
 * Export Data Delivery Item Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL36 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL36">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STXT1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STXT2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STXT3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STXT4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STXT5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STXT6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STXT7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPRF_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXART_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HERKL_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HERKR_BEZ" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDL36", propOrder = {
    "stxt1",
    "stxt2",
    "stxt3",
    "stxt4",
    "stxt5",
    "stxt6",
    "stxt7",
    "exprfbez",
    "exartbez",
    "herklbez",
    "herkrbez"
})
public class DELVRY03E1EDL36 {

    @XmlElement(name = "STXT1")
    protected String stxt1;
    @XmlElement(name = "STXT2")
    protected String stxt2;
    @XmlElement(name = "STXT3")
    protected String stxt3;
    @XmlElement(name = "STXT4")
    protected String stxt4;
    @XmlElement(name = "STXT5")
    protected String stxt5;
    @XmlElement(name = "STXT6")
    protected String stxt6;
    @XmlElement(name = "STXT7")
    protected String stxt7;
    @XmlElement(name = "EXPRF_BEZ")
    protected String exprfbez;
    @XmlElement(name = "EXART_BEZ")
    protected String exartbez;
    @XmlElement(name = "HERKL_BEZ")
    protected String herklbez;
    @XmlElement(name = "HERKR_BEZ")
    protected String herkrbez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad stxt1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT1() {
        return stxt1;
    }

    /**
     * Define el valor de la propiedad stxt1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT1(String value) {
        this.stxt1 = value;
    }

    /**
     * Obtiene el valor de la propiedad stxt2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT2() {
        return stxt2;
    }

    /**
     * Define el valor de la propiedad stxt2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT2(String value) {
        this.stxt2 = value;
    }

    /**
     * Obtiene el valor de la propiedad stxt3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT3() {
        return stxt3;
    }

    /**
     * Define el valor de la propiedad stxt3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT3(String value) {
        this.stxt3 = value;
    }

    /**
     * Obtiene el valor de la propiedad stxt4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT4() {
        return stxt4;
    }

    /**
     * Define el valor de la propiedad stxt4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT4(String value) {
        this.stxt4 = value;
    }

    /**
     * Obtiene el valor de la propiedad stxt5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT5() {
        return stxt5;
    }

    /**
     * Define el valor de la propiedad stxt5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT5(String value) {
        this.stxt5 = value;
    }

    /**
     * Obtiene el valor de la propiedad stxt6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT6() {
        return stxt6;
    }

    /**
     * Define el valor de la propiedad stxt6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT6(String value) {
        this.stxt6 = value;
    }

    /**
     * Obtiene el valor de la propiedad stxt7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTXT7() {
        return stxt7;
    }

    /**
     * Define el valor de la propiedad stxt7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTXT7(String value) {
        this.stxt7 = value;
    }

    /**
     * Obtiene el valor de la propiedad exprfbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPRFBEZ() {
        return exprfbez;
    }

    /**
     * Define el valor de la propiedad exprfbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPRFBEZ(String value) {
        this.exprfbez = value;
    }

    /**
     * Obtiene el valor de la propiedad exartbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXARTBEZ() {
        return exartbez;
    }

    /**
     * Define el valor de la propiedad exartbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXARTBEZ(String value) {
        this.exartbez = value;
    }

    /**
     * Obtiene el valor de la propiedad herklbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHERKLBEZ() {
        return herklbez;
    }

    /**
     * Define el valor de la propiedad herklbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHERKLBEZ(String value) {
        this.herklbez = value;
    }

    /**
     * Obtiene el valor de la propiedad herkrbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHERKRBEZ() {
        return herkrbez;
    }

    /**
     * Define el valor de la propiedad herkrbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHERKRBEZ(String value) {
        this.herkrbez = value;
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
