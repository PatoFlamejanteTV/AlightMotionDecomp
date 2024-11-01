package androidx.compose.ui.graphics.vector;

/* loaded from: classes.dex */
public interface VectorConfig {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig vectorConfig, VectorProperty<T> vectorProperty, T t8) {
            Object a9;
            a9 = a.a(vectorConfig, vectorProperty, t8);
            return (T) a9;
        }
    }

    <T> T getOrDefault(VectorProperty<T> vectorProperty, T t8);
}
