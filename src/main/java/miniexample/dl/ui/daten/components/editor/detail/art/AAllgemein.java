package miniexample.dl.ui.daten.components.editor.detail.art;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import miniexample.dl.ui.components.DLDatePicker;
import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.components.TitledLayout.Theme;


public class AAllgemein extends Composite<TitledLayout> implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final DatePicker dpModellAuslauf = DLDatePicker.newDLDatePicker();
	
	public AAllgemein()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		final FormLayout formLayout = new FormLayout();
		
		formLayout.addFormItem(this.dpModellAuslauf, "Modellauslauf Artikel");
		
		final VerticalLayout container = new VerticalLayout();
		container.setPadding(false);
		container.add(formLayout);
		
		/*
		 * ROOT LAYOUT
		 */
		
		final TitledLayout rootLayout = this.getContent();
		rootLayout.setTitle("Artikel Allgemein");
		rootLayout.setTitledContent(container);
		rootLayout.setTheme(Theme.JUST_FRAME);
	}
	
}
