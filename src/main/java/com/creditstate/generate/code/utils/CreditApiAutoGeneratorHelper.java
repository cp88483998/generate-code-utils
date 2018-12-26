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
		cg.setEntityPackage("com.myproject.api.model.entity.po");
		cg.setServicePackage("com.myproject.api.data.service");
		cg.setSuperServiceImpl("com.myproject.api.data.service.impl");
		cg.setMapperPackage("com.myproject.api.data.mapper");
		String[] tableNames = new String[]{"TABLENAME"};
		cg.setIdType(IdType.ID_WORKER);
		if (EnvUtil.isLinux()) {
			cg.setSaveDir("/Users/hubin/springwind/");
		} else {
			cg.setSaveDir("F:/file");
		}
		cg.setDbDriverName("oracle.jdbc.driver.OracleDriver");
		cg.setDbUser("username");
		cg.setDbPassword("password");
		cg.setDbUrl("jdbc:oracle:thin:@11.22.33.444:1234:abcd");
		cg.setTableNames(tableNames);
		cg.setDbPrefix(false);
		AutoGenerator.run(cg);
	}
	
}
