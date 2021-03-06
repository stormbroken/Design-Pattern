package principle.OCP;

/**
 * @Author stormbroken
 * Create by 2021/03/02
 * @Version 1.0
 **/

public class RectangleButton implements AbstractButton{
    private String message = "";
    @Override
    public void view() {
        System.out.println(message);
    }

    @Override
    public void setMessage(String message) {
        this.message = this.getClass().toString() + " success at " +
                System.currentTimeMillis() + " s with " + message + "。";
    }
}
