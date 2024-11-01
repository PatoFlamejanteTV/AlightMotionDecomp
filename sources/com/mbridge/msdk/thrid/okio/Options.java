package com.mbridge.msdk.thrid.okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    final ByteString[] byteStrings;
    final int[] trie;

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    private static void buildTrieRecursive(long j8, Buffer buffer, int i8, List<ByteString> list, int i9, int i10, List<Integer> list2) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Buffer buffer2;
        if (i9 < i10) {
            for (int i16 = i9; i16 < i10; i16++) {
                if (list.get(i16).size() < i8) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i9);
            ByteString byteString2 = list.get(i10 - 1);
            if (i8 == byteString.size()) {
                int i17 = i9 + 1;
                i12 = i17;
                i11 = list2.get(i9).intValue();
                byteString = list.get(i17);
            } else {
                i11 = -1;
                i12 = i9;
            }
            if (byteString.getByte(i8) != byteString2.getByte(i8)) {
                int i18 = 1;
                for (int i19 = i12 + 1; i19 < i10; i19++) {
                    if (list.get(i19 - 1).getByte(i8) != list.get(i19).getByte(i8)) {
                        i18++;
                    }
                }
                long intCount = j8 + intCount(buffer) + 2 + (i18 * 2);
                buffer.writeInt(i18);
                buffer.writeInt(i11);
                for (int i20 = i12; i20 < i10; i20++) {
                    byte b9 = list.get(i20).getByte(i8);
                    if (i20 == i12 || b9 != list.get(i20 - 1).getByte(i8)) {
                        buffer.writeInt(b9 & 255);
                    }
                }
                Buffer buffer3 = new Buffer();
                int i21 = i12;
                while (i21 < i10) {
                    byte b10 = list.get(i21).getByte(i8);
                    int i22 = i21 + 1;
                    int i23 = i22;
                    while (true) {
                        if (i23 < i10) {
                            if (b10 != list.get(i23).getByte(i8)) {
                                i14 = i23;
                                break;
                            }
                            i23++;
                        } else {
                            i14 = i10;
                            break;
                        }
                    }
                    if (i22 == i14 && i8 + 1 == list.get(i21).size()) {
                        buffer.writeInt(list2.get(i21).intValue());
                        i15 = i14;
                        buffer2 = buffer3;
                    } else {
                        buffer.writeInt((int) ((intCount(buffer3) + intCount) * (-1)));
                        i15 = i14;
                        buffer2 = buffer3;
                        buildTrieRecursive(intCount, buffer3, i8 + 1, list, i21, i14, list2);
                    }
                    buffer3 = buffer2;
                    i21 = i15;
                }
                Buffer buffer4 = buffer3;
                buffer.write(buffer4, buffer4.size());
                return;
            }
            int min = Math.min(byteString.size(), byteString2.size());
            int i24 = 0;
            for (int i25 = i8; i25 < min && byteString.getByte(i25) == byteString2.getByte(i25); i25++) {
                i24++;
            }
            long intCount2 = 1 + j8 + intCount(buffer) + 2 + i24;
            buffer.writeInt(-i24);
            buffer.writeInt(i11);
            int i26 = i8;
            while (true) {
                i13 = i8 + i24;
                if (i26 >= i13) {
                    break;
                }
                buffer.writeInt(byteString.getByte(i26) & 255);
                i26++;
            }
            if (i12 + 1 == i10) {
                if (i13 == list.get(i12).size()) {
                    buffer.writeInt(list2.get(i12).intValue());
                    return;
                }
                throw new AssertionError();
            }
            Buffer buffer5 = new Buffer();
            buffer.writeInt((int) ((intCount(buffer5) + intCount2) * (-1)));
            buildTrieRecursive(intCount2, buffer5, i13, list, i12, i10, list2);
            buffer.write(buffer5, buffer5.size());
            return;
        }
        throw new AssertionError();
    }

    private static int intCount(Buffer buffer) {
        return (int) (buffer.size() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.thrid.okio.Options of(com.mbridge.msdk.thrid.okio.ByteString... r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Options.of(com.mbridge.msdk.thrid.okio.ByteString[]):com.mbridge.msdk.thrid.okio.Options");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.byteStrings.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString get(int i8) {
        return this.byteStrings[i8];
    }
}
