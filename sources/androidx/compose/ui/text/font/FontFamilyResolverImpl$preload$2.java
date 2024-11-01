package androidx.compose.ui.text.font;

import Q5.I;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$preload$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(TypefaceResult.Immutable immutable) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TypefaceResult.Immutable) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        public final void invoke(TypefaceResult.Immutable immutable) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TypefaceResult.Immutable) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TypefaceResult invoke(TypefaceRequest typefaceRequest) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        Function1 function1;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        Function1 function12;
        fontListFontFamilyTypefaceAdapter = this.this$0.fontListFontFamilyTypefaceAdapter;
        PlatformFontLoader platformFontLoader$ui_text_release = this.this$0.getPlatformFontLoader$ui_text_release();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        function1 = this.this$0.createDefaultTypeface;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release, anonymousClass1, function1);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.platformFamilyTypefaceAdapter;
            PlatformFontLoader platformFontLoader$ui_text_release2 = this.this$0.getPlatformFontLoader$ui_text_release();
            AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
            function12 = this.this$0.createDefaultTypeface;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release2, anonymousClass2, function12);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }
}
