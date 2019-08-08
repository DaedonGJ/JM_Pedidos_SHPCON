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
 * Delivery Item Additional Data Descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL27 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL27">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PSTYV_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATKL_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRODH_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WERKS_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR1_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR2_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR3_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR4_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR5_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR1_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR2_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR3_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR4_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR5_BEZ" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDL27", propOrder = {
    "pstyvbez",
    "matklbez",
    "prodhbez",
    "werksbez",
    "kvgr1BEZ",
    "kvgr2BEZ",
    "kvgr3BEZ",
    "kvgr4BEZ",
    "kvgr5BEZ",
    "mvgr1BEZ",
    "mvgr2BEZ",
    "mvgr3BEZ",
    "mvgr4BEZ",
    "mvgr5BEZ"
})
public class DELVRY03E1EDL27 {

    @XmlElement(name = "PSTYV_BEZ")
    protected String pstyvbez;
    @XmlElement(name = "MATKL_BEZ")
    protected String matklbez;
    @XmlElement(name = "PRODH_BEZ")
    protected String prodhbez;
    @XmlElement(name = "WERKS_BEZ")
    protected String werksbez;
    @XmlElement(name = "KVGR1_BEZ")
    protected String kvgr1BEZ;
    @XmlElement(name = "KVGR2_BEZ")
    protected String kvgr2BEZ;
    @XmlElement(name = "KVGR3_BEZ")
    protected String kvgr3BEZ;
    @XmlElement(name = "KVGR4_BEZ")
    protected String kvgr4BEZ;
    @XmlElement(name = "KVGR5_BEZ")
    protected String kvgr5BEZ;
    @XmlElement(name = "MVGR1_BEZ")
    protected String mvgr1BEZ;
    @XmlElement(name = "MVGR2_BEZ")
    protected String mvgr2BEZ;
    @XmlElement(name = "MVGR3_BEZ")
    protected String mvgr3BEZ;
    @XmlElement(name = "MVGR4_BEZ")
    protected String mvgr4BEZ;
    @XmlElement(name = "MVGR5_BEZ")
    protected String mvgr5BEZ;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad pstyvbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTYVBEZ() {
        return pstyvbez;
    }

    /**
     * Define el valor de la propiedad pstyvbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTYVBEZ(String value) {
        this.pstyvbez = value;
    }

    /**
     * Obtiene el valor de la propiedad matklbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATKLBEZ() {
        return matklbez;
    }

    /**
     * Define el valor de la propiedad matklbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATKLBEZ(String value) {
        this.matklbez = value;
    }

    /**
     * Obtiene el valor de la propiedad prodhbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODHBEZ() {
        return prodhbez;
    }

    /**
     * Define el valor de la propiedad prodhbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODHBEZ(String value) {
        this.prodhbez = value;
    }

    /**
     * Obtiene el valor de la propiedad werksbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKSBEZ() {
        return werksbez;
    }

    /**
     * Define el valor de la propiedad werksbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKSBEZ(String value) {
        this.werksbez = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr1BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR1BEZ() {
        return kvgr1BEZ;
    }

    /**
     * Define el valor de la propiedad kvgr1BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR1BEZ(String value) {
        this.kvgr1BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr2BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR2BEZ() {
        return kvgr2BEZ;
    }

    /**
     * Define el valor de la propiedad kvgr2BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR2BEZ(String value) {
        this.kvgr2BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr3BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR3BEZ() {
        return kvgr3BEZ;
    }

    /**
     * Define el valor de la propiedad kvgr3BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR3BEZ(String value) {
        this.kvgr3BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr4BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR4BEZ() {
        return kvgr4BEZ;
    }

    /**
     * Define el valor de la propiedad kvgr4BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR4BEZ(String value) {
        this.kvgr4BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr5BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR5BEZ() {
        return kvgr5BEZ;
    }

    /**
     * Define el valor de la propiedad kvgr5BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR5BEZ(String value) {
        this.kvgr5BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr1BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR1BEZ() {
        return mvgr1BEZ;
    }

    /**
     * Define el valor de la propiedad mvgr1BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR1BEZ(String value) {
        this.mvgr1BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr2BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR2BEZ() {
        return mvgr2BEZ;
    }

    /**
     * Define el valor de la propiedad mvgr2BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR2BEZ(String value) {
        this.mvgr2BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr3BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR3BEZ() {
        return mvgr3BEZ;
    }

    /**
     * Define el valor de la propiedad mvgr3BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR3BEZ(String value) {
        this.mvgr3BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr4BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR4BEZ() {
        return mvgr4BEZ;
    }

    /**
     * Define el valor de la propiedad mvgr4BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR4BEZ(String value) {
        this.mvgr4BEZ = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr5BEZ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR5BEZ() {
        return mvgr5BEZ;
    }

    /**
     * Define el valor de la propiedad mvgr5BEZ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR5BEZ(String value) {
        this.mvgr5BEZ = value;
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
