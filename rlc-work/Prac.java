public class Prac {
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("点数は1つだけ入力してください。");
			System.exit(-1);
		}

		String rank = null;

		int score = Integer.parseInt(args[0]);

		if (score < 0 || score > 100) {
			System.out.println("0〜100を入力してください。");
			System.exit(-1);
		}

		if (score >= 90) {
			rank = "A";
		} else if (score >= 70) {
			rank = "B";
		} else if (score >= 50) {
			rank = "C";
		} else if (score >= 30) {
			rank = "D";
		} else {
			rank = "E";
		}

		System.out.println("成績の結果は" + rank + "ランクです。");
	}
}
