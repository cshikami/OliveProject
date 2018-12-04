package com.cshikami;

import java.util.List;

import com.cshikami.model.Olive;

public interface Press {

	public int getOil(List<Olive> olives);
	public void setOil(int oil);
}
