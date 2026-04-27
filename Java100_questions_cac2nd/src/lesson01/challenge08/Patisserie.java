/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 */

package lesson01.challenge08;

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
