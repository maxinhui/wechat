package top.builbu.business.user.entity;

/**
 * [STRATO MyBatis Generator]
 * Table: rolepermission
@mbggenerated do_not_delete_during_merge 2017-01-05 15:38:19
 */
public class Rolepermission {
    /**
     * Column: rolepermission.role_id
    @mbggenerated 2017-01-05 15:38:19
     */
    private Integer roleId;

    /**
     * Column: rolepermission.permission_id
    @mbggenerated 2017-01-05 15:38:19
     */
    private Integer permissionId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}