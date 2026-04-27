/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int amount = 30;

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

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);

		int ans1 = 250 * num1;
		int ans2 = 280 * num2;
		int ans3 = 320 * num3;
		int fin_num = num1 + num2 + num3;
		int fin_ans = ans1 + ans2 + ans3;

		System.out.println();

		System.out.println("合計個数\t\t" + fin_num + "個");
		System.out.println("合計金額\t" + fin_ans + "円");

		System.out.println();
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

		int amount1 = amount - num1;
		int amount2 = amount - num2;
		int amount3 = amount - num3;

		System.out.println("\n本日のおすすめです。\n");
		System.out.println("シトロン\t\t\\250・・・残り" + amount1 + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + amount2 + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + amount3 + "個");
	}

}
