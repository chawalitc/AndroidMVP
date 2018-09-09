package chawalit.chonpratatip.androidworkshop3;

public class MainPresenter {
    private Number numberModel = new Number();
    public int loadNumber(){
        return this.numberModel.getNumber();
    }

    public void start() {
        // load data from serve
    }
}
