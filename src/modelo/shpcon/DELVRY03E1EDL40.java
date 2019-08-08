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
 * Points (delivery deadlines)
 * 
 * <p>Clase Java para DELVRY03.E1EDL40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL40">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KNOTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KNOTE_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1ADRM2" type="{}DELVRY03.E1ADRM2" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL40", propOrder = {
    "knote",
    "knotebez",
    "e1ADRM2"
})
public class DELVRY03E1EDL40 {

    @XmlElement(name = "KNOTE")
    protected String knote;
    @XmlElement(name = "KNOTE_BEZ")
    protected String knotebez;
    @XmlElement(name = "E1ADRM2")
    protected DELVRY03E1ADRM2 e1ADRM2;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad knote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKNOTE() {
        return knote;
    }

    /**
     * Define el valor de la propiedad knote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKNOTE(String value) {
        this.knote = value;
    }

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
     * Obtiene el valor de la propiedad e1ADRM2.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1ADRM2 }
     *     
     */
    public DELVRY03E1ADRM2 getE1ADRM2() {
        return e1ADRM2;
    }

    /**
     * Define el valor de la propiedad e1ADRM2.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1ADRM2 }
     *     
     */
    public void setE1ADRM2(DELVRY03E1ADRM2 value) {
        this.e1ADRM2 = value;
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
