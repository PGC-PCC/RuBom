package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Wcounter implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String werks;

    private String fanlage2;

    private String number1;

    private String deliverySite;

    private String site;

    private String path;

    private Short quantity;

    private Short flag;

    private String strport;

    private String strknr;

    private String strspj;

    private String nowport;

    private String nowknr;

    private String nowspj;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1 == null ? null : number1.trim();
    }

    public String getDeliverySite() {
        return deliverySite;
    }

    public void setDeliverySite(String deliverySite) {
        this.deliverySite = deliverySite == null ? null : deliverySite.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getStrport() {
        return strport;
    }

    public void setStrport(String strport) {
        this.strport = strport == null ? null : strport.trim();
    }

    public String getStrknr() {
        return strknr;
    }

    public void setStrknr(String strknr) {
        this.strknr = strknr == null ? null : strknr.trim();
    }

    public String getStrspj() {
        return strspj;
    }

    public void setStrspj(String strspj) {
        this.strspj = strspj == null ? null : strspj.trim();
    }

    public String getNowport() {
        return nowport;
    }

    public void setNowport(String nowport) {
        this.nowport = nowport == null ? null : nowport.trim();
    }

    public String getNowknr() {
        return nowknr;
    }

    public void setNowknr(String nowknr) {
        this.nowknr = nowknr == null ? null : nowknr.trim();
    }

    public String getNowspj() {
        return nowspj;
    }

    public void setNowspj(String nowspj) {
        this.nowspj = nowspj == null ? null : nowspj.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}