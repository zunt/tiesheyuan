package cn.xjtu.zun.tiesheyuan.pojo;

public class ExcelUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_user.userId
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_user.userName
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column excel_user.phone
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_user.userId
     *
     * @return the value of excel_user.userId
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_user.userId
     *
     * @param userid the value for excel_user.userId
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_user.userName
     *
     * @return the value of excel_user.userName
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_user.userName
     *
     * @param username the value for excel_user.userName
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column excel_user.phone
     *
     * @return the value of excel_user.phone
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column excel_user.phone
     *
     * @param phone the value for excel_user.phone
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}