package miniexample.dl.ui.daten;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import miniexample.dl.ui.MainLayout;
import miniexample.dl.ui.daten.components.ImportEditor;


@Route(value = "", layout = MainLayout.class)
public class DatenView extends Composite<VerticalLayout>
{
	
	/*
	 * UI-Components
	 */
	private final ImportEditor editor = new ImportEditor();
	
	public DatenView()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		this.editor.setWidthFull();

		final VerticalLayout root = this.getContent();
		root.getStyle().set("padding-top", "0");
		root.add(this.editor);
	}
	
}
