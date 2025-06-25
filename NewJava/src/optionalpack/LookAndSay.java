import java.util.ArrayList;
import java.util.List;

public class LookAndSay {

	private void lookAndSay(int n) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			b.clear();
			b.addAll(a);
			if (b.size() <= 1) {
				a.add(1);
			} else {
				int count = 1;
				int row = 0;
				a.clear();
				for (int j = 0; j < b.size() - 1; j++) {
					int value = b.get(j);
					if (b.get(j) != b.get(j + 1)) {
						count = 1;
						if (j == 0) {
							a.add(row++, count);
							a.add(row++, b.get(j));
						}
						value = b.get(j + 1);
					} else {
						if (row > 3 && j == 0) {
							a.remove(--row);
							a.remove(--row);
						} else if (row > 1) {
							a.remove(--row);
							a.remove(--row);
						}
						++count;
					}
					a.add(row++, count);
					a.add(row++, value);
				}
			}
			a.stream().forEach(System.out::print);
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		LookAndSay t = new LookAndSay();
		t.lookAndSay(10);
	}

}
