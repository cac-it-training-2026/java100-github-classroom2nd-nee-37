/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);

		double ans1 = 250 * num1;
		double ans2 = 280 * num2;
		double ans3 = 320 * num3;
		double fin_num = num1 + num2 + num3;
		int fin_ans = (int) ans1 + (int) ans2 + (int) ans3;

		System.out.println();

		System.out.println("合計個数\t\t" + fin_num + "個");
		System.out.println("合計金額\t\t" + fin_ans + "円");

		System.out.println();
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

		int amount1 = amount - (int) num1;
		int amount2 = amount - (int) num2;
		int amount3 = amount - (int) num3;

		System.out.println("\n本日のおすすめです。\n");
		System.out.println("シトロン\t\t\\250・・・残り" + amount1 + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + amount2 + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + amount3 + "個");
	}
}
