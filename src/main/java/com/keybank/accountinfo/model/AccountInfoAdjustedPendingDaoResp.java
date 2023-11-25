/* @Copyright 2022,AccountInfoAdjustedPendingDaoResp.java Key Bank Pvt Ltd, all rightd are reserved 
 * 
 */
package com.keybank.accountinfo.model;

import java.util.concurrent.CompletableFuture;

/**
 * @author kaushik, 28-Nov-2022
 *
 * Description:

 */
@entity
public class AccountInfoAdjustedPendingDaoResp  extends CompletableFuture<AccountInfoAdjustedPendingDaoResp>{
	
	private String respCode;
	private String respMsg;
	private long adjustdPts;
	private long pendingPts;
	
	
	/**
	 * @param daoReq
	 * 
	 */
	
	
	
	
	public String getRespCode() {
		return respCode;
	}
	public AccountInfoAdjustedPendingDaoResp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountInfoAdjustedPendingDaoResp(String respCode, String respMsg, long adjustdPts, long pendingPts) {
		super();
		this.respCode = respCode;
		this.respMsg = respMsg;
		this.adjustdPts = adjustdPts;
		this.pendingPts = pendingPts;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public long getAdjustdPts() {
		return adjustdPts;
	}
	public void setAdjustdPts(long adjustdPts) {
		this.adjustdPts = adjustdPts;
	}
	public long getPendingPts() {
		return pendingPts;
	}
	public void setPendingPts(long pendingPts) {
		this.pendingPts = pendingPts;
	}
	@Override
	public String toString() {
		return "AccountInfoAdjustedPendingDaoResp [respCode=" + respCode + ", respMsg=" + respMsg + ", adjustdPts="
				+ adjustdPts + ", pendingPts=" + pendingPts + "]";
	}
	
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("AccountInfoAdjustedPendingDaoResp [respCode=");
//		builder.append(respCode);
//		builder.append(", respMsg=");
//		builder.append(respMsg);
//		builder.append(", adjustdPts=");
//		builder.append(adjustdPts);
//		builder.append(", pendingPts=");
//		builder.append(pendingPts);
//		builder.append("]");
//		return builder.toString();
//	}
//	
	
	
	

}
