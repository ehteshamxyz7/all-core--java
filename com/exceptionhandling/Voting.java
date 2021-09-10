package com.exceptionhandling;

class UnderAgeException extends Exception {
	UnderAgeException() {
		super("you are under age");
	}

	UnderAgeException(String massage) {
		super(massage);
	}

}

class Voting {
	public static void main(String[] args) {
		int age = 16;
		try {
			if (age < 18) {
				throw new UnderAgeException("you can not vote as your age is below 18");

			} else {
				System.out.println("you can vote now");
			}
		} catch (UnderAgeException e) {
			e.printStackTrace();

		}
		System.out.println("hello");

	}
}
