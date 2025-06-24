package com.anoud.pi.azure.service;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {

	private void lookAndSay(int n) {
		List<String> a = new ArrayList<>();
		List<String> d = new ArrayList<>();
		a.add("1");
		for (int i = 0; i < n; i++) {
			a.stream().forEach(System.out::print);
			int count = 1;
			int row = 0;
			boolean flag = false;
			d.clear();
			d.addAll(a);
			if (d.size() > 1) {
				a.clear();
				for (int j = 0; j < d.size() - 1; j++) {
					if (Integer.parseInt(d.get(j)) != Integer.parseInt(d.get(j+1))) {
						count = 1;
						if (!flag) {
							a.add(row, String.valueOf(count));
							row++;
							a.add(row, String.valueOf(d.get(j)));
							row++;
							if (count % 2 == 0) {
								flag = false;
							} else {
								flag = true;
							}
						}
						a.add(row, String.valueOf(count));
						row++;
						a.add(row, String.valueOf(d.get(j + 1)));
						row++;
					} else {
						if (row > 2) {
							a.remove(row - 1);
							a.remove(row - 2);
							row = row - 2;
							if (!flag) {
								a.remove(row - 1);
								a.remove(row - 2);
								row = row - 2;
							}
						} else if (row > 0) {
							a.remove(row - 1);
							a.remove(row - 2);
							row = row - 2;
						}
						count++;
						a.add(row, String.valueOf(count));
						row++;
						a.add(row, String.valueOf(d.get(j)));
						row++;
						flag = true;
					}
				}
			} else {
				a.add("1");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		LookAndSay t = new LookAndSay();
		t.lookAndSay(7);
	}

}
