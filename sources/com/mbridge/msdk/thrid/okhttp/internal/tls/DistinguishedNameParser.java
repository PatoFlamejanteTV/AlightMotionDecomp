package com.mbridge.msdk.thrid.okhttp.internal.tls;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes4.dex */
final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dn = name;
        this.length = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:            return new java.lang.String(r1, r2, r8.cur - r2);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String escapedAV() {
        /*
            r8 = this;
            int r0 = r8.pos
            r8.beg = r0
            r8.end = r0
        L6:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.chars
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.end
            int r4 = r3 + 1
            r8.end = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L3e:
            int r0 = r8.end
            int r2 = r0 + 1
            r8.end = r2
            char r2 = r8.getEscaped()
            r1[r0] = r2
            int r0 = r8.pos
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.end
            r8.cur = r2
            int r0 = r0 + 1
            r8.pos = r0
            int r0 = r2 + 1
            r8.end = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 >= r1) goto L83
            char[] r2 = r8.chars
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.end
            int r7 = r1 + 1
            r8.end = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.pos = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.chars
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.cur
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.tls.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private int getByte(int i8) {
        int i9;
        int i10;
        int i11 = i8 + 1;
        if (i11 < this.length) {
            char[] cArr = this.chars;
            char c8 = cArr[i8];
            if (c8 >= '0' && c8 <= '9') {
                i9 = c8 - '0';
            } else if (c8 >= 'a' && c8 <= 'f') {
                i9 = c8 - 'W';
            } else if (c8 >= 'A' && c8 <= 'F') {
                i9 = c8 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            char c9 = cArr[i11];
            if (c9 >= '0' && c9 <= '9') {
                i10 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i10 = c9 - 'W';
            } else if (c9 >= 'A' && c9 <= 'F') {
                i10 = c9 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            return (i9 << 4) + i10;
        }
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }

    private char getEscaped() {
        int i8 = this.pos + 1;
        this.pos = i8;
        if (i8 != this.length) {
            char c8 = this.chars[i8];
            if (c8 == ' ' || c8 == '%' || c8 == '\\' || c8 == '_' || c8 == '\"' || c8 == '#') {
                return c8;
            }
            switch (c8) {
                case '*':
                case '+':
                case ',':
                    return c8;
                default:
                    switch (c8) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c8;
                        default:
                            return getUTF8();
                    }
            }
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private char getUTF8() {
        int i8;
        int i9;
        int i10 = getByte(this.pos);
        this.pos++;
        if (i10 < 128) {
            return (char) i10;
        }
        if (i10 < 192 || i10 > 247) {
            return '?';
        }
        if (i10 <= 223) {
            i8 = i10 & 31;
            i9 = 1;
        } else if (i10 <= 239) {
            i8 = i10 & 15;
            i9 = 2;
        } else {
            i8 = i10 & 7;
            i9 = 3;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = this.pos;
            int i13 = i12 + 1;
            this.pos = i13;
            if (i13 == this.length || this.chars[i13] != '\\') {
                return '?';
            }
            int i14 = i12 + 2;
            this.pos = i14;
            int i15 = getByte(i14);
            this.pos++;
            if ((i15 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i8 = (i8 << 6) + (i15 & 63);
        }
        return (char) i8;
    }

    private String hexAV() {
        int i8;
        char[] cArr;
        char c8;
        int i9 = this.pos;
        if (i9 + 4 < this.length) {
            this.beg = i9;
            this.pos = i9 + 1;
            while (true) {
                i8 = this.pos;
                if (i8 == this.length || (c8 = (cArr = this.chars)[i8]) == '+' || c8 == ',' || c8 == ';') {
                    break;
                }
                if (c8 == ' ') {
                    this.end = i8;
                    this.pos = i8 + 1;
                    while (true) {
                        int i10 = this.pos;
                        if (i10 >= this.length || this.chars[i10] != ' ') {
                            break;
                        }
                        this.pos = i10 + 1;
                    }
                } else {
                    if (c8 >= 'A' && c8 <= 'F') {
                        cArr[i8] = (char) (c8 + ' ');
                    }
                    this.pos = i8 + 1;
                }
            }
            this.end = i8;
            int i11 = this.end;
            int i12 = this.beg;
            int i13 = i11 - i12;
            if (i13 >= 5 && (i13 & 1) != 0) {
                int i14 = i13 / 2;
                byte[] bArr = new byte[i14];
                int i15 = i12 + 1;
                for (int i16 = 0; i16 < i14; i16++) {
                    bArr[i16] = (byte) getByte(i15);
                    i15 += 2;
                }
                return new String(this.chars, this.beg, i13);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private String nextAT() {
        int i8;
        int i9;
        int i10;
        int i11;
        char c8;
        int i12;
        int i13;
        char c9;
        char c10;
        while (true) {
            i8 = this.pos;
            i9 = this.length;
            if (i8 >= i9 || this.chars[i8] != ' ') {
                break;
            }
            this.pos = i8 + 1;
        }
        if (i8 == i9) {
            return null;
        }
        this.beg = i8;
        this.pos = i8 + 1;
        while (true) {
            i10 = this.pos;
            i11 = this.length;
            if (i10 >= i11 || (c10 = this.chars[i10]) == '=' || c10 == ' ') {
                break;
            }
            this.pos = i10 + 1;
        }
        if (i10 < i11) {
            this.end = i10;
            if (this.chars[i10] == ' ') {
                while (true) {
                    i12 = this.pos;
                    i13 = this.length;
                    if (i12 >= i13 || (c9 = this.chars[i12]) == '=' || c9 != ' ') {
                        break;
                    }
                    this.pos = i12 + 1;
                }
                if (this.chars[i12] != '=' || i12 == i13) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.dn);
                }
            }
            this.pos++;
            while (true) {
                int i14 = this.pos;
                if (i14 >= this.length || this.chars[i14] != ' ') {
                    break;
                }
                this.pos = i14 + 1;
            }
            int i15 = this.end;
            int i16 = this.beg;
            if (i15 - i16 > 4) {
                char[] cArr = this.chars;
                if (cArr[i16 + 3] == '.' && (((c8 = cArr[i16]) == 'O' || c8 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                    this.beg = i16 + 4;
                }
            }
            char[] cArr2 = this.chars;
            int i17 = this.beg;
            return new String(cArr2, i17, i15 - i17);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private String quotedAV() {
        int i8 = this.pos + 1;
        this.pos = i8;
        this.beg = i8;
        this.end = i8;
        while (true) {
            int i9 = this.pos;
            if (i9 != this.length) {
                char[] cArr = this.chars;
                char c8 = cArr[i9];
                if (c8 == '\"') {
                    this.pos = i9 + 1;
                    while (true) {
                        int i10 = this.pos;
                        if (i10 >= this.length || this.chars[i10] != ' ') {
                            break;
                        }
                        this.pos = i10 + 1;
                    }
                    char[] cArr2 = this.chars;
                    int i11 = this.beg;
                    return new String(cArr2, i11, this.end - i11);
                }
                if (c8 == '\\') {
                    cArr[this.end] = getEscaped();
                } else {
                    cArr[this.end] = c8;
                }
                this.pos++;
                this.end++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
        }
    }

    public String findMostSpecific(String str) {
        String quotedAV;
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String nextAT = nextAT();
        if (nextAT == null) {
            return null;
        }
        do {
            int i8 = this.pos;
            if (i8 == this.length) {
                return null;
            }
            char c8 = this.chars[i8];
            if (c8 != '\"') {
                if (c8 != '#') {
                    if (c8 != '+' && c8 != ',' && c8 != ';') {
                        quotedAV = escapedAV();
                    } else {
                        quotedAV = "";
                    }
                } else {
                    quotedAV = hexAV();
                }
            } else {
                quotedAV = quotedAV();
            }
            if (str.equalsIgnoreCase(nextAT)) {
                return quotedAV;
            }
            int i9 = this.pos;
            if (i9 >= this.length) {
                return null;
            }
            char c9 = this.chars[i9];
            if (c9 != ',' && c9 != ';' && c9 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            this.pos = i9 + 1;
            nextAT = nextAT();
        } while (nextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }
}
