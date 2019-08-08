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
 * Delivery Item POD
 * 
 * <p>Clase Java para DELVRY03.E1EDL53 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL53">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GRUND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PODMG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LFIMG_DIFF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VRKME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGMNG_DIFF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEINS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "DELVRY03.E1EDL53", propOrder = {
    "grund",
    "podmg",
    "lfimgdiff",
    "vrkme",
    "lgmngdiff",
    "meins"
})
public class DELVRY03E1EDL53 {

    @XmlElement(name = "GRUND")
    protected String grund;
    @XmlElement(name = "PODMG")
    protected String podmg;
    @XmlElement(name = "LFIMG_DIFF")
    protected String lfimgdiff;
    @XmlElement(name = "VRKME")
    protected String vrkme;
    @XmlElement(name = "LGMNG_DIFF")
    protected String lgmngdiff;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad grund.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRUND() {
        return grund;
    }

    /**
     * Define el valor de la propiedad grund.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRUND(String value) {
        this.grund = value;
    }

    /**
     * Obtiene el valor de la propiedad podmg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPODMG() {
        return podmg;
    }

    /**
     * Define el valor de la propiedad podmg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPODMG(String value) {
        this.podmg = value;
    }

    /**
     * Obtiene el valor de la propiedad lfimgdiff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFIMGDIFF() {
        return lfimgdiff;
    }

    /**
     * Define el valor de la propiedad lfimgdiff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFIMGDIFF(String value) {
        this.lfimgdiff = value;
    }

    /**
     * Obtiene el valor de la propiedad vrkme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRKME() {
        return vrkme;
    }

    /**
     * Define el valor de la propiedad vrkme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRKME(String value) {
        this.vrkme = value;
    }

    /**
     * Obtiene el valor de la propiedad lgmngdiff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGMNGDIFF() {
        return lgmngdiff;
    }

    /**
     * Define el valor de la propiedad lgmngdiff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGMNGDIFF(String value) {
        this.lgmngdiff = value;
    }

    /**
     * Obtiene el valor de la propiedad meins.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEINS() {
        return meins;
    }

    /**
     * Define el valor de la propiedad meins.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEINS(String value) {
        this.meins = value;
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
