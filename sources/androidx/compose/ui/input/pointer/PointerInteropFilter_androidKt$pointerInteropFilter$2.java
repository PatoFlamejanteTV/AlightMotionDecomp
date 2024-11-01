package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ Function1 $onTouchEvent;
    final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(Function1 function1, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        super(3);
        this.$onTouchEvent = function1;
        this.$requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i8) {
        composer.startReplaceableGroup(374375707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(374375707, i8, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PointerInteropFilter();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) rememberedValue;
        pointerInteropFilter.setOnTouchEvent(this.$onTouchEvent);
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(this.$requestDisallowInterceptTouchEvent);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInteropFilter;
    }
}
