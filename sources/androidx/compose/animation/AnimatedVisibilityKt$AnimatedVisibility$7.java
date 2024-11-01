package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibility$7 extends AbstractC3293z implements Function1 {
    public static final AnimatedVisibilityKt$AnimatedVisibility$7 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$7();

    AnimatedVisibilityKt$AnimatedVisibility$7() {
        super(1);
    }

    public final Boolean invoke(boolean z8) {
        return Boolean.valueOf(z8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }
}
