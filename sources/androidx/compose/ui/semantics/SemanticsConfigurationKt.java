package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, SemanticsConfigurationKt$getOrNull$1.INSTANCE);
    }
}
