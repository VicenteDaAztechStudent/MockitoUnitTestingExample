package app.service;

import java.util.Arrays;


import app.dao.DataDao;

public class CalculationService {
	DataDao dao;
	
	public int addAll() {
		int result = 0;
		//Actual data      {1,2,5,8,9,6} =31 actual o/p 31
		//Mocked data      {1,8,7,8}     =24  o/p
		int [] addDatas = dao.getAddData();
		for (int x : addDatas) {
			result = result + x;
		}
		return result;
	}//addAll()
	
	public int subtractAll() {
		
		//Actual data {100, 30, 20, 10} = 40 actual o/p 40
		//Mocked data {500, 70,2}       = 428 o/p
		int[] subtractDatas = dao.getSubtractData();
		Arrays.sort(subtractDatas);
		int difference = subtractDatas[subtractDatas.length-1];
		
		for(int x = subtractDatas.length-2 ; x >= 0; x--) {

			difference -= subtractDatas[x];
		}
		return difference;
	}//subtractAll()
	
	public int multiplyAll() {
		//Actual data {2,4,6,2} = 40 actual o/p 40
		//Mocked data {1,5,7}   = 35 o/p
		int[] multiplyDatas = dao.getMultiplyData();
		Arrays.sort(multiplyDatas);
		int product = multiplyDatas[multiplyDatas.length-1];
		
		for (int x = multiplyDatas.length-2; x >= 0; x--) {
			product *= multiplyDatas[x];
		}
		return product;
	}//multiplyAll() 
	
	public int divideAll() {
		//Actual data {150,15,2} = 5 actual o/p 5
		//Mock data {500,25,5}   = 4
		int[] divideDatas = dao.getDivideData();
		Arrays.sort(divideDatas);
		int quotient = divideDatas[divideDatas.length-1];
		
		for (int x = divideDatas.length-2; x >= 0; x--) {
			quotient /= divideDatas[x];
		}
		return quotient;
	}//divideAll()
		
	
		
}

