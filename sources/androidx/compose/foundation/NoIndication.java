package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class NoIndication implements Indication {
    public static final NoIndication INSTANCE = new NoIndication();

    /* loaded from: classes.dex */
    private static final class NoIndicationInstance implements IndicationInstance {
        public static final NoIndicationInstance INSTANCE = new NoIndicationInstance();

        private NoIndicationInstance() {
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(ContentDrawScope contentDrawScope) {
            AbstractC3292y.i(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
        }
    }

    private NoIndication() {
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(285654452);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(285654452, i8, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return noIndicationInstance;
    }
}
