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
 * DG item data descriptions 1 (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD11">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VKTRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGNA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRESD2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRESD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGRESD3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGREDMP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="132"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGREDRQ" minOccurs="0">
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
@XmlType(name = "DELVRY03.E1EDD11", propOrder = {
    "vktrt",
    "dgna",
    "dgresd2",
    "dgresd",
    "dgresd3",
    "dgredmp",
    "dgredrq"
})
public class DELVRY03E1EDD11 {

    @XmlElement(name = "VKTRT")
    protected String vktrt;
    @XmlElement(name = "DGNA")
    protected String dgna;
    @XmlElement(name = "DGRESD2")
    protected String dgresd2;
    @XmlElement(name = "DGRESD")
    protected String dgresd;
    @XmlElement(name = "DGRESD3")
    protected String dgresd3;
    @XmlElement(name = "DGREDMP")
    protected String dgredmp;
    @XmlElement(name = "DGREDRQ")
    protected String dgredrq;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad vktrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKTRT() {
        return vktrt;
    }

    /**
     * Define el valor de la propiedad vktrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKTRT(String value) {
        this.vktrt = value;
    }

    /**
     * Obtiene el valor de la propiedad dgna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGNA() {
        return dgna;
    }

    /**
     * Define el valor de la propiedad dgna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGNA(String value) {
        this.dgna = value;
    }

    /**
     * Obtiene el valor de la propiedad dgresd2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRESD2() {
        return dgresd2;
    }

    /**
     * Define el valor de la propiedad dgresd2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRESD2(String value) {
        this.dgresd2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dgresd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRESD() {
        return dgresd;
    }

    /**
     * Define el valor de la propiedad dgresd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRESD(String value) {
        this.dgresd = value;
    }

    /**
     * Obtiene el valor de la propiedad dgresd3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGRESD3() {
        return dgresd3;
    }

    /**
     * Define el valor de la propiedad dgresd3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGRESD3(String value) {
        this.dgresd3 = value;
    }

    /**
     * Obtiene el valor de la propiedad dgredmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGREDMP() {
        return dgredmp;
    }

    /**
     * Define el valor de la propiedad dgredmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGREDMP(String value) {
        this.dgredmp = value;
    }

    /**
     * Obtiene el valor de la propiedad dgredrq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGREDRQ() {
        return dgredrq;
    }

    /**
     * Define el valor de la propiedad dgredrq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGREDRQ(String value) {
        this.dgredrq = value;
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
