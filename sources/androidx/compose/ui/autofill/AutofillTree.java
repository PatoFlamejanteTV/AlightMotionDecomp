package androidx.compose.ui.autofill;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class AutofillTree {
    public static final int $stable = 8;
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    public final I performAutofill(int i8, String str) {
        Function1 onFill;
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i8));
        if (autofillNode != null && (onFill = autofillNode.getOnFill()) != null) {
            onFill.invoke(str);
            return I.f8786a;
        }
        return null;
    }

    public final void plusAssign(AutofillNode autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
