package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    private final InterfaceC2074p item;
    private final Function1 key;
    private final InterfaceC2072n span;
    private final Function1 type;

    public LazyGridInterval(Function1 function1, InterfaceC2072n span, Function1 type, InterfaceC2074p item) {
        AbstractC3292y.i(span, "span");
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(item, "item");
        this.key = function1;
        this.span = span;
        this.type = type;
        this.item = item;
    }

    public final InterfaceC2074p getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getKey() {
        return this.key;
    }

    public final InterfaceC2072n getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public Function1 getType() {
        return this.type;
    }
}
