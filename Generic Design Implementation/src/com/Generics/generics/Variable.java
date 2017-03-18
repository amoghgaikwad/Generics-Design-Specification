package com.assignment6.generics;

/**
 * @author Varun
 *
 */
public class Variable<T>
{
	private T value;
	public Variable(T _value)
	{
		this.value = _value;
	} 
   
	public void setValue(T newvalue)
	{
		this.value = newvalue;
	} 
   
	public T getValue() 
	{
		return value;
	}

	public void swap(Variable<T> other)
	{
		T tmp = this.value;
		this.setValue(other.getValue());
		other.setValue(tmp);
	} 
} // class Variable

