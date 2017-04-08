package com.ddxx.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import sun.nio.ch.ThreadPool;
/**
 * 一个数组的倒序
 */
public class T2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		List list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			list.add(i+1);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println(list.size());
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
}
