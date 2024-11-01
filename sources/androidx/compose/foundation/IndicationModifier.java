package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class IndicationModifier implements DrawModifier {
    private final IndicationInstance indicationInstance;

    public IndicationModifier(IndicationInstance indicationInstance) {
        AbstractC3292y.i(indicationInstance, "indicationInstance");
        this.indicationInstance = indicationInstance;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        AbstractC3292y.i(contentDrawScope, "<this>");
        this.indicationInstance.drawIndication(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
