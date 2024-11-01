package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    /* loaded from: classes.dex */
    public interface ResourceLoader {
        Object load(Font font);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    int mo4725getLoadingStrategyPKNRLFQ();

    /* renamed from: getStyle-_-LCdwA */
    int mo4735getStyle_LCdwA();

    FontWeight getWeight();
}
