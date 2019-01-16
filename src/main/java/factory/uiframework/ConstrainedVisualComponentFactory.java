package factory.uiframework;

public class ConstrainedVisualComponentFactory implements VisualComponentFactory {

    @Override
    public Button createButton() {
        return new ConstrainedButton();
    }
    @Override
    public TextBox createTextbox() {
        return new ConstrainedTextbox();
    }

}
