package miniexample.dl.ui.daten.components.editor.detail.upload;

import java.util.Objects;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;

import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.components.TitledLayout.Theme;


public class UploadComponent extends Composite<TitledLayout>
	implements HasSize, ThemableLayout
{
	private final Upload upload = new Upload();
	private final Button btnDelete = new Button("DELETE");
	private final Grid<String> grid = new Grid<>();
	
	private final MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
	
	public UploadComponent(final String header)
	{
		super();
		
		Objects.requireNonNull(header);
		
		this.initUI();
	}
	
	private void initUI()
	{
		this.upload.setAutoUpload(true);
		this.upload.setReceiver(this.buffer);
		this.upload.getStyle().set("padding", "0");
		
		this.btnDelete.setEnabled(false);
		
		// @formatter:off
		this.grid
			.addComponentColumn(ifile -> {
				final Anchor anchor = new Anchor();

				anchor.setText("TEXT");
				anchor.setTarget("_blank");
				return anchor;
			})
			.setHeader("Name")
			.setAutoWidth(true)
			.setResizable(true)
			.setSortable(true);

		this.grid
			.addColumn(ifile -> "TYP")
			.setHeader("DateiTyp")
			.setAutoWidth(true)
			.setResizable(true)
			.setSortable(true);

		this.grid
			.addColumn(ifile -> "SIZE")
			.setHeader("Größe")
			.setAutoWidth(true)
			.setResizable(true)
			.setSortable(true);
		// @formatter:on
		
		this.grid.setWidthFull();
		this.grid.setMaxHeight("20vh");
		this.grid.addThemeVariants(GridVariant.LUMO_COMPACT);
		
		final HorizontalLayout hlHead = new HorizontalLayout();
		hlHead.setAlignItems(Alignment.BASELINE);
		hlHead.setWidthFull();
		hlHead.add(this.upload, this.btnDelete);
		
		final VerticalLayout container = new VerticalLayout();
		container.setPadding(false);
		container.add(hlHead, this.grid);
		
		final TitledLayout titleLayout = this.getContent();
		titleLayout.setTheme(Theme.JUST_FRAME);
		titleLayout.setTitledContent(container);
	}
	
}
