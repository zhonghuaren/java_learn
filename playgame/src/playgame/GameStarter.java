package playgame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameStarter implements Comparator<Poker> {

	//玩家集合
	private List<Player> player;
//	扑克牌集合
	private static List<Poker> poker;
//	洗牌后的扑克牌集合
	private List<Poker> pokerAfterShuffle;
//	发牌时临时存放Poker
	private Poker getPoker;
//	创建Scanner对象
	private static Scanner input;
	
	static {
		input = new Scanner(System.in);
//		创建一副扑克牌
		poker = new ArrayList<Poker>();
//		花色
		final String[] color = {"方片", "梅花", "红桃", "黑桃"};
//		创建扑克牌点数字符串
		String s = "2345678910JQKA";
//		根据4种不同花色创建点数
		System.out.println("---------扑克牌创建中...-----------");
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 14; i++) {
				StringBuilder s2 = new StringBuilder();
				if (i == 8) {
					s2.append(s.charAt(i));
					s2.append(s.charAt(i+1));
					poker.add(new Poker(color[j], s2.toString()));
					continue;
				}
				if ( i == 9) {
					continue;
				}
				s2.append(s.charAt(i));
				poker.add(new Poker(color[j], s2.toString()));
			}
		}
		
//		final String[] num = {"2", "3", "4", "5", "6", "7", "8",
//				"9", "10", "J", "Q", "K", "A"};
//		final String[] color = {"方片", "梅花", "红桃", "黑桃"};
//		for (String str1 : color) {
//			for (String str2 : num) {
//				Poker p = new Poker(str1, str2);
//				poker.add(p);
//			}
//		}
		System.out.println("---------扑克牌创建成功~-----------");
		System.out.print("牌面为: " + "\n" + "[ ");
		for (Poker p : poker) {
			System.out.print(p.getColor() + p.getNum() + " ");
		}
		System.out.println("]");
	}
	
	public GameStarter() {
		this.player = new ArrayList<Player>();
		this.pokerAfterShuffle = new ArrayList<Poker>();
		this.getPoker = new Poker();
	}
	
	public static void main(String[] args) {
		GameStarter gs = new GameStarter();
		gs.shuffle();
		gs.printList();
		gs.createPlayers();
		gs.dealPoker();
	}
	/**
	 * 洗牌原理：
	 * 利用遍历，使用生产的随机数字位置，将元素从有序的扑克集合中取出
	 * 再放入pokerAfterShuffle集合中即可
	 * 要去：元素不可重复添加
	 */
	public void shuffle() {
		Random random = new Random();
		Poker p = new Poker();
		System.out.println("-------开始洗牌--------");
		for (int i = 0; i < poker.size(); i++) {
			do {
				p = poker.get(random.nextInt(poker.size()));
			} while (pokerAfterShuffle.contains(p));
			pokerAfterShuffle.add(p);
		}
		System.out.println("----------洗牌结束---------");
	}
	
	//打印洗牌后顺序
	public void printList() {
		System.out.print("洗牌后：" + "\n" + "[ ");
		for (Poker p : pokerAfterShuffle) {
			System.out.print(p.getColor() + p.getNum() + " ");
		}
		System.out.println("]");
	}
	
	//创建玩家
	public void createPlayers() {
		try {
			for (int i = 0; i < 2; i++) {
				Player p = new Player();
				System.out.println("请输入第" + (i+1) + "位玩家的信息");
				System.out.print("请输入玩家ID: ");
				p.setID(input.next());
				if (p.getID().charAt(0) < '0' || p.getID().charAt(0) > '9') {
					throw new InputMismatchException("输入有误！请输入10以内的整数~");
				}
				System.out.print("请输入玩家姓名: ");
				p.setName(input.next());
				player.add(p);
			}
		} catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			createPlayers();
		}
	}
	
	/**
	 * 发牌并比较大小
	 */
	public void dealPoker() {
		System.out.println("----------开始发牌---------");
		for (int i = 0; i < 2; i++) {   //牌数
			for (int j = 0; j < 2; j++) {    //玩家
				System.out.println("玩家" + player.get(j).getName() + "取牌");
				getPoker = pokerAfterShuffle.get(2*i + j);
				player.get(j).playerPoker.add(getPoker);
				System.out.println("牌为: " + player.get(j).playerPoker.get(i).getColor()
						+ player.get(j).playerPoker.get(i).getNum());
			}
		}
		for(int i = 0;i < 2;i++){//玩家
			for(int j = 0;j < 2;j++){//牌数
				System.out.print(player.get(i).getName()+":"+
						player.get(i).playerPoker.get(j).getColor()+
						player.get(i).playerPoker.get(j).getNum() + " ");
			}
			System.out.println();
		}
	
		System.out.println("---------发牌结束！---------");
		//开始比较牌面大小
		Collections.sort(player.get(0).playerPoker,new GameStarter());
		Collections.sort(player.get(1).playerPoker,new GameStarter());
		System.out.println("各自最大的手牌为："+"\n"+player.get(0).getName()+":"+
				player.get(0).playerPoker.get(1).getColor()
				+player.get(0).playerPoker.get(1).getNum());
		System.out.println(player.get(1).getName()+":"+player.get(1).playerPoker.get(1).getColor()
				+player.get(1).playerPoker.get(1).getNum());
		System.out.println("---------两位玩家各持的手牌为---------");
		for(int i = 0;i < 2;i++){//玩家
			for(int j = 0;j < 2;j++){//牌数
				System.out.print(player.get(i).getName()+":"+
						player.get(i).playerPoker.get(j).getColor()+	
						player.get(i).playerPoker.get(j).getNum() + " ");
			}
			System.out.println();
		}
		System.out.println("-------------比较大小------------");
		if(compare(player.get(0).playerPoker.get(1), player.get(1).playerPoker.get(1)) == 1) {
			System.out.println("玩家"+player.get(0).getName()+"获胜！");
		} else {
			System.out.println("玩家"+player.get(1).getName()+"获胜！");
		}
		System.out.println("---------------游戏结束--------------");
	}
	
	@Override
	/**
	* 用到Collections工具类的sort方法
	* 需要重写comparator方法，对泛型为Poker的List进行排序
	*/
	public int compare(Poker o1, Poker o2) {
		String[] s = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		if(Arrays.asList(s).indexOf(o1.getNum()) > Arrays.asList(s).indexOf(o2.getNum())) {
			return 1;
		} else {
			if(Arrays.asList(s).indexOf(o1.getNum()) == Arrays.asList(s).indexOf(o2.getNum())){
				if(poker.indexOf(o1) > poker.indexOf(o2)) {
					return 1;
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		}
	}
}
