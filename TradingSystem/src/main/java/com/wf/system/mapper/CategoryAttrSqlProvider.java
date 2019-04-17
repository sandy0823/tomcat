package com.wf.system.mapper;

import com.wf.system.model.entity.CategoryAttr;
import org.apache.ibatis.jdbc.SQL;

public class CategoryAttrSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category_attr
	 * @mbg.generated
	 */
	public String insertSelective(CategoryAttr record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("category_attr");
		if (record.getId() != null) {
			sql.VALUES("id", "#{id,jdbcType=INTEGER}");
		}
		if (record.getName() != null) {
			sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
		}
		if (record.getDescript() != null) {
			sql.VALUES("descript", "#{descript,jdbcType=VARCHAR}");
		}
		if (record.getParentSecondCategoryId() != null) {
			sql.VALUES("parent_second_category_id", "#{parentSecondCategoryId,jdbcType=INTEGER}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table category_attr
	 * @mbg.generated
	 */
	public String updateByPrimaryKeySelective(CategoryAttr record) {
		SQL sql = new SQL();
		sql.UPDATE("category_attr");
		if (record.getName() != null) {
			sql.SET("name = #{name,jdbcType=VARCHAR}");
		}
		if (record.getDescript() != null) {
			sql.SET("descript = #{descript,jdbcType=VARCHAR}");
		}
		if (record.getParentSecondCategoryId() != null) {
			sql.SET("parent_second_category_id = #{parentSecondCategoryId,jdbcType=INTEGER}");
		}
		sql.WHERE("id = #{id,jdbcType=INTEGER}");
		return sql.toString();
	}
}