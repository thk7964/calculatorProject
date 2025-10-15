package lv2;

public class Calculator {

    private int result;

    public Calculator(){
        this.result = 0;
    }

    public int sum(int a, int b) {
        this.result = a + b;
        return this.result;
    }
    public int sub(int a, int b) {
        this.result = a - b;
        return this.result;
    }
    public int mul(int a, int b) {
        this.result = a * b;
        return this.result;
    }
    public int div(int a, int b) {
        this.result = a / b;
        return this.result;
    }

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
}
