package miniexample.dl.ui.components;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Objects.requireNonNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import miniexample.dl.ui.constants.DLStyles;


@CssImport(DLStyles.PATH)
public class TitledLayout
	extends Composite<VerticalLayout>
	implements ThemableLayout, HasStyle, HasComponents
{
	/*
	 * INSTANCE
	 */
	
	private final Set<String> rootThemeStyles = new HashSet<>();
	private final Set<String> contentThemeStyles = new HashSet<>();
	
	/*
	 * COMPONENTS
	 */
	
	private final H4 hTitle = new H4("<TITLE>");
	private final VerticalLayout vlContent = new VerticalLayout();
	
	/*
	 * CONSTRUCTOR + INIT
	 */
	
	public TitledLayout()
	{
		this.initUI();
	}
	
	private void initUI()
	{
		this.hTitle.addClassName(DLStyles.MARGIN_TOP_M);
		
		this.vlContent.addClassName("titled-layout-content");
		this.vlContent.setWidthFull();
		this.vlContent.setPadding(false);
		
		/*
		 * ROOT LAYOUT
		 */
		
		final VerticalLayout rootLayout = this.getContent();
		rootLayout.addClassName("titled-layout-root");
		rootLayout.add(this.hTitle);
		rootLayout.addAndExpand(this.vlContent);
		rootLayout.setHeight(null);
		
		this.setTheme(Theme.SHADED);
	}
	
	/*
	 * SETTER / GETTER
	 */
	
	public void setTitledContent(final Component content)
	{
		this.vlContent.removeAll();
		this.vlContent.add(content);
	}
	
	public void setTitle(final String title)
	{
		this.hTitle.setText(title);
	}
	
	public VerticalLayout getVlContent()
	{
		return this.vlContent;
	}
	
	public void setTheme(final Theme theme)
	{
		requireNonNull(theme);
		
		this.rootThemeStyles.forEach(this.getContent()::removeClassName);
		this.rootThemeStyles.clear();
		
		theme.getRootStyles().forEach(style ->
		{
			this.getContent().addClassName(style);
			this.rootThemeStyles.add(style);
		});
		
		this.contentThemeStyles.forEach(this.vlContent::removeClassName);
		this.contentThemeStyles.clear();
		
		theme.getContentStyles().forEach(style ->
		{
			this.vlContent.addClassName(style);
			this.contentThemeStyles.add(style);
		});
	}
	
	/*
	 * CLASSES / ENUM
	 */
	
	public enum Theme
	{
		PLAIN(
			emptyList(),
			asList(DLStyles.OVERFLOW_Y_AUTO)),
		SHADED(
			asList(
				DLStyles.SHADE_5PCT,
				DLStyles.BORDER_RADIUS_5PX,
				DLStyles.BORDER_SHADE_20PCT,
				DLStyles.SHADOW_XS),
			asList(
				DLStyles.SHADE_5PCT,
				DLStyles.BORDER_RADIUS_5PX,
				DLStyles.OVERFLOW_Y_AUTO)),
		BASE(
			asList(
				DLStyles.BASE,
				DLStyles.BORDER_RADIUS_5PX,
				DLStyles.BORDER_SHADE_20PCT),
			asList(DLStyles.OVERFLOW_Y_AUTO)),
		JUST_FRAME(
			asList(
				DLStyles.BORDER_RADIUS_5PX,
				DLStyles.BORDER_SHADE_20PCT),
			asList(DLStyles.OVERFLOW_Y_AUTO));
		
		private final Set<String> rootStyles = new HashSet<>();
		private final Set<String> contentStyles = new HashSet<>();
		
		private Theme(final Collection<String> rootStyles, final Collection<String> contentStyles)
		{
			this.rootStyles.addAll(rootStyles);
			this.contentStyles.addAll(contentStyles);
		}
		
		public Set<String> getRootStyles()
		{
			return this.rootStyles;
		}
		
		public Set<String> getContentStyles()
		{
			return this.contentStyles;
		}
	}
}
