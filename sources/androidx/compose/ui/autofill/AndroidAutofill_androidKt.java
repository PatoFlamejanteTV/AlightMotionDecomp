package androidx.compose.ui.autofill;

import Q5.q;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import e6.AbstractC2829a;
import g.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void performAutofill(AndroidAutofill androidAutofill, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            int keyAt = sparseArray.keyAt(i8);
            AutofillValue a9 = g.a(sparseArray.get(keyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(a9)) {
                androidAutofill.getAutofillTree().performAutofill(keyAt, autofillApi26Helper.textValue(a9).toString());
            } else if (!autofillApi26Helper.isDate(a9)) {
                if (!autofillApi26Helper.isList(a9)) {
                    if (autofillApi26Helper.isToggle(a9)) {
                        throw new q("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                } else {
                    throw new q("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
            } else {
                throw new q("An operation is not implemented: b/138604541: Add onFill() callback for date");
            }
        }
    }

    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void populateViewStructure(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        int addChildCount = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.INSTANCE;
            ViewStructure newChild = autofillApi23Helper.newChild(viewStructure, addChildCount);
            if (newChild != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId = autofillApi26Helper.getAutofillId(viewStructure);
                AbstractC3292y.f(autofillId);
                autofillApi26Helper.setAutofillId(newChild, autofillId, intValue);
                autofillApi23Helper.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), null, null);
                autofillApi26Helper.setAutofillType(newChild, 1);
                List<AutofillType> autofillTypes = value.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i8)));
                }
                autofillApi26Helper.setAutofillHints(newChild, (String[]) arrayList.toArray(new String[0]));
                Rect boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int d8 = AbstractC2829a.d(boundingBox.getLeft());
                    int d9 = AbstractC2829a.d(boundingBox.getTop());
                    int d10 = AbstractC2829a.d(boundingBox.getRight());
                    int d11 = AbstractC2829a.d(boundingBox.getBottom()) - d9;
                    AutofillApi23Helper.INSTANCE.setDimens(newChild, d8, d9, 0, 0, d10 - d8, d11);
                }
            }
            addChildCount++;
        }
    }
}
