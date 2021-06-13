package com.builderpattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		Student student = new Student.Builder(1).name("amit").address("address").build();
		System.out.println(student);		
	}
}
class Student{
	final private String name;
	final private int id;
	final private String address;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	public Student(Builder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.address = builder.address;
	}
	
	public static class Builder{
		private String name;
		private int id;
		private String address;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
		
		public Builder(int id) {
			this.id= id;
		}
	}
}
