package package4;

import package4.Interfaces.Eraser;

public class WritingTool  implements Eraser {
    private String color;

    @Override
    public void erase() {
        System.out.println("Writing Tool Eraser.");
    }
}
