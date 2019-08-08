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
 * Delivery header
 * 
 * <p>Clase Java para DELVRY03.E1EDL20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VBELN" minOccurs="0">
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
 *         &lt;element name="VKORG" minOccurs="0">
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
 *         &lt;element name="VKBUR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
 *         &lt;element name="ABLAD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INCO1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INCO2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ROUTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VSBED" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BTGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GEWEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLEH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANZPK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BOLNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRATY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRAID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XABLN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PARID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PODAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POTIM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LOC_SEQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAX_ERR_TYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LE_SCENARIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RECIPIENT_CREATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL22" type="{}DELVRY03.E1EDL22" minOccurs="0"/>
 *         &lt;element name="E1EDL21" type="{}DELVRY03.E1EDL21" minOccurs="0"/>
 *         &lt;element name="E1EDL51" type="{}DELVRY03.E1EDL51" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDD01" type="{}DELVRY03.E1EDD01" minOccurs="0"/>
 *         &lt;element name="E1EDL18" type="{}DELVRY03.E1EDL18" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDL55" type="{}DELVRY03.E1EDL55" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1ADRM1" type="{}DELVRY03.E1ADRM1" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDT13" type="{}DELVRY03.E1EDT13" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1TXTH8" type="{}DELVRY03.E1TXTH8" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDDH2" type="{}DELVRY03.E1EDDH2" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="E1EDL33" type="{}DELVRY03.E1EDL33" minOccurs="0"/>
 *         &lt;element name="E1EDL28" type="{}DELVRY03.E1EDL28" minOccurs="0"/>
 *         &lt;element name="E1EDL47" type="{}DELVRY03.E1EDL47" minOccurs="0"/>
 *         &lt;element name="E1EDL24" type="{}DELVRY03.E1EDL24" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDL37" type="{}DELVRY03.E1EDL37" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="E1EDL54" type="{}DELVRY03.E1EDL54" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL20", propOrder = {
    "vbeln",
    "vstel",
    "vkorg",
    "lstel",
    "vkbur",
    "lgnum",
    "ablad",
    "inco1",
    "inco2",
    "route",
    "vsbed",
    "btgew",
    "ntgew",
    "gewei",
    "volum",
    "voleh",
    "anzpk",
    "bolnr",
    "traty",
    "traid",
    "xabln",
    "lifex",
    "parid",
    "podat",
    "potim",
    "locseq",
    "hold",
    "maxerrtype",
    "lescenario",
    "recipientcreate",
    "e1EDL22",
    "e1EDL21",
    "e1EDL51",
    "e1EDD01",
    "e1EDL18",
    "e1EDL55",
    "e1ADRM1",
    "e1EDT13",
    "e1TXTH8",
    "e1EDDH2",
    "e1EDL33",
    "e1EDL28",
    "e1EDL47",
    "e1EDL24",
    "e1EDL37",
    "e1EDL54"
})
public class DELVRY03E1EDL20 {

    @XmlElement(name = "VBELN")
    protected String vbeln;
    @XmlElement(name = "VSTEL")
    protected String vstel;
    @XmlElement(name = "VKORG")
    protected String vkorg;
    @XmlElement(name = "LSTEL")
    protected String lstel;
    @XmlElement(name = "VKBUR")
    protected String vkbur;
    @XmlElement(name = "LGNUM")
    protected String lgnum;
    @XmlElement(name = "ABLAD")
    protected String ablad;
    @XmlElement(name = "INCO1")
    protected String inco1;
    @XmlElement(name = "INCO2")
    protected String inco2;
    @XmlElement(name = "ROUTE")
    protected String route;
    @XmlElement(name = "VSBED")
    protected String vsbed;
    @XmlElement(name = "BTGEW")
    protected String btgew;
    @XmlElement(name = "NTGEW")
    protected String ntgew;
    @XmlElement(name = "GEWEI")
    protected String gewei;
    @XmlElement(name = "VOLUM")
    protected String volum;
    @XmlElement(name = "VOLEH")
    protected String voleh;
    @XmlElement(name = "ANZPK")
    protected String anzpk;
    @XmlElement(name = "BOLNR")
    protected String bolnr;
    @XmlElement(name = "TRATY")
    protected String traty;
    @XmlElement(name = "TRAID")
    protected String traid;
    @XmlElement(name = "XABLN")
    protected String xabln;
    @XmlElement(name = "LIFEX")
    protected String lifex;
    @XmlElement(name = "PARID")
    protected String parid;
    @XmlElement(name = "PODAT")
    protected String podat;
    @XmlElement(name = "POTIM")
    protected String potim;
    @XmlElement(name = "LOC_SEQ")
    protected String locseq;
    @XmlElement(name = "HOLD")
    protected String hold;
    @XmlElement(name = "MAX_ERR_TYPE")
    protected String maxerrtype;
    @XmlElement(name = "LE_SCENARIO")
    protected String lescenario;
    @XmlElement(name = "RECIPIENT_CREATE")
    protected String recipientcreate;
    @XmlElement(name = "E1EDL22")
    protected DELVRY03E1EDL22 e1EDL22;
    @XmlElement(name = "E1EDL21")
    protected DELVRY03E1EDL21 e1EDL21;
    @XmlElement(name = "E1EDL51")
    protected List<DELVRY03E1EDL51> e1EDL51;
    @XmlElement(name = "E1EDD01")
    protected DELVRY03E1EDD01 e1EDD01;
    @XmlElement(name = "E1EDL18")
    protected List<DELVRY03E1EDL18> e1EDL18;
    @XmlElement(name = "E1EDL55")
    protected List<DELVRY03E1EDL55> e1EDL55;
    @XmlElement(name = "E1ADRM1")
    protected List<DELVRY03E1ADRM1> e1ADRM1;
    @XmlElement(name = "E1EDT13")
    protected List<DELVRY03E1EDT13> e1EDT13;
    @XmlElement(name = "E1TXTH8")
    protected List<DELVRY03E1TXTH8> e1TXTH8;
    @XmlElement(name = "E1EDDH2")
    protected List<DELVRY03E1EDDH2> e1EDDH2;
    @XmlElement(name = "E1EDL33")
    protected DELVRY03E1EDL33 e1EDL33;
    @XmlElement(name = "E1EDL28")
    protected DELVRY03E1EDL28 e1EDL28;
    @XmlElement(name = "E1EDL47")
    protected DELVRY03E1EDL47 e1EDL47;
    @XmlElement(name = "E1EDL24")
    protected List<DELVRY03E1EDL24> e1EDL24;
    @XmlElement(name = "E1EDL37")
    protected List<DELVRY03E1EDL37> e1EDL37;
    @XmlElement(name = "E1EDL54")
    protected List<DELVRY03E1EDL54> e1EDL54;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad vbeln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBELN() {
        return vbeln;
    }

    /**
     * Define el valor de la propiedad vbeln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBELN(String value) {
        this.vbeln = value;
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
     * Obtiene el valor de la propiedad vkorg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKORG() {
        return vkorg;
    }

    /**
     * Define el valor de la propiedad vkorg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKORG(String value) {
        this.vkorg = value;
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
     * Obtiene el valor de la propiedad vkbur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKBUR() {
        return vkbur;
    }

    /**
     * Define el valor de la propiedad vkbur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKBUR(String value) {
        this.vkbur = value;
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
     * Obtiene el valor de la propiedad inco1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCO1() {
        return inco1;
    }

    /**
     * Define el valor de la propiedad inco1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCO1(String value) {
        this.inco1 = value;
    }

    /**
     * Obtiene el valor de la propiedad inco2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCO2() {
        return inco2;
    }

    /**
     * Define el valor de la propiedad inco2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCO2(String value) {
        this.inco2 = value;
    }

    /**
     * Obtiene el valor de la propiedad route.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTE() {
        return route;
    }

    /**
     * Define el valor de la propiedad route.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTE(String value) {
        this.route = value;
    }

    /**
     * Obtiene el valor de la propiedad vsbed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSBED() {
        return vsbed;
    }

    /**
     * Define el valor de la propiedad vsbed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSBED(String value) {
        this.vsbed = value;
    }

    /**
     * Obtiene el valor de la propiedad btgew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTGEW() {
        return btgew;
    }

    /**
     * Define el valor de la propiedad btgew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTGEW(String value) {
        this.btgew = value;
    }

    /**
     * Obtiene el valor de la propiedad ntgew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTGEW() {
        return ntgew;
    }

    /**
     * Define el valor de la propiedad ntgew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTGEW(String value) {
        this.ntgew = value;
    }

    /**
     * Obtiene el valor de la propiedad gewei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEWEI() {
        return gewei;
    }

    /**
     * Define el valor de la propiedad gewei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEWEI(String value) {
        this.gewei = value;
    }

    /**
     * Obtiene el valor de la propiedad volum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLUM() {
        return volum;
    }

    /**
     * Define el valor de la propiedad volum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLUM(String value) {
        this.volum = value;
    }

    /**
     * Obtiene el valor de la propiedad voleh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLEH() {
        return voleh;
    }

    /**
     * Define el valor de la propiedad voleh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLEH(String value) {
        this.voleh = value;
    }

    /**
     * Obtiene el valor de la propiedad anzpk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZPK() {
        return anzpk;
    }

    /**
     * Define el valor de la propiedad anzpk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZPK(String value) {
        this.anzpk = value;
    }

    /**
     * Obtiene el valor de la propiedad bolnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOLNR() {
        return bolnr;
    }

    /**
     * Define el valor de la propiedad bolnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOLNR(String value) {
        this.bolnr = value;
    }

    /**
     * Obtiene el valor de la propiedad traty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRATY() {
        return traty;
    }

    /**
     * Define el valor de la propiedad traty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRATY(String value) {
        this.traty = value;
    }

    /**
     * Obtiene el valor de la propiedad traid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRAID() {
        return traid;
    }

    /**
     * Define el valor de la propiedad traid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRAID(String value) {
        this.traid = value;
    }

    /**
     * Obtiene el valor de la propiedad xabln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXABLN() {
        return xabln;
    }

    /**
     * Define el valor de la propiedad xabln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXABLN(String value) {
        this.xabln = value;
    }

    /**
     * Obtiene el valor de la propiedad lifex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFEX() {
        return lifex;
    }

    /**
     * Define el valor de la propiedad lifex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFEX(String value) {
        this.lifex = value;
    }

    /**
     * Obtiene el valor de la propiedad parid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARID() {
        return parid;
    }

    /**
     * Define el valor de la propiedad parid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARID(String value) {
        this.parid = value;
    }

    /**
     * Obtiene el valor de la propiedad podat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPODAT() {
        return podat;
    }

    /**
     * Define el valor de la propiedad podat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPODAT(String value) {
        this.podat = value;
    }

    /**
     * Obtiene el valor de la propiedad potim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOTIM() {
        return potim;
    }

    /**
     * Define el valor de la propiedad potim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOTIM(String value) {
        this.potim = value;
    }

    /**
     * Obtiene el valor de la propiedad locseq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCSEQ() {
        return locseq;
    }

    /**
     * Define el valor de la propiedad locseq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCSEQ(String value) {
        this.locseq = value;
    }

    /**
     * Obtiene el valor de la propiedad hold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLD() {
        return hold;
    }

    /**
     * Define el valor de la propiedad hold.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLD(String value) {
        this.hold = value;
    }

    /**
     * Obtiene el valor de la propiedad maxerrtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXERRTYPE() {
        return maxerrtype;
    }

    /**
     * Define el valor de la propiedad maxerrtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXERRTYPE(String value) {
        this.maxerrtype = value;
    }

    /**
     * Obtiene el valor de la propiedad lescenario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLESCENARIO() {
        return lescenario;
    }

    /**
     * Define el valor de la propiedad lescenario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLESCENARIO(String value) {
        this.lescenario = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientcreate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECIPIENTCREATE() {
        return recipientcreate;
    }

    /**
     * Define el valor de la propiedad recipientcreate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECIPIENTCREATE(String value) {
        this.recipientcreate = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL22.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL22 }
     *     
     */
    public DELVRY03E1EDL22 getE1EDL22() {
        return e1EDL22;
    }

    /**
     * Define el valor de la propiedad e1EDL22.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL22 }
     *     
     */
    public void setE1EDL22(DELVRY03E1EDL22 value) {
        this.e1EDL22 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL21.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL21 }
     *     
     */
    public DELVRY03E1EDL21 getE1EDL21() {
        return e1EDL21;
    }

    /**
     * Define el valor de la propiedad e1EDL21.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL21 }
     *     
     */
    public void setE1EDL21(DELVRY03E1EDL21 value) {
        this.e1EDL21 = value;
    }

    /**
     * Gets the value of the e1EDL51 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL51 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL51().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL51 }
     * 
     * 
     */
    public List<DELVRY03E1EDL51> getE1EDL51() {
        if (e1EDL51 == null) {
            e1EDL51 = new ArrayList<DELVRY03E1EDL51>();
        }
        return this.e1EDL51;
    }

    /**
     * Obtiene el valor de la propiedad e1EDD01.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDD01 }
     *     
     */
    public DELVRY03E1EDD01 getE1EDD01() {
        return e1EDD01;
    }

    /**
     * Define el valor de la propiedad e1EDD01.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDD01 }
     *     
     */
    public void setE1EDD01(DELVRY03E1EDD01 value) {
        this.e1EDD01 = value;
    }

    /**
     * Gets the value of the e1EDL18 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL18 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL18().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL18 }
     * 
     * 
     */
    public List<DELVRY03E1EDL18> getE1EDL18() {
        if (e1EDL18 == null) {
            e1EDL18 = new ArrayList<DELVRY03E1EDL18>();
        }
        return this.e1EDL18;
    }

    /**
     * Gets the value of the e1EDL55 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL55 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL55().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL55 }
     * 
     * 
     */
    public List<DELVRY03E1EDL55> getE1EDL55() {
        if (e1EDL55 == null) {
            e1EDL55 = new ArrayList<DELVRY03E1EDL55>();
        }
        return this.e1EDL55;
    }

    /**
     * Gets the value of the e1ADRM1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1ADRM1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1ADRM1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1ADRM1 }
     * 
     * 
     */
    public List<DELVRY03E1ADRM1> getE1ADRM1() {
        if (e1ADRM1 == null) {
            e1ADRM1 = new ArrayList<DELVRY03E1ADRM1>();
        }
        return this.e1ADRM1;
    }

    /**
     * Gets the value of the e1EDT13 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDT13 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDT13().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDT13 }
     * 
     * 
     */
    public List<DELVRY03E1EDT13> getE1EDT13() {
        if (e1EDT13 == null) {
            e1EDT13 = new ArrayList<DELVRY03E1EDT13>();
        }
        return this.e1EDT13;
    }

    /**
     * Gets the value of the e1TXTH8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1TXTH8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1TXTH8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1TXTH8 }
     * 
     * 
     */
    public List<DELVRY03E1TXTH8> getE1TXTH8() {
        if (e1TXTH8 == null) {
            e1TXTH8 = new ArrayList<DELVRY03E1TXTH8>();
        }
        return this.e1TXTH8;
    }

    /**
     * Gets the value of the e1EDDH2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDDH2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDDH2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDDH2 }
     * 
     * 
     */
    public List<DELVRY03E1EDDH2> getE1EDDH2() {
        if (e1EDDH2 == null) {
            e1EDDH2 = new ArrayList<DELVRY03E1EDDH2>();
        }
        return this.e1EDDH2;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL33.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL33 }
     *     
     */
    public DELVRY03E1EDL33 getE1EDL33() {
        return e1EDL33;
    }

    /**
     * Define el valor de la propiedad e1EDL33.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL33 }
     *     
     */
    public void setE1EDL33(DELVRY03E1EDL33 value) {
        this.e1EDL33 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL28.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL28 }
     *     
     */
    public DELVRY03E1EDL28 getE1EDL28() {
        return e1EDL28;
    }

    /**
     * Define el valor de la propiedad e1EDL28.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL28 }
     *     
     */
    public void setE1EDL28(DELVRY03E1EDL28 value) {
        this.e1EDL28 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL47.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL47 }
     *     
     */
    public DELVRY03E1EDL47 getE1EDL47() {
        return e1EDL47;
    }

    /**
     * Define el valor de la propiedad e1EDL47.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL47 }
     *     
     */
    public void setE1EDL47(DELVRY03E1EDL47 value) {
        this.e1EDL47 = value;
    }

    /**
     * Gets the value of the e1EDL24 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL24 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL24().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL24 }
     * 
     * 
     */
    public List<DELVRY03E1EDL24> getE1EDL24() {
        if (e1EDL24 == null) {
            e1EDL24 = new ArrayList<DELVRY03E1EDL24>();
        }
        return this.e1EDL24;
    }

    /**
     * Gets the value of the e1EDL37 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL37 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL37().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL37 }
     * 
     * 
     */
    public List<DELVRY03E1EDL37> getE1EDL37() {
        if (e1EDL37 == null) {
            e1EDL37 = new ArrayList<DELVRY03E1EDL37>();
        }
        return this.e1EDL37;
    }

    /**
     * Gets the value of the e1EDL54 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL54 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL54().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL54 }
     * 
     * 
     */
    public List<DELVRY03E1EDL54> getE1EDL54() {
        if (e1EDL54 == null) {
            e1EDL54 = new ArrayList<DELVRY03E1EDL54>();
        }
        return this.e1EDL54;
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
