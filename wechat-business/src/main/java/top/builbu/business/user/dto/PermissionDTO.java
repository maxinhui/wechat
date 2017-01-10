package top.builbu.business.user.dto;

/**
 * [STRATO MyBatis Generator]
 * Table: permission
@mbggenerated do_not_delete_during_merge 2017-01-05 15:38:19
 */
public class PermissionDTO {
    /**
     * Column: permission.permission_id
    @mbggenerated 2017-01-05 15:38:19
     */
    private Integer permissionId;

    /**
     * Column: permission.permission_name
    @mbggenerated 2017-01-05 15:38:19
     */
    private String permissionName;

    /**
     * Column: permission.permission_sys
    @mbggenerated 2017-01-05 15:38:19
     */
    private String permissionSys;

    /**
     *   Ȩ�޵ȼ�
     * Column: permission.permission_level
    @mbggenerated 2017-01-05 15:38:19
     */
    private Integer permissionLevel;

    /**
     * Column: permission.parentid
    @mbggenerated 2017-01-05 15:38:19
     */
    private Integer parentid;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionSys() {
        return permissionSys;
    }

    public void setPermissionSys(String permissionSys) {
        this.permissionSys = permissionSys == null ? null : permissionSys.trim();
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}