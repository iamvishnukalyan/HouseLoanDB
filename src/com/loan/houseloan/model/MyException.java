package com.loan.houseloan.model;

public class MyException extends Exception {
	public MyException(String s)
    {
        super(s);
    }
	public static void main(String args[])
    {
        try
        {
            throw new MyException("User Defined");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
