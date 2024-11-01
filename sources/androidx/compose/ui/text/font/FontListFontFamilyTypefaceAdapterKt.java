package androidx.compose.ui.text.font;

import Q5.I;
import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.AbstractC1435t;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final /* synthetic */ r access$firstImmediatelyAvailable(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        return firstImmediatelyAvailable(list, typefaceRequest, asyncTypefaceCache, platformFontLoader, function1);
    }

    public static final r firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        Object loadBlocking;
        Font font;
        Object b9;
        Font font2;
        int size = list.size();
        List list2 = null;
        for (int i8 = 0; i8 < size; i8++) {
            Font font3 = list.get(i8);
            int mo4725getLoadingStrategyPKNRLFQ = font3.mo4725getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (FontLoadingStrategy.m4766equalsimpl0(mo4725getLoadingStrategyPKNRLFQ, companion.m4771getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                        if (asyncTypefaceResult == null) {
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            loadBlocking = asyncTypefaceResult.m4744unboximpl();
                            font = font3;
                        } else {
                            I i9 = I.f8786a;
                            try {
                                loadBlocking = platformFontLoader.loadBlocking(font3);
                                font = font3;
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, loadBlocking, false, 8, null);
                            } catch (Exception e8) {
                                throw new IllegalStateException("Unable to load font " + font3, e8);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (loadBlocking != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4800synthesizeTypefaceFxwP2eA(typefaceRequest.m4823getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m4822getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m4766equalsimpl0(mo4725getLoadingStrategyPKNRLFQ, companion.m4772getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            b9 = asyncTypefaceResult2.m4744unboximpl();
                            font2 = font3;
                        } else {
                            I i10 = I.f8786a;
                            try {
                                s.a aVar = s.f8810b;
                                b9 = s.b(platformFontLoader.loadBlocking(font3));
                            } catch (Throwable th2) {
                                s.a aVar2 = s.f8810b;
                                b9 = s.b(t.a(th2));
                            }
                            if (s.g(b9)) {
                                b9 = null;
                            }
                            font2 = font3;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, b9, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (b9 != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4800synthesizeTypefaceFxwP2eA(typefaceRequest.m4823getFontSynthesisGVVA2EU(), b9, font2, typefaceRequest.getFontWeight(), typefaceRequest.m4822getFontStyle_LCdwA()));
                }
            } else if (FontLoadingStrategy.m4766equalsimpl0(mo4725getLoadingStrategyPKNRLFQ, companion.m4770getAsyncPKNRLFQ())) {
                AsyncTypefaceCache.AsyncTypefaceResult m4736get1ASDuI8 = asyncTypefaceCache.m4736get1ASDuI8(font3, platformFontLoader);
                if (m4736get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = AbstractC1435t.s(font3);
                    } else {
                        list2.add(font3);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m4742isPermanentFailureimpl(m4736get1ASDuI8.m4744unboximpl()) && m4736get1ASDuI8.m4744unboximpl() != null) {
                    return x.a(list2, FontSynthesis_androidKt.m4800synthesizeTypefaceFxwP2eA(typefaceRequest.m4823getFontSynthesisGVVA2EU(), m4736get1ASDuI8.m4744unboximpl(), font3, typefaceRequest.getFontWeight(), typefaceRequest.m4822getFontStyle_LCdwA()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + font3);
            }
        }
        return x.a(list2, function1.invoke(typefaceRequest));
    }
}
