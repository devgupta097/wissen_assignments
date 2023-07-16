package com.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class MyStream<T> {

	private List<T> elements;

	private MyStream(List<T> elements) {
		this.elements = elements;
	}
	
	public static <T> MyStream<T> of(List<T> elements) {
		return new MyStream<>(elements);
    }

	public MyStream<T> filter(Predicate<T> predicate) {
		List<T> filteredElements = new ArrayList<>();
		for (T element : elements) {
			if (predicate.test(element)) {
				filteredElements.add(element);
			}
		}
		return new MyStream<>(filteredElements);
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		List<R> mappedElements = new ArrayList<>();
		for (T element : elements) {
			mappedElements.add(mapper.apply(element));
		}
		return new MyStream<>(mappedElements);
	}
	
	public <R, A> R collect(Collector<? super T, A, R> collector) {
		A accumulator = collector.supplier().get();
		for (T element : elements) {
			collector.accumulator().accept(accumulator, element);
		}
		return collector.finisher().apply(accumulator);
	}
}
