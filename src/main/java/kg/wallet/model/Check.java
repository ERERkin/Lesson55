package kg.wallet.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "check")
public class Check {
    String ans;

    public Check(String ans) {
        this.ans = ans;
    }

    public Check() {
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
