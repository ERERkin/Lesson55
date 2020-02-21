package kg.wallet.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "plusik")
public class PlusAandB {
    private int sum;

    public PlusAandB(int sum) {
        this.sum = sum;
    }

    public PlusAandB() {
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
