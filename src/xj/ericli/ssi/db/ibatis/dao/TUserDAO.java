package xj.ericli.ssi.db.ibatis.dao;

import java.sql.SQLException;
import java.util.List;

import xj.ericli.ssi.db.ibatis.model.TUser;
import xj.ericli.ssi.db.ibatis.model.TUserExample;

public interface TUserDAO {

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	Integer insert(TUser record) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int updateByPrimaryKey(TUser record) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int updateByPrimaryKeySelective(TUser record) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	List selectByExample(TUserExample example) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	TUser selectByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int deleteByExample(TUserExample example) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int deleteByPrimaryKey(Integer id) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int countByExample(TUserExample example) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int updateByExampleSelective(TUser record, TUserExample example) throws SQLException;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table t_user
	 * @abatorgenerated  Fri Dec 10 14:27:45 CST 2010
	 */
	int updateByExample(TUser record, TUserExample example) throws SQLException;
}