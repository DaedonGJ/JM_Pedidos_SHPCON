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
 * DG item data descriptions 2 (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD15 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD15">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HPN1D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN2D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN3D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN4D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN5D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN6D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HPN7D" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDD15", propOrder = {
    "hpn1D",
    "hpn2D",
    "hpn3D",
    "hpn4D",
    "hpn5D",
    "hpn6D",
    "hpn7D"
})
public class DELVRY03E1EDD15 {

    @XmlElement(name = "HPN1D")
    protected String hpn1D;
    @XmlElement(name = "HPN2D")
    protected String hpn2D;
    @XmlElement(name = "HPN3D")
    protected String hpn3D;
    @XmlElement(name = "HPN4D")
    protected String hpn4D;
    @XmlElement(name = "HPN5D")
    protected String hpn5D;
    @XmlElement(name = "HPN6D")
    protected String hpn6D;
    @XmlElement(name = "HPN7D")
    protected String hpn7D;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad hpn1D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN1D() {
        return hpn1D;
    }

    /**
     * Define el valor de la propiedad hpn1D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN1D(String value) {
        this.hpn1D = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn2D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN2D() {
        return hpn2D;
    }

    /**
     * Define el valor de la propiedad hpn2D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN2D(String value) {
        this.hpn2D = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn3D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN3D() {
        return hpn3D;
    }

    /**
     * Define el valor de la propiedad hpn3D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN3D(String value) {
        this.hpn3D = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn4D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN4D() {
        return hpn4D;
    }

    /**
     * Define el valor de la propiedad hpn4D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN4D(String value) {
        this.hpn4D = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn5D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN5D() {
        return hpn5D;
    }

    /**
     * Define el valor de la propiedad hpn5D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN5D(String value) {
        this.hpn5D = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn6D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN6D() {
        return hpn6D;
    }

    /**
     * Define el valor de la propiedad hpn6D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN6D(String value) {
        this.hpn6D = value;
    }

    /**
     * Obtiene el valor de la propiedad hpn7D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPN7D() {
        return hpn7D;
    }

    /**
     * Define el valor de la propiedad hpn7D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPN7D(String value) {
        this.hpn7D = value;
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
