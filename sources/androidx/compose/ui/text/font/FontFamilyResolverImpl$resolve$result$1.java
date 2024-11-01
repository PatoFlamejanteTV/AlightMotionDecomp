package androidx.compose.ui.text.font;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$resolve$result$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TypefaceResult invoke(Function1 function1) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        Function1 function12;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        Function1 function13;
        fontListFontFamilyTypefaceAdapter = this.this$0.fontListFontFamilyTypefaceAdapter;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        PlatformFontLoader platformFontLoader$ui_text_release = this.this$0.getPlatformFontLoader$ui_text_release();
        function12 = this.this$0.createDefaultTypeface;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release, function1, function12);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.platformFamilyTypefaceAdapter;
            TypefaceRequest typefaceRequest2 = this.$typefaceRequest;
            PlatformFontLoader platformFontLoader$ui_text_release2 = this.this$0.getPlatformFontLoader$ui_text_release();
            function13 = this.this$0.createDefaultTypeface;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader$ui_text_release2, function1, function13);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }
}
