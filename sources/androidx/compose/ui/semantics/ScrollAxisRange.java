package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final Function0 maxValue;
    private final boolean reverseScrolling;
    private final Function0 value;

    public ScrollAxisRange(Function0 function0, Function0 function02, boolean z8) {
        this.value = function0;
        this.maxValue = function02;
        this.reverseScrolling = z8;
    }

    public final Function0 getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final Function0 getValue() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.value.invoke()).floatValue() + ", maxValue=" + ((Number) this.maxValue.invoke()).floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function02, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(function0, function02, (i8 & 4) != 0 ? false : z8);
    }
}
