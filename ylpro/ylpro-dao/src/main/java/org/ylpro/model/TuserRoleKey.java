package org.ylpro.model;

public class TuserRoleKey {
    private String tuserId;

    private String troleId;

    public String getTuserId() {
        return tuserId;
    }

    public void setTuserId(String tuserId) {
        this.tuserId = tuserId == null ? null : tuserId.trim();
    }

    public String getTroleId() {
        return troleId;
    }

    public void setTroleId(String troleId) {
        this.troleId = troleId == null ? null : troleId.trim();
    }
}