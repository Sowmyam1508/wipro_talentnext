package com.mile1.exception;

@SuppressWarnings("serial")
public class NullStudentObjectException extends Exception {
	@Override
	public String toString() {
		return "object is null";
	}
}