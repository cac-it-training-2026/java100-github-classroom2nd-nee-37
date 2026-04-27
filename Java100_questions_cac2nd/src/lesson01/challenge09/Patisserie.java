/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		double amount = 30;

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("シトロン\t\t>");
		String str1 = reader.readLine();
		System.out.print("ショコラ\t\t>");
		String str2 = reader.readLine();
		System.out.print("ピスターシュ\t>");
		String str3 = reader.readLine();

		System.out.println();

		System.out.println("シトロン\t\t" + str1 + "個");
		System.out.println("ショコラ\t\t" + str2 + "個");
		System.out.println("ピスターシュ\t" + str3 + "個");

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);

		double ans1 = 250 * num1;
		double ans2 = 280 * num2;
		double ans3 = 320 * num3;
		double fin_num = num1 + num2 + num3;
		double fin_ans = ans1 + ans2 + ans3;

		System.out.println();

		System.out.println("合計個数\t\t" + fin_num + "個");
		System.out.println("合計金額\t\t" + (int) fin_ans + "円");

		System.out.println();
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

		double amount1 = amount - num1;
		double amount2 = amount - num2;
		double amount3 = amount - num3;

		System.out.println("\n本日のおすすめです。\n");
		System.out.println("シトロン\t\t\\250・・・残り" + (int) amount1 + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + (int) amount2 + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + (int) amount3 + "個");

		System.out.println("\n売上の割合");
		System.out.println("売上合計\t\t" + "\\" + fin_ans);

		double rete1 = ans1 / fin_ans;
		double rete2 = ans2 / fin_ans;
		double rete3 = ans3 / fin_ans;

		System.out.println("\n内訳");
		System.out.println("シトロン\t\t\\" + (int) ans1 + "・・・" + (int) (rete1 * 100) + "%");
		System.out.println("ショコラ\t\t\\" + (int) ans2 + "・・・" + (int) (rete2 * 100) + "%");
		System.out.println("ピスターシュ\t\\" + (int) ans3 + "・・・" + (int) (rete3 * 100) + "%");

		//新商品価格決定
		double new_price = fin_ans / fin_num;//double型で割ると小数点以下残るため整数型でやる
		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味\t\t\\" + "・・・" + (int) (rete1 * 100) + "%");
		System.out.println("ショコラの味\t\t\\" + "・・・" + (int) (rete2 * 100) + "%");
		System.out.println("ピスターシュの味\t\\" + "・・・" + (int) (rete3 * 100) + "%");
		System.out.println("\nが楽しめます！\n");
		System.out.println("値段は\\" + (int) new_price / 10 * 10 + "円です。");

	}
}
