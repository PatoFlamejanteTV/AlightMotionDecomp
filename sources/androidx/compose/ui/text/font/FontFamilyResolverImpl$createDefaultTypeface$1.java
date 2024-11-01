package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$createDefaultTypeface$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(TypefaceRequest typefaceRequest) {
        State resolve;
        resolve = this.this$0.resolve(TypefaceRequest.m4818copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null));
        return resolve.getValue();
    }
}
