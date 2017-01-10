package top.builbu.business.user.entity;

/**
 * [STRATO MyBatis Generator]
 * Table: role
@mbggenerated do_not_delete_during_merge 2017-01-05 15:38:19
 */
public class Role {
    /**
     * Column: role.role_id
    @mbggenerated 2017-01-05 15:38:19
     */
    private Integer roleId;

    /**
     * Column: role.role_name
    @mbggenerated 2017-01-05 15:38:19
     */
    private String roleName;

    /**
     * Column: role.role_sys
    @mbggenerated 2017-01-05 15:38:19
     */
    private String roleSys;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSys() {
        return roleSys;
    }

    public void setRoleSys(String roleSys) {
        this.roleSys = roleSys == null ? null : roleSys.trim();
    }
}