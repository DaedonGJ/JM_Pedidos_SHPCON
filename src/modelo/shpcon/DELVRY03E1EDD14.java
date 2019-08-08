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
 * DG control data (delivery item)
 * 
 * <p>Clase Java para DELVRY03.E1EDD14 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD14">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DGARAND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGPULIM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGPAS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DGREPQU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "DELVRY03.E1EDD14", propOrder = {
    "dgarand",
    "dgpulim",
    "dgpas",
    "dgrepqu"
})
public class DELVRY03E1EDD14 {

    @XmlElement(name = "DGARAND")
    protected String dgarand;
    @XmlElement(name = "DGPULIM")
    protected String dgpulim;
    @XmlElement(name = "DGPAS")
    protected String dgpas;
    @XmlElement(name = "DGREPQU")
    protected String dgrepqu;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad dgarand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGARAND() {
        return dgarand;
    }

    /**
     * Define el valor de la propiedad dgarand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGARAND(String value) {
        this.dgarand = value;
    }

    /**
     * Obtiene el valor de la propiedad dgpulim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGPULIM() {
        return dgpulim;
    }

    /**
     * Define el valor de la propiedad dgpulim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGPULIM(String value) {
        this.dgpulim = value;
    }

    /**
     * Obtiene el valor de la propiedad dgpas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGPAS() {
        return dgpas;
    }

    /**
     * Define el valor de la propiedad dgpas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGPAS(String value) {
        this.dgpas = value;
    }

    /**
     * Obtiene el valor de la propiedad dgrepqu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGREPQU() {
        return dgrepqu;
    }

    /**
     * Define el valor de la propiedad dgrepqu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGREPQU(String value) {
        this.dgrepqu = value;
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
