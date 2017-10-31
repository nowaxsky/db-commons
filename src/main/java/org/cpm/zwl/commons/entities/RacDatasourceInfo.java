package org.cpm.zwl.commons.entities;

public class RacDatasourceInfo {

	private String onsConfiguration;
	private String connectionFactoryClassName;
	private String url;
	private int maxPoolSize;
	private int minPoolSize;
	private boolean fastConnectionFailoverEnabled;
	private boolean validateConnectionOnBorrow;
	private String sqlForValidateConnection;
	private String username;
	private String password;
	
	public static RacDatasourceInfo getDefault(String onsConfiguration, String url, String username, String password) {
		System.setProperty("NLS_LANG", "AMERICAN_AMERICA.AL32UTF8");
		RacDatasourceInfo rac = new RacDatasourceInfo();
		
		rac.setOnsConfiguration(onsConfiguration);
		rac.setConnectionFactoryClassName("org.postgresql.ds.PGPoolingDataSource");
		rac.setUrl(url);
		rac.setMaxPoolSize(50);
		rac.setMinPoolSize(5);
		rac.setFastConnectionFailoverEnabled(true);
		rac.setValidateConnectionOnBorrow(true);
		rac.setSqlForValidateConnection("SELECT 1 FROM DUAL");
		rac.setUsername(username);
		rac.setPassword(password);
		return rac;
	}
	public String getOnsConfiguration() {
		return onsConfiguration;
	}
	public void setOnsConfiguration(String onsConfiguration) {
		this.onsConfiguration = onsConfiguration;
	}
	public String getConnectionFactoryClassName() {
		return connectionFactoryClassName;
	}
	public void setConnectionFactoryClassName(String connectionFactoryClassName) {
		this.connectionFactoryClassName = connectionFactoryClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getMaxPoolSize() {
		return maxPoolSize;
	}
	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
	public int getMinPoolSize() {
		return minPoolSize;
	}
	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}
	public boolean isFastConnectionFailoverEnabled() {
		return fastConnectionFailoverEnabled;
	}
	public void setFastConnectionFailoverEnabled(boolean fastConnectionFailoverEnabled) {
		this.fastConnectionFailoverEnabled = fastConnectionFailoverEnabled;
	}
	public boolean isValidateConnectionOnBorrow() {
		return validateConnectionOnBorrow;
	}
	public void setValidateConnectionOnBorrow(boolean validateConnectionOnBorrow) {
		this.validateConnectionOnBorrow = validateConnectionOnBorrow;
	}
	public String getSqlForValidateConnection() {
		return sqlForValidateConnection;
	}
	public void setSqlForValidateConnection(String sqlForValidateConnection) {
		this.sqlForValidateConnection = sqlForValidateConnection;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
