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
 * Handling Unit Header Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL38 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL38">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VEGR1_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR2_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR3_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR4_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR5_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHART_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAGRV_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEBEZ" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDL38", propOrder = {
    "vegr1BEZ",
    "vegr2BEZ",
    "vegr3BEZ",
    "vegr4BEZ",
    "vegr5BEZ",
    "vhartbez",
    "magrvbez",
    "vebez"
})
public class DELVRY03E1EDL38 {

    @XmlElement(name = "VEGR1_BEZ")
    protected String vegr1BEZ;
    @XmlElement(name = "VEGR2_BEZ")
    protected String vegr2BEZ;
    @XmlElement(name = "VEGR3_BEZ")
    protected String vegr3BEZ;
    @XmlElement(name = "VEGR4_BEZ")
    protected String vegr4BEZ;
    @XmlElement(name = "VEGR5_BEZ")
    protected String vegr5BEZ;
    @XmlElement(name = "VHART_BEZ")
    protected String vhartbez;
    @XmlElement(name = "MAGRV_BEZ")
    protected String magrvbez;
    @XmlElement(name = "VEBEZ")
    protected String vebez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad vegr1BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR1BEZ() {
        return vegr1BEZ;
    }

    /**
     * Define el valor de la propiedad vegr1BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR1BEZ(String value) {
        this.vegr1BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr2BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR2BEZ() {
        return vegr2BEZ;
    }

    /**
     * Define el valor de la propiedad vegr2BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR2BEZ(String value) {
        this.vegr2BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr3BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR3BEZ() {
        return vegr3BEZ;
    }

    /**
     * Define el valor de la propiedad vegr3BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR3BEZ(String value) {
        this.vegr3BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr4BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR4BEZ() {
        return vegr4BEZ;
    }

    /**
     * Define el valor de la propiedad vegr4BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR4BEZ(String value) {
        this.vegr4BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr5BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR5BEZ() {
        return vegr5BEZ;
    }

    /**
     * Define el valor de la propiedad vegr5BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR5BEZ(String value) {
        this.vegr5BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad vhartbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHARTBEZ() {
        return vhartbez;
    }

    /**
     * Define el valor de la propiedad vhartbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHARTBEZ(String value) {
        this.vhartbez = value;
    }

    /**
     * Obtiene el valor de la propiedad magrvbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAGRVBEZ() {
        return magrvbez;
    }

    /**
     * Define el valor de la propiedad magrvbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAGRVBEZ(String value) {
        this.magrvbez = value;
    }

    /**
     * Obtiene el valor de la propiedad vebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEBEZ() {
        return vebez;
    }

    /**
     * Define el valor de la propiedad vebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEBEZ(String value) {
        this.vebez = value;
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
