package androidx.compose.ui.semantics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import j6.i;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.U;

/* loaded from: classes.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ i[] $$delegatedProperties = {U.e(new E(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    @ExperimentalComposeUiApi
    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @ExperimentalComposeUiApi
    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z8) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z8));
    }
}
