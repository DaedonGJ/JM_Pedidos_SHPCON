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
 * Handling unit header
 * 
 * <p>Clase Java para DELVRY03.E1EDL37 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDL37">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EXIDV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TARAG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GWEIT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BRGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GWEIM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BTVOL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTVOL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAVOL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TAVOL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VOLET" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAENG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEGR5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BREIT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HOEHE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEABM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INHALT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
 *         &lt;element name="LADLG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LADEH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FARZT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FAREH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ENTFE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EHENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VELTP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXIDV2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LANDT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LANDF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAMEF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NAMBE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_KU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VEBEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SMGKN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT35" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SORTL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERNAM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GEWFX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERLKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXIDA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MOVE_STATUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PACKVORSCHR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PACKVORSCHR_ST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LABELTYP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZUL_AUFL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="17"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT35_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT35_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KDMAT35_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_KU_EXTERNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_KU_VERSION" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VHILM_KU_GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDL39" type="{}DELVRY03.E1EDL39" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="E1EDL38" type="{}DELVRY03.E1EDL38" minOccurs="0"/>
 *         &lt;element name="E1EDL49" type="{}DELVRY03.E1EDL49" minOccurs="0"/>
 *         &lt;element name="E1EDL44" type="{}DELVRY03.E1EDL44" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDL37", propOrder = {
    "exidv",
    "tarag",
    "gweit",
    "brgew",
    "ntgew",
    "magew",
    "gweim",
    "btvol",
    "ntvol",
    "mavol",
    "volem",
    "tavol",
    "volet",
    "vegr2",
    "vegr1",
    "vegr3",
    "vhilm",
    "vegr4",
    "laeng",
    "vegr5",
    "breit",
    "hoehe",
    "meabm",
    "inhalt",
    "vhart",
    "magrv",
    "ladlg",
    "ladeh",
    "farzt",
    "fareh",
    "entfe",
    "ehent",
    "veltp",
    "exidv2",
    "landt",
    "landf",
    "namef",
    "nambe",
    "vhilmku",
    "vebez",
    "smgkn",
    "kdmat35",
    "sortl",
    "ernam",
    "gewfx",
    "erlkz",
    "exida",
    "movestatus",
    "packvorschr",
    "packvorschrst",
    "labeltyp",
    "zulaufl",
    "vhilmexternal",
    "vhilmversion",
    "vhilmguid",
    "kdmat35EXTERNAL",
    "kdmat35VERSION",
    "kdmat35GUID",
    "vhilmkuexternal",
    "vhilmkuversion",
    "vhilmkuguid",
    "e1EDL39",
    "e1EDL38",
    "e1EDL49",
    "e1EDL44"
})
public class DELVRY03E1EDL37 {

    @XmlElement(name = "EXIDV")
    protected String exidv;
    @XmlElement(name = "TARAG")
    protected String tarag;
    @XmlElement(name = "GWEIT")
    protected String gweit;
    @XmlElement(name = "BRGEW")
    protected String brgew;
    @XmlElement(name = "NTGEW")
    protected String ntgew;
    @XmlElement(name = "MAGEW")
    protected String magew;
    @XmlElement(name = "GWEIM")
    protected String gweim;
    @XmlElement(name = "BTVOL")
    protected String btvol;
    @XmlElement(name = "NTVOL")
    protected String ntvol;
    @XmlElement(name = "MAVOL")
    protected String mavol;
    @XmlElement(name = "VOLEM")
    protected String volem;
    @XmlElement(name = "TAVOL")
    protected String tavol;
    @XmlElement(name = "VOLET")
    protected String volet;
    @XmlElement(name = "VEGR2")
    protected String vegr2;
    @XmlElement(name = "VEGR1")
    protected String vegr1;
    @XmlElement(name = "VEGR3")
    protected String vegr3;
    @XmlElement(name = "VHILM")
    protected String vhilm;
    @XmlElement(name = "VEGR4")
    protected String vegr4;
    @XmlElement(name = "LAENG")
    protected String laeng;
    @XmlElement(name = "VEGR5")
    protected String vegr5;
    @XmlElement(name = "BREIT")
    protected String breit;
    @XmlElement(name = "HOEHE")
    protected String hoehe;
    @XmlElement(name = "MEABM")
    protected String meabm;
    @XmlElement(name = "INHALT")
    protected String inhalt;
    @XmlElement(name = "VHART")
    protected String vhart;
    @XmlElement(name = "MAGRV")
    protected String magrv;
    @XmlElement(name = "LADLG")
    protected String ladlg;
    @XmlElement(name = "LADEH")
    protected String ladeh;
    @XmlElement(name = "FARZT")
    protected String farzt;
    @XmlElement(name = "FAREH")
    protected String fareh;
    @XmlElement(name = "ENTFE")
    protected String entfe;
    @XmlElement(name = "EHENT")
    protected String ehent;
    @XmlElement(name = "VELTP")
    protected String veltp;
    @XmlElement(name = "EXIDV2")
    protected String exidv2;
    @XmlElement(name = "LANDT")
    protected String landt;
    @XmlElement(name = "LANDF")
    protected String landf;
    @XmlElement(name = "NAMEF")
    protected String namef;
    @XmlElement(name = "NAMBE")
    protected String nambe;
    @XmlElement(name = "VHILM_KU")
    protected String vhilmku;
    @XmlElement(name = "VEBEZ")
    protected String vebez;
    @XmlElement(name = "SMGKN")
    protected String smgkn;
    @XmlElement(name = "KDMAT35")
    protected String kdmat35;
    @XmlElement(name = "SORTL")
    protected String sortl;
    @XmlElement(name = "ERNAM")
    protected String ernam;
    @XmlElement(name = "GEWFX")
    protected String gewfx;
    @XmlElement(name = "ERLKZ")
    protected String erlkz;
    @XmlElement(name = "EXIDA")
    protected String exida;
    @XmlElement(name = "MOVE_STATUS")
    protected String movestatus;
    @XmlElement(name = "PACKVORSCHR")
    protected String packvorschr;
    @XmlElement(name = "PACKVORSCHR_ST")
    protected String packvorschrst;
    @XmlElement(name = "LABELTYP")
    protected String labeltyp;
    @XmlElement(name = "ZUL_AUFL")
    protected String zulaufl;
    @XmlElement(name = "VHILM_EXTERNAL")
    protected String vhilmexternal;
    @XmlElement(name = "VHILM_VERSION")
    protected String vhilmversion;
    @XmlElement(name = "VHILM_GUID")
    protected String vhilmguid;
    @XmlElement(name = "KDMAT35_EXTERNAL")
    protected String kdmat35EXTERNAL;
    @XmlElement(name = "KDMAT35_VERSION")
    protected String kdmat35VERSION;
    @XmlElement(name = "KDMAT35_GUID")
    protected String kdmat35GUID;
    @XmlElement(name = "VHILM_KU_EXTERNAL")
    protected String vhilmkuexternal;
    @XmlElement(name = "VHILM_KU_VERSION")
    protected String vhilmkuversion;
    @XmlElement(name = "VHILM_KU_GUID")
    protected String vhilmkuguid;
    @XmlElement(name = "E1EDL39")
    protected List<DELVRY03E1EDL39> e1EDL39;
    @XmlElement(name = "E1EDL38")
    protected DELVRY03E1EDL38 e1EDL38;
    @XmlElement(name = "E1EDL49")
    protected DELVRY03E1EDL49 e1EDL49;
    @XmlElement(name = "E1EDL44")
    protected List<DELVRY03E1EDL44> e1EDL44;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

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
     * Obtiene el valor de la propiedad tarag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARAG() {
        return tarag;
    }

    /**
     * Define el valor de la propiedad tarag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARAG(String value) {
        this.tarag = value;
    }

    /**
     * Obtiene el valor de la propiedad gweit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGWEIT() {
        return gweit;
    }

    /**
     * Define el valor de la propiedad gweit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGWEIT(String value) {
        this.gweit = value;
    }

    /**
     * Obtiene el valor de la propiedad brgew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRGEW() {
        return brgew;
    }

    /**
     * Define el valor de la propiedad brgew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRGEW(String value) {
        this.brgew = value;
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
     * Obtiene el valor de la propiedad magew.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAGEW() {
        return magew;
    }

    /**
     * Define el valor de la propiedad magew.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAGEW(String value) {
        this.magew = value;
    }

    /**
     * Obtiene el valor de la propiedad gweim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGWEIM() {
        return gweim;
    }

    /**
     * Define el valor de la propiedad gweim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGWEIM(String value) {
        this.gweim = value;
    }

    /**
     * Obtiene el valor de la propiedad btvol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTVOL() {
        return btvol;
    }

    /**
     * Define el valor de la propiedad btvol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTVOL(String value) {
        this.btvol = value;
    }

    /**
     * Obtiene el valor de la propiedad ntvol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTVOL() {
        return ntvol;
    }

    /**
     * Define el valor de la propiedad ntvol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTVOL(String value) {
        this.ntvol = value;
    }

    /**
     * Obtiene el valor de la propiedad mavol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAVOL() {
        return mavol;
    }

    /**
     * Define el valor de la propiedad mavol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAVOL(String value) {
        this.mavol = value;
    }

    /**
     * Obtiene el valor de la propiedad volem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLEM() {
        return volem;
    }

    /**
     * Define el valor de la propiedad volem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLEM(String value) {
        this.volem = value;
    }

    /**
     * Obtiene el valor de la propiedad tavol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAVOL() {
        return tavol;
    }

    /**
     * Define el valor de la propiedad tavol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAVOL(String value) {
        this.tavol = value;
    }

    /**
     * Obtiene el valor de la propiedad volet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLET() {
        return volet;
    }

    /**
     * Define el valor de la propiedad volet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLET(String value) {
        this.volet = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR2() {
        return vegr2;
    }

    /**
     * Define el valor de la propiedad vegr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR2(String value) {
        this.vegr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR1() {
        return vegr1;
    }

    /**
     * Define el valor de la propiedad vegr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR1(String value) {
        this.vegr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR3() {
        return vegr3;
    }

    /**
     * Define el valor de la propiedad vegr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR3(String value) {
        this.vegr3 = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILM() {
        return vhilm;
    }

    /**
     * Define el valor de la propiedad vhilm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILM(String value) {
        this.vhilm = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR4() {
        return vegr4;
    }

    /**
     * Define el valor de la propiedad vegr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR4(String value) {
        this.vegr4 = value;
    }

    /**
     * Obtiene el valor de la propiedad laeng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAENG() {
        return laeng;
    }

    /**
     * Define el valor de la propiedad laeng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAENG(String value) {
        this.laeng = value;
    }

    /**
     * Obtiene el valor de la propiedad vegr5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEGR5() {
        return vegr5;
    }

    /**
     * Define el valor de la propiedad vegr5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEGR5(String value) {
        this.vegr5 = value;
    }

    /**
     * Obtiene el valor de la propiedad breit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBREIT() {
        return breit;
    }

    /**
     * Define el valor de la propiedad breit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBREIT(String value) {
        this.breit = value;
    }

    /**
     * Obtiene el valor de la propiedad hoehe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOEHE() {
        return hoehe;
    }

    /**
     * Define el valor de la propiedad hoehe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOEHE(String value) {
        this.hoehe = value;
    }

    /**
     * Obtiene el valor de la propiedad meabm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEABM() {
        return meabm;
    }

    /**
     * Define el valor de la propiedad meabm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEABM(String value) {
        this.meabm = value;
    }

    /**
     * Obtiene el valor de la propiedad inhalt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINHALT() {
        return inhalt;
    }

    /**
     * Define el valor de la propiedad inhalt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINHALT(String value) {
        this.inhalt = value;
    }

    /**
     * Obtiene el valor de la propiedad vhart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHART() {
        return vhart;
    }

    /**
     * Define el valor de la propiedad vhart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHART(String value) {
        this.vhart = value;
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
     * Obtiene el valor de la propiedad ladlg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLADLG() {
        return ladlg;
    }

    /**
     * Define el valor de la propiedad ladlg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLADLG(String value) {
        this.ladlg = value;
    }

    /**
     * Obtiene el valor de la propiedad ladeh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLADEH() {
        return ladeh;
    }

    /**
     * Define el valor de la propiedad ladeh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLADEH(String value) {
        this.ladeh = value;
    }

    /**
     * Obtiene el valor de la propiedad farzt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFARZT() {
        return farzt;
    }

    /**
     * Define el valor de la propiedad farzt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFARZT(String value) {
        this.farzt = value;
    }

    /**
     * Obtiene el valor de la propiedad fareh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAREH() {
        return fareh;
    }

    /**
     * Define el valor de la propiedad fareh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAREH(String value) {
        this.fareh = value;
    }

    /**
     * Obtiene el valor de la propiedad entfe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTFE() {
        return entfe;
    }

    /**
     * Define el valor de la propiedad entfe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTFE(String value) {
        this.entfe = value;
    }

    /**
     * Obtiene el valor de la propiedad ehent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEHENT() {
        return ehent;
    }

    /**
     * Define el valor de la propiedad ehent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEHENT(String value) {
        this.ehent = value;
    }

    /**
     * Obtiene el valor de la propiedad veltp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVELTP() {
        return veltp;
    }

    /**
     * Define el valor de la propiedad veltp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVELTP(String value) {
        this.veltp = value;
    }

    /**
     * Obtiene el valor de la propiedad exidv2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXIDV2() {
        return exidv2;
    }

    /**
     * Define el valor de la propiedad exidv2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXIDV2(String value) {
        this.exidv2 = value;
    }

    /**
     * Obtiene el valor de la propiedad landt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANDT() {
        return landt;
    }

    /**
     * Define el valor de la propiedad landt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANDT(String value) {
        this.landt = value;
    }

    /**
     * Obtiene el valor de la propiedad landf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANDF() {
        return landf;
    }

    /**
     * Define el valor de la propiedad landf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANDF(String value) {
        this.landf = value;
    }

    /**
     * Obtiene el valor de la propiedad namef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEF() {
        return namef;
    }

    /**
     * Define el valor de la propiedad namef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEF(String value) {
        this.namef = value;
    }

    /**
     * Obtiene el valor de la propiedad nambe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMBE() {
        return nambe;
    }

    /**
     * Define el valor de la propiedad nambe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMBE(String value) {
        this.nambe = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMKU() {
        return vhilmku;
    }

    /**
     * Define el valor de la propiedad vhilmku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMKU(String value) {
        this.vhilmku = value;
    }

    /**
     * Obtiene el valor de la propiedad vebez.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVEBEZ() {
        return vebez;
    }

    /**
     * Define el valor de la propiedad vebez.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVEBEZ(String value) {
        this.vebez = value;
    }

    /**
     * Obtiene el valor de la propiedad smgkn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMGKN() {
        return smgkn;
    }

    /**
     * Define el valor de la propiedad smgkn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMGKN(String value) {
        this.smgkn = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat35.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT35() {
        return kdmat35;
    }

    /**
     * Define el valor de la propiedad kdmat35.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT35(String value) {
        this.kdmat35 = value;
    }

    /**
     * Obtiene el valor de la propiedad sortl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTL() {
        return sortl;
    }

    /**
     * Define el valor de la propiedad sortl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTL(String value) {
        this.sortl = value;
    }

    /**
     * Obtiene el valor de la propiedad ernam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERNAM() {
        return ernam;
    }

    /**
     * Define el valor de la propiedad ernam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERNAM(String value) {
        this.ernam = value;
    }

    /**
     * Obtiene el valor de la propiedad gewfx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEWFX() {
        return gewfx;
    }

    /**
     * Define el valor de la propiedad gewfx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEWFX(String value) {
        this.gewfx = value;
    }

    /**
     * Obtiene el valor de la propiedad erlkz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERLKZ() {
        return erlkz;
    }

    /**
     * Define el valor de la propiedad erlkz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERLKZ(String value) {
        this.erlkz = value;
    }

    /**
     * Obtiene el valor de la propiedad exida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXIDA() {
        return exida;
    }

    /**
     * Define el valor de la propiedad exida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXIDA(String value) {
        this.exida = value;
    }

    /**
     * Obtiene el valor de la propiedad movestatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOVESTATUS() {
        return movestatus;
    }

    /**
     * Define el valor de la propiedad movestatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOVESTATUS(String value) {
        this.movestatus = value;
    }

    /**
     * Obtiene el valor de la propiedad packvorschr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKVORSCHR() {
        return packvorschr;
    }

    /**
     * Define el valor de la propiedad packvorschr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKVORSCHR(String value) {
        this.packvorschr = value;
    }

    /**
     * Obtiene el valor de la propiedad packvorschrst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKVORSCHRST() {
        return packvorschrst;
    }

    /**
     * Define el valor de la propiedad packvorschrst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKVORSCHRST(String value) {
        this.packvorschrst = value;
    }

    /**
     * Obtiene el valor de la propiedad labeltyp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELTYP() {
        return labeltyp;
    }

    /**
     * Define el valor de la propiedad labeltyp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELTYP(String value) {
        this.labeltyp = value;
    }

    /**
     * Obtiene el valor de la propiedad zulaufl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZULAUFL() {
        return zulaufl;
    }

    /**
     * Define el valor de la propiedad zulaufl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZULAUFL(String value) {
        this.zulaufl = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMEXTERNAL() {
        return vhilmexternal;
    }

    /**
     * Define el valor de la propiedad vhilmexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMEXTERNAL(String value) {
        this.vhilmexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMVERSION() {
        return vhilmversion;
    }

    /**
     * Define el valor de la propiedad vhilmversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMVERSION(String value) {
        this.vhilmversion = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMGUID() {
        return vhilmguid;
    }

    /**
     * Define el valor de la propiedad vhilmguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMGUID(String value) {
        this.vhilmguid = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat35EXTERNAL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT35EXTERNAL() {
        return kdmat35EXTERNAL;
    }

    /**
     * Define el valor de la propiedad kdmat35EXTERNAL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT35EXTERNAL(String value) {
        this.kdmat35EXTERNAL = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat35VERSION.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT35VERSION() {
        return kdmat35VERSION;
    }

    /**
     * Define el valor de la propiedad kdmat35VERSION.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT35VERSION(String value) {
        this.kdmat35VERSION = value;
    }

    /**
     * Obtiene el valor de la propiedad kdmat35GUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDMAT35GUID() {
        return kdmat35GUID;
    }

    /**
     * Define el valor de la propiedad kdmat35GUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDMAT35GUID(String value) {
        this.kdmat35GUID = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmkuexternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMKUEXTERNAL() {
        return vhilmkuexternal;
    }

    /**
     * Define el valor de la propiedad vhilmkuexternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMKUEXTERNAL(String value) {
        this.vhilmkuexternal = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmkuversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMKUVERSION() {
        return vhilmkuversion;
    }

    /**
     * Define el valor de la propiedad vhilmkuversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMKUVERSION(String value) {
        this.vhilmkuversion = value;
    }

    /**
     * Obtiene el valor de la propiedad vhilmkuguid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVHILMKUGUID() {
        return vhilmkuguid;
    }

    /**
     * Define el valor de la propiedad vhilmkuguid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVHILMKUGUID(String value) {
        this.vhilmkuguid = value;
    }

    /**
     * Gets the value of the e1EDL39 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL39 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL39().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL39 }
     * 
     * 
     */
    public List<DELVRY03E1EDL39> getE1EDL39() {
        if (e1EDL39 == null) {
            e1EDL39 = new ArrayList<DELVRY03E1EDL39>();
        }
        return this.e1EDL39;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL38.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL38 }
     *     
     */
    public DELVRY03E1EDL38 getE1EDL38() {
        return e1EDL38;
    }

    /**
     * Define el valor de la propiedad e1EDL38.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL38 }
     *     
     */
    public void setE1EDL38(DELVRY03E1EDL38 value) {
        this.e1EDL38 = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDL49.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDL49 }
     *     
     */
    public DELVRY03E1EDL49 getE1EDL49() {
        return e1EDL49;
    }

    /**
     * Define el valor de la propiedad e1EDL49.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDL49 }
     *     
     */
    public void setE1EDL49(DELVRY03E1EDL49 value) {
        this.e1EDL49 = value;
    }

    /**
     * Gets the value of the e1EDL44 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDL44 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDL44().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELVRY03E1EDL44 }
     * 
     * 
     */
    public List<DELVRY03E1EDL44> getE1EDL44() {
        if (e1EDL44 == null) {
            e1EDL44 = new ArrayList<DELVRY03E1EDL44>();
        }
        return this.e1EDL44;
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
