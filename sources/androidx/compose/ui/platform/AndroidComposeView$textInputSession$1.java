package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {428}, m = "textInputSession")
/* loaded from: classes.dex */
public final class AndroidComposeView$textInputSession$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$1(AndroidComposeView androidComposeView, U5.d dVar) {
        super(dVar);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.textInputSession(null, this);
    }
}
