package androidx.compose.ui.tooling.preview.datasource;

import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import i.AbstractC2961a;
import java.util.Collection;
import k6.InterfaceC3255g;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return AbstractC2961a.a(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public InterfaceC3255g getValues() {
        return AbstractC1435t.c0(this.collection);
    }
}
