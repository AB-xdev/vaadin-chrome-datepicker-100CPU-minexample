package miniexample.dl.ui.daten.components.editor.detail;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.daten.components.editor.detail.art.AAllgemein;
import miniexample.dl.ui.daten.components.editor.detail.art.ALieferangaben;
import miniexample.dl.ui.daten.components.editor.detail.art.AMassangaben;
import miniexample.dl.ui.daten.components.editor.detail.art.APreisangaben;
import miniexample.dl.ui.daten.components.editor.detail.art.AWebShop;
import miniexample.dl.ui.daten.components.editor.detail.upload.UploadComponent;


public class ArtikelComponent extends Composite<TitledLayout> implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final AAllgemein artikelAllgemein;

	private final AMassangaben artikelMassangaben;
	private final ALieferangaben artikelLieferangaben;

	private final APreisangaben artikelPreisangaben;

	private final AWebShop artikelWebShop;

	private final UploadComponent uploadAllgemein =
		new UploadComponent("UPLOAD FILES ALLG");
	private final UploadComponent uploadShop =
		new UploadComponent("UPLOAD FILES ONLINE SHOP");

	public ArtikelComponent()
	{
		this.artikelAllgemein = new AAllgemein();
		this.artikelMassangaben = new AMassangaben();
		this.artikelLieferangaben = new ALieferangaben();

		this.artikelPreisangaben = new APreisangaben();

		this.artikelWebShop = new AWebShop();

		this.initUI();

	}

	private void initUI()
	{
		final HorizontalLayout hlMassAngabenLieferAngaben = new HorizontalLayout();
		hlMassAngabenLieferAngaben.setWidthFull();
		hlMassAngabenLieferAngaben.setPadding(false);

		hlMassAngabenLieferAngaben.add(
			this.artikelMassangaben,
			this.artikelLieferangaben);

		final HorizontalLayout hlColliesWebShop = new HorizontalLayout();
		hlColliesWebShop.setWidthFull();
		hlColliesWebShop.setPadding(false);

		hlColliesWebShop.add(
			this.artikelWebShop);

		final VerticalLayout container = new VerticalLayout();
		container.setPadding(true);
		container.add(
			this.artikelAllgemein,
			hlMassAngabenLieferAngaben,
			this.artikelPreisangaben,
			hlColliesWebShop,
			this.uploadAllgemein,
			this.uploadShop);

		final TitledLayout rootLayout = this.getContent();
		rootLayout.setTitle("Angaben zum Artikel");
		rootLayout.setTitledContent(container);
	}

}
