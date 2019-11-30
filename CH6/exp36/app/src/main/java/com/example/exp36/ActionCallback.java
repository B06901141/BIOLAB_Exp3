package com.example.exp36;

public interface ActionCallback
{
	public void onSuccess(Object data);
	public void onFail(int errorCode, String msg);
}
