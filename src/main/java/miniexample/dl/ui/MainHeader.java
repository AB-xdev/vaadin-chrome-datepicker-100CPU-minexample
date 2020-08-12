package miniexample.dl.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import miniexample.dl.ui.constants.DLStyles;


public class MainHeader extends Composite<Anchor>
{

	public MainHeader()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		final H1 headerText = new H1("NAME");
		headerText.addClassName(DLStyles.MARGIN_VERTICAL_ZERO);
		
		final HorizontalLayout layout = new HorizontalLayout(headerText);
		layout.addClassName(DLStyles.MARGIN_TOP_XL);
		layout.addClassName(DLStyles.PADDING_HORIZONTAL_L);
		layout.setAlignItems(Alignment.CENTER);
		layout.setJustifyContentMode(JustifyContentMode.BETWEEN);
		layout.setSpacing(false);
		layout.setPadding(false);
		
		final Anchor root = this.getContent();
		root.addClassName(DLStyles.NO_TEXT_DECORATION_HOVER);
		root.setTarget("_blank");
		
		root.setWidthFull();
		
		root.add(layout);
	}
	
}
