package androidx.compose.ui.autofill;

import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class AutofillNode {
    private static int previousId;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final Function1 onFill;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i8;
            synchronized (this) {
                AutofillNode.previousId++;
                i8 = AutofillNode.previousId;
            }
            return i8;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, Function1 function1) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = function1;
        this.id = Companion.generateId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        if (AbstractC3292y.d(this.autofillTypes, autofillNode.autofillTypes) && AbstractC3292y.d(this.boundingBox, autofillNode.boundingBox) && AbstractC3292y.d(this.onFill, autofillNode.onFill)) {
            return true;
        }
        return false;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    public final Function1 getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int i8;
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int i9 = 0;
        if (rect != null) {
            i8 = rect.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = (hashCode + i8) * 31;
        Function1 function1 = this.onFill;
        if (function1 != null) {
            i9 = function1.hashCode();
        }
        return i10 + i9;
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, Function1 function1, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? AbstractC1435t.m() : list, (i8 & 2) != 0 ? null : rect, function1);
    }
}
