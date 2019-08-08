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
 * IDoc: Deadline (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDT13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDT13">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QUALF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSTZW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSTZW_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTANF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTANZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTEND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTENZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TZONE_BEG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISDD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISDZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IEDD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IEDZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TZONE_END" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VORNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSTGA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSTGA_BEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EVENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EVENT_ALI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL40" type="{}DELVRY03.E1EDL40" minOccurs="0"/>
 *         &lt;element name="E1TXTH0" type="{}DELVRY03.E1TXTH0" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDT13", propOrder = {
    "qualf",
    "vstzw",
    "vstzwbez",
    "ntanf",
    "ntanz",
    "ntend",
    "ntenz",
    "tzonebeg",
    "isdd",
    "isdz",
    "iedd",
    "iedz",
    "tzoneend",
    "vornr",
    "vstga",
    "vstgabez",
    "event",
    "eventali",
    "e1EDL40",
    "e1TXTH0"
})
public class DELVRY03E1EDT13 {

    @XmlElement(name = "QUALF")
    protected String qualf;
    @XmlElement(name = "VSTZW")
    protected String vstzw;
    @XmlElement(name = "VSTZW_BEZ")
    protected String vstzwbez;
    @XmlElement(name = "NTANF")
    protected String ntanf;
    @XmlElement(name = "NTANZ")
    protected String ntanz;
    @XmlElement(name = "NTEND")
    protected String ntend;
    @XmlElement(name = "NTENZ")
    protected String ntenz;
    @XmlElement(name = "TZONE_BEG")
    protected String tzonebeg;
    @XmlElement(name = "ISDD")
    protected String isdd;
    @XmlElement(name = "ISDZ")
    protected String isdz;
    @XmlElement(name = "IEDD")
    protected String iedd;
    @XmlElement(name = "IEDZ")
    protected String iedz;
    @XmlElement(name = "TZONE_END")
    protected String tzoneend;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "VSTGA")
    protected String vstga;
    @XmlElement(name = "VSTGA_BEZ")
    protected String vstgabez;
    @XmlElement(name = "EVENT")
    protected String event;
    @XmlElement(name = "EVENT_ALI")
    protected String eventali;
    @XmlElement(name = "E1EDL40")
    protected DELVRY03E1EDL40 e1EDL40;
    @XmlElement(name = "E1TXTH0")
    protected List<DELVRY03E1TXTH0> e1TXTH0;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad qualf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUALF() {
        return qualf;
    }

    /**
     * Define el valor de la propiedad qualf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUALF(String value) {
        this.qualf = value;
    }

    /**
     * Obtiene el valor de la propiedad vstzw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSTZW() {
        return vstzw;
    }

    /**
     * Define el valor de la propiedad vstzw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSTZW(String value) {
        this.vstzw = value;
    }

    /**
     * Obtiene el valor de la propiedad vstzwbez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSTZWBEZ() {
        return vstzwbez;
    }

    /**
     * Define el valor de la propiedad vstzwbez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSTZWBEZ(String value) {
        this.vstzwbez = value;
    }

    /**
     * Obtiene el valor de la propiedad ntanf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTANF() {
        return ntanf;
    }

    /**
     * Define el valor de la propiedad ntanf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTANF(String value) {
        this.ntanf = value;
    }

    /**
     * Obtiene el valor de la propiedad ntanz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTANZ() {
        return ntanz;
    }

    /**
     * Define el valor de la propiedad ntanz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTANZ(String value) {
        this.ntanz = value;
    }

    /**
     * Obtiene el valor de la propiedad ntend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTEND() {
        return ntend;
    }

    /**
     * Define el valor de la propiedad ntend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTEND(String value) {
        this.ntend = value;
    }

    /**
     * Obtiene el valor de la propiedad ntenz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTENZ() {
        return ntenz;
    }

    /**
     * Define el valor de la propiedad ntenz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTENZ(String value) {
        this.ntenz = value;
    }

    /**
     * Obtiene el valor de la propiedad tzonebeg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTZONEBEG() {
        return tzonebeg;
    }

    /**
     * Define el valor de la propiedad tzonebeg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTZONEBEG(String value) {
        this.tzonebeg = value;
    }

    /**
     * Obtiene el valor de la propiedad isdd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDD() {
        return isdd;
    }

    /**
     * Define el valor de la propiedad isdd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDD(String value) {
        this.isdd = value;
    }

    /**
     * Obtiene el valor de la propiedad isdz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDZ() {
        return isdz;
    }

    /**
     * Define el valor de la propiedad isdz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDZ(String value) {
        this.isdz = value;
    }

    /**
     * Obtiene el valor de la propiedad iedd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIEDD() {
        return iedd;
    }

    /**
     * Define el valor de la propiedad iedd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIEDD(String value) {
        this.iedd = value;
    }

    /**
     * Obtiene el valor de la propiedad iedz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIEDZ() {
        return iedz;
    }

    /**
     * Define el valor de la propiedad iedz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIEDZ(String value) {
        this.iedz = value;
    }

    /**
     * Obtiene el valor de la propiedad tzoneend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTZONEEND() {
        return tzoneend;
    }

    /**
     * Define el valor de la propiedad tzoneend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTZONEEND(String value) {
        this.tzoneend = value;
    }

    /**
     * Obtiene el valor de la propiedad vornr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNR() {
        return vornr;
    }

    /**
     * Define el valor de la propiedad vornr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNR(String value) {
        this.vornr = value;
    }

    /**
     * Obtiene el valor de la propiedad vstga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSTGA() {
        return vstga;
    }

    /**
     * Define el valor de la propiedad vstga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSTGA(String value) {
        this.vstga = value;
    }

    /**
     * Obtiene el valor de la propiedad vstgabez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSTGABEZ() {
        return vstgabez;
    }

    /**
     * Define el valor de la propiedad vstgabez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSTGABEZ(String value) {
        this.vstgabez = value;
    }

    /**
     * Obtiene el valor de la propiedad event.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENT() {
        return event;
    }

    /**
     * Define el valor de la propiedad event.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENT(String value) {
        this.event = value;
    }

    /**
     * Obtiene el valor de la propiedad eventali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTALI() {
        return eventali;
    }

    /**
     * Define el valor de la propiedad eventali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTALI(String value) {
        this.eventali = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL40.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL40 }
     *     
     */
    public DELVRY03E1EDL40 getE1EDL40() {
        return e1EDL40;
    }

    /**
     * Define el valor de la propiedad e1EDL40.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL40 }
     *     
     */
    public void setE1EDL40(DELVRY03E1EDL40 value) {
        this.e1EDL40 = value;
    }

    /**
     * Gets the value of the e1TXTH0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1TXTH0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1TXTH0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1TXTH0 }
     * 
     * 
     */
    public List<DELVRY03E1TXTH0> getE1TXTH0() {
        if (e1TXTH0 == null) {
            e1TXTH0 = new ArrayList<DELVRY03E1TXTH0>();
        }
        return this.e1TXTH0;
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
