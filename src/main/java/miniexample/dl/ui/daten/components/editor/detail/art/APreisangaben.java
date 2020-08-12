package miniexample.dl.ui.daten.components.editor.detail.art;

import java.util.Arrays;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep.LabelsPosition;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;

import miniexample.dl.ui.components.DLDatePicker;
import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.components.TitledLayout.Theme;


public class APreisangaben extends Composite<TitledLayout>
	implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final DatePicker dpEKAb = DLDatePicker.newDLDatePicker();
	private final DatePicker dpEKBis = DLDatePicker.newDLDatePicker();
	private final NumberField nfEKVorSkonto = new NumberField();
	private final NumberField nfEkNetto = new NumberField();
	private final TextArea taETX = new TextArea();
	
	public APreisangaben()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		final FormLayout formLayout = new FormLayout();
		
		formLayout.setResponsiveSteps(
			new ResponsiveStep("0", 1, LabelsPosition.TOP),
			new ResponsiveStep("250px", 2, LabelsPosition.TOP),
			new ResponsiveStep("460px", 2, LabelsPosition.ASIDE));
		
		formLayout.addFormItem(this.dpEKAb, "PREIS_AB");
		formLayout.addFormItem(this.dpEKBis, "PREIS_BIS");
		formLayout.addFormItem(this.nfEKVorSkonto, "SK_EUR");
		formLayout.addFormItem(this.nfEkNetto, "NE_EUR");
		
		for(final HasSize comp : Arrays.asList(
			this.dpEKAb,
			this.dpEKBis,
			this.nfEKVorSkonto,
			this.nfEkNetto))
		{
			comp.setWidthFull();
		}
		
		formLayout.setWidth("60%");
		
		this.taETX.setHeightFull();
		this.taETX.setMinHeight("7vh");
		this.taETX.setMaxHeight("20vh");
		this.taETX.setWidthFull();
		
		final FormLayout einkaufstextFormLayout = new FormLayout();
		
		einkaufstextFormLayout.setResponsiveSteps(
			new ResponsiveStep("0", 1, LabelsPosition.TOP),
			new ResponsiveStep("400px", 1, LabelsPosition.ASIDE));
		
		einkaufstextFormLayout.addFormItem(this.taETX, "EIN_TX");
		
		einkaufstextFormLayout.setWidth("40%");
		
		final HorizontalLayout container = new HorizontalLayout();
		container.setPadding(false);
		container.add(formLayout, einkaufstextFormLayout);
		
		/*
		 * ROOT LAYOUT
		 */
		
		final TitledLayout rootLayout = this.getContent();
		rootLayout.setTitle("TITLE GOES HERE 2");
		rootLayout.setTitledContent(container);
		rootLayout.setTheme(Theme.JUST_FRAME);
	}
}
