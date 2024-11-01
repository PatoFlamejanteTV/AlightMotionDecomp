package androidx.compose.ui.text.font;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import n6.M;
import n6.a1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Font $font;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements Function1 {
        final /* synthetic */ Font $font;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03541 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
            final /* synthetic */ Font $font;
            final /* synthetic */ PlatformFontLoader $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03541(PlatformFontLoader platformFontLoader, Font font, U5.d dVar) {
                super(2, dVar);
                this.$resourceLoader = platformFontLoader;
                this.$font = font;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C03541(this.$resourceLoader, this.$font, dVar);
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
                    PlatformFontLoader platformFontLoader = this.$resourceLoader;
                    Font font = this.$font;
                    this.label = 1;
                    obj = platformFontLoader.awaitLoad(font, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C03541) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Font font, PlatformFontLoader platformFontLoader, U5.d dVar) {
            super(1, dVar);
            this.$font = font;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(U5.d dVar) {
            return new AnonymousClass1(this.$font, this.$resourceLoader, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(U5.d dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.label;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    C03541 c03541 = new C03541(this.$resourceLoader, this.$font, null);
                    this.label = 1;
                    obj = a1.c(15000L, c03541, this);
                    if (obj == e8) {
                        return e8;
                    }
                }
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("Unable to load font " + this.$font);
            } catch (Exception e9) {
                throw new IllegalStateException("Unable to load font " + this.$font, e9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, U5.d dVar) {
        super(2, dVar);
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$font = font;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AsyncTypefaceCache asyncTypefaceCache;
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
            asyncTypefaceCache = this.this$0.asyncTypefaceCache;
            Font font = this.$font;
            PlatformFontLoader platformFontLoader = this.$resourceLoader;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(font, platformFontLoader, null);
            this.label = 1;
            obj = asyncTypefaceCache.runCached(font, platformFontLoader, true, anonymousClass1, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
