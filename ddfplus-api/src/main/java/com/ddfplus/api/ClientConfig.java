/**
 * Copyright (C) 2004 - 2015 by Barchart.com, Inc. All Rights Reserved.
 * 
 * This software is the proprietary information of Barchart.com, Inc.
 * Use is subject to license terms.
 */
package com.ddfplus.api;

import com.ddfplus.enums.ConnectionType;

/**
 * DDF Client Configuration.
 * 
 */
public class ClientConfig {
	// Connection Type, default to TCP
	private ConnectionType connectionType = ConnectionType.TCP;

	// DDF Server
	private String primaryServer;
	private String secondaryServer;
	private Integer serverPort;

	private String userName;
	private String password;
	/*
	 * Network interface to bind for socket. If null will bind to all
	 * interfaces.
	 */
	private String bindInterface = null;
	/*
	 * Symbols to subscribe to, comma separated.
	 * 
	 * symbols = "YHOO,IBM,ESH6,YMH6,QQQQ,";
	 */
	private String symbols;
	/**
	 * Activate depth subscriptions.
	 */
	private boolean depthSubscription;
	private String exchangeCodes;
	private String snapshotUser;
	private String snapshotPassword;
	private String logMode;
	private boolean storeMessages;

	// Definition refresh interval
	private Long definitionRefreshIntervalSec;

	public String getSnapshotPassword() {
		return snapshotPassword;
	}

	public void setSnapshotPassword(String snapShotPassword) {
		this.snapshotPassword = snapShotPassword;
	}

	public Long getDefinitionRefreshIntervalSec() {
		return definitionRefreshIntervalSec;
	}

	public void setDefinitionRefreshIntervalSec(Long definitionRefreshPeriodSec) {
		this.definitionRefreshIntervalSec = definitionRefreshPeriodSec;
	}

	public String getPrimaryServer() {
		return primaryServer;
	}

	public void setPrimaryServer(String server) {
		this.primaryServer = server;
	}

	public String getSecondaryServer() {
		return secondaryServer;
	}

	public void setSecondaryServer(String server) {
		this.secondaryServer = server;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSymbols() {
		return symbols;
	}

	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}

	public boolean isDepthSubscription() {
		return depthSubscription;
	}

	public void setDepthSubscription(boolean depthSubscription) {
		this.depthSubscription = depthSubscription;
	}

	public String getExchangeCodes() {
		return exchangeCodes;
	}

	public void setExchangeCodes(String exchangeCode) {
		this.exchangeCodes = exchangeCode;
	}

	public String getSnapshotUser() {
		return snapshotUser;
	}

	public void setSnapshotUser(String sUser) {
		this.snapshotUser = sUser;
	}

	public String getLogMode() {
		return logMode;
	}

	public void setLogMode(String logMode) {
		this.logMode = logMode;
	}

	public boolean isStoreMessages() {
		return storeMessages;
	}

	public void setStoreMessages(boolean storeMessages) {
		this.storeMessages = storeMessages;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(ConnectionType connectionType) {
		this.connectionType = connectionType;
	}

	public String getBindInterface() {
		return bindInterface;
	}

	public void setBindInterface(String binInterface) {
		bindInterface = bindInterface;
	}

	public Integer getServerPort() {
		return serverPort;
	}

	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Client Config: ");
		sb.append("\n\tconnectionType: " + connectionType);
		sb.append("\n\tuser: " + userName);
		sb.append("\n\tsymbols: " + symbols);
		sb.append("\n\texchangeCodes: " + exchangeCodes);
		sb.append("\n\tlogMode: " + logMode);
		sb.append("\n\tserver: " + primaryServer);
		sb.append("\n\tsecondaryServer: " + secondaryServer);
		sb.append("\n\tserverPort: " + serverPort);
		sb.append("\n\tdepthSubscriptions: " + depthSubscription);
		sb.append("\n\tsnapshotUser: " + snapshotUser);
		sb.append("\n\tstoreMessages: " + storeMessages);
		sb.append("\n\tdefinitionRefreshIntervalSec: " + definitionRefreshIntervalSec);
		sb.append("\n");
		return sb.toString();
	}

}
