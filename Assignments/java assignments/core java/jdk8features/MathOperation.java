package jdk8features;

@FunctionalInterface
public interface MathOperation<T>{
	T operation(T t, T u);
}