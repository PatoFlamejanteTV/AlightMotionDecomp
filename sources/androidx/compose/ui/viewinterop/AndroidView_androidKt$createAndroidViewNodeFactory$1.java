package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$createAndroidViewNodeFactory$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $compositeKeyHash;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1 $factory;
    final /* synthetic */ View $ownerView;
    final /* synthetic */ CompositionContext $parentReference;
    final /* synthetic */ SaveableStateRegistry $stateRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$createAndroidViewNodeFactory$1(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i8, View view) {
        super(0);
        this.$context = context;
        this.$factory = function1;
        this.$parentReference = compositionContext;
        this.$stateRegistry = saveableStateRegistry;
        this.$compositeKeyHash = i8;
        this.$ownerView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LayoutNode invoke() {
        Context context = this.$context;
        Function1 function1 = this.$factory;
        CompositionContext compositionContext = this.$parentReference;
        SaveableStateRegistry saveableStateRegistry = this.$stateRegistry;
        int i8 = this.$compositeKeyHash;
        KeyEvent.Callback callback = this.$ownerView;
        AbstractC3292y.g(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(context, function1, compositionContext, saveableStateRegistry, i8, (Owner) callback).getLayoutNode();
    }
}
