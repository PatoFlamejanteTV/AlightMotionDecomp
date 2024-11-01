package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(23)
/* loaded from: classes.dex */
public final class AutofillApi23Helper {
    public static final int $stable = 0;
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(ViewStructure viewStructure, int i8) {
        int addChildCount;
        addChildCount = viewStructure.addChildCount(i8);
        return addChildCount;
    }

    @DoNotInline
    @RequiresApi(23)
    public final ViewStructure newChild(ViewStructure viewStructure, int i8) {
        ViewStructure newChild;
        newChild = viewStructure.newChild(i8);
        return newChild;
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(ViewStructure viewStructure, int i8, int i9, int i10, int i11, int i12, int i13) {
        viewStructure.setDimens(i8, i9, i10, i11, i12, i13);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(ViewStructure viewStructure, int i8, String str, String str2, String str3) {
        viewStructure.setId(i8, str, str2, str3);
    }
}
