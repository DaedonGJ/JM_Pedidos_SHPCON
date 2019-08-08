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
 * Reference data ordering party
 * 
 * <p>Clase Java para DELVRY03.E1EDL41 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL41">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUALI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BSTNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BSTDT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BSARK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IHREZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL42" type="{}DELVRY03.E1EDL42" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL41", propOrder = {
    "quali",
    "bstnr",
    "bstdt",
    "bsark",
    "ihrez",
    "posex",
    "e1EDL42"
})
public class DELVRY03E1EDL41 {

    @XmlElement(name = "QUALI")
    protected String quali;
    @XmlElement(name = "BSTNR")
    protected String bstnr;
    @XmlElement(name = "BSTDT")
    protected String bstdt;
    @XmlElement(name = "BSARK")
    protected String bsark;
    @XmlElement(name = "IHREZ")
    protected String ihrez;
    @XmlElement(name = "POSEX")
    protected String posex;
    @XmlElement(name = "E1EDL42")
    protected DELVRY03E1EDL42 e1EDL42;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad quali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUALI() {
        return quali;
    }

    /**
     * Define el valor de la propiedad quali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUALI(String value) {
        this.quali = value;
    }

    /**
     * Obtiene el valor de la propiedad bstnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSTNR() {
        return bstnr;
    }

    /**
     * Define el valor de la propiedad bstnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSTNR(String value) {
        this.bstnr = value;
    }

    /**
     * Obtiene el valor de la propiedad bstdt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSTDT() {
        return bstdt;
    }

    /**
     * Define el valor de la propiedad bstdt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSTDT(String value) {
        this.bstdt = value;
    }

    /**
     * Obtiene el valor de la propiedad bsark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSARK() {
        return bsark;
    }

    /**
     * Define el valor de la propiedad bsark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSARK(String value) {
        this.bsark = value;
    }

    /**
     * Obtiene el valor de la propiedad ihrez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIHREZ() {
        return ihrez;
    }

    /**
     * Define el valor de la propiedad ihrez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIHREZ(String value) {
        this.ihrez = value;
    }

    /**
     * Obtiene el valor de la propiedad posex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSEX() {
        return posex;
    }

    /**
     * Define el valor de la propiedad posex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSEX(String value) {
        this.posex = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL42.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL42 }
     *     
     */
    public DELVRY03E1EDL42 getE1EDL42() {
        return e1EDL42;
    }

    /**
     * Define el valor de la propiedad e1EDL42.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL42 }
     *     
     */
    public void setE1EDL42(DELVRY03E1EDL42 value) {
        this.e1EDL42 = value;
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
