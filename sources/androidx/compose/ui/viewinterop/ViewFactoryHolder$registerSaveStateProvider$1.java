package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ViewFactoryHolder$registerSaveStateProvider$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        View view;
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        view = ((ViewFactoryHolder) this.this$0).typedView;
        view.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
