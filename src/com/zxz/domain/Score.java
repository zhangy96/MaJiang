package com.zxz.domain;

public class Score {
	int huPaiTotal;//胡牌的次数
	int jieGangTotal;//接杠次数
	int anGangTotal;//暗杠次数
	int zhongMaTotal;//中码个数
	int finalScore;//总成绩
	int fangGangTotal ;//放杠的次数
	int mingGangtotal;//明杠的次数 也称公杠
	

	public int getMingGangtotal() {
		return mingGangtotal;
	}
	public void setMingGangtotal(int mingGangtotal) {
		this.mingGangtotal = mingGangtotal;
	}
	public int getFangGangTotal() {
		return fangGangTotal;
	}
	public void setFangGangTotal(int fangGangTotal) {
		this.fangGangTotal = fangGangTotal;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	public int getHuPaiTotal() {
		return huPaiTotal;
	}
	public void setHuPaiTotal(int huPaiTotal) {
		this.huPaiTotal = huPaiTotal;
	}
	public int getJieGangTotal() {
		return jieGangTotal;
	}
	public void setJieGangTotal(int jieGangTotal) {
		this.jieGangTotal = jieGangTotal;
	}
	public int getAnGangTotal() {
		return anGangTotal;
	}
	public void setAnGangTotal(int anGangTotal) {
		this.anGangTotal = anGangTotal;
	}
	public int getZhongMaTotal() {
		return zhongMaTotal;
	}
	public void setZhongMaTotal(int zhongMaTotal) {
		this.zhongMaTotal = zhongMaTotal;
	}
	@Override
	public String toString() {
		return "Score [huPaiTotal=" + huPaiTotal + ", gongGangTotal=" + jieGangTotal + ", anGangTotal=" + anGangTotal
				+ ", zhongMaTotal=" + zhongMaTotal + ", finalScore=" + finalScore + ", fangGangTotal=" + fangGangTotal
				+ ", mingGangtotal=" + mingGangtotal + ", jieGangTotal=" + jieGangTotal + "]";
	}
	
}
