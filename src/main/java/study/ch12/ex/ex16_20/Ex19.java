package study.ch12.ex.ex16_20;

public class Ex19 {

}
interface ButtonClickListener {
    void onClick(String buttonName);
}

class Button {
    String name;
    ButtonClickListener listene;

    void setListener(ButtonClickListener l){

    }

    void click(){

    }
}

class AlertListener implements ButtonClickListener {
    @Override
    public void onClick(String buttonName) {

    }
}
class LogListener implements ButtonClickListener {
    @Override
    public void onClick(String buttonName) {
        System.out.println();
    }
}