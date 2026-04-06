package study.ch12.ex.ex16_20;

public class Ex19 {
    public static void main(String[] args) {
        Button btn = new Button("저장");

        ButtonClickListener al = new AlertListener();
        ButtonClickListener ll = new LogListener();

        btn.setListener(al);
        btn.click();

        btn.setListener(ll);
        
        btn.click();
    }
}


class Button {
    String name;
    ButtonClickListener listener;

    public Button(String name) {
        this.name = name;
    }

    void setListener(ButtonClickListener listener){
        this.listener = listener;
    }

    void click(){
        listener.onClick(name);
    }
}
interface ButtonClickListener {
    void onClick(String buttonName);
}


class AlertListener implements ButtonClickListener {
    @Override
    public void onClick(String buttonName) {
        System.out.println("경고 " + buttonName + " 클릭됨");
    }
}

class LogListener implements ButtonClickListener {
    @Override
    public void onClick(String buttonName) {
        System.out.println(buttonName + "클릭됨 at" );
    }
}