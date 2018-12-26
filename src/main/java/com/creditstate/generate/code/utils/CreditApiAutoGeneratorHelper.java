package com.creditstate.generate.code.utils;

import org.mybatis.plus.mybatisplus.annotations.IdType;
import org.mybatis.plus.mybatisplus.generator.AutoGenerator;
import org.mybatis.plus.mybatisplus.generator.ConfigDataSource;
import org.mybatis.plus.mybatisplus.generator.ConfigGenerator;

/**
 * 
 * 鑷姩鐢熸垚鏄犲皠宸ュ叿绫�
 * 
 * @author hubin
 *
 */
public class CreditApiAutoGeneratorHelper {

	/**
	 * 
	 * 娴嬭瘯 run 鎵ц
	 * 
	 * <p>
	 * 閰嶇疆鏂规硶鏌ョ湅 {@link ConfigGenerator}
	 * </p>
	 * 
	 */
	public static void main( String[] args ) {
		ConfigGenerator cg = new ConfigGenerator();
		cg.setConfigDataSource(ConfigDataSource.ORACLE);
		cg.setEntityPackage("com.creditstate.api.model.entity.po");
		cg.setServicePackage("com.creditstate.api.data.service");
		cg.setSuperServiceImpl("com.creditstate.api.data.service.impl");
		cg.setMapperPackage("com.creditstate.api.data.mapper");
		String[] tableNames = new String[]{"T_CREDIT_LEARN_USER_APPLY"};
		cg.setIdType(IdType.ID_WORKER);
		if (EnvUtil.isLinux()) {
			cg.setSaveDir("/Users/hubin/springwind/");
		} else {
			cg.setSaveDir("F:/file");
		}
		cg.setDbDriverName("oracle.jdbc.driver.OracleDriver");
		cg.setDbUser("u_hzpt");
		cg.setDbPassword("p_hzpt");
		cg.setDbUrl("jdbc:oracle:thin:@10.28.60.219:1521:csdb");
		cg.setTableNames(tableNames);
		cg.setDbPrefix(false);
		AutoGenerator.run(cg);
	}
	
}
