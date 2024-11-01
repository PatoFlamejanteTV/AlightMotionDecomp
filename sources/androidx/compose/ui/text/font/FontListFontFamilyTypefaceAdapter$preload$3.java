package androidx.compose.ui.text.font;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n6.AbstractC3452f;
import n6.AbstractC3462k;
import n6.M;
import n6.U;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter$preload$3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ List<Font> $asyncLoads;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, U5.d dVar) {
        super(2, dVar);
        this.$asyncLoads = list;
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, dVar);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        U b9;
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
            M m8 = (M) this.L$0;
            List<Font> list = this.$asyncLoads;
            HashSet hashSet = new HashSet(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                Font font = list.get(i9);
                if (hashSet.add(font)) {
                    arrayList.add(font);
                }
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
            PlatformFontLoader platformFontLoader = this.$resourceLoader;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                b9 = AbstractC3462k.b(m8, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i10), platformFontLoader, null), 3, null);
                arrayList2.add(b9);
            }
            this.label = 1;
            if (AbstractC3452f.b(arrayList2, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
