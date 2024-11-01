package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuItemContent$2$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2073o $content;
        final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2073o interfaceC2073o, RowScope rowScope, int i8, int i9) {
            super(2);
            this.$content = interfaceC2073o;
            this.$this_Row = rowScope;
            this.$$changed = i8;
            this.$$dirty = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1705995688, i8, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:165)");
            }
            this.$content.invoke(this.$this_Row, composer, Integer.valueOf((this.$$changed & 14) | ((this.$$dirty >> 12) & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$2$1(boolean z8, InterfaceC2073o interfaceC2073o, RowScope rowScope, int i8, int i9) {
        super(2);
        this.$enabled = z8;
        this.$content = interfaceC2073o;
        this.$this_Row = rowScope;
        this.$$changed = i8;
        this.$$dirty = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float disabled;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1190489496, i8, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:163)");
        }
        if (this.$enabled) {
            composer.startReplaceableGroup(-1945695304);
            disabled = ContentAlpha.INSTANCE.getHigh(composer, 6);
        } else {
            composer.startReplaceableGroup(-1945695281);
            disabled = ContentAlpha.INSTANCE.getDisabled(composer, 6);
        }
        composer.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, ComposableLambdaKt.composableLambda(composer, -1705995688, true, new AnonymousClass1(this.$content, this.$this_Row, this.$$changed, this.$$dirty)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
