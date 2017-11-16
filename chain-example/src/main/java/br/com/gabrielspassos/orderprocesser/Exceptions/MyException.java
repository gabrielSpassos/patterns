package br.com.gabrielspassos.orderprocesser.Exceptions;

public class MyException extends RuntimeException {

    private String msg;

    public MyException(String s) {
        super(s);
        this.msg = s;
    }

    public String getMsg() {
        return msg;
    }
}
