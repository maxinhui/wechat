package top.builbu.business.user.dto;

import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: user
@mbggenerated do_not_delete_during_merge 2017-01-05 15:38:20
 */
public class UserDTO {
    /**
     * Column: user.user_Id
    @mbggenerated 2017-01-05 15:38:20
     */
    private Long userId;

    /**
     * Column: user.create_By_Date
    @mbggenerated 2017-01-05 15:38:20
     */
    private Date createByDate;

    /**
     * Column: user.create_By_Id
    @mbggenerated 2017-01-05 15:38:20
     */
    private Long createById;

    /**
     * Column: user.email
    @mbggenerated 2017-01-05 15:38:20
     */
    private String email;

    /**
     * Column: user.Icons
    @mbggenerated 2017-01-05 15:38:20
     */
    private String icons;

    /**
     * Column: user.nickname
    @mbggenerated 2017-01-05 15:38:20
     */
    private String nickname;

    /**
     * Column: user.on_Line_Status
    @mbggenerated 2017-01-05 15:38:20
     */
    private Integer onLineStatus;

    /**
     * Column: user.password
    @mbggenerated 2017-01-05 15:38:20
     */
    private String password;

    /**
     * Column: user.update_by_date
    @mbggenerated 2017-01-05 15:38:20
     */
    private Date updateByDate;

    /**
     * Column: user.update_by_id
    @mbggenerated 2017-01-05 15:38:20
     */
    private Long updateById;

    /**
     * Column: user.user_type
    @mbggenerated 2017-01-05 15:38:20
     */
    private Integer userType;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateByDate() {
        return createByDate;
    }

    public void setCreateByDate(Date createByDate) {
        this.createByDate = createByDate;
    }

    public Long getCreateById() {
        return createById;
    }

    public void setCreateById(Long createById) {
        this.createById = createById;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIcons() {
        return icons;
    }

    public void setIcons(String icons) {
        this.icons = icons == null ? null : icons.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getOnLineStatus() {
        return onLineStatus;
    }

    public void setOnLineStatus(Integer onLineStatus) {
        this.onLineStatus = onLineStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getUpdateByDate() {
        return updateByDate;
    }

    public void setUpdateByDate(Date updateByDate) {
        this.updateByDate = updateByDate;
    }

    public Long getUpdateById() {
        return updateById;
    }

    public void setUpdateById(Long updateById) {
        this.updateById = updateById;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}