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
 * Route Stage Point
 * 
 * <p>Clase Java para DELVRY03.E1EDL32 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL32">
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
 *         &lt;element name="KNOTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADRNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSTEL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LSTEL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WERKS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGORT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KUNNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ABLAD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGNUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGTOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL45" type="{}DELVRY03.E1EDL45" minOccurs="0"/>
 *         &lt;element name="E1ADRM3" type="{}DELVRY03.E1ADRM3" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL32", propOrder = {
    "quali",
    "knote",
    "adrnr",
    "vstel",
    "lstel",
    "werks",
    "lgort",
    "kunnr",
    "lifnr",
    "ablad",
    "lgnum",
    "lgtor",
    "e1EDL45",
    "e1ADRM3"
})
public class DELVRY03E1EDL32 {

    @XmlElement(name = "QUALI")
    protected String quali;
    @XmlElement(name = "KNOTE")
    protected String knote;
    @XmlElement(name = "ADRNR")
    protected String adrnr;
    @XmlElement(name = "VSTEL")
    protected String vstel;
    @XmlElement(name = "LSTEL")
    protected String lstel;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "LGORT")
    protected String lgort;
    @XmlElement(name = "KUNNR")
    protected String kunnr;
    @XmlElement(name = "LIFNR")
    protected String lifnr;
    @XmlElement(name = "ABLAD")
    protected String ablad;
    @XmlElement(name = "LGNUM")
    protected String lgnum;
    @XmlElement(name = "LGTOR")
    protected String lgtor;
    @XmlElement(name = "E1EDL45")
    protected DELVRY03E1EDL45 e1EDL45;
    @XmlElement(name = "E1ADRM3")
    protected DELVRY03E1ADRM3 e1ADRM3;
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
     * Obtiene el valor de la propiedad adrnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRNR() {
        return adrnr;
    }

    /**
     * Define el valor de la propiedad adrnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRNR(String value) {
        this.adrnr = value;
    }

    /**
     * Obtiene el valor de la propiedad vstel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSTEL() {
        return vstel;
    }

    /**
     * Define el valor de la propiedad vstel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSTEL(String value) {
        this.vstel = value;
    }

    /**
     * Obtiene el valor de la propiedad lstel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSTEL() {
        return lstel;
    }

    /**
     * Define el valor de la propiedad lstel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSTEL(String value) {
        this.lstel = value;
    }

    /**
     * Obtiene el valor de la propiedad werks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * Define el valor de la propiedad werks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * Obtiene el valor de la propiedad lgort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGORT() {
        return lgort;
    }

    /**
     * Define el valor de la propiedad lgort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGORT(String value) {
        this.lgort = value;
    }

    /**
     * Obtiene el valor de la propiedad kunnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNNR() {
        return kunnr;
    }

    /**
     * Define el valor de la propiedad kunnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNNR(String value) {
        this.kunnr = value;
    }

    /**
     * Obtiene el valor de la propiedad lifnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFNR() {
        return lifnr;
    }

    /**
     * Define el valor de la propiedad lifnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFNR(String value) {
        this.lifnr = value;
    }

    /**
     * Obtiene el valor de la propiedad ablad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABLAD() {
        return ablad;
    }

    /**
     * Define el valor de la propiedad ablad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABLAD(String value) {
        this.ablad = value;
    }

    /**
     * Obtiene el valor de la propiedad lgnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGNUM() {
        return lgnum;
    }

    /**
     * Define el valor de la propiedad lgnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGNUM(String value) {
        this.lgnum = value;
    }

    /**
     * Obtiene el valor de la propiedad lgtor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGTOR() {
        return lgtor;
    }

    /**
     * Define el valor de la propiedad lgtor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGTOR(String value) {
        this.lgtor = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL45.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL45 }
     *     
     */
    public DELVRY03E1EDL45 getE1EDL45() {
        return e1EDL45;
    }

    /**
     * Define el valor de la propiedad e1EDL45.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL45 }
     *     
     */
    public void setE1EDL45(DELVRY03E1EDL45 value) {
        this.e1EDL45 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1ADRM3.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1ADRM3 }
     *     
     */
    public DELVRY03E1ADRM3 getE1ADRM3() {
        return e1ADRM3;
    }

    /**
     * Define el valor de la propiedad e1ADRM3.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1ADRM3 }
     *     
     */
    public void setE1ADRM3(DELVRY03E1ADRM3 value) {
        this.e1ADRM3 = value;
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
