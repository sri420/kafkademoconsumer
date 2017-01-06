package com.demo.kafka.consumer.model;
public  class SinkTimeInfo{
 
		private String time;
		private String label;
 
		public String getTime() {
			return time;
		}
 
		public void setTime(String time) {
			this.time = time;
		}
 
		public void setSinkLabel(String label) {
			this.label = label;
		}
 
		public String getLabel() {
			return label;
		}
 
		@Override
		public String toString() {
			return "SinkTimeInfo [time=" + time + ", label=" + label + "]";
		}
 
	}