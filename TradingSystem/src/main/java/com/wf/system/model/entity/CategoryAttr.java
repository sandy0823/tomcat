package com.wf.system.model.entity;

public class CategoryAttr {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_attr.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_attr.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_attr.descript
     *
     * @mbg.generated
     */
    private String descript;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category_attr.parent_second_category_id
     *
     * @mbg.generated
     */
    private Integer parentSecondCategoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_attr.id
     *
     * @return the value of category_attr.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_attr.id
     *
     * @param id the value for category_attr.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_attr.name
     *
     * @return the value of category_attr.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_attr.name
     *
     * @param name the value for category_attr.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_attr.descript
     *
     * @return the value of category_attr.descript
     *
     * @mbg.generated
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_attr.descript
     *
     * @param descript the value for category_attr.descript
     *
     * @mbg.generated
     */
    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category_attr.parent_second_category_id
     *
     * @return the value of category_attr.parent_second_category_id
     *
     * @mbg.generated
     */
    public Integer getParentSecondCategoryId() {
        return parentSecondCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category_attr.parent_second_category_id
     *
     * @param parentSecondCategoryId the value for category_attr.parent_second_category_id
     *
     * @mbg.generated
     */
    public void setParentSecondCategoryId(Integer parentSecondCategoryId) {
        this.parentSecondCategoryId = parentSecondCategoryId;
    }
}