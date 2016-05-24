/**
 * 
 */
package com.kishore.projects.springservice.domain;

import java.util.Date;

/**
 * @author 497765
 *
 */

public class Quote {

	private String symbol;
	private String exchange;
	private String name;
	private int dayCode;
	private Date serverTimeStamp;
	private String mode;
	private double lastPrice;
	private Date tradeTimeStamp;
	private String netChange;
	private double percentageChange;
	private int unitCode;
	private double open;
	private double high;
	private double low;
	private double clode;
	private String flag;
	private int volume;

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the exchange
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange
	 *            the exchange to set
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dayCode
	 */
	public int getDayCode() {
		return dayCode;
	}

	/**
	 * @param dayCode
	 *            the dayCode to set
	 */
	public void setDayCode(int dayCode) {
		this.dayCode = dayCode;
	}

	/**
	 * @return the serverTimeStamp
	 */
	public Date getServerTimeStamp() {
		return serverTimeStamp;
	}

	/**
	 * @param serverTimeStamp
	 *            the serverTimeStamp to set
	 */
	public void setServerTimeStamp(Date serverTimeStamp) {
		this.serverTimeStamp = serverTimeStamp;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode
	 *            the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the lastPrice
	 */
	public double getLastPrice() {
		return lastPrice;
	}

	/**
	 * @param lastPrice
	 *            the lastPrice to set
	 */
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	/**
	 * @return the tradeTimeStamp
	 */
	public Date getTradeTimeStamp() {
		return tradeTimeStamp;
	}

	/**
	 * @param tradeTimeStamp
	 *            the tradeTimeStamp to set
	 */
	public void setTradeTimeStamp(Date tradeTimeStamp) {
		this.tradeTimeStamp = tradeTimeStamp;
	}

	/**
	 * @return the netChange
	 */
	public String getNetChange() {
		return netChange;
	}

	/**
	 * @param netChange
	 *            the netChange to set
	 */
	public void setNetChange(String netChange) {
		this.netChange = netChange;
	}

	/**
	 * @return the percentageChange
	 */
	public double getPercentageChange() {
		return percentageChange;
	}

	/**
	 * @param percentageChange
	 *            the percentageChange to set
	 */
	public void setPercentageChange(double percentageChange) {
		this.percentageChange = percentageChange;
	}

	/**
	 * @return the unitCode
	 */
	public int getUnitCode() {
		return unitCode;
	}

	/**
	 * @param unitCode
	 *            the unitCode to set
	 */
	public void setUnitCode(int unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * @return the open
	 */
	public double getOpen() {
		return open;
	}

	/**
	 * @param open
	 *            the open to set
	 */
	public void setOpen(double open) {
		this.open = open;
	}

	/**
	 * @return the high
	 */
	public double getHigh() {
		return high;
	}

	/**
	 * @param high
	 *            the high to set
	 */
	public void setHigh(double high) {
		this.high = high;
	}

	/**
	 * @return the low
	 */
	public double getLow() {
		return low;
	}

	/**
	 * @param low
	 *            the low to set
	 */
	public void setLow(double low) {
		this.low = low;
	}

	/**
	 * @return the clode
	 */
	public double getClode() {
		return clode;
	}

	/**
	 * @param clode
	 *            the clode to set
	 */
	public void setClode(double clode) {
		this.clode = clode;
	}

	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag
	 *            the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
