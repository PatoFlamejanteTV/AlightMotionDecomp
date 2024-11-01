package androidx.compose.ui.text.font;

import Q5.I;
import Q5.t;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends kotlin.coroutines.jvm.internal.l implements Function1 {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, U5.d dVar) {
        super(1, dVar);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(U5.d dVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(U5.d dVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            AsyncFontListLoader asyncFontListLoader = this.this$0;
            Font font = this.$font;
            this.label = 1;
            obj = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }
}
