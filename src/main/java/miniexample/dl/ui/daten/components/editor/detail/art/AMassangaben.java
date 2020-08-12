package miniexample.dl.ui.daten.components.editor.detail.art;

import java.util.Arrays;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.FormItem;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep.LabelsPosition;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;

import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.components.TitledLayout.Theme;


public class AMassangaben extends Composite<TitledLayout> implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final NumberField nfBreite = new NumberField();
	private final NumberField nfHoehe = new NumberField();
	private final NumberField nfTiefe = new NumberField();
	private final NumberField nfLaenge = new NumberField();
	private final NumberField nfDurchmesser = new NumberField();
	private final NumberField nfGewicht = new NumberField();
	

	public AMassangaben()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		final FormLayout formLayout = new FormLayout();
		
		formLayout.setResponsiveSteps(
			new ResponsiveStep("70px", 1, LabelsPosition.TOP),
			new ResponsiveStep("100px", 2, LabelsPosition.TOP),
			new ResponsiveStep("200px", 3, LabelsPosition.TOP),
			new ResponsiveStep("500px", 3, LabelsPosition.ASIDE));
		
		formLayout.addFormItem(this.nfBreite, "Breite (in cm)");
		formLayout.addFormItem(this.nfHoehe, "Höhe (in cm)");
		formLayout.addFormItem(this.nfTiefe, "Tiefe (in cm)");
		formLayout.addFormItem(this.nfLaenge, "Länge (in cm)");
		formLayout.addFormItem(this.nfDurchmesser, "Durchmesser (in cm)");
		formLayout.addFormItem(this.nfGewicht, "Gewicht (in kg)");
		
		formLayout.getChildren().filter(comp -> comp instanceof FormItem).forEach(
			comp -> comp.getElement().getStyle().set("--vaadin-form-item-label-width", "7em"));
		
		for(final HasSize comp : Arrays.asList(
			this.nfBreite,
			this.nfHoehe,
			this.nfTiefe,
			this.nfLaenge,
			this.nfDurchmesser,
			this.nfGewicht))
		{
			comp.setWidth("5em");
		}
		
		final VerticalLayout container = new VerticalLayout();
		container.setPadding(false);
		container.add(formLayout);
		
		final TitledLayout rootLayout = this.getContent();
		rootLayout.setTitle("TITLE GOES HERE");
		rootLayout.setTitledContent(container);
		rootLayout.setTheme(Theme.JUST_FRAME);
	}
}
