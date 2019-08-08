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
 * Points descriptions
 * 
 * <p>Clase Java para DELVRY03.E1EDL45 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL45">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KNOTE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSTEL_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
 *         &lt;element name="WERKS_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGORT_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
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
 *         &lt;element name="LGTOR_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
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
@XmlType(name = "DELVRY03.E1EDL45", propOrder = {
    "knotebez",
    "vstelbez",
    "lstelbez",
    "werksbez",
    "lgortbez",
    "lgnumbez",
    "lgtorbez"
})
public class DELVRY03E1EDL45 {

    @XmlElement(name = "KNOTE_BEZ")
    protected String knotebez;
    @XmlElement(name = "VSTEL_BEZ")
    protected String vstelbez;
    @XmlElement(name = "LSTEL_BEZ")
    protected String lstelbez;
    @XmlElement(name = "WERKS_BEZ")
    protected String werksbez;
    @XmlElement(name = "LGORT_BEZ")
    protected String lgortbez;
    @XmlElement(name = "LGNUM_BEZ")
    protected String lgnumbez;
    @XmlElement(name = "LGTOR_BEZ")
    protected String lgtorbez;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad knotebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNOTEBEZ() {
        return knotebez;
    }

    /**
     * Define el valor de la propiedad knotebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNOTEBEZ(String value) {
        this.knotebez = value;
    }

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
     * Obtiene el valor de la propiedad lgortbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGORTBEZ() {
        return lgortbez;
    }

    /**
     * Define el valor de la propiedad lgortbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGORTBEZ(String value) {
        this.lgortbez = value;
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
     * Obtiene el valor de la propiedad lgtorbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGTORBEZ() {
        return lgtorbez;
    }

    /**
     * Define el valor de la propiedad lgtorbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGTORBEZ(String value) {
        this.lgtorbez = value;
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
