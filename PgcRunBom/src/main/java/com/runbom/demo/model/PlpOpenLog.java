package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class PlpOpenLog implements Serializable {
    private String execid;

    private String documentid;

    private Short isdel;

    private Date rquesttime;

    private Date responsetime;

    private Date closetime;

    private Short cnum;

    private Short scnum;

    private Short dfnum;

    private String errormessage;

    private Short status;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String servicename;

    private String kbtype;

    private String newnum;

    private String renum;

    private static final long serialVersionUID = 1L;

    public String getExecid() {
        return execid;
    }

    public void setExecid(String execid) {
        this.execid = execid == null ? null : execid.trim();
    }

    public String getDocumentid() {
        return documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid == null ? null : documentid.trim();
    }

    public Short getIsdel() {
        return isdel;
    }

    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }

    public Date getRquesttime() {
        return rquesttime;
    }

    public void setRquesttime(Date rquesttime) {
        this.rquesttime = rquesttime;
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public Short getCnum() {
        return cnum;
    }

    public void setCnum(Short cnum) {
        this.cnum = cnum;
    }

    public Short getScnum() {
        return scnum;
    }

    public void setScnum(Short scnum) {
        this.scnum = scnum;
    }

    public Short getDfnum() {
        return dfnum;
    }

    public void setDfnum(Short dfnum) {
        this.dfnum = dfnum;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage == null ? null : errormessage.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid == null ? null : modifierid.trim();
    }

    public String getModifiername() {
        return modifiername;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername == null ? null : modifiername.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public String getKbtype() {
        return kbtype;
    }

    public void setKbtype(String kbtype) {
        this.kbtype = kbtype == null ? null : kbtype.trim();
    }

    public String getNewnum() {
        return newnum;
    }

    public void setNewnum(String newnum) {
        this.newnum = newnum == null ? null : newnum.trim();
    }

    public String getRenum() {
        return renum;
    }

    public void setRenum(String renum) {
        this.renum = renum == null ? null : renum.trim();
    }
}