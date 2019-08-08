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
 * Delivery Item Additional Data
 * 
 * <p>Clase Java para DELVRY03.E1EDL26 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL26">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PSTYV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATKL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRODH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UMVKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UMVKN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KZTLF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UEBTK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UEBTO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UNTTO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHSPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="XCHBW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOBKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PCKPF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAGRV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SHKZG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KOQUI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AKTNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KZUMW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KVGR5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MVGR5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIFEXPOS2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CQU_SA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CQU_SA_UNIT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CQU_ITQS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CQU_ITQS_UNIT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VBUMG_BME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL27" type="{}DELVRY03.E1EDL27" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL26", propOrder = {
    "pstyv",
    "matkl",
    "prodh",
    "umvkz",
    "umvkn",
    "kztlf",
    "uebtk",
    "uebto",
    "untto",
    "chspl",
    "xchbw",
    "posar",
    "sobkz",
    "pckpf",
    "magrv",
    "shkzg",
    "koqui",
    "aktnr",
    "kzumw",
    "kvgr1",
    "kvgr2",
    "kvgr3",
    "kvgr4",
    "kvgr5",
    "mvgr1",
    "mvgr2",
    "mvgr3",
    "mvgr4",
    "mvgr5",
    "lifexpos2",
    "cqusa",
    "cqusaunit",
    "cquitqs",
    "cquitqsunit",
    "vbumgbme",
    "e1EDL27"
})
public class DELVRY03E1EDL26 {

    @XmlElement(name = "PSTYV")
    protected String pstyv;
    @XmlElement(name = "MATKL")
    protected String matkl;
    @XmlElement(name = "PRODH")
    protected String prodh;
    @XmlElement(name = "UMVKZ")
    protected String umvkz;
    @XmlElement(name = "UMVKN")
    protected String umvkn;
    @XmlElement(name = "KZTLF")
    protected String kztlf;
    @XmlElement(name = "UEBTK")
    protected String uebtk;
    @XmlElement(name = "UEBTO")
    protected String uebto;
    @XmlElement(name = "UNTTO")
    protected String untto;
    @XmlElement(name = "CHSPL")
    protected String chspl;
    @XmlElement(name = "XCHBW")
    protected String xchbw;
    @XmlElement(name = "POSAR")
    protected String posar;
    @XmlElement(name = "SOBKZ")
    protected String sobkz;
    @XmlElement(name = "PCKPF")
    protected String pckpf;
    @XmlElement(name = "MAGRV")
    protected String magrv;
    @XmlElement(name = "SHKZG")
    protected String shkzg;
    @XmlElement(name = "KOQUI")
    protected String koqui;
    @XmlElement(name = "AKTNR")
    protected String aktnr;
    @XmlElement(name = "KZUMW")
    protected String kzumw;
    @XmlElement(name = "KVGR1")
    protected String kvgr1;
    @XmlElement(name = "KVGR2")
    protected String kvgr2;
    @XmlElement(name = "KVGR3")
    protected String kvgr3;
    @XmlElement(name = "KVGR4")
    protected String kvgr4;
    @XmlElement(name = "KVGR5")
    protected String kvgr5;
    @XmlElement(name = "MVGR1")
    protected String mvgr1;
    @XmlElement(name = "MVGR2")
    protected String mvgr2;
    @XmlElement(name = "MVGR3")
    protected String mvgr3;
    @XmlElement(name = "MVGR4")
    protected String mvgr4;
    @XmlElement(name = "MVGR5")
    protected String mvgr5;
    @XmlElement(name = "LIFEXPOS2")
    protected String lifexpos2;
    @XmlElement(name = "CQU_SA")
    protected String cqusa;
    @XmlElement(name = "CQU_SA_UNIT")
    protected String cqusaunit;
    @XmlElement(name = "CQU_ITQS")
    protected String cquitqs;
    @XmlElement(name = "CQU_ITQS_UNIT")
    protected String cquitqsunit;
    @XmlElement(name = "VBUMG_BME")
    protected String vbumgbme;
    @XmlElement(name = "E1EDL27")
    protected DELVRY03E1EDL27 e1EDL27;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad pstyv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSTYV() {
        return pstyv;
    }

    /**
     * Define el valor de la propiedad pstyv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSTYV(String value) {
        this.pstyv = value;
    }

    /**
     * Obtiene el valor de la propiedad matkl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATKL() {
        return matkl;
    }

    /**
     * Define el valor de la propiedad matkl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATKL(String value) {
        this.matkl = value;
    }

    /**
     * Obtiene el valor de la propiedad prodh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODH() {
        return prodh;
    }

    /**
     * Define el valor de la propiedad prodh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODH(String value) {
        this.prodh = value;
    }

    /**
     * Obtiene el valor de la propiedad umvkz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMVKZ() {
        return umvkz;
    }

    /**
     * Define el valor de la propiedad umvkz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMVKZ(String value) {
        this.umvkz = value;
    }

    /**
     * Obtiene el valor de la propiedad umvkn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMVKN() {
        return umvkn;
    }

    /**
     * Define el valor de la propiedad umvkn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMVKN(String value) {
        this.umvkn = value;
    }

    /**
     * Obtiene el valor de la propiedad kztlf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZTLF() {
        return kztlf;
    }

    /**
     * Define el valor de la propiedad kztlf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZTLF(String value) {
        this.kztlf = value;
    }

    /**
     * Obtiene el valor de la propiedad uebtk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUEBTK() {
        return uebtk;
    }

    /**
     * Define el valor de la propiedad uebtk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUEBTK(String value) {
        this.uebtk = value;
    }

    /**
     * Obtiene el valor de la propiedad uebto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUEBTO() {
        return uebto;
    }

    /**
     * Define el valor de la propiedad uebto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUEBTO(String value) {
        this.uebto = value;
    }

    /**
     * Obtiene el valor de la propiedad untto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNTTO() {
        return untto;
    }

    /**
     * Define el valor de la propiedad untto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNTTO(String value) {
        this.untto = value;
    }

    /**
     * Obtiene el valor de la propiedad chspl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHSPL() {
        return chspl;
    }

    /**
     * Define el valor de la propiedad chspl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHSPL(String value) {
        this.chspl = value;
    }

    /**
     * Obtiene el valor de la propiedad xchbw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCHBW() {
        return xchbw;
    }

    /**
     * Define el valor de la propiedad xchbw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCHBW(String value) {
        this.xchbw = value;
    }

    /**
     * Obtiene el valor de la propiedad posar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSAR() {
        return posar;
    }

    /**
     * Define el valor de la propiedad posar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSAR(String value) {
        this.posar = value;
    }

    /**
     * Obtiene el valor de la propiedad sobkz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOBKZ() {
        return sobkz;
    }

    /**
     * Define el valor de la propiedad sobkz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOBKZ(String value) {
        this.sobkz = value;
    }

    /**
     * Obtiene el valor de la propiedad pckpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCKPF() {
        return pckpf;
    }

    /**
     * Define el valor de la propiedad pckpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCKPF(String value) {
        this.pckpf = value;
    }

    /**
     * Obtiene el valor de la propiedad magrv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAGRV() {
        return magrv;
    }

    /**
     * Define el valor de la propiedad magrv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAGRV(String value) {
        this.magrv = value;
    }

    /**
     * Obtiene el valor de la propiedad shkzg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHKZG() {
        return shkzg;
    }

    /**
     * Define el valor de la propiedad shkzg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHKZG(String value) {
        this.shkzg = value;
    }

    /**
     * Obtiene el valor de la propiedad koqui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOQUI() {
        return koqui;
    }

    /**
     * Define el valor de la propiedad koqui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOQUI(String value) {
        this.koqui = value;
    }

    /**
     * Obtiene el valor de la propiedad aktnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAKTNR() {
        return aktnr;
    }

    /**
     * Define el valor de la propiedad aktnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAKTNR(String value) {
        this.aktnr = value;
    }

    /**
     * Obtiene el valor de la propiedad kzumw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZUMW() {
        return kzumw;
    }

    /**
     * Define el valor de la propiedad kzumw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZUMW(String value) {
        this.kzumw = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR1() {
        return kvgr1;
    }

    /**
     * Define el valor de la propiedad kvgr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR1(String value) {
        this.kvgr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR2() {
        return kvgr2;
    }

    /**
     * Define el valor de la propiedad kvgr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR2(String value) {
        this.kvgr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR3() {
        return kvgr3;
    }

    /**
     * Define el valor de la propiedad kvgr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR3(String value) {
        this.kvgr3 = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR4() {
        return kvgr4;
    }

    /**
     * Define el valor de la propiedad kvgr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR4(String value) {
        this.kvgr4 = value;
    }

    /**
     * Obtiene el valor de la propiedad kvgr5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKVGR5() {
        return kvgr5;
    }

    /**
     * Define el valor de la propiedad kvgr5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKVGR5(String value) {
        this.kvgr5 = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR1() {
        return mvgr1;
    }

    /**
     * Define el valor de la propiedad mvgr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR1(String value) {
        this.mvgr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR2() {
        return mvgr2;
    }

    /**
     * Define el valor de la propiedad mvgr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR2(String value) {
        this.mvgr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR3() {
        return mvgr3;
    }

    /**
     * Define el valor de la propiedad mvgr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR3(String value) {
        this.mvgr3 = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR4() {
        return mvgr4;
    }

    /**
     * Define el valor de la propiedad mvgr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR4(String value) {
        this.mvgr4 = value;
    }

    /**
     * Obtiene el valor de la propiedad mvgr5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVGR5() {
        return mvgr5;
    }

    /**
     * Define el valor de la propiedad mvgr5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVGR5(String value) {
        this.mvgr5 = value;
    }

    /**
     * Obtiene el valor de la propiedad lifexpos2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIFEXPOS2() {
        return lifexpos2;
    }

    /**
     * Define el valor de la propiedad lifexpos2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIFEXPOS2(String value) {
        this.lifexpos2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cqusa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCQUSA() {
        return cqusa;
    }

    /**
     * Define el valor de la propiedad cqusa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCQUSA(String value) {
        this.cqusa = value;
    }

    /**
     * Obtiene el valor de la propiedad cqusaunit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCQUSAUNIT() {
        return cqusaunit;
    }

    /**
     * Define el valor de la propiedad cqusaunit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCQUSAUNIT(String value) {
        this.cqusaunit = value;
    }

    /**
     * Obtiene el valor de la propiedad cquitqs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCQUITQS() {
        return cquitqs;
    }

    /**
     * Define el valor de la propiedad cquitqs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCQUITQS(String value) {
        this.cquitqs = value;
    }

    /**
     * Obtiene el valor de la propiedad cquitqsunit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCQUITQSUNIT() {
        return cquitqsunit;
    }

    /**
     * Define el valor de la propiedad cquitqsunit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCQUITQSUNIT(String value) {
        this.cquitqsunit = value;
    }

    /**
     * Obtiene el valor de la propiedad vbumgbme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBUMGBME() {
        return vbumgbme;
    }

    /**
     * Define el valor de la propiedad vbumgbme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBUMGBME(String value) {
        this.vbumgbme = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL27.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL27 }
     *     
     */
    public DELVRY03E1EDL27 getE1EDL27() {
        return e1EDL27;
    }

    /**
     * Define el valor de la propiedad e1EDL27.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL27 }
     *     
     */
    public void setE1EDL27(DELVRY03E1EDL27 value) {
        this.e1EDL27 = value;
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
