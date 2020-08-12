package miniexample.dl.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;

import miniexample.dl.ui.constants.DLStyles;
import miniexample.dl.ui.constants.GridStyles;
import miniexample.vaadin.styles.SharedStyles;


@CssImport(DLStyles.PATH)
@CssImport(SharedStyles.PATH)
@CssImport(value = "./styles/button-styles.css", themeFor = "vaadin-button")
@CssImport(value = "./styles/textfield-styles.css", themeFor = "vaadin-text-field")
@CssImport(value = GridStyles.PATH, themeFor = "vaadin-grid")
public class MainLayout extends Composite<VerticalLayout> implements RouterLayout, PageConfigurator
{
	/*
	 * COMPONENTS
	 */
	
	private final MainHeader header = new MainHeader();
	private final VerticalLayout contentContainer = new VerticalLayout();
	
	/*
	 * CONSTRUCTOR + INIT
	 */
	
	public MainLayout()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		/*
		 * CONTENT
		 */
		
		this.contentContainer.addClassName("main-layout-content");
		this.contentContainer.addClassName(DLStyles.OVERFLOW_Y_AUTO);
		this.contentContainer.setSpacing(false);
		this.contentContainer.setPadding(false);
		this.contentContainer.setSizeFull();
		
		/*
		 * FOOTER
		 */
		
		final Label lblVersion = new Label();
		lblVersion.addClassName(DLStyles.MARGIN_RIGHT_M);
		
		final HorizontalLayout hlFooter = new HorizontalLayout();
		hlFooter.addClassName("main-layout-footer");
		hlFooter.addClassName(DLStyles.SHADE_10PCT);
		hlFooter.addClassName(DLStyles.SECONDARY_TEXT);
		hlFooter.setJustifyContentMode(JustifyContentMode.END);
		hlFooter.setWidthFull();
		hlFooter.add(lblVersion);
		
		/*
		 * ROOT LAYOUT
		 */
		final VerticalLayout vlCenter = new VerticalLayout();
		vlCenter.addClassName("main-layout-center");
		vlCenter.addClassName(DLStyles.PADDING_HORIZONTAL_XL);

		vlCenter.setWidthFull();
		vlCenter.setMaxWidth("1280px");
		
		vlCenter.setAlignItems(Alignment.STRETCH);
		vlCenter.add(this.header);
		vlCenter.add(this.contentContainer);
		
		final VerticalLayout vlRoot = this.getContent();
		vlRoot.addClassName("main-layout-root");
		vlRoot.addClassName(DLStyles.OVERFLOW_AUTO);
		vlRoot.setAlignItems(Alignment.CENTER);
		vlRoot.setPadding(false);
		vlRoot.setSizeFull();
		vlRoot.addAndExpand(vlCenter);
		vlRoot.add(hlFooter);
		
		/*
		 * FILL DATA
		 */
		
		lblVersion.setText("Some version");
	}
	
	@Override
	public void showRouterLayoutContent(final HasElement content)
	{
		if(content != null && content.getElement() != null)
		{
			this.contentContainer.getElement().appendChild(content.getElement());
		}
	}
	
	@Override
	public void configurePage(final InitialPageSettings settings)
	{
		settings.addFavIcon("icon", "icons/icon.gif", "256x256");
	}
}
