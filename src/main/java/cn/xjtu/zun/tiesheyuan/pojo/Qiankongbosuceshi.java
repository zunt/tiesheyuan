package cn.xjtu.zun.tiesheyuan.pojo;

public class Qiankongbosuceshi {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qiankongbosuceshi.ID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qiankongbosuceshi.PROJECT_INFORMATION_ID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Long projectInformationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qiankongbosuceshi.FILE_NAME
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qiankongbosuceshi.FILE_TYPE
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private String fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qiankongbosuceshi.FILE_SIZE
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private String fileSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qiankongbosuceshi.FILE_PATH
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private String filePath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qiankongbosuceshi.ID
     *
     * @return the value of qiankongbosuceshi.ID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qiankongbosuceshi.ID
     *
     * @param id the value for qiankongbosuceshi.ID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qiankongbosuceshi.PROJECT_INFORMATION_ID
     *
     * @return the value of qiankongbosuceshi.PROJECT_INFORMATION_ID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Long getProjectInformationId() {
        return projectInformationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qiankongbosuceshi.PROJECT_INFORMATION_ID
     *
     * @param projectInformationId the value for qiankongbosuceshi.PROJECT_INFORMATION_ID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setProjectInformationId(Long projectInformationId) {
        this.projectInformationId = projectInformationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qiankongbosuceshi.FILE_NAME
     *
     * @return the value of qiankongbosuceshi.FILE_NAME
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qiankongbosuceshi.FILE_NAME
     *
     * @param fileName the value for qiankongbosuceshi.FILE_NAME
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qiankongbosuceshi.FILE_TYPE
     *
     * @return the value of qiankongbosuceshi.FILE_TYPE
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qiankongbosuceshi.FILE_TYPE
     *
     * @param fileType the value for qiankongbosuceshi.FILE_TYPE
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qiankongbosuceshi.FILE_SIZE
     *
     * @return the value of qiankongbosuceshi.FILE_SIZE
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qiankongbosuceshi.FILE_SIZE
     *
     * @param fileSize the value for qiankongbosuceshi.FILE_SIZE
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qiankongbosuceshi.FILE_PATH
     *
     * @return the value of qiankongbosuceshi.FILE_PATH
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qiankongbosuceshi.FILE_PATH
     *
     * @param filePath the value for qiankongbosuceshi.FILE_PATH
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
}