//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.08.08 a las 01:36:33 PM CEST 
//


package modelo.shpcon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Route Stages
 * 
 * <p>Clase Java para DELVRY03.E1EDL30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL30">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABNUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANFRF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISTZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEDST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TSTYP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL31" type="{}DELVRY03.E1EDL31" minOccurs="0"/>
 *         &lt;element name="E1EDL32" type="{}DELVRY03.E1EDL32" maxOccurs="9" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL30", propOrder = {
    "abnum",
    "anfrf",
    "vsart",
    "distz",
    "medst",
    "tstyp",
    "e1EDL31",
    "e1EDL32"
})
public class DELVRY03E1EDL30 {

    @XmlElement(name = "ABNUM")
    protected String abnum;
    @XmlElement(name = "ANFRF")
    protected String anfrf;
    @XmlElement(name = "VSART")
    protected String vsart;
    @XmlElement(name = "DISTZ")
    protected String distz;
    @XmlElement(name = "MEDST")
    protected String medst;
    @XmlElement(name = "TSTYP")
    protected String tstyp;
    @XmlElement(name = "E1EDL31")
    protected DELVRY03E1EDL31 e1EDL31;
    @XmlElement(name = "E1EDL32")
    protected List<DELVRY03E1EDL32> e1EDL32;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad abnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABNUM() {
        return abnum;
    }

    /**
     * Define el valor de la propiedad abnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABNUM(String value) {
        this.abnum = value;
    }

    /**
     * Obtiene el valor de la propiedad anfrf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANFRF() {
        return anfrf;
    }

    /**
     * Define el valor de la propiedad anfrf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANFRF(String value) {
        this.anfrf = value;
    }

    /**
     * Obtiene el valor de la propiedad vsart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSART() {
        return vsart;
    }

    /**
     * Define el valor de la propiedad vsart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSART(String value) {
        this.vsart = value;
    }

    /**
     * Obtiene el valor de la propiedad distz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTZ() {
        return distz;
    }

    /**
     * Define el valor de la propiedad distz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTZ(String value) {
        this.distz = value;
    }

    /**
     * Obtiene el valor de la propiedad medst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDST() {
        return medst;
    }

    /**
     * Define el valor de la propiedad medst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDST(String value) {
        this.medst = value;
    }

    /**
     * Obtiene el valor de la propiedad tstyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSTYP() {
        return tstyp;
    }

    /**
     * Define el valor de la propiedad tstyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSTYP(String value) {
        this.tstyp = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL31.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL31 }
     *     
     */
    public DELVRY03E1EDL31 getE1EDL31() {
        return e1EDL31;
    }

    /**
     * Define el valor de la propiedad e1EDL31.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL31 }
     *     
     */
    public void setE1EDL31(DELVRY03E1EDL31 value) {
        this.e1EDL31 = value;
    }

    /**
     * Gets the value of the e1EDL32 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL32 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL32().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL32 }
     * 
     * 
     */
    public List<DELVRY03E1EDL32> getE1EDL32() {
        if (e1EDL32 == null) {
            e1EDL32 = new ArrayList<DELVRY03E1EDL32>();
        }
        return this.e1EDL32;
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
