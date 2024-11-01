package androidx.compose.ui.text.font;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {57, 58}, m = "awaitLoad")
/* loaded from: classes.dex */
public final class AndroidFontLoader$awaitLoad$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFontLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, U5.d dVar) {
        super(dVar);
        this.this$0 = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitLoad(null, this);
    }
}
