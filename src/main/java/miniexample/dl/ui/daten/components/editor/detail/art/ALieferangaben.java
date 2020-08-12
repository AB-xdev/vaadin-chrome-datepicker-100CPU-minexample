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
import com.vaadin.flow.component.textfield.TextField;

import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.components.TitledLayout.Theme;


public class ALieferangaben extends Composite<TitledLayout>
	implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final TextField txtVerpackungsEinheit = new TextField();
	private final TextField txtLieferZeit = new TextField();
	private final TextField txtMindestBestellMenge = new TextField();
	private final TextField txtMindestBestellWert = new TextField();
	
	
	public ALieferangaben()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		final FormLayout formLayout = new FormLayout();
		
		formLayout.setResponsiveSteps(
			new ResponsiveStep("0", 2, LabelsPosition.TOP),
			new ResponsiveStep("500px", 2, LabelsPosition.ASIDE));
		
		formLayout.setResponsiveSteps(
			new ResponsiveStep("120px", 1, LabelsPosition.TOP),
			new ResponsiveStep("250px", 2, LabelsPosition.TOP),
			new ResponsiveStep("500px", 2, LabelsPosition.ASIDE));
		
		formLayout.addFormItem(this.txtVerpackungsEinheit, "Verpackungseinheit");
		formLayout.addFormItem(this.txtLieferZeit, "Lieferzeit");
		formLayout.addFormItem(this.txtMindestBestellMenge, "Mindestbestellmenge");
		formLayout.addFormItem(this.txtMindestBestellWert, "Mindestbestellwert");
		
		formLayout.getChildren().filter(comp -> comp instanceof FormItem).forEach(
			comp -> comp.getElement().getStyle().set("--vaadin-form-item-label-width", "10em"));
		
		for(final HasSize comp : Arrays.asList(
			this.txtVerpackungsEinheit,
			this.txtLieferZeit,
			this.txtMindestBestellMenge,
			this.txtMindestBestellWert))
		{
			comp.setWidth("9em");
		}
		
		final VerticalLayout container = new VerticalLayout();
		container.setPadding(false);
		container.add(formLayout);
		
		final TitledLayout rootLayout = this.getContent();
		rootLayout.setTitle("Lieferangaben");
		rootLayout.setTitledContent(container);
		rootLayout.setTheme(Theme.JUST_FRAME);
	}
}
