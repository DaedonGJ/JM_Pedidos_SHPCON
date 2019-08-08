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
 * Export Data Delivery Header Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL34 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL34">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXPVZ_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLLA_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLLB_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL1_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL2_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL3_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL4_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL5_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZOLL6_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IEVER_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STGBE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STABE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
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
@XmlType(name = "DELVRY03.E1EDL34", propOrder = {
    "expvzbez",
    "zollabez",
    "zollbbez",
    "zoll1BEZ",
    "zoll2BEZ",
    "zoll3BEZ",
    "zoll4BEZ",
    "zoll5BEZ",
    "zoll6BEZ",
    "ieverbez",
    "stgbebez",
    "stabebez"
})
public class DELVRY03E1EDL34 {

    @XmlElement(name = "EXPVZ_BEZ")
    protected String expvzbez;
    @XmlElement(name = "ZOLLA_BEZ")
    protected String zollabez;
    @XmlElement(name = "ZOLLB_BEZ")
    protected String zollbbez;
    @XmlElement(name = "ZOLL1_BEZ")
    protected String zoll1BEZ;
    @XmlElement(name = "ZOLL2_BEZ")
    protected String zoll2BEZ;
    @XmlElement(name = "ZOLL3_BEZ")
    protected String zoll3BEZ;
    @XmlElement(name = "ZOLL4_BEZ")
    protected String zoll4BEZ;
    @XmlElement(name = "ZOLL5_BEZ")
    protected String zoll5BEZ;
    @XmlElement(name = "ZOLL6_BEZ")
    protected String zoll6BEZ;
    @XmlElement(name = "IEVER_BEZ")
    protected String ieverbez;
    @XmlElement(name = "STGBE_BEZ")
    protected String stgbebez;
    @XmlElement(name = "STABE_BEZ")
    protected String stabebez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad expvzbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPVZBEZ() {
        return expvzbez;
    }

    /**
     * Define el valor de la propiedad expvzbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPVZBEZ(String value) {
        this.expvzbez = value;
    }

    /**
     * Obtiene el valor de la propiedad zollabez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLLABEZ() {
        return zollabez;
    }

    /**
     * Define el valor de la propiedad zollabez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLLABEZ(String value) {
        this.zollabez = value;
    }

    /**
     * Obtiene el valor de la propiedad zollbbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLLBBEZ() {
        return zollbbez;
    }

    /**
     * Define el valor de la propiedad zollbbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLLBBEZ(String value) {
        this.zollbbez = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll1BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL1BEZ() {
        return zoll1BEZ;
    }

    /**
     * Define el valor de la propiedad zoll1BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL1BEZ(String value) {
        this.zoll1BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll2BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL2BEZ() {
        return zoll2BEZ;
    }

    /**
     * Define el valor de la propiedad zoll2BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL2BEZ(String value) {
        this.zoll2BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll3BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL3BEZ() {
        return zoll3BEZ;
    }

    /**
     * Define el valor de la propiedad zoll3BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL3BEZ(String value) {
        this.zoll3BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll4BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL4BEZ() {
        return zoll4BEZ;
    }

    /**
     * Define el valor de la propiedad zoll4BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL4BEZ(String value) {
        this.zoll4BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll5BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL5BEZ() {
        return zoll5BEZ;
    }

    /**
     * Define el valor de la propiedad zoll5BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL5BEZ(String value) {
        this.zoll5BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad zoll6BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZOLL6BEZ() {
        return zoll6BEZ;
    }

    /**
     * Define el valor de la propiedad zoll6BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZOLL6BEZ(String value) {
        this.zoll6BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad ieverbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIEVERBEZ() {
        return ieverbez;
    }

    /**
     * Define el valor de la propiedad ieverbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIEVERBEZ(String value) {
        this.ieverbez = value;
    }

    /**
     * Obtiene el valor de la propiedad stgbebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTGBEBEZ() {
        return stgbebez;
    }

    /**
     * Define el valor de la propiedad stgbebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTGBEBEZ(String value) {
        this.stgbebez = value;
    }

    /**
     * Obtiene el valor de la propiedad stabebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTABEBEZ() {
        return stabebez;
    }

    /**
     * Define el valor de la propiedad stabebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTABEBEZ(String value) {
        this.stabebez = value;
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
