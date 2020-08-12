package miniexample.dl.ui.daten.components.editor;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import miniexample.dl.ui.daten.components.editor.detail.ArtikelComponent;
import miniexample.dl.ui.daten.components.editor.detail.ModellComponent;


public class ImportDetailPanel extends Composite<VerticalLayout> implements HasSize, ThemableLayout
{

	/*
	 * Modell Components
	 */
	private final ModellComponent modellComp = new ModellComponent();
	private final ArtikelComponent artikelComp = new ArtikelComponent();
	
	public ImportDetailPanel()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		this.getContent().add(
			this.modellComp,
			this.artikelComp);
	}
	
}
