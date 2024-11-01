package androidx.compose.ui.tooling.preview;

import i.AbstractC2961a;
import k6.InterfaceC3255g;

/* loaded from: classes.dex */
public interface PreviewParameterProvider<T> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            int a9;
            a9 = AbstractC2961a.a(previewParameterProvider);
            return a9;
        }
    }

    int getCount();

    InterfaceC3255g getValues();
}
