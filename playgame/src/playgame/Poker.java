package playgame;
/**
 * 此为扑克牌类，定义扑克牌的属性
 * 1.四种花色：黑桃、红桃、梅花、方片
 * 2.13种点数：2-10、J、Q、K、A，不考虑大小王
 * @author huasir
 *
 */

public class Poker {
	//定义扑克牌属性
	
	//花色
	private String color;
	//点数大小
	private String num;
	//构造方法初始化属性
	public Poker(String color, String num) {
		this.color = color;
		this.num = num;
	}
	//无参构造方法
	public Poker() {
	}
	//属性的getter和setter方法
	//获取color属性
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
}
