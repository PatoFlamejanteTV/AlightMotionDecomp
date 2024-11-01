package androidx.compose.ui.text.font;

import Q5.I;
import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.J;
import n6.M;
import n6.N;
import n6.O;
import n6.U0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private M asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final J DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(J.f35662m0);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final J getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, U5.d dVar) {
        if (!(fontFamily instanceof FontListFontFamily)) {
            return I.f8786a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i8 = 0; i8 < size; i8++) {
            Font font = fonts2.get(i8);
            if (FontLoadingStrategy.m4766equalsimpl0(font.mo4725getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m4770getAsyncPKNRLFQ())) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Font font2 = (Font) arrayList.get(i9);
            arrayList2.add(x.a(font2.getWeight(), FontStyle.m4776boximpl(font2.mo4735getStyle_LCdwA())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = arrayList2.get(i10);
            if (hashSet.add((r) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i11 = 0; i11 < size4; i11++) {
            r rVar = (r) arrayList3.get(i11);
            FontWeight fontWeight = (FontWeight) rVar.a();
            int m4782unboximpl = ((FontStyle) rVar.b()).m4782unboximpl();
            List list = (List) FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m4775matchFontRetOiIg(fonts, fontWeight, m4782unboximpl), new TypefaceRequest(fontFamily, fontWeight, m4782unboximpl, FontSynthesis.Companion.m4796getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, FontListFontFamilyTypefaceAdapter$preload$2$1.INSTANCE).a();
            if (list != null) {
                arrayList4.add(AbstractC1435t.m0(list));
            }
        }
        Object e8 = N.e(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, platformFontLoader, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1 function1, Function1 function12) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        r access$firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m4775matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m4822getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, function12);
        List list = (List) access$firstImmediatelyAvailable.a();
        Object b9 = access$firstImmediatelyAvailable.b();
        if (list == null) {
            return new TypefaceResult.Immutable(b9, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b9, typefaceRequest, this.asyncTypefaceCache, function1, platformFontLoader);
        AbstractC3462k.d(this.asyncLoadScope, null, O.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, U5.g gVar) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = N.a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(gVar).plus(U0.a((InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i8 & 2) != 0 ? U5.h.f10149a : gVar);
    }
}
