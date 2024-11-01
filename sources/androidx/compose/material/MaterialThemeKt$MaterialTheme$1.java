package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialThemeKt$MaterialTheme$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ Typography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.MaterialThemeKt$MaterialTheme$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2072n interfaceC2072n, int i8) {
            super(2);
            this.$content = interfaceC2072n;
            this.$$dirty = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(181426554, i8, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
            }
            MaterialTheme_androidKt.PlatformMaterialTheme(this.$content, composer, (this.$$dirty >> 9) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$1(Typography typography, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$typography = typography;
        this.$content = interfaceC2072n;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1740102967, i8, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
        }
        TextKt.ProvideTextStyle(this.$typography.getBody1(), ComposableLambdaKt.composableLambda(composer, 181426554, true, new AnonymousClass1(this.$content, this.$$dirty)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
