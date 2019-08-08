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
 * IDoc: Handling Unit Item (Delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDL44 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL44">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VELIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VBELN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POSNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXIDV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEMNG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEMEH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHARG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
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
 *         &lt;element name="CUOBJ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BESTQ" minOccurs="0">
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
 *         &lt;element name="SONUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANZSN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WDATU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
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
 *         &lt;element name="MATNR_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATNR_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL46" type="{}DELVRY03.E1EDL46" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL44", propOrder = {
    "velin",
    "vbeln",
    "posnr",
    "exidv",
    "vemng",
    "vemeh",
    "matnr",
    "kdmat",
    "charg",
    "werks",
    "lgort",
    "cuobj",
    "bestq",
    "sobkz",
    "sonum",
    "anzsn",
    "wdatu",
    "parid",
    "matnrexternal",
    "matnrversion",
    "matnrguid",
    "kdmatexternal",
    "kdmatversion",
    "kdmatguid",
    "e1EDL46"
})
public class DELVRY03E1EDL44 {

    @XmlElement(name = "VELIN")
    protected String velin;
    @XmlElement(name = "VBELN")
    protected String vbeln;
    @XmlElement(name = "POSNR")
    protected String posnr;
    @XmlElement(name = "EXIDV")
    protected String exidv;
    @XmlElement(name = "VEMNG")
    protected String vemng;
    @XmlElement(name = "VEMEH")
    protected String vemeh;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "KDMAT")
    protected String kdmat;
    @XmlElement(name = "CHARG")
    protected String charg;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "LGORT")
    protected String lgort;
    @XmlElement(name = "CUOBJ")
    protected String cuobj;
    @XmlElement(name = "BESTQ")
    protected String bestq;
    @XmlElement(name = "SOBKZ")
    protected String sobkz;
    @XmlElement(name = "SONUM")
    protected String sonum;
    @XmlElement(name = "ANZSN")
    protected String anzsn;
    @XmlElement(name = "WDATU")
    protected String wdatu;
    @XmlElement(name = "PARID")
    protected String parid;
    @XmlElement(name = "MATNR_EXTERNAL")
    protected String matnrexternal;
    @XmlElement(name = "MATNR_VERSION")
    protected String matnrversion;
    @XmlElement(name = "MATNR_GUID")
    protected String matnrguid;
    @XmlElement(name = "KDMAT_EXTERNAL")
    protected String kdmatexternal;
    @XmlElement(name = "KDMAT_VERSION")
    protected String kdmatversion;
    @XmlElement(name = "KDMAT_GUID")
    protected String kdmatguid;
    @XmlElement(name = "E1EDL46")
    protected List<DELVRY03E1EDL46> e1EDL46;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad velin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVELIN() {
        return velin;
    }

    /**
     * Define el valor de la propiedad velin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVELIN(String value) {
        this.velin = value;
    }

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
     * Obtiene el valor de la propiedad posnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSNR() {
        return posnr;
    }

    /**
     * Define el valor de la propiedad posnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSNR(String value) {
        this.posnr = value;
    }

    /**
     * Obtiene el valor de la propiedad exidv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXIDV() {
        return exidv;
    }

    /**
     * Define el valor de la propiedad exidv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXIDV(String value) {
        this.exidv = value;
    }

    /**
     * Obtiene el valor de la propiedad vemng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEMNG() {
        return vemng;
    }

    /**
     * Define el valor de la propiedad vemng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEMNG(String value) {
        this.vemng = value;
    }

    /**
     * Obtiene el valor de la propiedad vemeh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEMEH() {
        return vemeh;
    }

    /**
     * Define el valor de la propiedad vemeh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEMEH(String value) {
        this.vemeh = value;
    }

    /**
     * Obtiene el valor de la propiedad matnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * Define el valor de la propiedad matnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT() {
        return kdmat;
    }

    /**
     * Define el valor de la propiedad kdmat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT(String value) {
        this.kdmat = value;
    }

    /**
     * Obtiene el valor de la propiedad charg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHARG() {
        return charg;
    }

    /**
     * Define el valor de la propiedad charg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHARG(String value) {
        this.charg = value;
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
     * Obtiene el valor de la propiedad cuobj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUOBJ() {
        return cuobj;
    }

    /**
     * Define el valor de la propiedad cuobj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUOBJ(String value) {
        this.cuobj = value;
    }

    /**
     * Obtiene el valor de la propiedad bestq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBESTQ() {
        return bestq;
    }

    /**
     * Define el valor de la propiedad bestq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBESTQ(String value) {
        this.bestq = value;
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
     * Obtiene el valor de la propiedad sonum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSONUM() {
        return sonum;
    }

    /**
     * Define el valor de la propiedad sonum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSONUM(String value) {
        this.sonum = value;
    }

    /**
     * Obtiene el valor de la propiedad anzsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANZSN() {
        return anzsn;
    }

    /**
     * Define el valor de la propiedad anzsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANZSN(String value) {
        this.anzsn = value;
    }

    /**
     * Obtiene el valor de la propiedad wdatu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWDATU() {
        return wdatu;
    }

    /**
     * Define el valor de la propiedad wdatu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWDATU(String value) {
        this.wdatu = value;
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
     * Obtiene el valor de la propiedad matnrexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNREXTERNAL() {
        return matnrexternal;
    }

    /**
     * Define el valor de la propiedad matnrexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNREXTERNAL(String value) {
        this.matnrexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad matnrversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNRVERSION() {
        return matnrversion;
    }

    /**
     * Define el valor de la propiedad matnrversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNRVERSION(String value) {
        this.matnrversion = value;
    }

    /**
     * Obtiene el valor de la propiedad matnrguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNRGUID() {
        return matnrguid;
    }

    /**
     * Define el valor de la propiedad matnrguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNRGUID(String value) {
        this.matnrguid = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmatexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMATEXTERNAL() {
        return kdmatexternal;
    }

    /**
     * Define el valor de la propiedad kdmatexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMATEXTERNAL(String value) {
        this.kdmatexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmatversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMATVERSION() {
        return kdmatversion;
    }

    /**
     * Define el valor de la propiedad kdmatversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMATVERSION(String value) {
        this.kdmatversion = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmatguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMATGUID() {
        return kdmatguid;
    }

    /**
     * Define el valor de la propiedad kdmatguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMATGUID(String value) {
        this.kdmatguid = value;
    }

    /**
     * Gets the value of the e1EDL46 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL46 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL46().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL46 }
     * 
     * 
     */
    public List<DELVRY03E1EDL46> getE1EDL46() {
        if (e1EDL46 == null) {
            e1EDL46 = new ArrayList<DELVRY03E1EDL46>();
        }
        return this.e1EDL46;
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
