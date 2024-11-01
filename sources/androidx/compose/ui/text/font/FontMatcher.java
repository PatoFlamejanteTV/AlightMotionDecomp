package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z8, FontWeight fontWeight2, FontWeight fontWeight3, int i8, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i8 & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i8 & 8) != 0) {
            fontWeight3 = null;
        }
        int size = list.size();
        FontWeight fontWeight5 = null;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i9)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else if (weight.compareTo(fontWeight) > 0) {
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else {
                    fontWeight4 = weight;
                    fontWeight5 = fontWeight4;
                    break;
                }
            }
            i9++;
        }
        if (!z8 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj2 = list.get(i10);
            if (AbstractC3292y.d(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<Font> filterByClosestWeight$ui_text_release(List<? extends Font> list, FontWeight fontWeight, boolean z8, FontWeight fontWeight2, FontWeight fontWeight3) {
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            FontWeight weight = list.get(i8).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else if (weight.compareTo(fontWeight) > 0) {
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else {
                    fontWeight4 = weight;
                    fontWeight5 = fontWeight4;
                    break;
                }
            }
            i8++;
        }
        if (!z8 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            Font font = list.get(i9);
            if (AbstractC3292y.d(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m4773matchFontRetOiIg(FontFamily fontFamily, FontWeight fontWeight, int i8) {
        if (fontFamily instanceof FontListFontFamily) {
            return m4774matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i8);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m4774matchFontRetOiIg(FontListFontFamily fontListFontFamily, FontWeight fontWeight, int i8) {
        return m4775matchFontRetOiIg(fontListFontFamily.getFonts(), fontWeight, i8);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m4775matchFontRetOiIg(List<? extends Font> list, FontWeight fontWeight, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Font font = list.get(i10);
            Font font2 = font;
            if (AbstractC3292y.d(font2.getWeight(), fontWeight) && FontStyle.m4779equalsimpl0(font2.mo4735getStyle_LCdwA(), i8)) {
                arrayList.add(font);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Font font3 = list.get(i11);
            if (FontStyle.m4779equalsimpl0(font3.mo4735getStyle_LCdwA(), i8)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends Font> list2 = list;
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            int size3 = list2.size();
            FontWeight fontWeight3 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= size3) {
                    break;
                }
                FontWeight weight = list2.get(i12).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight3 = weight;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                }
                i12++;
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i9 < size4) {
                Font font4 = list2.get(i9);
                if (AbstractC3292y.d(font4.getWeight(), fontWeight3)) {
                    arrayList3.add(font4);
                }
                i9++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.getW500()) > 0) {
            int size5 = list2.size();
            FontWeight fontWeight4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= size5) {
                    break;
                }
                FontWeight weight2 = list2.get(i13).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight2;
                    }
                } else {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                }
                i13++;
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i9 < size6) {
                Font font5 = list2.get(i9);
                if (AbstractC3292y.d(font5.getWeight(), fontWeight4)) {
                    arrayList4.add(font5);
                }
                i9++;
            }
            return arrayList4;
        }
        FontWeight w500 = companion.getW500();
        int size7 = list2.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i14 = 0;
        while (true) {
            if (i14 >= size7) {
                break;
            }
            FontWeight weight3 = list2.get(i14).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(fontWeight) < 0) {
                    if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                        fontWeight5 = weight3;
                    }
                } else {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                }
            }
            i14++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list2.size();
        for (int i15 = 0; i15 < size8; i15++) {
            Font font6 = list2.get(i15);
            if (AbstractC3292y.d(font6.getWeight(), fontWeight5)) {
                arrayList5.add(font6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight w5002 = FontWeight.Companion.getW500();
        int size9 = list2.size();
        FontWeight fontWeight7 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size9) {
                break;
            }
            FontWeight weight4 = list2.get(i16).getWeight();
            if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                if (weight4.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight4;
                    }
                } else {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = weight4;
                    }
                }
            }
            i16++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list2.size();
        while (i9 < size10) {
            Font font7 = list2.get(i9);
            if (AbstractC3292y.d(font7.getWeight(), fontWeight2)) {
                arrayList6.add(font7);
            }
            i9++;
        }
        return arrayList6;
    }
}
