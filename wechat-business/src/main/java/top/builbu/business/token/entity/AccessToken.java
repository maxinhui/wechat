package top.builbu.business.token.entity;

/**
 * [STRATO MyBatis Generator]
 * Table: access_token
@mbggenerated do_not_delete_during_merge 2016-12-28 14:04:08
 */
public class AccessToken {
    /**
     *   索引id
     * Column: access_token.id
    @mbggenerated 2016-12-28 14:04:08
     */
    private Integer id;

    /**
     *   JSSDK_Ticket
     * Column: access_token.js_api_ticket
    @mbggenerated 2016-12-28 14:04:08
     */
    private String jsApiTicket;

    /**
     *   有效时间
     * Column: access_token.expires_in
    @mbggenerated 2016-12-28 14:04:08
     */
    private Integer expiresIn;

    /**
     *   创建时间
     * Column: access_token.create_time
    @mbggenerated 2016-12-28 14:04:08
     */
    private Long createTime;

    /**
     *   商家令牌
     * Column: access_token.token
    @mbggenerated 2016-12-28 14:04:08
     */
    private String token;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJsApiTicket() {
        return jsApiTicket;
    }

    public void setJsApiTicket(String jsApiTicket) {
        this.jsApiTicket = jsApiTicket == null ? null : jsApiTicket.trim();
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}