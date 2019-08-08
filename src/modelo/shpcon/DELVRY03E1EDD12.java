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
 * DG item data 2 (delivery)
 * 
 * <p>Clase Java para DELVRY03.E1EDD12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DELVRY03.E1EDD12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STOSU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COTMP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPCUN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMTMP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPEUN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLTMP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPFUN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPSNL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPSLU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPSNH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPSHU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COWE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VBFC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SDCL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOOWA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USOOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DENFEE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UDENFE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DENTWE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UDENTWE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DENFIF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UDENFI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUDEN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UBUDE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BOPOI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UBOPO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VISCO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UVISC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STPRES" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USTPRE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HYGRO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEPOI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UMEPO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COOEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UCOOE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MTMPF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UMTMP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAIU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAOU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RQA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RQU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MINQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MINU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAXQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAXU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RELQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RELU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MULRQ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RCHEM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STOPA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PASI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UPASI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAGW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UPAGW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MIOWA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UMIOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RQA2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RQU2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPL_NET" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPL_NET_U" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXPL_REL_PERCENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTVTY_MAX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTVTY_MAX_U" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTVTY_MAX_REL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTVTY_MAX_REL_U" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TRANSP_INDEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CRIT_SAF_INDEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PACKAGE_CAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTVTY_SINGLE_A2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LTSK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FSAK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SFK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MUNAKODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EXNUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="E1EDD16" type="{}DELVRY03.E1EDD16" minOccurs="0"/>
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
@XmlType(name = "DELVRY03.E1EDD12", propOrder = {
    "stosu",
    "cotmp",
    "tpcun",
    "emtmp",
    "tpeun",
    "fltmp",
    "tpfun",
    "tpsnl",
    "tpslu",
    "tpsnh",
    "tpshu",
    "cowe",
    "vbfc",
    "sdcl",
    "soowa",
    "usoow",
    "denfee",
    "udenfe",
    "dentwe",
    "udentwe",
    "denfif",
    "udenfi",
    "buden",
    "ubude",
    "bopoi",
    "ubopo",
    "visco",
    "uvisc",
    "stpres",
    "ustpre",
    "hygro",
    "mepoi",
    "umepo",
    "cooex",
    "ucooe",
    "mtmpf",
    "umtmp",
    "pai",
    "paiu",
    "pao",
    "paou",
    "rqa",
    "rqu",
    "minq",
    "minu",
    "maxq",
    "maxu",
    "relq",
    "relu",
    "mulrq",
    "rchem",
    "stopa",
    "pasi",
    "upasi",
    "pagw",
    "upagw",
    "miowa",
    "umiow",
    "rqa2",
    "rqu2",
    "explnet",
    "explnetu",
    "explrelpercent",
    "actvtymax",
    "actvtymaxu",
    "actvtymaxrel",
    "actvtymaxrelu",
    "transpindex",
    "critsafindex",
    "packagecat",
    "actvtysinglea2",
    "ltsk",
    "emv",
    "fsak",
    "sfk",
    "munakode",
    "exnumber",
    "e1EDD16"
})
public class DELVRY03E1EDD12 {

    @XmlElement(name = "STOSU")
    protected String stosu;
    @XmlElement(name = "COTMP")
    protected String cotmp;
    @XmlElement(name = "TPCUN")
    protected String tpcun;
    @XmlElement(name = "EMTMP")
    protected String emtmp;
    @XmlElement(name = "TPEUN")
    protected String tpeun;
    @XmlElement(name = "FLTMP")
    protected String fltmp;
    @XmlElement(name = "TPFUN")
    protected String tpfun;
    @XmlElement(name = "TPSNL")
    protected String tpsnl;
    @XmlElement(name = "TPSLU")
    protected String tpslu;
    @XmlElement(name = "TPSNH")
    protected String tpsnh;
    @XmlElement(name = "TPSHU")
    protected String tpshu;
    @XmlElement(name = "COWE")
    protected String cowe;
    @XmlElement(name = "VBFC")
    protected String vbfc;
    @XmlElement(name = "SDCL")
    protected String sdcl;
    @XmlElement(name = "SOOWA")
    protected String soowa;
    @XmlElement(name = "USOOW")
    protected String usoow;
    @XmlElement(name = "DENFEE")
    protected String denfee;
    @XmlElement(name = "UDENFE")
    protected String udenfe;
    @XmlElement(name = "DENTWE")
    protected String dentwe;
    @XmlElement(name = "UDENTWE")
    protected String udentwe;
    @XmlElement(name = "DENFIF")
    protected String denfif;
    @XmlElement(name = "UDENFI")
    protected String udenfi;
    @XmlElement(name = "BUDEN")
    protected String buden;
    @XmlElement(name = "UBUDE")
    protected String ubude;
    @XmlElement(name = "BOPOI")
    protected String bopoi;
    @XmlElement(name = "UBOPO")
    protected String ubopo;
    @XmlElement(name = "VISCO")
    protected String visco;
    @XmlElement(name = "UVISC")
    protected String uvisc;
    @XmlElement(name = "STPRES")
    protected String stpres;
    @XmlElement(name = "USTPRE")
    protected String ustpre;
    @XmlElement(name = "HYGRO")
    protected String hygro;
    @XmlElement(name = "MEPOI")
    protected String mepoi;
    @XmlElement(name = "UMEPO")
    protected String umepo;
    @XmlElement(name = "COOEX")
    protected String cooex;
    @XmlElement(name = "UCOOE")
    protected String ucooe;
    @XmlElement(name = "MTMPF")
    protected String mtmpf;
    @XmlElement(name = "UMTMP")
    protected String umtmp;
    @XmlElement(name = "PAI")
    protected String pai;
    @XmlElement(name = "PAIU")
    protected String paiu;
    @XmlElement(name = "PAO")
    protected String pao;
    @XmlElement(name = "PAOU")
    protected String paou;
    @XmlElement(name = "RQA")
    protected String rqa;
    @XmlElement(name = "RQU")
    protected String rqu;
    @XmlElement(name = "MINQ")
    protected String minq;
    @XmlElement(name = "MINU")
    protected String minu;
    @XmlElement(name = "MAXQ")
    protected String maxq;
    @XmlElement(name = "MAXU")
    protected String maxu;
    @XmlElement(name = "RELQ")
    protected String relq;
    @XmlElement(name = "RELU")
    protected String relu;
    @XmlElement(name = "MULRQ")
    protected String mulrq;
    @XmlElement(name = "RCHEM")
    protected String rchem;
    @XmlElement(name = "STOPA")
    protected String stopa;
    @XmlElement(name = "PASI")
    protected String pasi;
    @XmlElement(name = "UPASI")
    protected String upasi;
    @XmlElement(name = "PAGW")
    protected String pagw;
    @XmlElement(name = "UPAGW")
    protected String upagw;
    @XmlElement(name = "MIOWA")
    protected String miowa;
    @XmlElement(name = "UMIOW")
    protected String umiow;
    @XmlElement(name = "RQA2")
    protected String rqa2;
    @XmlElement(name = "RQU2")
    protected String rqu2;
    @XmlElement(name = "EXPL_NET")
    protected String explnet;
    @XmlElement(name = "EXPL_NET_U")
    protected String explnetu;
    @XmlElement(name = "EXPL_REL_PERCENT")
    protected String explrelpercent;
    @XmlElement(name = "ACTVTY_MAX")
    protected String actvtymax;
    @XmlElement(name = "ACTVTY_MAX_U")
    protected String actvtymaxu;
    @XmlElement(name = "ACTVTY_MAX_REL")
    protected String actvtymaxrel;
    @XmlElement(name = "ACTVTY_MAX_REL_U")
    protected String actvtymaxrelu;
    @XmlElement(name = "TRANSP_INDEX")
    protected String transpindex;
    @XmlElement(name = "CRIT_SAF_INDEX")
    protected String critsafindex;
    @XmlElement(name = "PACKAGE_CAT")
    protected String packagecat;
    @XmlElement(name = "ACTVTY_SINGLE_A2")
    protected String actvtysinglea2;
    @XmlElement(name = "LTSK")
    protected String ltsk;
    @XmlElement(name = "EMV")
    protected String emv;
    @XmlElement(name = "FSAK")
    protected String fsak;
    @XmlElement(name = "SFK")
    protected String sfk;
    @XmlElement(name = "MUNAKODE")
    protected String munakode;
    @XmlElement(name = "EXNUMBER")
    protected String exnumber;
    @XmlElement(name = "E1EDD16")
    protected DELVRY03E1EDD16 e1EDD16;
    @XmlAttribute(name = "SEGMENT", required = true)
    protected String segment;

    /**
     * Obtiene el valor de la propiedad stosu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOSU() {
        return stosu;
    }

    /**
     * Define el valor de la propiedad stosu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOSU(String value) {
        this.stosu = value;
    }

    /**
     * Obtiene el valor de la propiedad cotmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOTMP() {
        return cotmp;
    }

    /**
     * Define el valor de la propiedad cotmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOTMP(String value) {
        this.cotmp = value;
    }

    /**
     * Obtiene el valor de la propiedad tpcun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPCUN() {
        return tpcun;
    }

    /**
     * Define el valor de la propiedad tpcun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPCUN(String value) {
        this.tpcun = value;
    }

    /**
     * Obtiene el valor de la propiedad emtmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMTMP() {
        return emtmp;
    }

    /**
     * Define el valor de la propiedad emtmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMTMP(String value) {
        this.emtmp = value;
    }

    /**
     * Obtiene el valor de la propiedad tpeun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPEUN() {
        return tpeun;
    }

    /**
     * Define el valor de la propiedad tpeun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPEUN(String value) {
        this.tpeun = value;
    }

    /**
     * Obtiene el valor de la propiedad fltmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLTMP() {
        return fltmp;
    }

    /**
     * Define el valor de la propiedad fltmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLTMP(String value) {
        this.fltmp = value;
    }

    /**
     * Obtiene el valor de la propiedad tpfun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPFUN() {
        return tpfun;
    }

    /**
     * Define el valor de la propiedad tpfun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPFUN(String value) {
        this.tpfun = value;
    }

    /**
     * Obtiene el valor de la propiedad tpsnl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPSNL() {
        return tpsnl;
    }

    /**
     * Define el valor de la propiedad tpsnl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPSNL(String value) {
        this.tpsnl = value;
    }

    /**
     * Obtiene el valor de la propiedad tpslu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPSLU() {
        return tpslu;
    }

    /**
     * Define el valor de la propiedad tpslu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPSLU(String value) {
        this.tpslu = value;
    }

    /**
     * Obtiene el valor de la propiedad tpsnh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPSNH() {
        return tpsnh;
    }

    /**
     * Define el valor de la propiedad tpsnh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPSNH(String value) {
        this.tpsnh = value;
    }

    /**
     * Obtiene el valor de la propiedad tpshu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPSHU() {
        return tpshu;
    }

    /**
     * Define el valor de la propiedad tpshu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPSHU(String value) {
        this.tpshu = value;
    }

    /**
     * Obtiene el valor de la propiedad cowe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOWE() {
        return cowe;
    }

    /**
     * Define el valor de la propiedad cowe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOWE(String value) {
        this.cowe = value;
    }

    /**
     * Obtiene el valor de la propiedad vbfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBFC() {
        return vbfc;
    }

    /**
     * Define el valor de la propiedad vbfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBFC(String value) {
        this.vbfc = value;
    }

    /**
     * Obtiene el valor de la propiedad sdcl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDCL() {
        return sdcl;
    }

    /**
     * Define el valor de la propiedad sdcl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDCL(String value) {
        this.sdcl = value;
    }

    /**
     * Obtiene el valor de la propiedad soowa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOOWA() {
        return soowa;
    }

    /**
     * Define el valor de la propiedad soowa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOOWA(String value) {
        this.soowa = value;
    }

    /**
     * Obtiene el valor de la propiedad usoow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSOOW() {
        return usoow;
    }

    /**
     * Define el valor de la propiedad usoow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSOOW(String value) {
        this.usoow = value;
    }

    /**
     * Obtiene el valor de la propiedad denfee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENFEE() {
        return denfee;
    }

    /**
     * Define el valor de la propiedad denfee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENFEE(String value) {
        this.denfee = value;
    }

    /**
     * Obtiene el valor de la propiedad udenfe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDENFE() {
        return udenfe;
    }

    /**
     * Define el valor de la propiedad udenfe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDENFE(String value) {
        this.udenfe = value;
    }

    /**
     * Obtiene el valor de la propiedad dentwe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENTWE() {
        return dentwe;
    }

    /**
     * Define el valor de la propiedad dentwe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENTWE(String value) {
        this.dentwe = value;
    }

    /**
     * Obtiene el valor de la propiedad udentwe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDENTWE() {
        return udentwe;
    }

    /**
     * Define el valor de la propiedad udentwe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDENTWE(String value) {
        this.udentwe = value;
    }

    /**
     * Obtiene el valor de la propiedad denfif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENFIF() {
        return denfif;
    }

    /**
     * Define el valor de la propiedad denfif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENFIF(String value) {
        this.denfif = value;
    }

    /**
     * Obtiene el valor de la propiedad udenfi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDENFI() {
        return udenfi;
    }

    /**
     * Define el valor de la propiedad udenfi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDENFI(String value) {
        this.udenfi = value;
    }

    /**
     * Obtiene el valor de la propiedad buden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDEN() {
        return buden;
    }

    /**
     * Define el valor de la propiedad buden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDEN(String value) {
        this.buden = value;
    }

    /**
     * Obtiene el valor de la propiedad ubude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBUDE() {
        return ubude;
    }

    /**
     * Define el valor de la propiedad ubude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBUDE(String value) {
        this.ubude = value;
    }

    /**
     * Obtiene el valor de la propiedad bopoi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOPOI() {
        return bopoi;
    }

    /**
     * Define el valor de la propiedad bopoi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOPOI(String value) {
        this.bopoi = value;
    }

    /**
     * Obtiene el valor de la propiedad ubopo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUBOPO() {
        return ubopo;
    }

    /**
     * Define el valor de la propiedad ubopo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUBOPO(String value) {
        this.ubopo = value;
    }

    /**
     * Obtiene el valor de la propiedad visco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISCO() {
        return visco;
    }

    /**
     * Define el valor de la propiedad visco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISCO(String value) {
        this.visco = value;
    }

    /**
     * Obtiene el valor de la propiedad uvisc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVISC() {
        return uvisc;
    }

    /**
     * Define el valor de la propiedad uvisc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVISC(String value) {
        this.uvisc = value;
    }

    /**
     * Obtiene el valor de la propiedad stpres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTPRES() {
        return stpres;
    }

    /**
     * Define el valor de la propiedad stpres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTPRES(String value) {
        this.stpres = value;
    }

    /**
     * Obtiene el valor de la propiedad ustpre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSTPRE() {
        return ustpre;
    }

    /**
     * Define el valor de la propiedad ustpre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSTPRE(String value) {
        this.ustpre = value;
    }

    /**
     * Obtiene el valor de la propiedad hygro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHYGRO() {
        return hygro;
    }

    /**
     * Define el valor de la propiedad hygro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHYGRO(String value) {
        this.hygro = value;
    }

    /**
     * Obtiene el valor de la propiedad mepoi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEPOI() {
        return mepoi;
    }

    /**
     * Define el valor de la propiedad mepoi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEPOI(String value) {
        this.mepoi = value;
    }

    /**
     * Obtiene el valor de la propiedad umepo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMEPO() {
        return umepo;
    }

    /**
     * Define el valor de la propiedad umepo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMEPO(String value) {
        this.umepo = value;
    }

    /**
     * Obtiene el valor de la propiedad cooex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOOEX() {
        return cooex;
    }

    /**
     * Define el valor de la propiedad cooex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOOEX(String value) {
        this.cooex = value;
    }

    /**
     * Obtiene el valor de la propiedad ucooe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCOOE() {
        return ucooe;
    }

    /**
     * Define el valor de la propiedad ucooe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCOOE(String value) {
        this.ucooe = value;
    }

    /**
     * Obtiene el valor de la propiedad mtmpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTMPF() {
        return mtmpf;
    }

    /**
     * Define el valor de la propiedad mtmpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTMPF(String value) {
        this.mtmpf = value;
    }

    /**
     * Obtiene el valor de la propiedad umtmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMTMP() {
        return umtmp;
    }

    /**
     * Define el valor de la propiedad umtmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMTMP(String value) {
        this.umtmp = value;
    }

    /**
     * Obtiene el valor de la propiedad pai.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAI() {
        return pai;
    }

    /**
     * Define el valor de la propiedad pai.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAI(String value) {
        this.pai = value;
    }

    /**
     * Obtiene el valor de la propiedad paiu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIU() {
        return paiu;
    }

    /**
     * Define el valor de la propiedad paiu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIU(String value) {
        this.paiu = value;
    }

    /**
     * Obtiene el valor de la propiedad pao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAO() {
        return pao;
    }

    /**
     * Define el valor de la propiedad pao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAO(String value) {
        this.pao = value;
    }

    /**
     * Obtiene el valor de la propiedad paou.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAOU() {
        return paou;
    }

    /**
     * Define el valor de la propiedad paou.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAOU(String value) {
        this.paou = value;
    }

    /**
     * Obtiene el valor de la propiedad rqa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRQA() {
        return rqa;
    }

    /**
     * Define el valor de la propiedad rqa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRQA(String value) {
        this.rqa = value;
    }

    /**
     * Obtiene el valor de la propiedad rqu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRQU() {
        return rqu;
    }

    /**
     * Define el valor de la propiedad rqu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRQU(String value) {
        this.rqu = value;
    }

    /**
     * Obtiene el valor de la propiedad minq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINQ() {
        return minq;
    }

    /**
     * Define el valor de la propiedad minq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINQ(String value) {
        this.minq = value;
    }

    /**
     * Obtiene el valor de la propiedad minu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINU() {
        return minu;
    }

    /**
     * Define el valor de la propiedad minu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINU(String value) {
        this.minu = value;
    }

    /**
     * Obtiene el valor de la propiedad maxq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXQ() {
        return maxq;
    }

    /**
     * Define el valor de la propiedad maxq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXQ(String value) {
        this.maxq = value;
    }

    /**
     * Obtiene el valor de la propiedad maxu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXU() {
        return maxu;
    }

    /**
     * Define el valor de la propiedad maxu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXU(String value) {
        this.maxu = value;
    }

    /**
     * Obtiene el valor de la propiedad relq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELQ() {
        return relq;
    }

    /**
     * Define el valor de la propiedad relq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELQ(String value) {
        this.relq = value;
    }

    /**
     * Obtiene el valor de la propiedad relu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELU() {
        return relu;
    }

    /**
     * Define el valor de la propiedad relu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELU(String value) {
        this.relu = value;
    }

    /**
     * Obtiene el valor de la propiedad mulrq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULRQ() {
        return mulrq;
    }

    /**
     * Define el valor de la propiedad mulrq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULRQ(String value) {
        this.mulrq = value;
    }

    /**
     * Obtiene el valor de la propiedad rchem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCHEM() {
        return rchem;
    }

    /**
     * Define el valor de la propiedad rchem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCHEM(String value) {
        this.rchem = value;
    }

    /**
     * Obtiene el valor de la propiedad stopa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPA() {
        return stopa;
    }

    /**
     * Define el valor de la propiedad stopa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPA(String value) {
        this.stopa = value;
    }

    /**
     * Obtiene el valor de la propiedad pasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASI() {
        return pasi;
    }

    /**
     * Define el valor de la propiedad pasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASI(String value) {
        this.pasi = value;
    }

    /**
     * Obtiene el valor de la propiedad upasi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPASI() {
        return upasi;
    }

    /**
     * Define el valor de la propiedad upasi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPASI(String value) {
        this.upasi = value;
    }

    /**
     * Obtiene el valor de la propiedad pagw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGW() {
        return pagw;
    }

    /**
     * Define el valor de la propiedad pagw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGW(String value) {
        this.pagw = value;
    }

    /**
     * Obtiene el valor de la propiedad upagw.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPAGW() {
        return upagw;
    }

    /**
     * Define el valor de la propiedad upagw.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPAGW(String value) {
        this.upagw = value;
    }

    /**
     * Obtiene el valor de la propiedad miowa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIOWA() {
        return miowa;
    }

    /**
     * Define el valor de la propiedad miowa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIOWA(String value) {
        this.miowa = value;
    }

    /**
     * Obtiene el valor de la propiedad umiow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMIOW() {
        return umiow;
    }

    /**
     * Define el valor de la propiedad umiow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMIOW(String value) {
        this.umiow = value;
    }

    /**
     * Obtiene el valor de la propiedad rqa2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRQA2() {
        return rqa2;
    }

    /**
     * Define el valor de la propiedad rqa2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRQA2(String value) {
        this.rqa2 = value;
    }

    /**
     * Obtiene el valor de la propiedad rqu2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRQU2() {
        return rqu2;
    }

    /**
     * Define el valor de la propiedad rqu2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRQU2(String value) {
        this.rqu2 = value;
    }

    /**
     * Obtiene el valor de la propiedad explnet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPLNET() {
        return explnet;
    }

    /**
     * Define el valor de la propiedad explnet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPLNET(String value) {
        this.explnet = value;
    }

    /**
     * Obtiene el valor de la propiedad explnetu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPLNETU() {
        return explnetu;
    }

    /**
     * Define el valor de la propiedad explnetu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPLNETU(String value) {
        this.explnetu = value;
    }

    /**
     * Obtiene el valor de la propiedad explrelpercent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPLRELPERCENT() {
        return explrelpercent;
    }

    /**
     * Define el valor de la propiedad explrelpercent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPLRELPERCENT(String value) {
        this.explrelpercent = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtymax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTVTYMAX() {
        return actvtymax;
    }

    /**
     * Define el valor de la propiedad actvtymax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTVTYMAX(String value) {
        this.actvtymax = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtymaxu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTVTYMAXU() {
        return actvtymaxu;
    }

    /**
     * Define el valor de la propiedad actvtymaxu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTVTYMAXU(String value) {
        this.actvtymaxu = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtymaxrel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTVTYMAXREL() {
        return actvtymaxrel;
    }

    /**
     * Define el valor de la propiedad actvtymaxrel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTVTYMAXREL(String value) {
        this.actvtymaxrel = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtymaxrelu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTVTYMAXRELU() {
        return actvtymaxrelu;
    }

    /**
     * Define el valor de la propiedad actvtymaxrelu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTVTYMAXRELU(String value) {
        this.actvtymaxrelu = value;
    }

    /**
     * Obtiene el valor de la propiedad transpindex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSPINDEX() {
        return transpindex;
    }

    /**
     * Define el valor de la propiedad transpindex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSPINDEX(String value) {
        this.transpindex = value;
    }

    /**
     * Obtiene el valor de la propiedad critsafindex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITSAFINDEX() {
        return critsafindex;
    }

    /**
     * Define el valor de la propiedad critsafindex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITSAFINDEX(String value) {
        this.critsafindex = value;
    }

    /**
     * Obtiene el valor de la propiedad packagecat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKAGECAT() {
        return packagecat;
    }

    /**
     * Define el valor de la propiedad packagecat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKAGECAT(String value) {
        this.packagecat = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtysinglea2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTVTYSINGLEA2() {
        return actvtysinglea2;
    }

    /**
     * Define el valor de la propiedad actvtysinglea2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTVTYSINGLEA2(String value) {
        this.actvtysinglea2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ltsk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTSK() {
        return ltsk;
    }

    /**
     * Define el valor de la propiedad ltsk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTSK(String value) {
        this.ltsk = value;
    }

    /**
     * Obtiene el valor de la propiedad emv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMV() {
        return emv;
    }

    /**
     * Define el valor de la propiedad emv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMV(String value) {
        this.emv = value;
    }

    /**
     * Obtiene el valor de la propiedad fsak.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSAK() {
        return fsak;
    }

    /**
     * Define el valor de la propiedad fsak.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSAK(String value) {
        this.fsak = value;
    }

    /**
     * Obtiene el valor de la propiedad sfk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFK() {
        return sfk;
    }

    /**
     * Define el valor de la propiedad sfk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFK(String value) {
        this.sfk = value;
    }

    /**
     * Obtiene el valor de la propiedad munakode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMUNAKODE() {
        return munakode;
    }

    /**
     * Define el valor de la propiedad munakode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMUNAKODE(String value) {
        this.munakode = value;
    }

    /**
     * Obtiene el valor de la propiedad exnumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXNUMBER() {
        return exnumber;
    }

    /**
     * Define el valor de la propiedad exnumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXNUMBER(String value) {
        this.exnumber = value;
    }

    /**
     * Obtiene el valor de la propiedad e1EDD16.
     * 
     * @return
     *     possible object is
     *     {@link DELVRY03E1EDD16 }
     *     
     */
    public DELVRY03E1EDD16 getE1EDD16() {
        return e1EDD16;
    }

    /**
     * Define el valor de la propiedad e1EDD16.
     * 
     * @param value
     *     allowed object is
     *     {@link DELVRY03E1EDD16 }
     *     
     */
    public void setE1EDD16(DELVRY03E1EDD16 value) {
        this.e1EDD16 = value;
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
