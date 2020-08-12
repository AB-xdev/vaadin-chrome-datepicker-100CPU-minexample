package miniexample.dl.ui.daten.components.editor.detail.art;

import java.util.Arrays;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep.LabelsPosition;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.components.TitledLayout.Theme;


public class AWebShop extends Composite<TitledLayout> implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final TextField txt1 = new TextField();
	private final TextField txt2 = new TextField();
	private final TextArea taOnlineBesc = new TextArea();
	private final NumberField nfUnverbVkPreis = new NumberField();

	public AWebShop()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		this.taOnlineBesc.setHeightFull();
		this.taOnlineBesc.setMinHeight("10vh");
		this.taOnlineBesc.setMaxHeight("30vh");
		this.taOnlineBesc.setWidthFull();
		
		final FormLayout formLayout = new FormLayout();
		
		formLayout.setResponsiveSteps(
			new ResponsiveStep("0", 1, LabelsPosition.TOP),
			new ResponsiveStep("460px", 1, LabelsPosition.ASIDE));
		
		formLayout.addFormItem(this.txt1, "TXT1");
		formLayout.addFormItem(this.txt2, "TXT2");
		formLayout.addFormItem(this.taOnlineBesc, "TA1");
		formLayout.addFormItem(this.nfUnverbVkPreis, "PRICE");
		
		formLayout.getChildren().filter(comp -> comp instanceof FormItem).forEach(
			comp -> comp.getElement().getStyle().set("--vaadin-form-item-label-width", "9em"));
		
		for(final HasSize comp : Arrays.asList(
			this.txt1,
			this.txt2,
			this.taOnlineBesc))
		{
			comp.setWidthFull();
		}
		
		final HorizontalLayout container = new HorizontalLayout();
		container.setPadding(false);
		container.add(formLayout);
		
		/*
		 * ROOT LAYOUT
		 */
		
		final TitledLayout rootLayout = this.getContent();
		rootLayout.setTitle("TITLE GOES MAYBE HERE?");
		rootLayout.setTitledContent(container);
		rootLayout.setTheme(Theme.JUST_FRAME);
	}
}
