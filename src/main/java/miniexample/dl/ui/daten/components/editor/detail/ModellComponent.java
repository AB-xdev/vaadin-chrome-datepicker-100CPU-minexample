package miniexample.dl.ui.daten.components.editor.detail;

import java.time.LocalDate;
import java.util.Arrays;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep.LabelsPosition;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.ThemableLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

import miniexample.dl.ui.components.DLDatePicker;
import miniexample.dl.ui.components.TitledLayout;
import miniexample.dl.ui.daten.components.editor.detail.upload.UploadComponent;


public class ModellComponent extends Composite<TitledLayout> implements ThemableLayout, FlexComponent<VerticalLayout>
{
	private final TextField txt1 = new TextField();
	private final TextField txt2 = new TextField();
	private final TextField txt3 = new TextField();
	private final TextField txt4 = new TextField();
	private final TextField txt5 = new TextField();
	private final TextField txt6 = new TextField();
	private final TextArea ta1 = new TextArea();
	private final TextArea ta2 = new TextArea();
	private final TextArea ta3 = new TextArea();
	private final DatePicker dp1 = DLDatePicker.newDLDatePicker();
	private final DatePicker dp2 = DLDatePicker.newDLDatePicker();
	private final UploadComponent upload = new UploadComponent("UPLOAD FILES");

	public ModellComponent()
	{
		this.initUI();
	}

	private void initUI()
	{
		this.dp2.setValue(LocalDate.now());

		final FormLayout formLayout = new FormLayout();

		formLayout.setResponsiveSteps(
			new ResponsiveStep("120px", 1, LabelsPosition.TOP),
			new ResponsiveStep("390px", 2, LabelsPosition.TOP),
			new ResponsiveStep("600px", 2, LabelsPosition.ASIDE),
			new ResponsiveStep("850px", 3, LabelsPosition.ASIDE));

		formLayout.addFormItem(this.txt1, "NAME1");
		formLayout.addFormItem(this.txt2, "NAME2");
		formLayout.addFormItem(this.txt3, "NAME3");
		formLayout.addFormItem(this.txt4, "NAME4");
		formLayout.addFormItem(this.txt5, "NAME5");
		formLayout.addFormItem(this.txt6, "NAME6");
		formLayout.addFormItem(this.ta1, "TA1");
		formLayout.addFormItem(this.ta2, "TA2");
		formLayout.addFormItem(this.ta3, "TA3");
		formLayout.addFormItem(this.dp1, "DP1");
		formLayout.addFormItem(this.dp2, "DP2");

		for(final HasSize comp : Arrays.asList(
			this.txt1,
			this.txt2,
			this.txt3,
			this.txt4,
			this.txt5,
			this.txt6,
			this.ta1,
			this.ta2,
			this.ta3,
			this.dp1,
			this.dp2))
		{
			comp.setWidthFull();
		}

		for(final TextArea ta : Arrays.asList(
			this.ta1,
			this.ta2,
			this.ta3))
		{
			ta.setMaxHeight("20vh");
		}

		this.upload.setSizeFull();

		final VerticalLayout container = new VerticalLayout();
		container.setPadding(true);
		container.add(formLayout, this.upload);

		/*
		 * ROOT LAYOUT
		 */

		final TitledLayout vlRoot = this.getContent();
		vlRoot.setTitle("TITLE HERE");
		vlRoot.setTitledContent(container);
	}
}
