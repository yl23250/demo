package org.ylpro.model;

public class Tresource {
    private String id;

    private String icon;

    private String name;

    private String remark;

    private Integer seq;

    private String url;

    private String pid;

    private String tresourcetypeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getTresourcetypeId() {
        return tresourcetypeId;
    }

    public void setTresourcetypeId(String tresourcetypeId) {
        this.tresourcetypeId = tresourcetypeId == null ? null : tresourcetypeId.trim();
    }
}