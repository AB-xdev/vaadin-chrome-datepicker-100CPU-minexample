package miniexample.dl.ui.daten.components;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;

import miniexample.dl.ui.daten.components.editor.ImportDetailPanel;

import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


public class ImportEditor extends Composite<VerticalLayout> implements HasSize, ThemableLayout
{
	private final ImportDetailPanel detailView = new ImportDetailPanel();
	
	public ImportEditor()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		this.detailView.setVisible(true);
		this.detailView.setPadding(false);
		
		final VerticalLayout vlRoot = this.getContent();
		vlRoot.setPadding(false);
		vlRoot.setAlignItems(Alignment.STRETCH);
		vlRoot.add(
			this.detailView);
	}
}
