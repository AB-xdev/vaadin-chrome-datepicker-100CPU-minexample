package miniexample.dl.ui.components;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;

import miniexample.dl.ui.constants.DLStyles;


@CssImport(DLStyles.PATH)
public class ButtonPanel
	extends Composite<Div>
	implements
	ThemableLayout
{
	/*
	 * CONSTRUCTOR + INIT
	 */
	
	public ButtonPanel()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		final Div root = this.getContent();
		root.addClassName("button-panel-root");
		root.addClassName(DLStyles.SHADE_5PCT);
		root.addClassName(DLStyles.BORDER_RADIUS_5PX);
		root.addClassName(DLStyles.BORDER_SHADE_20PCT);
		root.addClassName(DLStyles.PADDING_HORIZONTAL_M);
		root.addClassName(DLStyles.SHADOW_XS);
	}
	
	public void addButton(final String name, final ComponentEventListener<ClickEvent<Button>> listener)
	{
		this.addButton(new Button(name, listener));
	}
	
	public void addButton(final Button button)
	{
		this.getContent().add(button);
	}
	
	public void addAnchor(final Anchor anchor)
	{
		this.getContent().add(anchor);
	}
}
