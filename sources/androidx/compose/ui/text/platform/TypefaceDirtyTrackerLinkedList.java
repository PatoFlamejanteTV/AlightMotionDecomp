package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypefaceDirtyTrackerLinkedList {
    private final Object initial;
    private final TypefaceDirtyTrackerLinkedList next;
    private final State<Object> resolveResult;

    public TypefaceDirtyTrackerLinkedList(State<? extends Object> state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.resolveResult = state;
        this.next = typefaceDirtyTrackerLinkedList;
        this.initial = state.getValue();
    }

    public final Object getInitial() {
        return this.initial;
    }

    public final Typeface getTypeface() {
        Object obj = this.initial;
        AbstractC3292y.g(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        if (this.resolveResult.getValue() == this.initial && ((typefaceDirtyTrackerLinkedList = this.next) == null || !typefaceDirtyTrackerLinkedList.isStaleResolvedFont())) {
            return false;
        }
        return true;
    }

    public /* synthetic */ TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList, int i8, AbstractC3284p abstractC3284p) {
        this(state, (i8 & 2) != 0 ? null : typefaceDirtyTrackerLinkedList);
    }
}
