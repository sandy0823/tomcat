package com.wf.system.model.entity;

public class FirstCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column first_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column first_category.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column first_category.descript
     *
     * @mbg.generated
     */
    private String descript;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column first_category.id
     *
     * @return the value of first_category.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column first_category.id
     *
     * @param id the value for first_category.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column first_category.name
     *
     * @return the value of first_category.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column first_category.name
     *
     * @param name the value for first_category.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column first_category.descript
     *
     * @return the value of first_category.descript
     *
     * @mbg.generated
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column first_category.descript
     *
     * @param descript the value for first_category.descript
     *
     * @mbg.generated
     */
    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }
}