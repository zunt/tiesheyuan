package cn.xjtu.zun.tiesheyuan.pojo;

public class Project {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.id
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.name
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.type
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.proType
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private String protype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.proState
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private String prostate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.proSV
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    private String prosv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.id
     *
     * @return the value of project.id
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.id
     *
     * @param id the value for project.id
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.name
     *
     * @return the value of project.name
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.name
     *
     * @param name the value for project.name
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.type
     *
     * @return the value of project.type
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.type
     *
     * @param type the value for project.type
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.proType
     *
     * @return the value of project.proType
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getProtype() {
        return protype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.proType
     *
     * @param protype the value for project.proType
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setProtype(String protype) {
        this.protype = protype == null ? null : protype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.proState
     *
     * @return the value of project.proState
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getProstate() {
        return prostate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.proState
     *
     * @param prostate the value for project.proState
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setProstate(String prostate) {
        this.prostate = prostate == null ? null : prostate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.proSV
     *
     * @return the value of project.proSV
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getProsv() {
        return prosv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.proSV
     *
     * @param prosv the value for project.proSV
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setProsv(String prosv) {
        this.prosv = prosv == null ? null : prosv.trim();
    }
}