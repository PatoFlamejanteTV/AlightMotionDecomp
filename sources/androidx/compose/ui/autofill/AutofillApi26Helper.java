package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final AutofillId getAutofillId(ViewStructure viewStructure) {
        AutofillId autofillId;
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isDate(AutofillValue autofillValue) {
        boolean isDate;
        isDate = autofillValue.isDate();
        return isDate;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isList(AutofillValue autofillValue) {
        boolean isList;
        isList = autofillValue.isList();
        return isList;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isText(AutofillValue autofillValue) {
        boolean isText;
        isText = autofillValue.isText();
        return isText;
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean isToggle(AutofillValue autofillValue) {
        boolean isToggle;
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillHints(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillId(ViewStructure viewStructure, AutofillId autofillId, int i8) {
        viewStructure.setAutofillId(autofillId, i8);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAutofillType(ViewStructure viewStructure, int i8) {
        viewStructure.setAutofillType(i8);
    }

    @DoNotInline
    @RequiresApi(26)
    public final CharSequence textValue(AutofillValue autofillValue) {
        CharSequence textValue;
        textValue = autofillValue.getTextValue();
        return textValue;
    }
}
