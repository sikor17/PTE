package pl.edu.pw.ii.pte.junit.tdd.step9exercise;

import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	public static final int MAXIMUM_CAPACITY = 10;
	private int size = 0;
	private int[] contents = new int[MAXIMUM_CAPACITY];

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(int i) {
		if (size == contents.length) {
			resize(2*contents.length);
		}
		contents[size++] = i;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return contents[--size];
	}

	public int getSize() {
		return size;
	}

	public int[] getContents() {
		return contents;
	}

	public boolean isFull() {
		return size == MAXIMUM_CAPACITY;
	}

	public int peek() {
	    if (size == -1)
	        throw new EmptyStackException();
		return contents[size];
	}

	public void resize(int max) {
		int[] temp = new int[max];
		for (int i = 0; i < size; i++) {
			temp[i] = contents[i];
		}
		contents = temp;
	}
	     }

