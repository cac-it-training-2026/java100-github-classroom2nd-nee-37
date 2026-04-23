/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] MQArayyC = new int[5];
		int[] MQArayyD = new int[5];
		int[] MQArayyE = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < MQArayyC.length; i++) {
			int Number = (int) (Math.random() * 10) % 4;
			if (Number == 0) {
				MQArayyC[i] = Number;
			} else {
				int Number1 = (int) (Math.random() * 10) % 9 + 1;
				MQArayyC[i] = Number1;
			}

		}
		for (int i = 0; i < MQArayyD.length; i++) {
			int Number = (int) (Math.random() * 10) % 4;
			if (Number == 0) {
				MQArayyD[i] = Number;
			} else {
				int Number1 = (int) (Math.random() * 10) % 9 + 1;
				MQArayyD[i] = Number1;
			}
		}
		for (int i = 0; i < MQArayyE.length; i++) {
			int Number = (int) (Math.random() * 10) % 4;
			if (Number == 0) {
				MQArayyE[i] = Number;
			} else {
				int Number1 = (int) (Math.random() * 10) % 9 + 1;
				MQArayyE[i] = Number1;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i : MQArayyC) {
			System.out.print(i + ",");
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i : MQArayyD) {
			System.out.print(i + ",");
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i : MQArayyE) {
			System.out.print(i + ",");
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する

		for (int i = 0; i < MQArayyC.length; i++) {
			if (MQArayyC[i] == 0) {
				for (int j = 0; j < MQArayyD.length; j++) {
					if (MQArayyD[j] != 0) {
						MQArayyC[i] = MQArayyD[j];
						MQArayyD[j] = 0;
						break;
					}
				}
			}
		}
		for (int i = 0; i < MQArayyD.length; i++) {
			if (MQArayyD[i] == 0) {
				for (int j = 0; j < MQArayyE.length; j++) {
					if (MQArayyE[j] != 0) {
						MQArayyD[i] = MQArayyE[j];
						MQArayyE[j] = 0;
						break;
					}
				}
			}
		}

		for (int i = 0; i < MQArayyE.length - 1; i++) {
			for (int j = i + 1; j < MQArayyE.length; j++) {
				if (MQArayyE[i] < MQArayyE[j]) {
					int temp = MQArayyE[i];
					MQArayyE[i] = MQArayyE[j];
					MQArayyE[j] = temp;
				}
			}
		}

		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i : MQArayyC) {
			System.out.print(i + ",");
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i : MQArayyD) {
			System.out.print(i + ",");
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i : MQArayyE) {
			System.out.print(i + ",");
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
