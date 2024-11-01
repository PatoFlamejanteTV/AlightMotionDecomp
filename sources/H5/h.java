package H5;

import H5.d;
import com.inmobi.cmp.core.model.Vector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3249a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final Vector a(String value) {
            int intValue;
            int intValue2;
            int intValue3;
            int intValue4;
            char c8;
            int intValue5;
            int i8;
            int intValue6;
            int intValue7;
            int intValue8;
            int intValue9;
            int intValue10;
            int intValue11;
            int intValue12;
            int intValue13;
            int intValue14;
            int intValue15;
            AbstractC3292y.i(value, "value");
            Vector vector = new Vector(null, 1, null);
            d.a aVar = d.f3245a;
            F5.c cVar = F5.c.f2694a;
            F5.d dVar = F5.d.MAX_ID;
            Integer a9 = cVar.a(dVar);
            if (a9 == null) {
                intValue = 0;
            } else {
                intValue = a9.intValue();
            }
            String substring = value.substring(0, intValue);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Integer a10 = cVar.a(dVar);
            if (a10 == null) {
                intValue2 = 0;
            } else {
                intValue2 = a10.intValue();
            }
            int a11 = aVar.a(substring, intValue2);
            Integer a12 = cVar.a(dVar);
            if (a12 == null) {
                intValue3 = 0;
            } else {
                intValue3 = a12.intValue();
            }
            String valueOf = String.valueOf(value.charAt(intValue3));
            F5.d dVar2 = F5.d.ENCODING_TYPE;
            Integer a13 = cVar.a(dVar2);
            if (a13 == null) {
                intValue4 = 0;
            } else {
                intValue4 = a13.intValue();
            }
            int a14 = aVar.a(valueOf, intValue4);
            if (a14 != 0) {
                if (a14 == 1) {
                    c8 = 2;
                } else {
                    a aVar2 = h.f3249a;
                    throw new F5.e(AbstractC3292y.q("h.h", ": Too large value to encode into VectorEncodingType"));
                }
            } else {
                c8 = 1;
            }
            Integer a15 = cVar.a(dVar2);
            if (a15 == null) {
                intValue5 = 0;
            } else {
                intValue5 = a15.intValue();
            }
            int i9 = intValue3 + intValue5;
            if (c8 == 2) {
                F5.d dVar3 = F5.d.NUM_ENTRIES;
                Integer a16 = cVar.a(dVar3);
                if (a16 == null) {
                    intValue6 = 0;
                } else {
                    intValue6 = a16.intValue();
                }
                String substring2 = value.substring(i9, intValue6);
                AbstractC3292y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                Integer a17 = cVar.a(dVar3);
                if (a17 == null) {
                    intValue7 = 0;
                } else {
                    intValue7 = a17.intValue();
                }
                int a18 = aVar.a(substring2, intValue7);
                Integer a19 = cVar.a(dVar3);
                if (a19 == null) {
                    intValue8 = 0;
                } else {
                    intValue8 = a19.intValue();
                }
                i8 = i9 + intValue8;
                if (a18 >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String value2 = String.valueOf(value.charAt(i8));
                        AbstractC3292y.i(value2, "value");
                        boolean d8 = AbstractC3292y.d(value2, "1");
                        F5.c cVar2 = F5.c.f2694a;
                        Integer a20 = cVar2.a(F5.d.SINGLE_OR_RANGE);
                        if (a20 == null) {
                            intValue9 = 0;
                        } else {
                            intValue9 = a20.intValue();
                        }
                        int i12 = i8 + intValue9;
                        d.a aVar3 = d.f3245a;
                        F5.d dVar4 = F5.d.VENDOR_ID;
                        Integer a21 = cVar2.a(dVar4);
                        if (a21 == null) {
                            intValue10 = 0;
                        } else {
                            intValue10 = a21.intValue();
                        }
                        String substring3 = value.substring(i12, intValue10);
                        AbstractC3292y.h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        Integer a22 = cVar2.a(dVar4);
                        if (a22 == null) {
                            intValue11 = 0;
                        } else {
                            intValue11 = a22.intValue();
                        }
                        int a23 = aVar3.a(substring3, intValue11);
                        Integer a24 = cVar2.a(dVar4);
                        if (a24 == null) {
                            intValue12 = 0;
                        } else {
                            intValue12 = a24.intValue();
                        }
                        i8 = i12 + intValue12;
                        if (d8) {
                            Integer a25 = cVar2.a(dVar4);
                            if (a25 == null) {
                                intValue13 = 0;
                            } else {
                                intValue13 = a25.intValue();
                            }
                            String substring4 = value.substring(i8, intValue13);
                            AbstractC3292y.h(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                            Integer a26 = cVar2.a(dVar4);
                            if (a26 == null) {
                                intValue14 = 0;
                            } else {
                                intValue14 = a26.intValue();
                            }
                            int a27 = aVar3.a(substring4, intValue14);
                            Integer a28 = cVar2.a(dVar4);
                            if (a28 == null) {
                                intValue15 = 0;
                            } else {
                                intValue15 = a28.intValue();
                            }
                            i8 += intValue15;
                            if (a23 <= a27) {
                                while (true) {
                                    int i13 = a23 + 1;
                                    vector.set(a23);
                                    if (a23 == a27) {
                                        break;
                                    }
                                    a23 = i13;
                                }
                            }
                        } else {
                            vector.set(a23);
                        }
                        if (i10 == a18) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } else {
                int i14 = i9 + a11;
                String substring5 = value.substring(i9, i14);
                AbstractC3292y.h(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                vector = c.f3244a.a(substring5, a11);
                i8 = i14;
            }
            vector.setBitLength(i8);
            return vector;
        }
    }
}
