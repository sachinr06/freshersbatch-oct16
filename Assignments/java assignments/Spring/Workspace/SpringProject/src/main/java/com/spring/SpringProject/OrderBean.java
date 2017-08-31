package com.spring.SpringProject;

public class OrderBean {
	 ItemBean item;

	 public OrderBean() {
			
		}
	public OrderBean(ItemBean item) {
		super();
		this.item = item;
	}

	@Override
	public String toString() {
		return "OrderBean [item=" + item + "]";
	}

	public ItemBean getItem() {
		return item;
	}

	public void setItem(ItemBean item) {
		this.item = item;
	}
	}
