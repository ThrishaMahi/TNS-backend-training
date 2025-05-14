package com.tnsif.Generics;
//Demo for Generic Class
public class Sender<T> {
	//T--> the type
		private T message;
		
		
		public void setMessage(T message) {
			this.message=message;
			}
		
		public T getMessage() {
			return message;
		}


}
