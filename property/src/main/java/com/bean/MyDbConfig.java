/**
 * 
 */
package com.bean;

/**
 * @author bmp
 *
 */
public class MyDbConfig {
	 
    private String dbHost;
    private String dbUser;
    private String dbPassword;
     
    public String getDbHost() {
        return dbHost;
    }
    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }
    public String getDbPassword() {
        return dbPassword;
    }
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    public String getDbUser() {
        return dbUser;
    }
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }
     
    @Override
    public String toString(){
        return dbHost+"|"+dbUser+"|"+dbPassword;
    }
}