/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
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

	}
}
