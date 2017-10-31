package org.cpm.zwl.commons.utils;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.cpm.zwl.commons.entities.RacDatasourceInfo;
import org.postgresql.ds.PGPoolingDataSource;

public class RacDatasourceUtil {

	public static DataSource getRacDatasource(RacDatasourceInfo info) throws SQLException {
		PGPoolingDataSource source = new PGPoolingDataSource();
		
		source.setServerName("localhost");
		source.setUser(info.getUsername());
		source.setPassword(info.getPassword());
		source.setUrl(info.getUrl());
		source.setMaxConnections(info.getMaxPoolSize());
		return source;
	}
}
