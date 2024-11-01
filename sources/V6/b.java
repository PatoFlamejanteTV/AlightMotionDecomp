package V6;

import Q5.I;
import U6.C1449e;
import U6.C1452h;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a */
    private static final char[] f10667a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int c(byte[] bArr, int i8) {
        int i9;
        byte b9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int length = bArr.length;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        loop0: while (i15 < length) {
            byte b10 = bArr[i15];
            if (b10 >= 0) {
                int i18 = i17 + 1;
                if (i17 == i8) {
                    return i16;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                    return -1;
                }
                if (b10 < 65536) {
                    i9 = 1;
                } else {
                    i9 = 2;
                }
                i16 += i9;
                i15++;
                while (true) {
                    i17 = i18;
                    if (i15 < length && (b9 = bArr[i15]) >= 0) {
                        i15++;
                        i18 = i17 + 1;
                        if (i17 == i8) {
                            return i16;
                        }
                        if ((b9 == 10 || b9 == 13 || ((b9 < 0 || b9 >= 32) && (Byte.MAX_VALUE > b9 || b9 >= 160))) && b9 != 65533) {
                            if (b9 < 65536) {
                                i10 = 1;
                            } else {
                                i10 = 2;
                            }
                            i16 += i10;
                        }
                    }
                }
            } else {
                if ((b10 >> 5) == -2) {
                    int i19 = i15 + 1;
                    if (length <= i19) {
                        if (i17 != i8) {
                            return -1;
                        }
                        return i16;
                    }
                    byte b11 = bArr[i19];
                    if ((b11 & 192) == 128) {
                        int i20 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i20 < 128) {
                            if (i17 != i8) {
                                return -1;
                            }
                            return i16;
                        }
                        i11 = i17 + 1;
                        if (i17 == i8) {
                            return i16;
                        }
                        if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                            return -1;
                        }
                        if (i20 < 65536) {
                            i14 = 1;
                        } else {
                            i14 = 2;
                        }
                        i16 += i14;
                        I i21 = I.f8786a;
                        i15 += 2;
                    } else {
                        if (i17 != i8) {
                            return -1;
                        }
                        return i16;
                    }
                } else if ((b10 >> 4) == -2) {
                    int i22 = i15 + 2;
                    if (length <= i22) {
                        if (i17 != i8) {
                            return -1;
                        }
                        return i16;
                    }
                    byte b12 = bArr[i15 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i22];
                        if ((b13 & 192) == 128) {
                            int i23 = ((b12 << 6) ^ ((-123008) ^ b13)) ^ (b10 << 12);
                            if (i23 < 2048) {
                                if (i17 != i8) {
                                    return -1;
                                }
                                return i16;
                            }
                            if (55296 <= i23 && i23 < 57344) {
                                if (i17 != i8) {
                                    return -1;
                                }
                                return i16;
                            }
                            i11 = i17 + 1;
                            if (i17 == i8) {
                                return i16;
                            }
                            if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                                return -1;
                            }
                            if (i23 < 65536) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            i16 += i13;
                            I i24 = I.f8786a;
                            i15 += 3;
                        } else {
                            if (i17 != i8) {
                                return -1;
                            }
                            return i16;
                        }
                    } else {
                        if (i17 != i8) {
                            return -1;
                        }
                        return i16;
                    }
                } else if ((b10 >> 3) == -2) {
                    int i25 = i15 + 3;
                    if (length <= i25) {
                        if (i17 != i8) {
                            return -1;
                        }
                        return i16;
                    }
                    byte b14 = bArr[i15 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i15 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i25];
                            if ((b16 & 192) == 128) {
                                int i26 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i26 > 1114111) {
                                    if (i17 != i8) {
                                        return -1;
                                    }
                                    return i16;
                                }
                                if (55296 <= i26 && i26 < 57344) {
                                    if (i17 != i8) {
                                        return -1;
                                    }
                                    return i16;
                                }
                                if (i26 < 65536) {
                                    if (i17 != i8) {
                                        return -1;
                                    }
                                    return i16;
                                }
                                i11 = i17 + 1;
                                if (i17 == i8) {
                                    return i16;
                                }
                                if ((i26 != 10 && i26 != 13 && ((i26 >= 0 && i26 < 32) || (127 <= i26 && i26 < 160))) || i26 == 65533) {
                                    return -1;
                                }
                                if (i26 < 65536) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                i16 += i12;
                                I i27 = I.f8786a;
                                i15 += 4;
                            } else {
                                if (i17 != i8) {
                                    return -1;
                                }
                                return i16;
                            }
                        } else {
                            if (i17 != i8) {
                                return -1;
                            }
                            return i16;
                        }
                    } else {
                        if (i17 != i8) {
                            return -1;
                        }
                        return i16;
                    }
                } else {
                    if (i17 != i8) {
                        return -1;
                    }
                    return i16;
                }
                i17 = i11;
            }
        }
        return i16;
    }

    public static final void d(C1452h c1452h, C1449e buffer, int i8, int i9) {
        AbstractC3292y.i(c1452h, "<this>");
        AbstractC3292y.i(buffer, "buffer");
        buffer.write(c1452h.i(), i8, i9);
    }

    public static final int e(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c8);
    }

    public static final char[] f() {
        return f10667a;
    }
}
